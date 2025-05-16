<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class = "text-center">Hello, Welcome ${name }</h1>

</body>
</html>


<!-- spring interceptor can be applied before handler method, after handler and after the view resolver, it can be used for validation
purpose like name starting with d or not and many more -->
<!-- if we use handlerinterceptor for this then we have to override all the methods like prehandler, pothandler, aftercopletion -->

<!-- but if we want to override any one of the method then we go for handleeinterceptoradaptor -->

<!-- we have to configure it in config file using interceptor tag and it is part of mvc so we have to include xmlns:mvc -->