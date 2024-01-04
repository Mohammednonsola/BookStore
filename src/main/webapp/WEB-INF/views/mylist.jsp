<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border="1">
  <tr>
  <th>BookId</th>
  <th>BookName</th>
  <th>BookAuthor</th>
  <th>BookPage</th>
  <th>BookPrice</th>
  <th>Remove</th>
  </tr>
 
  <c:forEach var="add" items="${list}">
   <tr>
   <td>${add.id}</td>
   <td>${add.book}</td>
   <td>${add.author}</td>
   <td>${add.page}</td>
   <td>${add.price}</td>
   <td><a href="remove?id=${add.id}">Remove</a></td>
    </tr>
   </c:forEach>
 
 </table>
</html>