/**
 * placeholder
 */
;(function($){$.fn.placeholder=function(){function valueIsPlaceholder(input){return($(input).val()==$(input).attr("placeholder"));}return this.each(function(){$(this).find(":input").each(function(){if($(this).attr("type")=="password"){var new_field=$("<input type='text' />");new_field.attr("rel",$(this).attr("id"));new_field.attr("value",$(this).attr("placeholder"));new_field.attr("class",$(this).attr("class"));$(this).parent().append(new_field);new_field.hide();function showPasswordPlaceHolder(input){if($(input).val()==""||valueIsPlaceholder(input)){$(input).hide();$('input[rel='+$(input).attr("id")+']').css("color","#999").attr("tabIndex","2").show();};};new_field.focus(function(){$(this).hide();$('input#'+$(this).attr("rel")).show().focus();});$(this).blur(function(){showPasswordPlaceHolder(this);});showPasswordPlaceHolder(this);}else{function showPlaceholder(input,reload){if($(input).val()==""||(reload&&valueIsPlaceholder(input))){$(input).val($(input).attr("placeholder"));$(input).css("color","#999");}else{$(input).removeAttr("style");}};$(this).focus(function(){if($(this).val()==$(this).attr("placeholder")){$(this).val("");$(this).removeAttr("style");};});$(this).blur(function(){showPlaceholder($(this),false)});showPlaceholder(this,true);};});$(this).submit(function(){$(this).find(":input").each(function(){if($(this).val()==$(this).attr("placeholder")){$(this).val("");}});});});};$(function(){function hasPlaceholderSupport(){var i=document.createElement('input');return'placeholder'in i;};if(!hasPlaceholderSupport()){$("form,.form,.search").placeholder();$('input[autofocus=true]').focus();};});})(jQuery);

/*模态窗口*/
;(function($){
    $.fn.modalll=function(options){
       var defaults = {			
			title : "标题",
			name :'',
			width : 1000,
			content : "",
			close : "取消",
			enter : "确定",
			closeHide : false,
            footHide : false,
			callback : null
		}; 
		var options = $.extend(defaults,options);

		
		$(".specialModal").remove();
		var html = '';
		html += '<div class="modal fade specialModal '+options.name+'"><div class="modal-dialog" style="width:'+options.width+'px"><div class="modal-content"><div class="modal-header"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button><h4 class="modal-title">'+options.title+'</h4></div><div class="modal-body">'+options.content+'</div><div class="modal-footer"><a class="btn btn-white" id="model2" style="display: none;">'+'查看我的榜单'+'</a><button type="button" class="btn btn-white" data-dismiss="modal" id="modalClose">'+options.close+'</button><button type="button" class="btn btn-primary">'+options.enter+'</button></div></div></div></div>';
		$("body").append(html);
		$('.specialModal').modal('show');
		$("body").on("click",".modal-header .close,#modalClose",function(){
			$(".modal,.modal-backdrop").remove();
			$("body").removeClass("modal-open").attr("style","");
		})

		if(options.closeHide == true){
			$("#modalClose").hide();
		}
        if(options.footHide == true){
            $(".modal-footer").remove();
        }
		if(options.callback != null){
			$(".specialModal .btn:last").click(options.callback);
		}
	} 
})(jQuery);

var Dialog = {
	alert: function(content){
		$(document).modalll({
			title : "提示",
			width : 400,
			content : content,
			close : "关闭",
			enter : "确定",
			closeHide : true,
			callback: function(){
				$("#modalClose").click();
			}
		});
	},
	confirm: function(content,fn){
		$(document).modalll({
			title : "提示",
			width : 400,
			content : content,
			close : "关闭",
			enter : "确定",			
			callback: function(){fn(),$("#modalClose").click();}
		});
	}
}

//我的榜单页面中modal的tips
function showModalTip(obj, className, msg) {
    if (className === '') {
        obj.removeClass('alert');
        obj.html('');
        obj.hide();
    } else if(className=='alert-success'){
        obj.addClass('alert');
        obj.addClass(className).removeClass('alert-danger');
        obj.html(msg);
        obj.show();
    }else{
        obj.addClass('alert');
        obj.addClass(className).removeClass('alert-success');
        obj.html(msg);
        obj.show();
    }
}

/*冒泡*/
function stopDefault(e) {
	if (window.event) {
	  e.cancelBubble=true;// ie下阻止冒泡
	 } else {
	  //e.preventDefault();
	  e.stopPropagation();// 其它浏览器下阻止冒泡
	 }
}

