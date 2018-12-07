<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="Styles.css" />
</head>

<body align="center">
<form action="/ShopHub/MainServlet" method="post">
<div class="main">
    <p class="sign" align="center">Welcome Back!</p>
    <form class="form1">
      <input class="un " type="text" align="center" placeholder="Enter Email-Id" name="email" required>
      <input class="pass" type="password" align="center" placeholder="Enter Password" name="password" required>
       <input type="hidden" name="checkForm"  value="login"></input>
      <input type="submit" class="submit" align="center" value="Sign in"><br><br>
     
 <p class="register" align="center"> New User? &nbsp<a href="register.jsp" >Sign Up</p>
            
    </div>
                
</form>         
</body>
</html>
