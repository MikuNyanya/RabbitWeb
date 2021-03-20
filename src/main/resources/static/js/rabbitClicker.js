var clickCountBefore = 0;
var clickCountAfter = 0;
var clickCountAfterTemp = 0;

$(document).ready(function () {
    // 初始化菜单
    menuInit();
    //同步后台点击总数
    syncClickCount();
    // 绑定兔子点击事件
    $("#div_rabbit").click(function () {
        clickCountAfterTemp = clickCountAfterTemp + 1;
    })
    // 定时同步总点击数
    window.setInterval("syncClickCount()", 2000)
});


function syncClickCount() {
    clickCountAfter = clickCountAfterTemp;
    clickCountAfterTemp = 0;

    $.post("rabbitclicker/syncClickCount", {clickCountAfter: clickCountAfter}, function (data, status) {
        var dataJson = jQuery.parseJSON(data);
        clickCountBefore = dataJson.clickCount;
        $("#span_clickCount").html(clickCountBefore);
    })
}