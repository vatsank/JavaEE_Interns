package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.HospitalManager;
import com.training.domains.Hospital;

/**
 * Servlet implementation class HospitalServlet
 */
public class HospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HospitalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String strId =    request.getParameter("id");
		   int id = Integer.parseInt(strId);
		
		   String hospitalName =   request.getParameter("hospitalName");
		 String location =    request.getParameter("location");
		 
		 String strPhone  = request.getParameter("phoneNumber");
		     long phoneNumber =  Long.parseLong(strPhone) ;
		     
		     
		     Hospital hospRef = new Hospital(id, hospitalName, location, phoneNumber);
		    
		 
		      HospitalManager mgr = new HospitalManager();
		      
		      boolean result = mgr.addHospital(hospRef);
		       
		     String message = "Error - Check";
		       if(result ) {
		    	    message = "One Hospital Added";
		       }
		       
		       request.setAttribute("msg",message);
		       RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
		       
		        dispatcher.forward(request, response);
		        
	}

}
