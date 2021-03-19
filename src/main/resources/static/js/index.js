var clickCountBefore = 0;
var clickCountAfter = 0;
var clickCountAfterTemp = 0;

$(document).ready(function () {
    syncClickCount();
    $("#div_rabbit").click(function () {
        clickCountAfterTemp = clickCountAfterTemp + 1;
    })

    window.setInterval("refreshCount()",1000)
});


function refreshCount() {
    if (clickCountAfterTemp <= 0) {
        return;
    }
    syncClickCount();
}

function syncClickCount(){
    clickCountAfter = clickCountAfterTemp;
    clickCountAfterTemp = 0;

    $.post("/syncClickCount", {clickCountAfter: clickCountAfter}, function (data, status) {
        var dataJson = jQuery.parseJSON(data);
        clickCountBefore = dataJson.clickCount;
        $("#span_clickCount").html(clickCountBefore);
    })
}