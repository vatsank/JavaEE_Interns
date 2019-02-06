<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Example</title>
</head>
<body>
<c:set var="heading" value="Using JSTL" scope="page"/>

<h1>
<c:out value="${heading}"></c:out>
</h1>

<c:set var= "age" value="122" scope="page"/>

<c:if test="${ age gt 18 }" >
 	<c:out value="You are Admitted"/>
</c:if>

<c:if test="${ !(age gt 18) }" >
 	<c:out value="You are NOT Admitted"/>
</c:if>

</body>
</html>