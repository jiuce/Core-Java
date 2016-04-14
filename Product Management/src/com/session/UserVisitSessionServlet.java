package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserVisitSessionServlet
 */
public class UserVisitSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserVisitSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("sessionservlet");
		ServletContext ctx = getServletContext();
		Cookie[] cs =request.getCookies();
		boolean found=false;
		if(cs!=null){
		for(int i=0;i<cs.length;i++){
		if(cs[i].getName().equals("aaa")){
			int temp=Integer.parseInt(cs[i].getValue());
			
			//method1
			/*System.out.println("temp="+temp);
			temp=temp+1;
			
			String s=String.valueOf(temp);
			System.out.println(s);
			Cookie c1 = new Cookie("visitcount",s);
			c1.setMaxAge(5000);
			response.addCookie(c1);
			out.println("ftemp="+temp);*/
			
			//method2(both works)
			Integer n=(Integer) ctx.getAttribute("num");
			n=new Integer(n.intValue()+1);
			
			ctx.setAttribute("num", n);
			System.out.println(n);
			found=true;
		}
		}
		}
		if(found==false){
		Cookie cook = new Cookie("aaa", "1");
		cook.setMaxAge(5000);
		response.addCookie(cook);
		ctx.setAttribute("num", 1);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
