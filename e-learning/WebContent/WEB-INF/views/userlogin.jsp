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
  <h1>User Login Form</h1>
  <form action="<%= request.getContextPath() %>/loginServlet" method="post">
   <table style="with: 80%">
   
   <tr>
     <td>Mail ID</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
    <br><br>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
      <br><br>
   
   </table>
   <input type="submit" value="Submit" />
   <br><br>
   
   <button><a href="register">SignUP</a></button>
  </form>
 </div>

</body>
</html>