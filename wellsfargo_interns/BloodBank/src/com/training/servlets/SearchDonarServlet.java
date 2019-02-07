package com.training.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.utils.BloodDonar;
import com.training.utils.CrudExample;

/**
 * Servlet implementation class SearchDonarServlet
 */
public class SearchDonarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchDonarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String requiredGroup =request.getParameter("bloodGroup");
		   CrudExample dao = new CrudExample();
		   List<BloodDonar> list = dao.findDonarByGroup(requiredGroup);
		   
		   System.out.println(list);
		   
		   request.setAttribute("list", list);
		   RequestDispatcher dispatcher = request.getRequestDispatcher("/SearchByGroup.jsp");
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
