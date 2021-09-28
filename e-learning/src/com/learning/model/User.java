package com.learning.model;

public class User {
	
	private String user_id;
	private String name ;
	private String phone_no;
	private String email;
	private String address ;
	private String password ;
	private String role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String phone_no, String email, String address, String password, String role) {
		super();
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.address = address;
		this.password = password;
		this.role = role;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
