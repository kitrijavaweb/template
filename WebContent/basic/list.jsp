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
	<h2>�μ����(��û�������� list.jsp)</h2>
	<hr/>
	<table border='1' width='600'>
		<tr bgcolor='skyblue'>
			<th>�μ���ȣ</th><th>�μ���</th><th>��ġ</th>
			<th>��ȭ��ȣ</th><th>������</th><th>����</th>
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
		href="/serverweb/del.do?deptNo=<%=dept.getDeptNo() %>&info=123">����</a></td>
			</tr>	
		<%} %>	
	</table>
</body>
</html>





