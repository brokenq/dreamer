<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/tags.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>top页面</title>
<link rel="stylesheet" type="text/css" href="${contextPath }/common/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="${contextPath }/common/css/base.css" />
<style type="text/css">
.nav > li > a {
	position: relative;
	display: block;
	padding: 10px 15px;
	height: 50px;
	line-height: 30px;
}
</style>
<!--[if lt IE 9]>
	<script type="text/javascript" src="${contextPath }/common/bootstrap/js/html5shiv.js" ></script>
	<script type="text/javascript" src="${contextPath }/common/bootstrap/js/respond.js" ></script>
<![endif]-->
</head>
<body>
    <div class="container">
    	<div class="row">
	    	<div class="col-md-4"><img src="${contextPath }/common/images/logo.png" class="img-responsive"></div>
	    	<div class="col-md-4 col-md-offset-4 text-right" >
				<p>
					当前时间：<span id="time"></span>
					<a data-toggle="modal" href="#loginModal" class="btn btn-primary">登 录</a>
				</p>
	    	</div>
	    	<!-- 登陆框 -->
			<div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
							<h4 class="modal-title">登 录</h4>
						</div>
						<div class="modal-body">
							<form class="form-signin">
						        <input type="text" class="form-control mb10" placeholder="Username" autofocus>
						        <input type="password" class="form-control" placeholder="Password">
						        <label class="checkbox">
						          <input type="checkbox" value="remember-me"> 记住我
						        </label>
					      </form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary">登 录</button>
							<button type="button" class="btn btn-default" data-dismiss="modal">取 消</button>
						</div>
					</div>
				</div>
			</div>
    	</div>
    	
		<nav class="navbar navbar-default" role="navigation">
			<!-- 导航头：商标、响应式展示导航条 -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
	   			<a class="navbar-brand" href="#">Elaine</a>
			</div>
			<!-- 导航条链接 -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav nav-pills nav-justified">
					<li class="active"><a href="#">拍卖品</a></li>
					<li><a href="#">得标者</a></li>
					<li><a href="#">竞标流程</a></li>
				</ul>
			</div>
		</nav>
		
    </div>
</body>
<script type="text/javascript" src="${contextPath }/common/jquery/jquery.js" ></script>
<script type="text/javascript" src="${contextPath }/common/bootstrap/js/bootstrap.js" ></script>
<script type="text/javascript" src="${contextPath }/common/js/common.js" ></script>
<script type="text/javascript" src="${contextPath }/main/js/top.js" ></script>
</html>