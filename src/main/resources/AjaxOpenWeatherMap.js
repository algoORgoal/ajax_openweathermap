$(function () {
    $.get("http://localhost:8080/remote/openweather", function (data) {
        $.map(data["list"], function (index10, value10) {
            console.log("typeof index10: " + typeof index10);
            console.log("typeof value10: " + typeof value10);
        });
        console.log("-------------------------------------------");
        $.each(data["list"], function (index, value2) {
            console.log("typeof index: " + typeof index);
            console.log("typeof value2: " + typeof value2);
        });
    });
});