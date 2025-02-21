"use strict";

$(function () {

  $.ajax({
    url: "http://localhost:8080/employee/getJsonForEmployeeNameList",
    type: "get",
    dataType: "json",
    async: true,
  })
    .done(function (data) {
      // RestControllerではnameのリストをreturnするとJSON形式でdataに入る
    //   console.dir(JSON.stringify(data));

      $("#autoComplete").autocomplete({
        source: data,
      });
    })
    .fail(function (XMLHttpRequest, testStatus, errorThrown) {
      alert("エラーが発生しました.");
      console.log("XMLHttpRequest: " + XMLHttpRequest);
      console.log("testStatus: " + testStatus);
      console.log("errorThrown" + errorThrown);
    });
});
