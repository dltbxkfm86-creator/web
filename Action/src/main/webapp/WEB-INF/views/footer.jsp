<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<script>
		const date = new Date();
	</script>
	
	<%
		String year =  new java.text.SimpleDateFormat("yyyy")
							   .format(new java.util.Date());
	%>
	
	Copyright 1998 - <%= year %> kh 
	
	<br>
	
	include.jsp로부터 전달받은 test라는 키값의 value ==> ${ param.test } <br>
</body>
</html>