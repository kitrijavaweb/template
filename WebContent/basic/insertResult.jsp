<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%String msg = (String) request.getAttribute("msg");
	  int result = (Integer)request.getAttribute("result");	 
	%>
	<h2><%= msg %></h2>
</body>
</html>