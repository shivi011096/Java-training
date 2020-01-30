<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cd's Home Page</title>
</head>
<body >
<!-- Page Heading -->
 <table border="1">
 <tr>
<td><h2>CD : Home</h2></td>
 </tr>
</table>
<p>
This is the Home Page of Cd's.
</p>

 <ul>
 <li><!-- <a href=""> -->List all Cd's<!-- </a> --></li>
 <li>Register for a league (TBA)</li>
 </ul>

 <h3>CD Administrator</h3>

 <ul>
 <li><a href="${pageContext.request.contextPath}/cd/showForm">Add a new CD</a></li>
 </ul>

 </body>
</html>