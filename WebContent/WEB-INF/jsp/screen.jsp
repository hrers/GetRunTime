<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>跑操连不上专用</title>
<script type="text/javascript">
	function fun(){
		var xuehao=document.getElementById("xuehao").value
		var password=document.getElementById("password").value;
		if(xuehao==""){
			alert("学号不能为空");
			return false;
		}else if(password==""){
			alert("密码不能为空");
			return false;
		}else
			return true;
	}
</script>

</head>
<body >
<img alt="" src="/Screenshots/aa815094-3e0c-4b2c-9696-d38486ed62d8.png">
<h1></h1>
<form method="post" action="${pageContext.request.contextPath}/screenshotServlet" onsubmit="return fun()">
	<center >
	<label style="color: green;font-size: 30px">学号</label><input style="font-size: 30px" type="text" id="xuehao" name="xuehao" placeholder="请输入学号">
		<label style="color: green;font-size: 30px">密码</label><input  style="font-size: 30px" type="text" id="password" name="password" placeholder="请输入密码"><br/>
		<input style="font-size: 40px;color: green" type="submit" value="确认">
	</center>
</form>


</body>
</html>