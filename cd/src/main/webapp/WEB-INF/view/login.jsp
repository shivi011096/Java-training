<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
   <h3 id="heading-1" class="ui-bar ui-bar-b ui-corner-all"><center>Login</center></h3>
   
   <form action="LoginController.do" method="post">
  <div class="form-group">
    <label >Email/User Name</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Password</label>
    <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="password" name="password">
  </div>
  <div class="form-group">
    <label >Gender</label>
	<fieldset data-role="controlgroup" id="radio-1" data-type="horizontal">
		<legend></legend>
		<input name="radio-choice-1" id="radio-choice-1a" data-mini="true" data-theme="a" value="Male" type="radio"/>
		<label for="radio-choice-1a">Male</label>
		<input name="radio-choice-1" id="radio-choice-1b" data-mini="true" data-theme="a" value="Female" type="radio"/>
		<label for="radio-choice-1b">Female</label>
	</fieldset>
  </div>
  <div class="form-group">
    <label>Country</label>
    <select class="form-control" name="cdType">
      <option value="Unknown">Select...</option>
      <option value="India">India</option>
      <option value="USA">USA</option>
      <option value="South Korea">South Korea</option>
      <option value="England">England</option>
      <option value="Spain">Spain</option>
    </select>
  </div>
  
  <div class="ui-input-btn ui-btn ui-icon-arrow-r ui-btn-icon-right ui-btn-inline ui-corner-all ui-btn-b">
	  Submit
	  <input data-enhanced="true" type="submit" value="Login" id="submitBttn"/>
  </div>
</form>
 
	

</body>
</html>