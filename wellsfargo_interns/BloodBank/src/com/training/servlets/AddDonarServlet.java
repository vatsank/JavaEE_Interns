package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.utils.BloodDonar;
import com.training.utils.CrudExample;

/**
 * Servlet implementation class AddDonarServlet
 */
public class AddDonarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDonarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		   String strMobile = request.getParameter("mobileNumber");
			   long mobileNumber = Long.parseLong(strMobile);
		
		   String bloodDonarName = request.getParameter("bloodDonarName");
		   String bloodGroup =request.getParameter("bloodGroup");
		   String location =request.getParameter("location");
		   
		   BloodDonar donar = new BloodDonar(mobileNumber, bloodDonarName, bloodGroup, location);
		   
		   CrudExample dao = new CrudExample();
		   
		    int rowAdded = dao.add(donar);
		    
		    
		    request.setAttribute("msg", rowAdded + "Donar with Name" + donar.getBloodDonarName() +"Added");
		    
		    RequestDispatcher dispatcher = request.getRequestDispatcher("/addResponse.jsp");
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
