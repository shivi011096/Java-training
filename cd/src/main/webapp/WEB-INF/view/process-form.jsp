<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Page</title>
</head>
<body>
CD added successfully.<br/>

CD Title:${cd.title}<br/>
CD Type:${cd.cdType}<br/>
CD Date:${cd.date}<br/>

<a href="${pageContext.request.contextPath}/">home</a>

</body>
</html>