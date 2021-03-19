<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "userlist.util.Mappings" %>
<html>
<head>
<title>Users</title>
</head>
    <body>
<div align = "center">
<table border="1">
<tr>
    <th> Name </th>
    <th> age </th>
    <th> View </th>
    <th> Edit </th>
    <th> Delete </th>

</tr>
<c:forEach var="user" items="${userMap}">

<tr>
<td> <c:out value="${user.value.name}"/> </td>
<td> <c:out value="${user.value.age}"/> </td>

<c:url var="viewUrl" value="${Mappings.VIEW_USER}">
    <c:param name="id" value="${user.value.id}"/>
    </c:url>

    <td> <a href="${viewUrl}"> View </a> </td>

<c:url var="editUserUrl" value="${Mappings.EDIT_USER}">
<c:param name="id" value="${user.value.id}"/>
</c:url>

    <td> <a href="${editUserUrl}"> Edit </a> </td>

 <c:url var="deleteUrl" value="${Mappings.DELETE_USER}">
 <c:param name="id" value="${user.value.id}"/>
 </c:url>

 <td> <a href="${deleteUrl}"> Delete </a> </td>
</tr>

</c:forEach>
</table>
</div>
<c:url var="addUserUrl" value="${Mappings.ADD_USER}"/>
<div align="center">
<a href="${addUserUrl}"> Add user </a>
</div>
    </body>
</html>