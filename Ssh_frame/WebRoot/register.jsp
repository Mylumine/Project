<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="register.action" method="post">
   		<p>id：<input type="text" name="user.id" /></p>
    	<p>帐号：<input type="text" name="user.name" /></p>
    	<p>密码：<input type="text" name="user.password" /></p>
    	<p>电话：<input type="text" name="user.telphone" /></p>
    	<p>用户名：<input type="text" name="user.username" /></p>
    	<p>是否管理员：<input type="text" name="user.isadmin" /></p>
    	<p><input type="submit" value="登录" /></p>
    </form>
  </body>
</html>
