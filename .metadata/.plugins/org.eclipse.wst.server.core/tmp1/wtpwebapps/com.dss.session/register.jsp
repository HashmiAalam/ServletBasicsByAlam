<%@page import="java.sql.DriverManager"%><%@page import="java.sql.PreparedStatement"%><%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<body>
<%!
 Connection connection;
 PreparedStatement preparedStatement;
%>
<%   //create connection 
    //for oracle Class.forName("oracle.jdbc.driver.OracleDriver");
   // connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","root","Sherjilraza@312");
    Class.forName("com.mysql.cj.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Sherjilraza@312");
	connection.createStatement().execute("create table user_details(username varchar(30), age int,qualification varchar(30), designation varchar(30), mobile bigint, email varchar(30))");
	preparedStatement=connection.prepareStatement("insert into user_details values(?,?,?,?,?,?)");
	preparedStatement.setString(1, (String)session.getAttribute("username"));
	preparedStatement.setInt(2, (Integer)session.getAttribute("age"));
	preparedStatement.setString(3, (String)session.getAttribute("qualification"));
	preparedStatement.setString(4, (String)session.getAttribute("designation"));
	preparedStatement.setString(5, request.getParameter("mobile"));
	preparedStatement.setString(6, request.getParameter("email"));
	preparedStatement.executeUpdate();
	out.print("Application created successfully...");
%>
</body>
</html>