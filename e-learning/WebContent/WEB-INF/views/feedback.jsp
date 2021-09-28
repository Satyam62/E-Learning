<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
  <h1>FeedBack Form</h1>
  <form action="<%= request.getContextPath() %>/FeedBackServlet" method="post">
   <table style="with: 80%">
   
   <tr>
     <td>UserId</td>
     <td><input type="text" name="user_id" /></td>
    </tr>
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Mail ID</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>FeedBack</td>
     <td><input type="text" name="feedback" /></td>
    </tr>
    
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>


</body>
</html>