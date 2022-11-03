package com.user.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/updateServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
    
	public void init() throws ServletException {
		System.out.println("init()");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//since java 1.7v only working with TomCat
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Sherjilraza@312");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public void destroy() {
		try {
			System.out.println("destroy()");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("update user set password='"+password+"' where email='"+email+"'");
			PrintWriter out = response.getWriter();
			if(result>0) {
				out.println("<H1>password updated<H1>");
			}else {
				out.println("<H1>error while creating update servlet<H1>");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
