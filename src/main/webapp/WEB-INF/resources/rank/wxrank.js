//收藏公众号
function tag_wx(obj,wx_name){
    $.ajax({
        url:'/custom/ajax_wxtag',
        type:'post',
        dataType:'json',
        data:{wx_name:wx_name},
        success:function(res){
            if(res.error == 0){
                $(obj).addClass('active').attr('onclick',"distag_wx(this,'"+wx_name+"');");
                $(obj).attr('title','已收藏');
            }else{
                alert(res.error_msg);
            }
        },error:function(){
            console.log('error');
        }
    });
}

//取消收藏公众号
function distag_wx(obj,wx_name){
    $.ajax({
        url:'/custom/ajax_diswxtag',
        type:'post',
        dataType:'json',
        data:{wx_name:wx_name},
        success:function(res){
            if(res.error == 0){
                $(obj).removeClass('active').attr('onclick',"tag_wx(this,'"+wx_name+"');");
                $(obj).attr('title','收藏公众号');
            }else{
                alert(res.error_msg);
            }
        },error:function(){
            console.log('error');
        }
    });
}

//导出Excel
function exportModal() {
    var gname = $("#_name").html();
    var html3 = $("#exportModal").html();
    $(document).modalll({
        title : "导出",
        width : 640,
        content : html3,
        close : "关闭",
        enter : "确定",
        callback: function(){
            var row_num = $("input[name='row_num']:checked").val();
            var sort = $("input[name='sort']:checked").val();
            var etype = $("input[name='type']:checked").val();
            var imgname = $("input[name='imgname']").val();
            var imgwidth = $("input[name='imgwidth']").val();
            var types = $('#types').html();
            if(row_num == 'more'){
                row_num =  $("input[name='row_num_text']").val();
                if(row_num == ''){row_num = 0}
                if(parseInt(row_num) == 0){
                    showModalTip($('.form-warp .wxModalTip'), 'alert-danger', '导出数量要大于0');
                    return false;
                }else if(parseInt(row_num) > exportMax){
                    showModalTip($('.form-warp .wxModalTip'), 'alert-danger', '导出数量当前最多导出'+exportMax);
                    return false;
                }
            }
            if(industry == ''){industry='all'};
            if(types == '全部'){types='all'};
            if(type=='day'){
                date = $("input[name='format_day']").val();
            }
            if(type=='week'){
                date = $("select[name='format_week']").find('option:selected').val();
            }
            if(type=='month'){
                date =  $("select[name='format_month']").find('option:selected').val();
            }
            var url = '';
            if (etype === 'image') {
                url = '/export/image?sort=' + sort +'&types='+ types +'&industry='+ industry + '&proname='+proName+'&row_num=' + row_num + '&imgname=' + imgname + '&date=' + date + '&imgwidth=' + imgwidth + '&type=' + type+'&industry_full='+industry_full+'&proName_full='+proName_full;
            }else{
                url = '/export/excel?sort=' + sort +'&types='+ types +'&industry='+ industry + '&proname='+proName+ '&row_num=' + row_num + '&date=' + date + '&type=' + type+'&industry_full='+industry_full+'&proName_full='+proName_full;
            }
            window.open(url);
            $("#modalClose").click();
        }
    });
    $('#exportTitle').html(gname+'榜单');
    if (gname) {
        $("input[name='imgname']").val(removeHTMLTag(gname+'榜单'));
    }
    checkChecked();

    //导出文件类型选择点击事件
    $('#wen_type .subcheck').on('ifChanged', function(event){
        if($(this).prop("checked") == true){
            if($(this).val() == 'excel'){
                $('#ig1,#ig2').addClass("hide");
            }else{
                $('#ig1,#ig2').removeClass("hide");
            }
        }
    });
}

