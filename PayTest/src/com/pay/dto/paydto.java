package com.pay.dto;

import java.util.Date;

public class paydto {

	String projectname;
	int totalprice;
	String username;
	String address;
	int phone;
	
	
	public paydto() {
		
	}


	public paydto(String projectname, int totalprice, String username, String address, int phone) {
		
		this.projectname = projectname;
		this.totalprice = totalprice;
		this.username = username;
		this.address = address;
		this.phone = phone;
	}


	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	public int getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	

}