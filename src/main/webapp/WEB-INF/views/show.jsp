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
  <th>Delete</th>
  <th>update</th>
  </tr>
 
  <c:forEach var="add" items="${show}">
   <tr>
   <td>${add.id}</td>
   <td>${add.book}</td>
   <td>${add.author}</td>
   <td>${add.page}</td>
   <td>${add.price}</td>
   <td><a href="delete?id=${add.id}">Delete</a></td>
   <td><a href="getbyid?id=${add.id}">update</a></td>
   <td><a href="mylist?id=${add.id}">AddBook</a></td>

    </tr>
   </c:forEach>
 
 </table>
 <form action="search" method="post">
id <input type="number" name="id" />
<input type="submit" value="search" />
</form>

 
</body>
</html>