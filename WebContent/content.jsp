<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4>
		<small>��ſ� web</small>
	</h4>
	<hr>
	<div class="col-sm-10">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="/template/images/m_garden01.jpg" alt="Image" width="800" height="320">
					<div class="carousel-caption">
						<h3>�̹��ִ� �⺻ ��</h3>
						<p>servlet,jsp �⺻���...</p>
					</div>
				</div>

				<div class="item">
					<img src="/template/images/m_garden02.jpg" alt="Image" width="800" height="320">
					<div class="carousel-caption">
						<h3>�����ִ� ����� ��...</h3>
						<p>Open API, Ajax..</p>
					</div>
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<h5>
			<span class="label label-success">Lorem</span>
		</h5>
		<br>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
			eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
			ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
			aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat
			non proident, sunt in culpa qui officia deserunt mollit anim id est
			laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt
			ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
			nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
			consequat.</p>
		<hr>

		<h4>Leave a Comment:</h4>
		<form role="form">
			<div class="form-group">
				<textarea class="form-control" rows="3" required></textarea>
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		<br> <br>
	</div>





</body>
</html>