$(function(){
	/*下拉选择*/
	$("body").on("click",".dropdown-menu a",function(){
		if($(this).hasClass('no')){
			return;
		}
		var html = $(this).html();
        var val = $(this).attr('data-value');
        $(this).parents(".dropdown").find(".word").html(html);
        $(this).parents(".dropdown").find(".word").attr('data-value',val);
	});

	//返回顶部
	$("#backTop").click(function(){
		$('html,body').animate({
			scrollTop: '0px'
		},500)
	});

	//头像移上显示
	$("body").on("mouseover",".useWarp",function(){
		$(this).find(".dropdown-toggle").addClass("open");
	});
	$("body").on("mouseout",".useWarp",function(){
		$(this).find(".dropdown-toggle").removeClass("open");
	});

	//底部菜单
	screenHeight(); 
    $(window).resize(function() {
       screenHeight(); 
    });

	//返回顶部显示
	$(window).scroll(function(){
		var sh = $(this).scrollTop();
		if(sh > $(window).height()){
			$(".new-bdsharebuttonbox .top-a").removeClass("hide");
		}else{
			$(".new-bdsharebuttonbox .top-a").addClass("hide");
		}
	});
});

//关闭消息提醒
function closeXinxiTips(){
	$(".useinfo-login").addClass("div-hide");
}

function screenHeight(){
    if($(".footer").length <= 0){
        return;
    }
    var h = $(window).height() - 182;
    $(".footer").removeClass("curr");
    var h1 = $(".footer").offset().top;
    if(h > h1){
        $(".footer").addClass("curr");
    }else{
        $(".footer").removeClass("curr");
    }
}

function checkChecked(){
	$('.i-checks').iCheck({
		checkboxClass: 'icheckbox_square-green',
		radioClass: 'iradio_square-green',
	});
	$('#checkAll').on('ifChanged', function(event){
		$(".subcheck").prop("checked", this.checked);
		if($(this).prop("checked")){
			$(".subcheck").parent().addClass("checked");
		}else{
			$(".subcheck").parent().removeClass("checked");
		}
	});
	$('.subcheck').on('ifChanged', function(event){
		$("#checkAll").prop("checked", $(".subcheck:checked").length == $(".subcheck").length ? true : false);
		if($("#checkAll").prop("checked")){
			$("#checkAll").parent().addClass("checked");
		}else{
			$("#checkAll").parent().removeClass("checked");
		}
		
	});
}

function checkChecked2(id1,id2){
    $(''+id1+' .i-checks').iCheck({
        checkboxClass: 'icheckbox_square-green',
        radioClass: 'iradio_square-green',
    });
    $(id2).on('ifChanged', function(event){

        $(""+id1+" .subcheck").prop("checked", this.checked);
        if($(this).prop("checked")){
            $(""+id1+" .subcheck").parent().addClass("checked");
        }else{
            $(""+id1+" .subcheck").parent().removeClass("checked");
        }
    });
    $(''+id1+'  .subcheck').on('ifChanged', function(event){
        $(id2).prop("checked", $(""+id1+" .subcheck:checked").length == $(""+id1+" .subcheck").length ? true : false);
        if($(id2).prop("checked")){
            $(id2).parent().addClass("checked");
        }else{
            $(id2).parent().removeClass("checked");
        }

    });
}


