<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%!
 String qualification;
 String designation;
%>
<%
qualification=request.getParameter("qualification");
designation=request.getParameter("designation");
session.setAttribute("qualification", qualification);
session.setAttribute("designation", designation);
%>
<jsp:forward page="form3.html"/>
</body>
</html>