<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="database.DbConnnect"%>
<% DbConnnect db = new DbConnnect();  %>
<% int a= 24; %>
<%@ include file="/templates/header.jsp"  %>

<body>

<%@ include file="/templates/navbar.jsp" %>
<%@ include file="/templates/title.jsp" %>
<jsp:include page="templates/body.jsp"></jsp:include>

</body>
</html>