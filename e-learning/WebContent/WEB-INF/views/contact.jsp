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
  <h1>Contact US</h1>
  <form action="<%= request.getContextPath() %>/contact" method="post">
   <table style="with: 80%">   
   <tr>
     <td>UserId</td>
     <td><input type="text" name="user_id" /></td>
    </tr>
      <br><br>
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" /></td>
    </tr>  <br><br>
    <tr>
     <td>Mail ID</td>
     <td><input type="text" name="email" /></td>
    </tr>  <br><br>
    <tr>
     <td>Phone Number</td>
     <td><input type="text" name="phone_no" /></td>
    </tr>  <br><br>
    
    <tr>
     <td>Message</td>
     <td><input type="text" name="message" /></td>
    </tr>  <br><br>
    <!-- 
    <tr>
     <td>Role</td>
     <td><input type="text" name="role" /></td>
    </tr>
     -->
   </table>
   
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>