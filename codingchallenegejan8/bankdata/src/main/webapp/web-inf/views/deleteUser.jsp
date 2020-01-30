<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>User Deletion</h2>
		<form action="/deleteuserdata" method="post">
			<div class="form-group">
				<label for="pwd">User Id:</label> <input type="number"
					class="form-control" id="uid" placeholder="Enter User Id"
					name="userId" required="required" min="0">
			</div>
			<button type="submit" class="btn btn-primary">Delete</button>
			<br> <br> <br>
		</form>

	</div>
			
</body>
</html>