<%-- 
    Document   : registration
    Created on : 17 nov. 2022, 18:48:48
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Inscription</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link href="style/registration.css" rel="stylesheet" type="text/css"/>
   </head>
   <body>
    <div class="container">
        <div class="text">S'inscrire</div>
       <form action="<%=request.getContextPath()%>/register" method="post">
           <div class="form-row">
              <div class="input-data"> 
                 <div class="underline"></div>
                 <label for="">Nom</label>
                  <input type="text"class="form-control" id="uname" name="nom" required>
              </div>
              <div class="input-data">
                
                 <div class="underline"></div>
                 <label for="">Email</label>
                 <input type="text"
        class="form-control" id="username"
        name="email" required>
              </div>
           </div>
           <div class="form-row">
              <div class="input-data">
                 <div class="underline"></div>
                 <label for="">Prenom </label>
                 <input type="text"
        class="form-control" id="uname" 
        name="prenom" required>
              </div>
                <div class="input-data">
                 <div class="underline"></div>
                 <label for="">Telephone </label>
                 <input type="text"
        class="form-control" id="uname" 
        name="telephone" required>
              </div>
              <div class="input-data">
                 <div class="underline"></div>
                 <label for="">Mot de passe</label>
                 <input type="password"
        class="form-control" id="password" 
        name="password" required>
              </div>
           </div>
           <div class="form-row">
              <div class="input-data">
                
                 <div class="underline"></div>
                 <label for="">Adresse </label>
                 <input type="text"
        class="form-control" id="uname" 
        name="adresse" required>
              </div>
            
           </div>
                 <br />
                 <div class="form-row submit-btn">
                    <div class="input-data">
                       <div class="inner"></div>
                       <input type="submit" value="s'inscrire">
                    </div>
                
              </div>
           </div>
        </form>
     </div>
   </body>
</html>