package com.prabha.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prabha.web.dao.RoughDao;
import com.prabha.web.model.Rough;


public class GetRoughController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		RoughDao dao = new RoughDao();
		Rough r1 = dao.getRough(eid);
		
		request.setAttribute("rough", r1);
		RequestDispatcher rd = request.getRequestDispatcher("showRough.jsp");
		rd.forward(request, response);
	}

}
