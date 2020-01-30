<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Cd's Show page</title>
</head>
<body>
<table border="1">
 <tr>
<td><h2>Cd Home: Add A New CD</h2></td>
 </tr>
</table>

 
 <form action="processForm" method="post">
  <div class="form-group">
    <label >Cd Title</label>
    <input type="text" class="form-control" name="title" placeholder="title">
  </div>
  <div class="form-group">
    <label>Cd Type</label>
    <select class="form-control" name="cdType">
      <option value="Unknown">Select...</option>
      <option value="InternationalCD">International Cd</option>
      <option value="SpecialEditionCD">SpecialEdition CD</option>
      <option value="NormalCD">Normal CD</option>
      
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlInput1">Cd released Date</label>
    <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="date" name="date">
  </div>
 <input type="submit"/> 
 <input type="reset"/> 
</form>
 
</body>
</html>