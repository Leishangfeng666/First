<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" src="JS/jquery-1.8.3.js"></script></head>
  <script type="text/javascript">
  		$(function(){
			$('a').click(function(){
				
			}) 				
  		});
  </script>
  <body>
   		<center>
   		<table border="1" cellpadding="1" cellspacing="1">
   			<tr>
   				<td>产品名称</td>
   				<td>产品描述</td>
   				<td>类别</td>
   				<td>操作</td>
   			</tr>
   			<c:forEach items="${list}" var="list">
   				<tr>
   					<td>${list.getProductname()}</td>
   					<td>${list.getDescs()}</td>
   					<td>${list.getName()}</td>
   					<td><a href="${list.getId()}" >删除</a></td>
   				</tr>
   			</c:forEach>
   			
   		</table>
   		<td><a href="getAll?pageindex=1">首页</a></td>
   		<td><a href="getAll?pageindex=${pageindex-1}">上一页</a></td>
   		<td><a href="getAll?pageindex=${pageindex+1}">下一页</a></td>
   		<td><a href="getAll?pageindex=${countpage}">末页</a></td><br/>
   		<a href="add.jsp">新增</a>
   		</center>
  </body>
</html>
