<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="base.jsp"%>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill the Product Detail</h1>
				<form action="handle-product" method="post">
					<div class="form-group">
						<label for="name">Product name</label><input type="text"
							class="form-control" id="prodName" name="prodName"
							placeholder="enter name here,,">
					</div>
					<div class="form-group">
						<label for="name">Product Description</label>
						<textarea class="form-control" id="description" name="description"
							rows="5" placeholder="enter description here,,">
							</textarea>
					</div>
					<div class="form-group">
						<label for="name">Product Price</label><input type="text"
							class="form-control" id="price" name="price"
							placeholder="enter price here,,">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath } /"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>