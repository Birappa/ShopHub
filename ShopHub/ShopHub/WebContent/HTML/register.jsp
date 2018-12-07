<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String alreadyUser=request.getParameter("alreadyUser");
    out.print(alreadyUser);
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
<link rel="stylesheet" type="text/css" href="Style.css" />
</head>
<body>

		<div class="main">
    <p class="sign" align="center">Registration Page</p>
    <form class="form1" method="post" action="/ShopHub/MainServlet">
      <input class="un " type="text" placeholder="Enter User Name" name="userName" required><br>
      <input class="un" type="email"  placeholder="Enter Email-Id" name="email" required><br>
        <input class="un" type="text"  placeholder="Enter Contact Number" name="contact" required><br>
      <input class="pass" type="password"  placeholder="Enter Password" name="password" required><br>
      <input class="pass" type="password"  placeholder="Confirm Password" required><br>
    <input type="hidden" name="checkForm"  value="signup"></input>
      
      <input type="submit" class="submit"  value="Sign Up"><br>
     </form>
       
    </div>	
</body>
</html>