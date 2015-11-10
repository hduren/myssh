<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>欢迎</title>
</head>
<body>
	<jsp:useBean id="user" class="org.ultimania.model.User" />
	<jsp:setProperty property="name" name="user" value="hfff1" />
	<jsp:useBean id="user2" class="org.ultimania.model.User"></jsp:useBean>

	<h2>hello! spring struts 1</h2>
	<form action="hello" method="post">
	<input type="text" name="name">
		<input type="submit">
	</form>
</body>
</html>
