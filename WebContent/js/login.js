function clickBtn(form) {
    var username = form.username.value;
    var password = form.password.value;
    if (username == null || username == "") {
        form.username.focus();
        return false;
    }
    if (password == null || password == "") {
        form.password.focus();
        return false;
    }
    return true;
}
