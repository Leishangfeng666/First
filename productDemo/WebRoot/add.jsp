<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

  </head>
  
  <body>
  <center>
   	<form action="add" method="post">
   		<table border="1" cellpadding="1" cellspacing="1">
   			<tr>
   				<td>产品名称</td>
   				<td><input type="text" name="name"/></td>
   			</tr>
   			<tr>
   				<td>产品描述</td>
   				<td><input type="text" name="desc"/></td>
   			</tr>
   			<tr>
   				<td>商品类别</td>
   				<td> <select name="type">
   				<option value="1">数码产品</option>
   				<option value="2">服饰</option>
   				<option value="3">鞋</option>
   				<option value="4">食品</option>
   				</select> </td>
   			</tr>
   			<tr>
   				<td colspan="2"><input type="submit" value="提交"/></td>
   			</tr>
   			</table>
   	</form>
   	</center>
  </body>
</html>
