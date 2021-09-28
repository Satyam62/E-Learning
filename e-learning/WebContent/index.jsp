<%@page import="com.learning.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div align="left" mr-4>
			<h3>
				Name:
				</h3>
			<button>LogOut</button>
		</div>
		<div align="center">
			<h1>Welcome to E-Learning</h1>
			<form action="<%=request.getContextPath()%>/register" method="post">
				
				<br><br>
				<button type="submit"><a href="CoursesServlet">Course</button>
				<br><br>
				<button type="submit"><a href="contact">Contact</a></button>
				<br><br>
				<button type="submit"><a href="FeedBackServlet">feedback</button>
				<br><br>
				
			</form>
		</div>
	</div>

</body>
</html>