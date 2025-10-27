<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<html>

<head>


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/home/home.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/home/home.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>
</head>
<body>

	<div class="header" id="mainHeader">
		<div class="headerTitle">
			<h5>천천희</h5>
			<a href="javascript:void(0);" class="icon" id="toggleButton">&#9776;</a>
		</div>
		<a href="/home">Home</a> <a href="/Menu">Menu</a> <a href="/contact">Contact</a>
	</div>
	<main>
	<div>
	이미지
	</div>
	<div>
	소개글
	</div>
	<div>
	추천 메뉴???
	</div>
	<div>
	영상
	</div>
	
	</main>
	<footer>푸터</footer>
</body>

</html>
