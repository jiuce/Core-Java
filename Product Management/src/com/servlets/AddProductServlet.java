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
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("pname");
		double price = Double.parseDouble(request.getParameter("pprice"));
		int pquantity=Integer.parseInt(request.getParameter("pqty"));
		Product p =new Product(name,price,pquantity);
		ProductDaoImpl pimpl = new ProductDaoImpl();
		pimpl.add(p);
		
		/*PrintWriter out = response.getWriter();
		out.print("<p>Product </p>"+name+"<p>is entered</p>");
		out.println("<h2> A new Product is entered into database.</h2>");*/
		//RequestDispatcher rd = request.getRequestDispatcher("confirmation.html");
		request.setAttribute("srcpage", "add");
		request.setAttribute("pname",name);
		request.setAttribute("pprice",price);
		request.setAttribute("pqty",pquantity);
		RequestDispatcher rd = request.getRequestDispatcher("Confirm.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
