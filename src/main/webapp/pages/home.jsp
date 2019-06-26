<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hai, ${user.name}, ${user.tech}

	<form action="adduser">
		<input name="uid" type="text"><br> 
		<input name="name" type="text"><br> 
		<input name="tech" type="text"><br>
		<input type="submit">
	</form>
</body>
</html>
 