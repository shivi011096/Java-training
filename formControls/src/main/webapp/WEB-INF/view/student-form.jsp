<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<form:errors path="firstName"/>
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		<form:errors path="lastName"/>
		<br><br>
	
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>
	
	    Email Id: <form:input path="email" />
		<form:errors path="email"/>
		<br><br>
		
		Age: <form:input path="age" />
		<form:errors path="age"/>
		<br><br>

        Zip Code: <form:input path="zipCode" />
		<form:errors path="zipCode"/>
		<br><br> 
		
		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br><br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>










