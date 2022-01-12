<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<% 
   List<BookEntity> list=(List)request.getAttribute("book");
    if(list != null) {
    	for(BookEntity b : list)
    	{
	%>
	<pre>
   <b>Book Id</b>    :<%=b.getBookId()%><br>
   <b>Book Name</b>  :<%=b.getBookName() %><br>
   <b>Book Cost</b>  :<%=b.getBookCost() %><br>
   </pre>
	<% }
    	}%>


</body>
</html>