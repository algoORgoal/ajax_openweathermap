$(function () {
    $.get("http://localhost:8080/remote/openweather", function (data) {
        $.each(data["list"], function (index, value2) {
            $.map(value2, function (value3, currentData2) {

                $("#time1").append(value2["main"]["temp"]);
                console.log()
            })
        });
    });
});