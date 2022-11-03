<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h1>Hello JSP's implicit objects:- pageContext</h1>
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
<%   
String uname=(String)pageContext.getAttribute("uname", PageContext.SESSION_SCOPE); 
out.print("welcome pageContext which is an implicit object "+uname);  
%>   
</body>
</html>