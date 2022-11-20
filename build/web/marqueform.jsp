<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Admin- Gestion des marques</title>
      <link href="style/forms.css" rel="stylesheet" type="text/css"/>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
    <div class="container">
         <form action="<%=request.getContextPath()%>/admin/AddMarque" method="post">
        <div class="text">Ajouter une marque</div>
       
             <div class="form-row">
             <div class="form-group">
       <label for="uname">Marque:</label> <input type="text"
        class="form-control" id="uname" placeholder="marque"
        name="marque" required>
      </div>  
           </div>
          
           
            <div class="form-row submit-btn">
                <div class="input-data">
                    <div class="inner"></div>
                    <input type="submit" value="Ajouter la marque">
                </div>
                </div>
        </form>
     </div>
   </body>
</html>