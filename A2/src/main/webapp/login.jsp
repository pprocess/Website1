<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html language="en">
<head>
<meta charset="UTF-8">
<title>Jakarta EE | Assignment 2</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<header style="background-color:black">
        <div style="margin:0;align-self:center;text-align:center"><img src="img/logo.png" height="100em" ></div><br>
        <h2 style="color: #ccc;text-align: center;margin:0 0 20px 0;">Process Parajuli</h2>
</header>
<h1>LOGIN</h1>
<div class="mp">
	<div class="lgn">
		<h3>Enter your credentials to Login.</h3>
		<form method="post" action="LoginServlet">
    	<input type="text" name="username" placeholder="Username" required /><br>
    	<input type="password" name="password" placeholder="Password" required /><br>
    	<div class="btn">
        	<div><button type="submit">Login</button></div>
        <div>
        <button type="button" onclick="window.location.href='index.jsp'">Back</button></div>
    </div>
</form>
	</div>
</div>
</body>
<footer >&copy;Process Parajuli | 2025</footer>
</html>