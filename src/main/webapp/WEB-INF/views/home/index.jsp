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

	<%@include file="/WEB-INF/views/common/header.jsp" %>
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
