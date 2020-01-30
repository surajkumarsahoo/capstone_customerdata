<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>User Registration</h2>
		<form action="/adduserdata" method="post">
			<div class="form-group">
				<label for="pwd">UserName:</label> <input type="text"
					class="form-control" id="unm" placeholder="Enter username"
					name="userName" required="required">
			</div>
			<div class="form-group">
				<label for="pwd">Opening Balance:</label> <input type="number"
					class="form-control" id="ln" placeholder="Enter opening amount "
					name="openingBalance" required="required" min="0">
			</div>
			<button type="submit" class="btn btn-primary">Add</button>
			<br> <br> <br>
		</form>

	</div>
	<div class="container">
		<a href="home"><button type="submit" class="btn btn-primary">HOME</button></a>
	</div>
</body>
</html>