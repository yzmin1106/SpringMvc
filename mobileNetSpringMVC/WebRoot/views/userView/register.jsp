<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="st" uri="http://www.springframework.org/tags" %>
<html>
  <head>
   <title>新增用户</title>
  </head>
  <body>
  	<form action="<st:url value="/user/addUser"/>" method="post">
  		<table>
  			<tr>
  				<td>用户名:</td>
  				<td><input type="text" name="userName"/></td>
  			</tr>
  			<tr>
  				<td>密码:</td>
  				<td><input type="password" name="password"/></td>
  			</tr>
  			<tr>
  				<td>姓名:</td>
  				<td><input type="text" name="realName"/></td>
  			</tr>
  			<tr>
  				<td colspan="2"><input type="submit" value="提交"/></td>
  			</tr>
  		</table>
  	</form>  
  </body>
</html>
