<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/users/updateReg" method="POST">
	<input type="hidden" name = "id" value="<%=request.getParameter("choice")%>"/>
	<input type="text" name="firstname"/>
	<input type="text" name="lastname"/>
	<input type="submit" />
</form>
</body>
</html>