<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="images/favicon.jpg" type="image/jpg" >
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
 integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Jeevan Blood Bank</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>
<div class ='container'>
<div class='row'>
<%@ include file="menu.html" %>
</div>
<div class='row'>
   <div>
   <jsp:include page="login.jsp"/>
   <c:out value="${message}"/>
      </div>
</div>
<div>
 <jsp:include page="footer.jsp"/>
</div>
</div>



</body>
</html>