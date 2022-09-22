<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza Order Page</title>
</head>
<body>
<h1>Make selection from options below:</h1>
<fieldset>
<form action="pizzaOrderServlet" method="post">
What is your name?:
<input type="text" name="orderName" size="10">
<br>
<br>


<label for="size">Choose a size:</label>
<select name="size" id="size">
  <option value="small">Small ($10.99)</option>
  <option value="medium">Medium ($12.99)</option>
  <option value="large">Large ($13.99)</option>
</select>
<br>
<br>

<label for="topping">Choose a topping:</label>
<select name="topping" id="topping">
  <option value="plain">Plain Cheese</option>
  <option value="sausage">Sausage (+$1)</option>
  <option value="pepperoni">Pepperoni (+$1)</option>
  <option value="supreme">Supreme (+$3)</option>
  <option value="veggie">Veggie (+$1)</option>
</select>
<br>
<br>

How many do you want?:
<input type="text" name="pizzaQty" size="10">
<br>
<br>
<input type="submit" value="Submit Order">
</form>
</fieldset>
</body>
</html>