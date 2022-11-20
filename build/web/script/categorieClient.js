/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $.ajax({
        url: "/admin/listproduits",
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("erreur");
        }
    });
    function remplir(data) {
        var liste = $("#produit");
        var option = "";
        for (i = 0; i < data.length; i++) {
            option += "<option value = " + data[i].id + ">" + data[i].nom + "</option>";
        }
        liste.html(option);
    }

 });

