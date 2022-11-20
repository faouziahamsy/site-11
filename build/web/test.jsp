<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
    <main>
        <div class="container-fluid bg-trasparent my-4 p-3" style="position: relative;">
            <div class="row row-cols-1 row-cols-xs-2 row-cols-sm-2 row-cols-lg-4 g-3">
                <c:forEach var="produit" items="${produits}">
                    <div class="col-md-3">
                        <div class="card h-40 shadow-sm">
                            <img src="./kiloi.jpg" width="80px" height="200px" class="card-img-top" alt="...">
                            <div class="card-body">
                                <div class="clearfix mb-3">
                                    <span class="float-start badge rounded-pill bg-primary">
                                        <c:out value="${produit.getNom()}"/>
                                    </span>
                                    <span class="float-end price-hp"> <c:out value="${produit. getPrix()}"/> MAD</span>
                                </div>
                                <h6 class="card-title">   <c:out value="${produit.getDescription()}"/>
                                 </h6>
                                <div class="text-center my-4">
                                    <a href="#" class="btn btn-info">Modifier</a>
                                    <a href="#" class="btn btn-danger">Suppriemr</a>
                                </div>
                            </div>
                        </div>
                               
                    </div>
                             </c:forEach>   
               
            </div>
        </div>
    </main>
</body>

</html>