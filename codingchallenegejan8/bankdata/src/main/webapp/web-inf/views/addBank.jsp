<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bank</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>bank Registration</h2>
		<form action="/addbankdata" method="post">
			<div class="form-group">
				<label for="pwd">BankName:</label> <input type="text"
					class="form-control" id="banm" placeholder="Enter bankname"
					name="bankName" required="required">
			</div>
			<div class="form-group">
				<label for="pwd">Location:</label> <input type="text"
					class="form-control" id="ln" placeholder="Enter Location"
					name="location" required="required">
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