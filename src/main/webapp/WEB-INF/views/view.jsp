<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="newbook" method="post">
 <pre>
  BookName <input type="text" name="book" />
  Author <input type="text" name="author" />
  BookPages <input type="number" name="page" />
  BookPrice <input type="number" name="price" />
  <input type="submit" value="save"/>
 </pre>
 </form>
</body>
</html>