<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>

</head>
<body>
<!-- Scriptlet -->

<%
out.println("Using Java Server Page");
int age = 45;
%>

<!-- Declaration -->
<%! String name = "Ramesh"; %>

<!-- Expression -->

<p style="color:#ff0000"><%=name%></p>

<%=age%>

</body>
</html>