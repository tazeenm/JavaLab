<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="TshirtClass" method="post">
T-Shirt Accessories<input type="checkbox" name="access"  value="Belt"/>Belt
<input type="checkbox" name="access" value="Cap"/>Cap
<input type="checkbox" name="access" value="Hair-Band"/>Hair-Band<br>
Tag-Line<input type="text" name="tagline" size="50"/><br>
T-Shirt Feature:<input type="radio" name="pocket" value="ChestPocket"/>Chest Pocket
<input type="radio" name="pocket" value="NoChestPocket"/>No Chest Pocket<br>
T-Shirt Color:<select name="Tshirtcolor">
<option>Blue</option>
<option>Red</option>
<option>Green</option>
</select><br>
<input type="submit" value="Place Orders"/>   
</form>
</body>
</html>