//上传头像
/*
*名称:图片上传本地预览插件 v1.1
*作者:周祥
*时间:2013年11月26日
*介绍:基于JQUERY扩展,图片上传预览插件 目前兼容浏览器(IE 谷歌 火狐) 不支持safari
*插件网站:http://keleyi.com/keleyi/phtml/image/16.htm
*参数说明: Img:图片ID;Width:预览宽度;Height:预览高度;ImgType:支持文件类型;Callback:选择文件显示图片后回调方法;
*使用方法: 
<div>
<img id="ImgPr" width="120" height="120" /></div>
<input type="file" id="up" />
把需要进行预览的IMG标签外 套一个DIV 然后给上传控件ID给予uploadPreview事件
$("#up").uploadPreview({ Img: "ImgPr", Width: 120, Height: 120, ImgType: ["gif", "jpeg", "jpg", "bmp", "png"], Callback: function () { }});
*/
jQuery.fn.extend({
    uploadPreview: function (opts) {
        var _self = this,
            _this = $(this);
        opts = jQuery.extend({
            Img: "ImgPr",
            Width: 100,
            Height: 100,
            ImgType: ["gif", "jpeg", "jpg", "bmp", "png"],
            Callback: function () {}
        }, opts || {});
        _self.getObjectURL = function (file) {
            var url = null;
            if (window.createObjectURL != undefined) {
                url = window.createObjectURL(file)
            } else if (window.URL != undefined) {
                url = window.URL.createObjectURL(file)
            } else if (window.webkitURL != undefined) {
                url = window.webkitURL.createObjectURL(file)
            }
            return url
        };
        _this.change(function () {
            if (this.value) {
                if (!RegExp("\.(" + opts.ImgType.join("|") + ")$", "i").test(this.value.toLowerCase())) {
                    alert("选择文件错误,图片类型必须是" + opts.ImgType.join("，") + "中的一种");
                    this.value = "";
                    return false
                }
                if ($.support.msie) {
                    try {
                        $("#" + opts.Img).attr('src', _self.getObjectURL(this.files[0]))
                    } catch (e) {
                        var src = "";
                        var obj = $("#" + opts.Img);
                        var div = obj.parent("div")[0];
                        _self.select();
                        if (top != self) {
                            window.parent.document.body.focus()
                        } else {
                            _self.blur()
                        }
                        src = document.selection.createRange().text;
                        document.selection.empty();
                        obj.hide();
                        obj.parent("div").css({
                            'filter': 'progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)',
                            'width': opts.Width + 'px',
                            'height': opts.Height + 'px'
                        });
                        div.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = src
                    }
                } else {
                    $("#" + opts.Img).attr('src', _self.getObjectURL(this.files[0]))
                }
                opts.Callback()
            }
        })
    }
});
/*图片切换*/
;(function($){
    $.fn.imgsTab=function(options){
        var defaults = {
            idName : '#imgsTabs',
            liWidth : 300,
            leftWidth : 1200
        };
        var options = $.extend(defaults,options);
        var len = $(''+options.idName+' .list-ul li').length;
        var wh = len*options.liWidth;
        $(''+options.idName+' .list-ul').width(wh);
        var num = wh/options.leftWidth;
        var nums = parseInt(num);
        if(num > nums){
            nums = nums + 1;
        }
        var html = '';
        for(var i = 0;i < nums;i++){
            if(i == 0){
                html += '<li class="curr">'+i+'</li>';
            }else{
                html += '<li>'+i+'</li>';
            }
        }
        var spotWh = nums*10 + nums*2*4;
        $(''+options.idName+' .spot-list').html(html);
        $(''+options.idName+' .spot-list').css({
            'width' : ''+spotWh+'px',
            'margin-left' : '-'+(spotWh/2)+'px'
        });
        $("body").on('click',''+options.idName+' .spot-list li',function(){
            $(''+options.idName+' .spot-list li').removeClass("curr");
            $(this).addClass("curr");
            var val = $(this).html();
            var leftW = val*options.leftWidth;
            $(''+options.idName+' .list-ul').animate({"left":"-"+leftW+"px"},500);
        })
    }
})(jQuery);
/*鼠标移上出现*/
function moveShowHide(className,name){
    var nodes  = document.querySelectorAll(className),
        _nodes = [].slice.call(nodes, 0);

    var getDirection = function (ev, obj) {
        var w = obj.offsetWidth,
            h = obj.offsetHeight,
            x = (ev.pageX - obj.offsetLeft - (w / 2) * (w > h ? (h / w) : 1)),
            y = (ev.pageY - obj.offsetTop - (h / 2) * (h > w ? (w / h) : 1)),
            d = Math.round( Math.atan2(y, x) / 1.57079633 + 5 ) % 4;

        return d;
    };

    var addClass = function ( ev, obj, state ) {
        var direction = getDirection( ev, obj ),
            class_suffix = "";

        obj.className = name;
        switch ( direction ) {
            case 0 : class_suffix = '-top';    break;
            case 1 : class_suffix = '-right';  break;
            case 2 : class_suffix = '-bottom'; break;
            case 3 : class_suffix = '-left';   break;
        }

        obj.classList.add( state + class_suffix );
    };

    // bind events
    _nodes.forEach(function (el) {
        el.addEventListener('mouseover', function (ev) {
            addClass( ev, this, 'in' );
        }, false);

        el.addEventListener('mouseout', function (ev) {
            addClass( ev, this, 'out' );
        }, false);
    });
}

