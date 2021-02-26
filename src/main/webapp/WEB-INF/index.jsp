<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>

</head>
<body>


<h1>Dojo Survey</h1>

<div class="form">
<form method="POST" action="/info">

    <label>Your Name: <input type="text" name="name"></label>
    
    <label for="location">Dojo Location:</label>
<select id="location" name="location">
  <option value="San Jose">San Jose</option>
  <option value="Chicago">Chicago</option>
  <option value="Seattle">Seattle</option>
  <option value="Home">Home</option>
</select>

<label for="lango">Favorite Language:</label>
<select id="lango" name="lango">
  <option value="Python">Python</option>
  <option value="Java">Java</option>
  <option value="C++">C++</option>
  <option value="JavaScript">JS</option>
</select>

<p>Comment (optional):</p>
<textarea name="comment" rows="10" cols="30">
</textarea>

    <button type="submit">Login</button>
</form>
</div>

</body>
</html>