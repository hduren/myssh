<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- jsp声明 --%>
	<%!int count = 0;%>
	<%-- jsp脚本--%>
	<%
		count++;
		out.println(count);
	%>
	<%
		out.print("<br/>");
	%>
	<%-- jsp表达式--%>
	<%=count%>
	</br>
	<%=application.getInitParameter("contextpara")
	%>
</body>
</html>