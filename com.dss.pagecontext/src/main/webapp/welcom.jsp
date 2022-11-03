<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<% 
String uname=request.getParameter("username");
pageContext.setAttribute("uname", uname, PageContext.SESSION_SCOPE);
out.print("<a href='second.jsp'>click here to get message");

%>
</body>
</html>