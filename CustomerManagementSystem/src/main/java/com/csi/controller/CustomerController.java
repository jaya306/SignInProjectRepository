package com.csi.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceIMpl;
import com.csi.service.CustomerServiceInterface;
import com.mysql.cj.log.Log;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CustomerServiceInterface customerServiceInterface=new CustomerServiceIMpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 int custId=Integer.parseInt(request.getParameter("custid"));
		 String custName=request.getParameter("custname");
		 String custAddress=request.getParameter("custaddress");
		 double custSalary=Double.valueOf(request.getParameter("custsalary"));
		 String custEmailId=request.getParameter("custemailid");
		 long custContactNo=Long.valueOf(request.getParameter("custcontactno"));
		 Date custDate=Date.valueOf(request.getParameter("custdob"));
		 Customer customer=new Customer(custId, custName, custAddress, custSalary, custEmailId, custContactNo,custDate);
		 
		 customerServiceInterface.signUp(customer);
		 
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("showCustData.jsp");
		 requestDispatcher.forward(request, response);	
	 
	
	
	}

	

}
