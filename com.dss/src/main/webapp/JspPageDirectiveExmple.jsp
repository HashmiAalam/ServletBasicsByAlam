<%@ page language="java" contentType="text/html" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<body>
<!-- Declaration tag declaration -->
<%! Date d=null; %>
<!-- Scriptlets tag block of java code-->
<%
 d=new Date();
%>
<!-- Expression Tag to print -->
Today date:<%=d %>
<%-- static inclusion:- in this inclusion will done are compile time --%>
<%@ include file="footer.jsp" %>

<%--Dynamic inclusion:- in this inclusion will be done on run time --%>
<jsp:include page="footer.jsp"/>
</body>
</html>
