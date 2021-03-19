<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Edit User</title>
</head>
    <body>
<div align = "center">
<form:form method="POST" modelAttribute="userToEdit">
<table border="1">
<tr>
<td><Label>id</Label></td>
<td>
<form:input path="id" disabled = "true"/>
</td>
</tr>
<tr>
<td><Label> Name </Label> </td>
<td>
<form:input path="name"/>
</td>
</tr>
<tr>
<td> <Label> age </Label> </td>
<td>
<form:input path = "age"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Submit"/>
</td>
</tr>

</table>
</form:form>
</div>
    </body>
</html>