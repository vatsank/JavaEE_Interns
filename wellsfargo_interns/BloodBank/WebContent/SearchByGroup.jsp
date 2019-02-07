<%@ page language="java" import="com.training.utils.* ,java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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

<img src='images/srch.jpg' alt='logo' class='image-rounded'>
</div>

<div class="col-md-10">

<form action="SearchDonarServlet">
<label for="">Blood Group</label>
 	<select  name="bloodGroup">
 	
 	<option value="apos">A Positive</option>
 	<option value="aneg">A Negative</option>
 	<option value="opos">O Positive</option>
 	<option value="oneg">O Negative</option>
 	<option value="Bpos">B Positive</option>
 	<option value="Bpos">B Negative</option>
 	
 	
 	</select>
 	

<input type="submit"  value="search"/>

</form>
<table class="table table-striped">
  <tr>
    <th>Donar Name</th>
    <th>Location</th>
    <th>Blood Group</th>
    <th>Mobile Number</th>
    
  </tr>
<%
if(request.getAttribute("list")!=null) { 
	 
List<BloodDonar> donarList =(List<BloodDonar>)request.getAttribute("list"); 
 for(BloodDonar eachDonar:donarList) { %>
  
	 <tr>
	  <td><%=eachDonar.getBloodDonarName() %></td>
	  <td><%=eachDonar.getLocation() %></td>
	  <td><%=eachDonar.getBloodGroup() %></td>
	  <td><%=eachDonar.getMobileNumber() %></td>

	 </tr>
  <%  }
 
}
%>
</table> 

</div>

</div>
</body>
</html>