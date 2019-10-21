function processName(name){
    //对姓名进行脱敏处理
    if (name.length == 1){
        return '*';
    }else if(name.length == 2){
        return name.substr(0,1) + '*';
    }else if(name.length == 2){
        return name.substr(0,1) + '*' + name.substr(2,1);
    }else{
        return name.substr(0,1) + '*' + name.substr(2,1);
    }
}
function processOutid(outid){
    //对学号进行脱敏
    if (outid.length == 12) {
        return outid.substr(0,4) + "***" + outid.substr(7,5);
    }else{
        return "***";
    }

}