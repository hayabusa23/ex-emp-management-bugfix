"use strict";

$(function () {
  $("#get_address_btn").on("click", () => {
    $.ajax({
      url: "https://zipcoda.net/api",
      type: "GET",
      dataType: "json",
      data: {
        zipcode: $("#zipcode").val(),
      },
      async: true,
    })
      .done((data) => {
        console.log(data);
        console.log(JSON.stringify(data));

        // $("#pref").val(data.items[0].pref);
        // $("#city").val(data.items[0].components[1]);
        // $("#detail").val(data.items[0].address);

        $("#address").val(data.items[0].pref + data.items[0].address);
      })
      .fail((XMLHttpRequest, textStatus, errorThrown) => {
        alert("正しい結果を得られませんでした。");
        console.log("XMLHttpRequest:" + XMLHttpRequest);
        console.log("textStatus    :" + textStatus);
        console.log("errorThrown   :" + errorThrown);
      });
  });
});
