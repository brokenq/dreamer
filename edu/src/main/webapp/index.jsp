<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>title</title>
<jsp:include page="${contextPath }/WEB-INF/views/include/top.jsp" />
</head>
<body>
	<div class="container">
		<!-- 拍卖品展示屏 -->
		<div class="jumbotron">
			<h1>Hello, world!</h1>
			<p>...</p>
			<p><a class="btn btn-primary btn-lg">Learn more</a></p>
		</div>
		
		<nav class="navbar navbar-default" role="navigation">
			<!-- 导航头：商标、响应式展示导航条 -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-auctions-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
	   			<a class="navbar-brand" href="#">Elaine</a>
			</div>
			<!-- 导航条链接 -->
			<div class="collapse navbar-collapse navbar-auctions-collapse">
				<ul class="nav navbar-nav">
					<li class="dropdown active"><a href="#" class="dropdown-toggle" data-toggle="dropdown">拍卖品 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">IPHONE</a></li>
							<li><a href="#">HTC</a></li>
							<li><a href="#">MAC</a></li>
							<li><a href="#">IPAD</a></li>
						</ul>
					</li>
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search"></span> Submit
					</button>
				</form>
			</div>
		</nav>

		<!-- 拍卖品信息 -->
		<div class="row">
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<img src="${contextPath }/common/images/test.jpg" class="img-rounded img-responsive">
					<div class="caption">
						<h3>Thumbnail label</h3>
						<p>...</p>
						<p>
							<a href="#" class="btn btn-primary">Button</a> <a href="#" class="btn btn-default">Button</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<img src="${contextPath }/common/images/test.jpg" class="img-rounded img-responsive">
					<div class="caption">
						<h3>Thumbnail label</h3>
						<p>...</p>
						<p>
							<a href="#" class="btn btn-primary">Button</a> <a href="#" class="btn btn-default">Button</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<img src="${contextPath }/common/images/test.jpg" class="img-rounded img-responsive">
					<div class="caption">
						<h3>Thumbnail label</h3>
						<p>...</p>
						<p>
							<a href="#" class="btn btn-primary">Button</a> <a href="#" class="btn btn-default">Button</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<img src="${contextPath }/common/images/test.jpg" class="img-rounded img-responsive">
					<div class="caption">
						<h3>Thumbnail label</h3>
						<p>...</p>
						<p>
							<a href="#" class="btn btn-primary">Button</a> <a href="#" class="btn btn-default">Button</a>
						</p>
					</div>
				</div>
			</div>
		</div>

		<ul class="pagination">
			<li><a href="#">&laquo;</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">&raquo;</a></li>
		</ul>

	</div>
</body>
<%-- <script type="text/javascript" src="${contextPath }/main/js/index.js" ></script> --%>
</html>