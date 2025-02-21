package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TaxCalculatorServlet")  // Specifies the URL pattern for the servlet
public class TaxCalculatorServlet extends HttpServlet {
    
	 // The @Override annotation indicates that this method overrides a method from the HttpServlet class.
    // The doGet method handles GET requests sent to this servlet.
    
    // Throws ServletException and IOException to handle possible errors during request processing or input/output operations.

    // 'request' is an object representing the client's request, containing parameters, headers, and other information.
    // 'response' is an object that allows the servlet to send a response back to the client (usually the browser).
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	   	
        
        // Sets the response content type to HTML for rendering the response as a webpage
        response.setContentType("text/html");
        
        // Creates a PrintWriter object to send the response back to the client (browser)
        PrintWriter out = response.getWriter();
        
        // Retrieves the "income" parameter from the HTTP request and parses it as a double
        double income = Double.parseDouble(request.getParameter("income"));
        double taxrate = Double.parseDouble(request.getParameter("taxrate"));
        
        // Calculates the tax as 10% of the income
        double tax = (taxrate/100) * income; // 10% tax calculation
        
        // Generates the HTML response that displays the income and the calculated tax
        out.println("<!DOCTYPE html><html>");
        out.println("<head><title>Tax Calculator Result</title><link rel='stylesheet' href='tax.css'></head>");
        out.println("<body><form class='container'>");
        out.println("<h1>Tax Calculator Result</h1>");
        out.println("<p>Income: $" + String.format("%.2f", income) + "</p>");
        out.println("<p>Tax Rate: " + String.format("%.2f", taxrate) + "%</p>");
        out.println("<p>Calculated Tax: $" + String.format("%.2f", tax) + "</p></form>");
        out.println("<div><a href='tax.html'><button class='calc'>Calculate Again</button></a>");
        out.println("<a href='index.jsp'><button class='calc'>Go Back</buttton></a></div>");
        out.println("</body></html>");
    }
}
