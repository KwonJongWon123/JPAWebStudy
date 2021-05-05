<%@page import="com.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	List<User> us = (List<User>) request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저 삭제</title>
</head>
<body>
<form action="" method="POST">
<%for(int i =0; i< us.size(); i++){
%>
<input type="radio" name="choice" value="<%=us.get(i).getId()%>"/>
또잉? : <%=us.get(i) %><br>
<%} %>
<input type="submit" value="삭제" />
</form>
</body>
</html>