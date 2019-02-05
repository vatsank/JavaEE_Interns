package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindDonarServlet
 */
public class FindDonarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindDonarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String reqGroup = request.getParameter("bloodGroup");
		
		
		   String donarName = "Ramesh";
		   
		   if(reqGroup.equals("opos")) {
			    donarName = "Suresh";
		   }
		   
		   request.setAttribute("donar", donarName);
		   
		   RequestDispatcher dispatcher =
					 request.getRequestDispatcher("/showDonar.jsp");
			
			 dispatcher.forward(request, response);
			 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
