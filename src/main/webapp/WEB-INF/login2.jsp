<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
if (request.getSession(false)==null){
	response.sendRedirect("login2.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<title>Login</title>
</head>
<body>

	<!-- checking for branching -->
	<!-- checking for branching -->

	<!--TITLE OF THE SITE-->
	<div id="title">
		<b class="first_letter_in_title">C</b>ollege <b
			class="first_letter_in_title">N</b>etwork <b
			class="first_letter_in_title">S</b>ystem
	</div>

	<!--LOGIN PAGE-->
	<div id="login">
		<form action="/LoginAction"  method="post" modelAttribute="login">
			<p>LOGIN</p>
			<hr>
			<br>
			<p
				style="color: red; margin: 0; text-align: center; font-size: 17px; margin-bottom: 10px;">
				<%
                		String msg = "&nbsp;";
                		if(session.getAttribute("WrongCredentials")!=null){
                			msg="** Incorrect ID or Password !!";
                		}
                	%>
				<%=msg %>
			</p>
			<label for="id">ID</label> <input type="text" id="id" name="id">
			<br>
			<br> 
			<label for="pw">PASSWORD</label> 
			<input type="password" id="pw" name="password"> 
			<input type="submit" id="submit">
		</form>
	</div>

</body>
</html>