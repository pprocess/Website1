package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProcessServlet")  // Specifies the URL pattern for the servlet
public class ProcessServlet extends HttpServlet {
    
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	   	
        
        // Sets the response content type to HTML for rendering the response as a webpage
        response.setContentType("text/html");
        
        response.getWriter().println("<h1>Hello user!<h2><br><a href='index.jsp'><button class='calc'>Go Back</buttton></a></div>");
        
	}

}