<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="select" method="get">
		Select Book:<select name="book">
			<option>select</option>
			<option value="aaaa">aaaa</option>
			<option value="bbbb">bbbb</option>
			<option value="cccc">cccc</option>
			<option value="dddd">dddd</option>
			<option value="FFFF">FFFF</option>
		</select> <br> <input type="submit" value="show" /><br>

	</form>
	<form action="delete" method="post">
		<select name="book">
			<option>select</option>
			<option value="aaaa">aaaa</option>
			<option value="bbbb">bbbb</option>
			<option value="cccc">cccc</option>
			<option value="dddd">dddd</option>
			<option value="ffff">ffff</option>
		</select> <input type="submit" value="delete" />
	</form>







</body>
</html>