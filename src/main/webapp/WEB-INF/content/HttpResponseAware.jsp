<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="date" class="java.util.Date" scope="page"></jsp:useBean>
<s:text name="hello">
<s:param>胡龙飞</s:param>
<s:param>${date }</s:param>
</s:text>
<form action="HttpResponseAction" method="post">
	<input type="text" name="name" key="hello">
	
		<input type="submit" key="hello">
	</form>
</body>
</html>