<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style type="text/css">

img{
width: 100px;
height: 100px;
}
</style>
</head>
<body>

<%@ include file="menu.html" %>
<div class='container'>

<div class="col-md-2">

<img src='images/hospital.jpg' alt='logo' class='image-rounded'>
</div>

<div class="col-md-10">

<form action="HospitalServlet" method="post">

<div class="form-group">

	<label for="">Id</label>
	<input type="text" name="id"  class="form-control"/>

</div>

<div class="form-group">
	<label for="">Hospital Name</label>
	<input type="text" name="hospitalName"  class="form-control"/>
</div>
	

<div class="form-group">

	<label for="">Location</label>
	<input type="text" name="location"  class="form-control" />

</div>
	

<div class="form-group">

	<label for="">Phone Number</label>
	<input type="text" name="phoneNumber"  class="form-control" />

</div>
	

<div>
	<input type="submit" value="Add" class='btn btn-info' />
</div>
	
</form>

</div>


</div>

</body>
</html>