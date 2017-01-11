var t = null;
t = setTimeout(time,1000);
function time()
{
    clearTimeout(t);
    dt = new Date();
    var year=dt.getYear() + 1900;
    var month=dt.getMonth() + 1;
    var day=dt.getDate();
    var hour=dt.getHours();
    var minute=dt.getMinutes();
    var second=dt.getSeconds();
    minute = extra(minute);
    second = extra(second);

    document.getElementById("timeShow").innerHTML = 
        year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second;
    t = setTimeout(time,1000);
} 

function extra(x) {

    if(x < 10) {
        return "0" + x;
    } else {
        return x;
    }
}