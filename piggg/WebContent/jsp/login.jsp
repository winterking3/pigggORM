<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="userModel" scope="page" class="com.piggg.oa.model.table.piggg.UserEntity"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
<form method="post" action="../LoginServlet" >
工号:<input name="jobNumber"/><br/><br/>
密码:<input name="pigggPassword" type="password"/>

<input type="submit"  value="登录" />
</form>

<!-- 这个是个注释啊 -->

<%
	userModel.setJobNumber("22");
%>
<span><%=userModel.getId()%></span> 
<%=userModel.getJobNumber()%>
<%=userModel.getName()%>
</body>
</html>