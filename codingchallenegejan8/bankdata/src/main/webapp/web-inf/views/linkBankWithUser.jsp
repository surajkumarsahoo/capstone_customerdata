<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Link Bank With User</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<form action="/linkuserwithbank" method="post">
			<select name="bankId">
				<option selected>Bank Name</option>
				<c:forEach var="bank" items="${banks}">
					<option value="${bank.bankId}">${bank.bankName}</option>
				</c:forEach>

			</select> <select name="userId">
				<option selected>User Name</option>
				<c:forEach var="user" items="${users}">
					<option value="${user.userId}">${user.userName}</option>
				</c:forEach>

			</select>
			<button type="submit" class="btn btn-primary">Link</button>
		</form>
	</div>


</body>
</html>