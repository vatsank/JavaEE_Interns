<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.training.beans.ValidateBean" scope="session"/>

<jsp:setProperty property="*" name="bean"/>


<c:if test="${bean.validate()}">
	 <jsp:forward page="SearchByGroup.jsp"></jsp:forward>
</c:if>


<c:if test="${ !bean.validate() }">
	 <c:out value="IN VALID UserName or Password"/>
 	<a href="index.jsp"> Try again</a>
</c:if>

 
 
</body>
</html>