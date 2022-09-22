<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final result page</title>
</head>
<body>
<p>
${userOrder.toString() }
</p>
<br>
<button type="button" onclick="location.href='http://localhost:8080/week4assessment/index.jsp';">Return Home</button>
</body>
</html>