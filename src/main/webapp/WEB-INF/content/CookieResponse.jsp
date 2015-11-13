<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br /> cookie.name.value: ${cookie.name.value }
	<br /> request cookie:
	<%
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			out.println("cookie name" + cookie.getName() + " cooke value" + cookie.getValue());
		}
		out.println("结束");
	%>
	<br/>
	seesion value
	<%= session.getAttribute("name")!=null?session.getAttribute("name").toString():"null" %>
<br/>
${sessionScope.name }
<br/>
${sessionScope["name"] }

	<br /> ${pageContext.request.queryString}
	<br /> 取得请求的参数字符串
	<br /> ${pageContext.request.requestURL}
	<br /> 取得请求的URL，但不包括请求之参数字符串
	<br /> ${pageContext.request.contextPath}
	<br /> 服务的web application 的名称
	<br /> ${pageContext.request.method}
	<br /> 取得HTTP 的方法(GET、POST)
	<br /> ${pageContext.request.protocol}
	<br /> 取得使用的协议(HTTP/1.1、HTTP/1.0)
	<br /> ${pageContext.request.remoteUser}
	<br /> 取得用户名称
	<br /> ${pageContext.request.remoteAddr }
	<br /> 取得用户的IP 地址
	<br /> ${pageContext.session.id}
	<br /> 取得session 的ID
	<br /> ${pageContext.servletContext.serverInfo}
	<br /> 取得主机端的服务信息
	<br />

</body>
</html>