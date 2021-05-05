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
<title>유저리스트</title>
</head>
<body>
<%for(int i =0; i< us.size(); i++){
%>
또잉? : <%=us.get(i) %><br>
<%} %>
</body>
</html>