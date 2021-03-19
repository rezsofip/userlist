<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="userlist.util.Mappings" %>
<html>
<head>
<title>Users Application</title>
</head>
    <body>
<div align = "center">
<c:url var="usersLink" value="${Mappings.USERS}"/>
<h2><a href="${usersLink}">Show users </a></h2>
</div>
    </body>
</html>