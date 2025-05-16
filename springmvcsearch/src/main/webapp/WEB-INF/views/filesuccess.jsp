<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class = "color:green">${msg}</h1>
<h1>${filename }</h1>
<img alt = "img name" src = "<c:url value="/resources/image/${filename }"/>"/>



</body>
</html>