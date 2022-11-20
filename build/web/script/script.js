$(document).ready(function () {
    $.ajax({
        url: "FindMarques",
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("erreur");
        }
    });


 });
 $(document).ready(function () {
    $.ajax({
        url: "FindCategories",
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("erreur");
        }
    });


 });