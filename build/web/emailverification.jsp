<%-- 
    Document   : emailverification
    Created on : 17 nov. 2022, 18:58:31
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style/registration.css" rel="stylesheet" type="text/css"/>
        <title>Email verification</title>
    </head>
    <body>
           <div class="container">
        <div class="text">Email verification</div>
        <form action="#">
           <div class="form-row">
              <div class="input-data">
                 <input type="text" required>
                 <div class="underline"></div>
                 <label for="">Email</label>
              </div>             
           </div>
                 <div class="form-row submit-btn">
                    <div class="input-data">
                       <div class="inner"></div>
                       <input type="submit" value="Verifier">
                    </div>
                
              </div>
           </div>
        </form>
     </div>
    </body>
</html>
