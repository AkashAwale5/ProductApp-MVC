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
				<h1 class="text-center mb-3">Update the Product Detail</h1>
				<form action="handle-product" method="post">

					<input type="text" value="${product.id }" name="id" />

					<div class="form-group">
						<label for="name">Product name</label>
						 <input type="text"
							class="form-control" value="${product.prodName }"  name="prodName"
							 />
					</div>
					<div class="form-group">
						<label for="name">Product Description</label>
						<textarea class="form-control" id="description" name="description" 
							rows="5" placeholder="enter description here,,">${product.description }
							</textarea>
					</div>
					<div class="form-group">
						<label for="name">Product Price</label> <input type="text"
							class="form-control" id="price" name="price" value="${product.price }"
							placeholder="enter price here,,"  />
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath } /"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>