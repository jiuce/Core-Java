package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDaoImpl;
import com.model.Product;

/**
 * Servlet implementation class ViewAllServlet
 */
public class ViewAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("viewall");
		ProductDaoImpl pimpl = new ProductDaoImpl();
		
	//	int l=pimpl.viewAll().length;
	//	String [] view = new String[l];
		Product [] view=pimpl.viewAll();
		System.out.println(view.length);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h3>Product List<h3>");
		out.println("<table border=1>");
		out.println("<tr><th>Product Name</th><th>Price</th><th>Stock</th></tr>");
		for(Product a:view){
			out.println("<tr><td>");
			out.println(a.getProdName());
			out.println("</td><td>");
			out.println(a.getProdPrice());
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
