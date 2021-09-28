package com.learning.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.CoursesDao;
import com.learning.model.Contact;
import com.learning.model.Courses;


@WebServlet("/CoursesServlet")
public class CoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private CoursesDao coursesDao = new CoursesDao();
    public CoursesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/courseadd.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String c_name = request.getParameter("c_name");
		
		String c_desp = request.getParameter("c_desp");
		String c_fees = request.getParameter("c_fees");
		
		
		Courses courses = new Courses();
		
		courses.setC_name(c_name);;
		courses.setC_desp(c_desp);;
		courses.setC_fees(c_fees);;
	
		
		
		try {
			coursesDao.coursesDetail(courses);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		

	}

}
