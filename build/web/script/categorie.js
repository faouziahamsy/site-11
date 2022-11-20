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
    function remplir(data) {
        var liste = $("#categories");
        var option = "";
        for (i = 0; i < data.length; i++) {
            option += "<option value = " + data[i].id + ">" + data[i].nom + "</option>";
        }
        liste.html(option);
    }

 });
