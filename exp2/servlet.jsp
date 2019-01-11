<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html xmlns="http://w...content-available-to-author-only...3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Hello World</title>
</head>
<body>
 
<%
 
String hello = "Test Buffer";
 
%>
 
I came to test the Http Request Buffer:
 
 <form>
  First name:
  <input type="text" name="firstname" />
  Last name:
  <input type="text" name="lastname" />
</form>

 <form action="HelloServlet">
   <input type="submit" value="Send" />
</form>
 
 
</body>
</html>