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
        var liste = $("marques");
        var option = "";
        for (i = 0; i < data.length; i++) {
            option += "<option value = " + data[i] + ">" + data[i] + "</option>";
        }
        liste.html(option);
    }

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

    function remplir(data) {
        var liste = $("#categories");
        var option = "";
        for (i = 0; i < data.length; i++) {
            option += "<option value = " + data[i] + ">" + data[i] + "</option>";
        }
        liste.html(option);
    }
 });
 function myFunction(obj)
  {
    $('#marques').empty()
    var dropDown = document.findById("marqueId");
    var carId = dropDown.options[dropDown.selectedIndex].value;
    $.ajax({
            type: "POST",
            url: "",
            data: { 'marqueId': Id  },
            success: function(data){
                //Parse the returned json data
                var opts = $.parseJSON(data);
                //Use jQuery's each to iterate over the opts value

            }
        });
  }