package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//Q5
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//hard coded credentials (replace with database.authentication)
		if ("admin".equals(username) && "password123".equals(password)) {
			HttpSession session = request.getSession();		
			session.setAttribute("user", username);
			response.sendRedirect("welcome.jsp"); // redirect to home page
		}
		else {
			response.sendRedirect("error.jsp"); // redirect to error page
		}
	}
}