package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.utils.UserDAO;

/**
 * Servlet implementation class ChangePassWordServlet
 */
public class ChangePassWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String email = request.getParameter("email");
		   String passWordToChange =request.getParameter("newPassWord");
	
		   UserDAO dao = new UserDAO();
		   
		    int rowUpdated = dao.updatePassWord(email, passWordToChange);
		    
		    String msg = "Invalid email-Id";
		    		
		    		if(rowUpdated ==1) {
		    			 msg = "Pass Word updated Successfully";
		    			 	    			 
		    		}
		    
		    		request.setAttribute("message",msg);
		    		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		    		dispatcher.forward(request, response);
		    		
	}

}
