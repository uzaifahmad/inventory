<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Inventory</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/products">Inventory</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/products">Home </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="products/addProduct">Add Product</a>
      </li>
    </ul>
  </div>
</nav>
<div class="container">
    <table class="table mt-3">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Price</th>
      <th scope="col">Description</th>
      <th scope="col">Delete</th>
      
    </tr>
  </thead>
  
 <c:forEach items="${products}" var="product">
  <tbody>
    <tr>
      <td>${product.id}</td>
      <td>${product.productName}</td>
      <td>${product.price}</td>
      <td><a class="btn btn-outline-primary" href="/products/description/${product.id}" >Description</a></td>
      <td><form method="GET" class="card-link" action="/products/deleteProduct/${product.id}" >
                        <input class="btn btn-danger" type="submit" value="DELETE"/>
          </form>
	   </td>
    </tr>
  </tbody>
</c:forEach>
</table>


</div>
</body>
</html>