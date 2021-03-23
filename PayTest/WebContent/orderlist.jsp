<%@page import="com.pay.dto.paydto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	List<paydto> list = (List<paydto>) request.getAttribute("list");
%>
<body>
	<h1>orderlist</h1>
		<table border="1">
		<tr>
			<th>상품명</th>
			<th>가격</th>
			<th>주문자명</th>
			<th>주문자주소</th>
			<th>핸드폰 번호</th>
		</tr>
		
<%
	for (paydto dto : list) {
%>

	<tr>
		<td><%=dto.getProjectname() %></td>
		<td><%=dto.getTotalprice() %></td>
		<td><%=dto.getUsername() %></td>
		<td><%=dto.getAddress() %></td>
		<td><%=dto.getPhone() %></td>
	</tr>
	
<%
	}
%>
	<tr>
		<td colspan="4" align="right">
			<input type="button" value="계속펀딩하기" onclick=""/>
		</td>
	</tr>
	
	</table>

</body>
</html>