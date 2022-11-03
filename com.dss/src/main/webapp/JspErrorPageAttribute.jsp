<%@ page language="java" contentType="text/html" import="java.util.Date" errorPage="myerror.jsp"%>
<!DOCTYPE html>
<html>
<body>
<!-- Declaration tag -->
<%! Date d=null; %>
<!-- Scriptlet tag -->
<%-- <%
 d=new Date();
%> --%>
<!-- Expression Tag  to print -->
Today date:<%=d.toString() %>
</body>
</html>