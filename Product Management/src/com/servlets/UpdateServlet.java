package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDaoImpl;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double price=Double.parseDouble(request.getParameter("pricechg"));
		String product=request.getParameter("prodselect");
		System.out.println(price+" "+product+request.getParameter("prodselect"));
		if(product.equals("1")){
			product="Pencil";
		}
		if(product.equals("2")){
			product="pen";
		}
		if(product.equals("3")){
			product="book";
		}
		if(product.equals("4")){
			product="pencilbox";
		}
		if(product.equals("5")){
			product="storybook";
		}
		ProductDaoImpl pimpl = new ProductDaoImpl();
		pimpl.update(product, price);
		request.setAttribute("srcpage","update");
		request.setAttribute("updatestatus", "The product "+product+" is successfully updated");
		RequestDispatcher rd=request.getRequestDispatcher("Confirm.jsp");
		rd.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
