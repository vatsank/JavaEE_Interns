<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<html>
<head>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<form action="validate.jsp">

<div class='form-group'>
	<label for="">User Name</label>
	<input type="text" name="userName" class='form-control'/>
</div>
<div class='form-group'>
	<label for="">Pass Word</label>
	<input type="text" name="passWord" class='form-control' />
</div>
<div class='form-group'>	
	<input type="submit" value="Login" class='btn btn-danger' />
</div>
<div>
 <a href="changePassWord.jsp">Forget PassWord</a>
</div>

</form>
<c:out v />
</body>
</html>