<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/forms.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">

</head>

</head>
<body>
 <div class="container">
 <hr>
  <div class="row col-md-10 col-md-offset-3"> 
   
   <div class="card card-body">
     <form action="<%=request.getContextPath()%>/admin/AddProduct" method="post">
    <h2>Produit Form</h2>
    <div class="col-md-8 col-md-offset-3">

      <div class="form-group">
       <label for="uname">Nom du produit:</label> <input type="text"
        class="form-control" id="uname" placeholder="nom"
        name="nom" required>
      </div>

      <div class="form-group">
       <label for="uname">Description:</label> <input type="text"
        class="form-control" id="uname" placeholder="description"
        name="description" required>
      </div>
      <div class="form-group">
       <label for="uname">Designation:</label> <input type="text"
        class="form-control" id="uname" placeholder="designation"
        name="designation" required>
      </div>

      
        <div class="form-group">
       <label for="uname">unite:</label> <input type="text"
        class="form-control" id="unite" placeholder="unite"
        name="unite" required>
         </div>
         <div class="form-group">
       <label for="uname">prix:</label> <input type="text"
        class="form-control" id="prix" placeholder="prix"
        name="prix" required>
         </div>
        <div class="form-group">
       <label for="uname">image:</label> <input type="text"
        class="form-control" id="username" placeholder="image"
        name="unite" required>
         </div>
         <div class="form-group">

                <div class="input-data">
                <div class="underline"></div>
                <label for="marque">Marque:</label>  
                 
                    <div >
                        <select id="marque" name="marque">
                            <c:forEach var="marque" items="${marques}">
                   <option value ="<c:out value="${marque.getId()}"/>"><c:out value="${marque.getNom()}"/></option>
                </c:forEach>
                        </select> 
                      
                    </div>
                </div>
             <div class="input-data">
                <div class="underline"></div>
                <label for="categorie">categoriee:</label>                    
                    <div >
                        <select id="categorie" name="categorie">
                           <c:forEach var="categorie" items="${categories}">
                   <option value = "<c:out value="${categorie.getId()}"/>"><c:out value="${categorie.getNom()}"/></option>
                </c:forEach>
                        </select> 
                    </div>
                </div>
             <div class="input-data">
                    <div class="inner"></div>
                    <input type="submit" value="Ajouter le produit">
                </div>
     
      
     </form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>
