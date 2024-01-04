<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="up" method="post">
  <pre>
   <input type="hidden" name="id" value="${f.id}"/>
  BookName <input type="text" name="book" value="${f.book}"/>
  Author <input type="text" name="author" value="${f.author}"/>
  BookPages <input type="number" name="page" value="${f.page}"/>
  BookPrice <input type="number" name="price" value="${f.price}"/>
  <input type="submit" value="Update"/>
 </pre>
 </form>
</body>
</html>