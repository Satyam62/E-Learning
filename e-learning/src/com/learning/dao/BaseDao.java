package com.learning.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao  {
	
	public static Connection getCon() throws ClassNotFoundException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		try {
			
			con =  DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/elearning?useSSL=false", "root", "Okay@123");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeCon(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
