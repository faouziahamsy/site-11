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
        <form action="#">
           <div class="form-row">
              <div class="input-data">
                 <input type="text" required>
                 <div class="underline"></div>
                 <label for="">Nom</label>
              </div>
              <div class="input-data">
                 <input type="text" required>
                 <div class="underline"></div>
                 <label for="">Email</label>
              </div>
           </div>
           <div class="form-row">
              <div class="input-data">
                 <input type="text" required>
                 <div class="underline"></div>
                 <label for="">Prenom </label>
              </div>
              <div class="input-data">
                 <input type="password" required>
                 <div class="underline"></div>
                 <label for="">Mot de passe</label>
              </div>
           </div>
           <div class="form-row">
              <div class="input-data">
                 <input type="text" required>
                 <div class="underline"></div>
                 <label for="">Telephone </label>
              </div>
              <div class="input-data">
                 <input type="password" required>
                 <div class="underline"></div>
                 <label for="">Confirmer votre mot de passe </label>
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