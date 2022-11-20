<%-- 
    Document   : catalogue
    Created on : 20 nov. 2022, 13:12:02
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>product card</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link href="style/catalogue.css" rel="stylesheet" type="text/css"/>
    <script src="script/catalogue.js" type="text/javascript"></script> 
  </head>
  <body>
    <%@include file="nav.jsp" %>
    <div class="wrapper">
      <div class="cart-nav">
        <div class="icon">
          <i class="fas fa-shopping-cart"></i>
          <span>Panier</span>
        </div>
        <div class="item-count">0</div>
      </div>
      <div class="card">
        <img src="images/img1.jpg" alt="">
        <div class="content">
          <div class="row">
            <div class="details">
              <span>nom</span>
              <p>description</p>
            </div>
            <div class="price">3</div>
          </div>
          <div class="buttons">
            <button class="cart-btn">Ajouter au panier</button>
          </div>
        </div>
      </div>
      <div class="card">
        <img src="images/img2.jpg" alt="">
        <div class="content">
          <div class="row">
            <div class="details">
              <span>nom</span>
              <p>description</p>
            </div>
            <div class="price">8</div>
          </div>
          <div class="buttons">
            <button class="cart-btn">Ajouter au panier</button>
          </div>
        </div>
      </div>
      <div class="card">
        <img src="images/img1.jpg" alt="">
        <div class="content">
          <div class="row">
            <div class="details">
              <span>nam</span>
              <p>description</p>
            </div>
            <div class="price">5</div>
          </div>
          <div class="buttons">
            <button class="cart-btn">Ajouter au panier</button>
          </div>
        </div>
      </div>
    </div>
    <script src="script.js"></script>

  </body>
</html>
