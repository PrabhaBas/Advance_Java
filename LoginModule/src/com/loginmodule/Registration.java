package com.loginmodule;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginmodule.dao.RegistrationDao;


@WebServlet(name = "Registration", urlPatterns = { "/Registration" })
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegistrationDao rd = new RegistrationDao();
		String uname = request.getParameter("uname");
		String mail = request.getParameter("umail");
		long phone =Long.parseLong(request.getParameter("uphone"));
		String pass = request.getParameter("upass");
		String cpass = request.getParameter("ucpass");
		System.out.println(uname);
		System.out.println(mail);
		System.out.println(phone);
		System.out.println(pass);
		System.out.println(cpass);
		
		if(rd.check(uname, mail, phone, pass, cpass)==true & pass.equals(cpass))
		{
			
			response.sendRedirect("welcome.jsp");
		}
		else
			response.sendRedirect("registration.jsp");
	}

}
