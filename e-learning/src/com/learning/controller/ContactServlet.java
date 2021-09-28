package com.learning.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.ContactDao;
import com.learning.model.Contact;
import com.learning.model.User;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ContactDao contactDao = new ContactDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/contact.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone_no = request.getParameter("phone_no");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		String user_id = request.getParameter("user_id");
		
		
		Contact contact = new Contact();
		
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhone_no(phone_no);
		contact.setMessage(message);
		contact.setUser_id(user_id);
		
		
		try {
			contactDao.contactUs(contact);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/userregisterdone.jsp");
		dispatcher.forward(request, response);
		
	}

}
