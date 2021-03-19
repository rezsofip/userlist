<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "userlist.util.Mappings" %>
<html>
<head>
<title>User</title>
</head>
    <body>
<div align = "center">
<table border="1">
<tr>
    <th> id </th>
    <th> Name </th>
    <th> age </th>

</tr>

<tr>
<td> <c:out value="${viewUser.id}"/> </td>
<td> <c:out value="${viewUser.name}"/> </td>
<td> <c:out value="${viewUser.age}"/> </td>

</table>
</div>
<div align="center">
<c:url var="usersUrl" value="${Mappings.USERS}"/>
<a href="${usersUrl}"> Users </a>
</div>
    </body>
</html>