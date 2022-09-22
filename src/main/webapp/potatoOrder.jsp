<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Potato Order Page</title>
</head>
<body>

<h1>Make selection from options below:</h1>

<fieldset>
<form action="potatoOrderServlet" method="post">
<label for="size">Choose a size:</label>

<select name="size" id="size">
  <option value="small">Small</option>
  <option value="medium">Medium</option>
  <option value="large">Large</option>
</select>

<br>
<br>
Choose quantity:
<input type="text" name="potatoQty" size="10">

<br>
<br>
<label for="potatoStyle">Fully Loaded or plain?:</label>
<select name="potatoStyle" id="potatoStyle">
  <option value="small">Loaded</option>
  <option value="medium">Plain</option>
  <option value="medium">Loaded but on the side</option>
</select>

<br>
<br>
What is your name?:
<input type="text" name="orderName" size="10">
<br>
<br>
<input type="submit" value="Calc potato">

</form>
</fieldset>
</body>
</html>