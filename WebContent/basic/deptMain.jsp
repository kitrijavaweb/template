<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>
	<jsp:include page="/top.jsp"></jsp:include>
	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<jsp:include page="/layout/jsp_menu.jsp"></jsp:include>
			</div>
			<div class="col-sm-10">
	<form method="post" action="/serverweb/dept.do">
		deptNo : <input type="text"  name="deptNo"/><br/>
		deptName : <input type="text"  name="deptName"/><br/>
		LOC : <input type="text"  name="loc"/><br/>
		TEL : <input type="text"  name="tel"/><br/>
		MGR : <input type="text"  name="mgr"/><br/>
		<input type="submit" value="제출"/>
	</form>
	<h2><a href='/serverweb/list.do'>전체 목록 보기</a></h2>
			</div>
		</div>	
	</div>
	<footer class="container-fluid text-center">
	  <p>Footer Text</p>
	</footer>

</body>
</html>
