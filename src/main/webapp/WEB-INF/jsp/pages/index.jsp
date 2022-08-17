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

  <div class="collapse navbar-collapse d-flex justify-content-end" id="navbarSupportedContent">
   
    <form class="form-inline" action="/products/${product.id}" method="post">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0 " type="submit">Search</button>
    </form>
  </div>
</nav>
<div class="container">
    <table class="table">
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
      <td>${product.description}</td>
      <td><form method="GET" action="/products/deleteProduct/${product.id}" >
                        <input class="btn btn-danger" type="submit" value="DELETE"/>
                    </form>
    </tr>
  </tbody>
</c:forEach>
</table>
    
</div>
</body>
</html>