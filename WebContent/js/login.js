function clickBtn(form) {
    var username = form.username.value;
    var password = form.password.value;
    var xmlhttp;

    if (username == null || username == "") {
        form.username.focus();
        return false;
    }
    if (password == null || password == "") {
        form.password.focus();
        return false;
    }

    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function(){
        if(xmlhttp.readyState==4&&xmlhttp.status==200){
            window.location.href="/ExcelImport/jsp/main.jsp";
        }
    }
    var url="/ExcelImport/login.html";
    var sendStr = "username=" + username + " password=" + password;
    
    xmlhttp.open("POST",url, true);
    xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xmlhttp.send(sendStr);
}