function exportModal2() {
    var gname = $("#_name").html();
    var html3 = $("#exportModal2").html();
    $(document).modalll({
        title : "导出",
        width : 640,
        content : html3,
        close : "关闭",
        enter : "确定",
        callback: function(){
            var row_num = $("input[name='row_num']:checked").val();
            var sort = $("input[name='sort']:checked").val();
            var etype = $("input[name='type']:checked").val();
            var imgname = $("input[name='imgname']").val();
            var imgwidth = $("input[name='imgwidth']").val();
            var types = $('#types').html();
            if(row_num == 'more'){
                row_num =  $("input[name='row_num_text']").val();
                if(row_num == ''){row_num = 0}
                if(parseInt(row_num) == 0){
                    showModalTip($('.form-warp #groupModalTip'), 'alert-danger', '导出数量要大于0');
                    return false;
                }else if(parseInt(row_num) > exportMax){
                    showModalTip($('.form-warp #groupModalTip'), 'alert-danger', '导出数量当前最多导出'+exportMax);
                    return false;
                }
            }
            if(industry == ''){industry='all'};
            if(types == '全部'){types='all'};
            if(type=='day'){
                date = $("input[name='format_day']").val();
            }
            if(type=='week'){
                date = $("select[name='format_week']").find('option:selected').val();
            }
            if(type=='month'){
                date =  $("select[name='format_month']").find('option:selected').val();
            }
            if (etype === 'image') {
                params = {'etype':etype,'sort':sort, 'row_num':row_num, 'imgname':imgname,'date':date, 'imgwidth':imgwidth,'type':type};
            }else{
                params = {'etype':etype,'sort':sort, 'row_num':row_num, 'date':date,'type':type};
            }
            var is_succ = '';
            $.ajax({
                url: '/custom/exportwxrank',
                type: 'post',
                dataType: 'json',
                async:false,
                data: params,
                success: function (res) {
                    if (res.error == 0) {
                        is_succ =1;
                    } else {
                        showModalTip($('.form-warp #groupModalTip'), "alert-danger", res.error_msg);
                        return false;
                    }
                }, error: function () {
                    console.log('error');
                    return false;
                }
            });
            if(is_succ==1){
                var url = '';
                if (etype === 'image') {
                    url = '/export/image?sort=' + sort +'&types='+ types +'&industry='+ industry + '&proname='+proName+'&row_num=' + row_num + '&imgname=' + imgname + '&date=' + date + '&imgwidth=' + imgwidth + '&type=' + type+'&industry_full='+industry_full+'&proName_full='+proName_full;
                }else{
                    url = '/export/excel?sort=' + sort +'&types='+ types +'&industry='+ industry + '&proname='+proName+ '&row_num=' + row_num + '&date=' + date + '&type=' + type+'&industry_full='+industry_full+'&proName_full='+proName_full;
                }
                window.open(url);
                $("#modalClose").click();
            }

        }
    });
    $('#exportTitle').html(gname+'榜单');
    if (gname) {
        $("input[name='imgname']").val(removeHTMLTag(gname+'榜单'));
    }
    checkChecked();
    $('#rownums .subcheck').on('ifChanged', function(event){
        var rows = $(this).val();
        if(rows == 'more'){
            var rows_num_text = $("input[name='row_num_text']").val();
            if(rows_num_text == ''){rows_num_text = 0}
            rows = parseInt(rows_num_text);
        }
        var total_price = rows * 0.01;
        $('#total_price').html(total_price.toFixed(2));

    });

    $('#row_num_text').bind('input propertychange', function () {
        var rows_num_text = $("input[name='row_num_text']").val();
        if(rows_num_text == ''){rows_num_text = 0}
        rows_num_text = parseInt(rows_num_text);
        $('#total_price').html((rows_num_text*0.01).toFixed(2));

    });

    //导出文件类型选择点击事件
    $('#wen_type .subcheck').on('ifChanged', function(event){
        if($(this).prop("checked") == true){
            if($(this).val() == 'excel'){
                $('#ig1,#ig2').addClass("hide");
            }else{
                $('#ig1,#ig2').removeClass("hide");
            }

        }
    });
}

function removeHTMLTag(str) {
    str = str.replace(/<\/?[^>]*>/g,''); //去除HTML tag
    str = str.replace(/[ | ]*\n/g,'\n'); //去除行尾空白
    //str = str.replace(/\n[\s| | ]*\r/g,'\n'); //去除多余空行
    str=str.replace(/ /ig,'');//去掉
    return str;
}

