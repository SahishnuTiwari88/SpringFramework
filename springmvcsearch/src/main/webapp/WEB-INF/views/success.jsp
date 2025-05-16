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
<h1 style = "color:green"> Register Successfully</h1>
<%-- <h4>Student Details is : ${student}</h4> --%>
<h4>Student Name is : ${student.name}</h4>
<h4>Student Roll Id is : ${student.id}</h4>
<h4>Student DOB is : ${student.dob}</h4>
<h4>Student course is : ${student.courses}</h4>
<h4>Student gender is : ${student.gender}</h4>
<h4>Student type is : ${student.type}</h4>
<h4>Student Street is : ${student.address.street}</h4>
<h4>Student City is : ${student.address.city}</h4>
<h4>Student Zipcode is : ${student.address.zip}</h4>
</body>
</html>