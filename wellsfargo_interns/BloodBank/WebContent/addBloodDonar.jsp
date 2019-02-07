<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Blood Donar</title>
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
<div class='container'>
<div class="row">
<%@ include file="menu.html" %>
</div>
<div class='row'>

<div class="col-md-2">
<img src='images/donation.jpg' alt='logo' class='image-rounded'>

</div>

<div class="col-md-10">

<form action="AddDonarServlet" >

<div class="form-group">
 	<label for="">Mobile Number</label>
 	<input type="text" name="mobileNumber" class="form-control"/>
 	</div>
 	
 	<div class="form-group">
 	<label for="">Blood Donor Name</label>
 	<input type="text" name ="bloodDonarName" class="form-control" />
 	</div>
 	
 	<div class="form-group">
 	<label for="">Blood Group</label>
 	<select  name="bloodGroup" class="form-control">
 	
 	<option value="apos">A Positive</option>
 	<option value="aneg">A Negative</option>
 	<option value="opos">O Positive</option>
 	<option value="oneg">O Negative</option>
 	<option value="Bpos">B Positive</option>
 	<option value="Bpos">B Negative</option>
 	
 	
 	</select>
 	</div>
 	<div class="form-group">
 	<label for="">Location</label>
 	<input type="text" name ="location" class="form-control"/>
 	</div>
 	<div class="form-group">
 	 	<input type="submit" value="Add" class='btn btn-info' />
 	 	</div>
 </form>
</div>

</div>
</div>


</body>
</html>