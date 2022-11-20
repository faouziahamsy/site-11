<%-- 
    Document   : nav
    Created on : 18 nov. 2022, 18:02:59
    Author     : DELL
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>site</title>
  <link href="style/nav.css" rel="stylesheet" type="text/css"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body>
  <div class="wrap">
    <nav>
      <input type="checkbox" id="show-search">
      <input type="checkbox" id="show-menu">
      <label for="show-menu" class="menu-icon"><i class="fas fa-bars"></i></label>
      <div class="content">
      <div class="logo"><a href="#">HABSHOP</a></div>
        <ul class="links">
          <li><a href="#">Accueil</a></li>
           <li>
            <a href="#" class="desktop-link">Catégories</a>
            <input type="checkbox" id="categorie">
            <label for="categorie">Catégories</label>
            <ul>
              <li><a href="#"></a></li>
              <li><a href="#"></a></li>
            </ul>
          </li>
          <li>
            <a href="#" class="desktop-link">Marques</a>
            <input type="checkbox" id="marques">
            <label for="marques">Marques</label>
            <ul>
              <li><a href="#"></a></li>
              <li><a href="#"></a></li>
            </ul>
          </li>
          <li><a href="Login.jsp">Se connecter </a></li>
          
         
        </ul>
      </div>
     
    </nav>
  </div>

  

</body>
</html>