<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%!
 String username;
 int age;
%>
<%
username=request.getParameter("username");
age=Integer.parseInt(request.getParameter("age"));
session.setAttribute("username", username);
session.setAttribute("age", age);
%>
<jsp:forward page="form2.html"/>
</body>
</html>