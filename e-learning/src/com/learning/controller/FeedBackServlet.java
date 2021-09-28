package com.learning.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.learning.dao.FeebBackDao;
import com.learning.model.FeedBack;

/**
 * Servlet implementation class FeedBackServlet
 */
@WebServlet("/FeedBackServlet")
public class FeedBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FeebBackDao feebBackDao = new FeebBackDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedBackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/feedback.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String user_id = request.getParameter("user_id");
		String email = request.getParameter("email");
		String feedback = request.getParameter("feedback");
		
		
		
		FeedBack feedBack= new FeedBack();
		
		feedBack.setName(name);
		feedBack.setEmail(email);
		feedBack.setFeedback(feedback);
		
		feedBack.setUser_id(user_id);
		
		
		try {
			feebBackDao.feedBack(feedBack);
			JOptionPane.showMessageDialog(null, "Thanks For Your FeedBack!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		



	}

}