$(function() {
    proName='';
    //城市选择插件调用
    industry = 'all';
    industry_full = 'all';
    proName_full='';

    $('#fromcity').jcity({
        urlOrData: 'http://gsdata-img1.oss-cn-hangzhou.aliyuncs.com/gsdata/gsdata_doc/common/js/city/citydata.json',
        all:true,
        qg:true,
        animate: { showClass: 'animated flipInX', hideClass: 'animated flipOutX' },
        onChoice: function (data1) {
            $("#add_data").nextAll().remove();
            $("#add_data").removeAttr("style");
            var day = $('[name="format_' + type + '"]').val();
            var types = $('#types').html();
            industry_full = data1.realName;
            proName_full = data1.proName;
            industry = data1.cityName;
            proName = data1.provinceName;
            var industry2 = data1.cityName;
            if(types == '全部'){types='all'};
            if(industry == ''){industry='all'};
            $("#rank_data tbody").empty();
            $("#add_data").html("<img class=\"loading\" src=\"http://img1.xuetang.cn/common/loading.gif\" alt=\"\"/>");
            $.get('/rank/ajax_wxrank?type='+type+'&post_time='+day+'&page=1'+'&types='+encodeURIComponent(types)+'&industry='+encodeURIComponent(industry)+'&proName='+encodeURIComponent(proName)+'&industry_full='+encodeURIComponent(industry_full)+'&proName_full='+encodeURIComponent(proName_full),function(data) {
                if(industry !='all'){$('#_industry').html(industry2+'地区');}
                data = eval("("+data+")");
                if(data.error == 1){
                    $("#rank_data tbody").append(data.error_msg);
                    $("#add_data").html("");
                    return false;
                }else if(data.error == 2){
                    $("#rank_data tbody").append(data.data);
                    $("#add_data").html("数据已加载完成");
                    return false;
                }

                $("#rank_data tbody").append(data.data);
                $("#add_data").html("点击加载更多");
            });
        }
    });


    // 日期控制
    $(".format_data").datetimepicker({
        language: "zh-CN",
        format: "yyyy-mm-dd",
        showMeridian: true,
        autoclose: true,
        todayBtn: true,
        endDate: endday,
        minView: 2
    });

    //日期的改变
    $('.format_data').datetimepicker().on('changeDate', function (ev) {
        $("#add_data").nextAll().remove();
        $("#add_data").removeAttr("style");
        var date = $('[name="format_day"]').val();
        var types = $('#types').html();
        //var industry = $('#fromcity').val();
        if(types == '全部'){types='all'};
        if(industry == ''){industry='all'};
        $("#rank_data tbody").empty();
        $("#add_data").html("<img class=\"loading\" src=\"http://img1.xuetang.cn/common/loading.gif\" alt=\"\"/>");
        $.get('/rank/ajax_wxrank?type='+type+'&post_time='+date+'&page=1'+'&types='+encodeURIComponent(types)+'&industry='+encodeURIComponent(industry)+'&proName='+encodeURIComponent(proName)+'&industry_full='+encodeURIComponent(industry_full)+'&proName_full='+encodeURIComponent(proName_full),{dataType:'json'},function(data) {
            $('#_date').html(date);
            data = eval("("+data+")");
            if(data.error == 1){
                $("#rank_data tbody").append(data.error_msg);
                $("#add_data").html("");
                return false;
            }else if(data.error == 2){
                $("#rank_data tbody").append(data.data);
                $("#add_data").html("数据已加载完成");
                return false;
            }

            $("#rank_data tbody").append(data.data);
            $("#add_data").html("点击加载更多");
        });
        //location.href = '?type=day&post_time=' + date+'&types='+types+'&industry='+industry;

    });

    //月日期的改变
    $('select[name="format_month"]').change(function () {
        $("#add_data").nextAll().remove();
        $("#add_data").removeAttr("style");
        var date = $(this).val();
        var types = $('#types').html();
        //var industry = $('#fromcity').val();
        if(types == '全部'){types='all'};
        if(industry == ''){industry='all'};
        $("#rank_data tbody").empty();
        $("#add_data").html("<img class=\"loading\" src=\"http://img1.xuetang.cn/common/loading.gif\" alt=\"\"/>");
        $.get('/rank/ajax_wxrank?type='+type+'&post_time='+date+'&page=1'+'&types='+encodeURIComponent(types)+'&industry='+encodeURIComponent(industry)+'&proName='+encodeURIComponent(proName)+'&industry_full='+encodeURIComponent(industry_full)+'&proName_full='+encodeURIComponent(proName_full),{dataType:'json'},function(data) {
            $('#_date').html(date);
            data = eval("("+data+")");
            if(data.error == 1){
                $("#rank_data tbody").append(data.error_msg);
                $("#add_data").html("");
                return false;
            }else if(data.error == 2){
                $("#rank_data tbody").append(data.data);
                $("#add_data").html("数据已加载完成");
                return false;
            }

            $("#rank_data tbody").append(data.data);
            $("#add_data").html("点击加载更多");
        });
        //location.href = '?type=month&post_time=' + date+'&types='+types+'&industry='+industry;
    });

    //周日期的改变
    $('select[name="format_week"]').change(function () {
        $("#add_data").nextAll().remove();
        $("#add_data").removeAttr("style");
        var date = $(this).val();
        var types = $('#types').html();
        //var industry = $('#fromcity').val();
        if(types == '全部'){types='all'};
        if(industry == ''){industry='all'};
        $("#rank_data tbody").empty();
        $("#add_data").html("<img class=\"loading\" src=\"http://img1.xuetang.cn/common/loading.gif\" alt=\"\"/>");
        $.get('/rank/ajax_wxrank?type='+type+'&post_time='+date+'&page=1'+'&types='+encodeURIComponent(types)+'&industry='+encodeURIComponent(industry)+'&proName='+encodeURIComponent(proName)+'&industry_full='+encodeURIComponent(industry_full)+'&proName_full='+encodeURIComponent(proName_full),{dataType:'json'},function(data) {
            $('#_date').html(date);
            data = eval("("+data+")");
            if(data.error == 1){
                $("#rank_data tbody").append(data.error_msg);
                $("#add_data").html("");
                return false;
            }else if(data.error == 2){
                $("#rank_data tbody").append(data.data);
                $("#add_data").html("数据已加载完成");
                return false;
            }

            $("#rank_data tbody").append(data.data);
            $("#add_data").html("点击加载更多");
        });
        //location.href = '?type=week&post_time=' + day+'&types='+types+'&industry='+industry;
    });


    // 日榜，周榜，月榜的点击事件
    $('.datetype').click(function () {
        var type = $(this).data('name');
        if (type == 'day') {
            location.href = '?type=' + type;
            return;
        }
        $('[name="format_' + type + '"]').find('option:selected').attr('selected', false);
        var day = $('[name="format_' + type + '"]').val();
        location.href = '?type=' + type + '&post_time=' + day;
    });

    //分类点击事件
    $('#select-typs a').click(function () {
        $("#add_data").nextAll().remove();
        $("#add_data").removeAttr("style");
        var date = $('[name="format_' + type + '"]').val();
        var types = $(this).attr('data-value');
        //var industry = $('#fromcity').val();
        if(types == '全部'){types='all'};
        if(industry == ''){industry='all'};
        $("#rank_data tbody").empty();
        $("#add_data").html("<img class=\"loading\" src=\"http://img1.xuetang.cn/common/loading.gif\" alt=\"\"/>");
        $.get('/rank/ajax_wxrank?type='+type+'&post_time='+date+'&page=1'+'&types='+encodeURIComponent(types)+'&industry='+encodeURIComponent(industry)+'&proName='+encodeURIComponent(proName)+'&industry_full='+encodeURIComponent(industry_full)+'&proName_full='+encodeURIComponent(proName_full),{dataType:'json'},function(data) {

            if(types !='all'){$('#_types').html(types+'分类');}
            data = eval("("+data+")");
            if(data.error == 1){
                $("#rank_data tbody").append(data.error_msg);
                $("#add_data").html("");
                return false;
            }else if(data.error == 2){
                $("#rank_data tbody").append(data.data);
                $("#add_data").html("数据已加载完成");
                return false;
            }

            $("#rank_data tbody").append(data.data);
            $("#add_data").html("点击加载更多");
        });
    });


    //加载25条信息
    $("#add_data").click(function() {
        page=parseInt(page)+1;
        if(typeof total_limit =='undefined'){
            location.href='/member/login';
            return false;
        }
        if(parseInt(total_limit) >= parseInt(total_page)){
            if(parseInt(total_page) < page){ return false; }
        }else if(parseInt(total_limit) < page){
            return false;
        }
        var date = $('[name="format_' + type + '"]').val();
        var types = $('#types').html();
        //var industry = $('#fromcity').val();
        if(types == '全部'){types='all'};
        if(industry == ''){industry='all'};
        $("#add_data").html("<img class=\"loading\" src=\"http://img1.xuetang.cn/common/loading.gif\" alt=\"\"/>");
        $.get('/rank/ajax_wxrank?type='+type+'&post_time='+date+'&page='+page+'&types='+encodeURIComponent(types)+'&industry='+encodeURIComponent(industry)+'&proName='+encodeURIComponent(proName)+'&industry_full='+encodeURIComponent(industry_full)+'&proName_full='+encodeURIComponent(proName_full),{dataType:'json'},function(data) {
            data = eval("("+data+")");
            if(data.error == 1){
                $("#rank_data tbody").append(data.error_msg);
                $("#add_data").html("");
                return false;
            }else if(data.error == 2){
                $("#rank_data tbody").append(data.data);
                $("#add_data").html("数据已加载完成");
                return false;
            }
            $("#rank_data tbody").append(data.data);
            if(parseInt(total_page) <= page){
                $("#add_data").html("数据已加载完成");
            }/*else if(8 <= page){   //最高权限是加载200条数据
                $("#add_data").html("当前权限只可加载"+total_limit*25+"条数据,已到最大权限 ").css("color","#0f0f0f");
            }*/else if(parseInt(total_limit) == page){
                $("#add_data").html("当前权限只可加载"+total_limit*25+"条数据,需要更多权限请点击 ").css("color","#0f0f0f");
                $("#add_data").after('<a target="_blank" href="/user/limit">扩展权限</a>');
            }else{
                $("#add_data").html("点击加载更多");
            }
        });
    });

});



