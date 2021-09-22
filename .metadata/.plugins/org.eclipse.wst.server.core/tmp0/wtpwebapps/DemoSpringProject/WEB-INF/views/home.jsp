<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<script src="/resources/plugins/jquery/jquery-3.6.0.min.js"></script>
	<title>Home</title>
	<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css">
</head>
<body>
	<h1>
		Hello world!  
	</h1>

	<P>  The time on the server is ${serverTime}. </P>
	<div id="test">jQuery 테스트입니다.</div>
	
	<del>부트스트랩 삭제된 텍스트 테스트 입니다.</del>

    <script>
        $('#test').css('border','1px solid blue')
    </script>
</body>
</html>
