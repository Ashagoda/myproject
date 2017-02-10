<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body {
    background-image: url("resources/bg.jpg");
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action=Login>
<div class="container">
<h2>Login</h2>
<form>
<div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" name="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="pass" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="button"> Remember me</label>
    </div>
  

<div class="form-group last">
                        <div class="col-sm-offset-3 col-sm-9">
                            <button type="submit" class="btn btn-success btn-sm">
                                Sign in</button>
                                 <button type="reset" class="btn btn-default btn-sm">
                                Reset</button>
                        </div>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>


