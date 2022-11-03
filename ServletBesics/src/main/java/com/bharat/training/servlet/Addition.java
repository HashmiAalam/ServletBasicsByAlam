package com.bharat.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Addition extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");
		Integer sum=(Integer.valueOf(num1))+(Integer.valueOf(num2));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("The sum is "+sum);
		

	}

}
