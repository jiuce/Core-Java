package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDaoImpl;
import com.model.Product;

/**
 * Servlet implementation class CheckBufferServlet
 */
public class CheckBufferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBufferServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ProductDaoImpl pi=new ProductDaoImpl();	
		
		List<Product> p=new ArrayList<Product>();
		p=pi.order();
		PrintWriter out=response.getWriter();
		out.println("<h3>Products which are under 10 items in stock needs to be ordered</h3>");
		out.println("<table border=1>");
		for(Product a: p){
			out.println("<tr><td>");
			out.println(a.getProdName());
			System.out.println(a.getProdName());
			out.println("</td><td>");
			out.println(a.getStock());
			out.println("</td></tr>");
		}
		out.println("</table>");	
		
		RequestDispatcher rd=request.getRequestDispatcher("confirmation.html");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
