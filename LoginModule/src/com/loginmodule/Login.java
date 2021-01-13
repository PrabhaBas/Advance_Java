package com.loginmodule;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loginmodule.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginDao ld = new LoginDao();
		String uname = request.getParameter("uname");
		String pass  = request.getParameter("pass");
		System.out.println("login class");
		boolean tjcheck = ld.check(uname, pass);
		System.out.println("tjcheck = "+tjcheck);
				
		if(tjcheck==true)
		{
			System.out.println("login class if");
			System.out.println("Setting attri");
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("pass", pass);
				
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			System.out.println("login class else");
			response.sendRedirect("login.jsp");
		}
	}

}
