<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "userlist.util.Mappings"%>
<html>
<head>
<title> Message </title>
</head>
<body>
<h1> "${message}" </h1>
<c:url var="messageUrl" value="${Mappings.ADD_USER}">
</c:url>
<a href="${messageUrl}"> Add user </a>
</body>
</html>