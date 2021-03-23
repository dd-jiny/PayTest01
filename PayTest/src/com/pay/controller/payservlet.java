package com.pay.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pay.biz.paybiz;
import com.pay.biz.paybizimpl;
import com.pay.dao.paydao;
import com.pay.dto.paydto;

@WebServlet("/Payservlet")
public class payservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public payservlet() {
     
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		paybiz biz = new paybizimpl();
		
		String command = request.getParameter("command");
		System.out.println("[" + command + "]");
		
		if(command.equals("orderpage")) {
		
			response.sendRedirect("orderpage.jsp");
			
	} else if(command.equals("orderres")) {
		System.out.println(
				request.getParameter("projectname")
				+request.getParameter("projectname")+request.getParameter("totalprice")
				+request.getParameter("username")
				+request.getParameter("address")
				+request.getParameter("phone")
				);
		
		String projectname = request.getParameter("projectname");
		int totalprice = Integer.parseInt(request.getParameter("totalprice"));
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		int phone = Integer.parseInt(request.getParameter("phone"));
		
		paydto dto = new paydto(projectname, totalprice, username, address, phone);
		
		int res = biz.insert(dto);
		
		if(res > 0) {
			response.sendRedirect("payservlet.do?command=orderlist");
		} else {
			response.sendRedirect("payservlet.do?command=orderpage");
		}
	} else if(command.equals("orderlist")) {
		
		List<paydto> list = biz.selectList();
		
		request.setAttribute("list", list);
		
		dispatch(request, response, "orderlist.jsp");
		
	}

}
	
	public void dispatch(HttpServletRequest request, HttpServletResponse response, String path) throws ServletException, IOException  {
		
		RequestDispatcher dispatch = request.getRequestDispatcher(path);
		dispatch.forward(request, response);
		
	}
	
}
