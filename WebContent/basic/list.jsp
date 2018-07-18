<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.ArrayList,basic.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<DeptDTO> deptlist = 
				(ArrayList<DeptDTO>)request.getAttribute("deptlist");
	%>
	<h2>부서목록(요청재지정된 list.jsp)</h2>
	<hr/>
	<table border='1' width='600'>
		<tr bgcolor='skyblue'>
			<th>부서번호</th><th>부서명</th><th>위치</th>
			<th>전화번호</th><th>관리자</th><th>삭제</th>
		</tr>
		<%
		int size = deptlist.size();	
		for(int i=0;i<size;i++){ 
			DeptDTO dept =  deptlist.get(i);%>
			<tr>
				<td><%=  dept.getDeptNo() %></td>
				<td><%=  dept.getDeptName() %></td>
				<td><%=  dept.getLoc() %></td>
				<td><%=  dept.getTel() %></td>
				<td><%=  dept.getMgr() %></td>
				<td><a 
		href="/serverweb/del.do?deptNo=<%=dept.getDeptNo() %>&info=123">삭제</a></td>
			</tr>	
		<%} %>	
	</table>
</body>
</html>





