<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Description</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/products">Inventory</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item ">
        <a class="nav-link" href="/products">Home </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/products/addProduct">Add Product</a>
      </li>
    </ul>
  </div>
</nav>
<body>
<br>
<div class="container">
<div class="card">
  <h5 class="card-header">Product Description</h5>
  <div class="card-body">
    <h5 class="card-title d-flex justify-content-center">${description.productName}</h5>
    <p class="card-text d-flex justify-content-center"> ${description.description} </p>
    <a class="btn btn-outline-info d-flex justify-content-center">${description.price }</a>
  </div>
</div>
</div>




</body>
</html>