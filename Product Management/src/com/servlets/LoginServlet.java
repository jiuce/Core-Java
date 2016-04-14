package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserValidator;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("<a href='http://localhost:8080/Test1/Registration.html'>New User Click here for registration</a>");
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		UserValidator validator=new UserValidator();
		//boolean status=validator.validate(uname, pwd);
		boolean status=validator.validatefromDB(uname, pwd);
		if(status==true){
			request.setAttribute("welcome", "Welcome "+uname);		
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			//RequestDispatcher rd=request.getRequestDispatcher("/ValidServlet");
			//RequestDispatcher rd=request.getRequestDispatcher("/SessionServlet");
			//rd.forward(request, response);
			rd.include(request, response);
		}
		else{
			//RequestDispatcher rd=request.getRequestDispatcher("/InvalidServlet");
			RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
			//rd.forward(request, response);
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
