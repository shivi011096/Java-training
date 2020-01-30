package crm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crm.model.Customer;
import crm.service.CustomerService;
import crm.service.CustomerServiceImpl;


public class CustomerDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerService service;

	
	public void init(ServletConfig config) throws ServletException {
		super.init();
		service=new CustomerServiceImpl();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Customer customer=service.findBuyId(Integer.parseInt(request.getParameter("id")));
		service.delete(customer);
		RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
		view.forward(request, response);
	}
}
