<!DOCTYPE html>
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Admin- Gestion des catégories</title>
   <form action="<%=request.getContextPath()%>/admin/AddCategorie" method="post">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
    <div class="container">
        <div class="text">Ajouter une catégorie</div>
           <div class="form-row">
             <div class="form-group">
       <label for="uname">categorie:</label> <input type="text"
        class="form-control" id="uname" placeholder="categorie"
        name="categorie" required>
      </div>  
           </div>
            <div class="form-row submit-btn">
                <div class="input-data">
                    <div class="inner"></div>
                    <input type="submit" value="Ajouter la catégorie">
                </div>
                </div>
        </form>
     </div>
   </body>
</html>