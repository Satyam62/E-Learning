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
  <h1>Add New Course</h1>
  <form action="<%= request.getContextPath() %>/CoursesServlet" method="post">
   <table style="with: 80%">
   
   
    <tr>
     <td>Course Name</td>
     <td><input type="text" name="c_name" /></td>
    </tr>
    <tr>
     <td>Description </td>
     <td><input type="text" name="c_desp" /></td>
    </tr>
    <tr>
     <td>Price</td>
     <td><input type="text" name="c_fees" /></td>
    </tr>
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>



</body>
</html>