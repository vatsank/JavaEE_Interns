<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<form action="ChangePassWordServlet" method="post">
	<label for="">Email</label>
	<input type="email"  name ='email'/>
	<label for="">New Pass Word</label>
	<input type="password" name="newPassWord" />
	<input type="submit" value="update" />
</form>
</body>
</html>