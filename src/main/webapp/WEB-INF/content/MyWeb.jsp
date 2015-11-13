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
<s:property value="user.name"/>
user.name
${applicationScope.userid}<br/>
${sessionScope.username}<br/>
你好吗，你丫！
<s:property value="para"/>

cookie
<br/>
${cookie.name.value }<br/>
</body>
</html>