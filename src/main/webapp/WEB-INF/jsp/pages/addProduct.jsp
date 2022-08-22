<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Add Product</title>
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
        <a class="nav-link active" href="addProduct">Add Product</a>
      </li>
    </ul>
  </div>
</nav>

<h3 align="center">Add Product to Inventory</h3>
<div class="container">
<form:form action="addProduct" method="post" modelAttribute="product" ><br>

<div class="form-group row"> 
<form:label path="productName" class="col-sm-2 col-form-label">Product Name: </form:label>
<div class="col-sm-10">
<form:input type ="text" class="form-control" path="productName"/>
</div>
</div>
<div class="form-group row">
<form:label path="price" class="col-sm-2 col-form-label">Price : </form:label>
<div class="col-sm-10">
<form:input type="number" class="form-control" path="price"/>
</div>
</div>
<div class="form-group row">
<form:label path="description" class="col-sm-2 col-form-label">Description : </form:label>
<div class="col-sm-10">
<form:input type ="text" class="form-control" path="description"/>
</div>
</div>
<div align="center">
<form:button class="btn btn-primary">Add</form:button>
</div>
</form:form>
</div>
</body>
</html>