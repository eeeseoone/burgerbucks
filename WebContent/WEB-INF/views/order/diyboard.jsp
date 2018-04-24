<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
.diy-box{
	height:280px;
	width:220px;
	float: left;
	display: inline-block;
	background-color:white;
	padding: 10px;
	margin-left: 20px;
	margin-right: 20px;
}
.diy-detail{
	height: 200px;
	width: 200px;
	margin: auto;
	background-color: gray;
}
.text-left{
	height: 60px;
	width: 80px;
	background-color: yellow;
	float: left;
	padding-top: 5px;
}
.text-right{
	height: 60px;
	width: 120px;
	background-color: pink;
	float:right;
	padding-top: 5px;	
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="diy-box">
	<div class="diy-detail"></div>
	<div class="text-left">
		<p>금액:<br>5000원 </p>
	</div>
	<div class="text-right">
		<input type="button" value="구매">
		<input type="button" value="상세"><br>
		<input type="button" value="like">
	</div>
</div>
<div class="diy-box">
	<div class="diy-detail"></div>
	<div class="text-left"></div>
	<div class="text-right">
		<input type="button" value="구매">
		<input type="button" value="상세"><br>
		<input type="button" value="like">
	</div>
</div>
<div class="diy-box">
	<div class="diy-detail"></div>
	<div class="text-left"></div>
	<div class="text-right">
		<input type="button" value="구매">
		<input type="button" value="상세"><br>
		<input type="button" value="like">
	</div>
</div>
</body>
</html>