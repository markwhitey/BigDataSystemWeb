<%--
  Created by IntelliJ IDEA.
  User: hadoop
  Date: 2019-04-19
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<script src="./舆情监测平台_files/hm.js.下载">

</script>
<script src="chrome-extension://ljdobmomdgdljniojadhoplhkpialdid/page/prompt.js"></script><script src="chrome-extension://ljdobmomdgdljniojadhoplhkpialdid/page/runScript.js"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生图书门禁大数据平台</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="HandheldFriendly" content="true">
    <meta name="MobileOptimized" content="width">
    <meta id="viewport" content="width=device-width, user-scalable=no,initial-scale=1" name="viewport">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta content="black" name="apple-mobile-web-app-status-bar-style">
    <meta content="telephone=no" name="format-detection">
    <script src="/js/echarts.js"></script>
    <script src="/js/echarts-wordcloud.js"></script>
    <script src="/js/jquery.min.js"></script>
    <script src="/js/theme/macarons.js"></script>
    <script src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
    <script src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
    <script src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
    <script src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
    <%--<script src="https://api.map.baidu.com/api?v=2.0&ak=xfhhaTThl11qYVrqLZii6w8qE5ggnhrY&__ec_v__=20190126"></script>--%>
    <%--<script src="https://api.map.baidu.com/getscript?v=2.0&ak=xfhhaTThl11qYVrqLZii6w8qE5ggnhrY&services=&t=20190123111209"></script>--%>
    <script src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
    <script src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
    <script src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>
    <link href="/resources/yuqing/style2.css" type="text/css" rel="stylesheet">
    <link href="/resources/yuqing/animate.css" type="text/css" rel="stylesheet">
<body>
<div class="query" >
    <div id = "selectinput" style="display: block;float: left;">
        <select name="grade_select" id="grade_select" style="background: rgba(42,47,41,0.98);color:#3eff45;font-size: large">
            <option value="all" selected>2013~2018级</option>
            <option value="2013">2013级</option>
            <option value="2014">2014级</option>
            <option value="2015">2015级</option>
            <option value="2016">2016级</option>
            <option value="2017">2017级</option>
            <option value="2018">2018级</option>
        </select>
    </div>
    <div style="display: block; float: left;">
        <input type="text" id="outid" placeholder="输入学号查看信息" style="background: #2a2f29;color:#3eff45;font-size: large" name="学号">
    </div>
    <div style="display: block;">
        <input type="button" id="query_button" style="background: #2a2f29;color:#3eff45;font-size: large" name="查询" value="查询">
    </div>
</div>
<div class="wrapper">
    <header class="tc">
        <h2 class="fs34">学生图书门禁大数据平台</h2>
    </header>
    <section class="main clearfix">
        <div class="m-r r">

            <div class="mCont mb10">
                <p class="line2"><img src="/resources/yuqing/mcont-bg2.png"></p>
                <h3 class="mCont-tit mCont-tit-bg2 fs24 ar">
                    <label>用户画像</label>
                </h3>
                <div id="hotwordsCloud" class="echarTabs" style="position: relative; overflow: hidden; width: 100%; height: 510px"></div>

            </div>

        </div>
        <div class="m-l l">
            <div class="mCont mb10">
                <p class="line2"><img src="/resources/yuqing/mcont-bg2.png"></p>
                <h3 class="mCont-tit fs24 ">
                    <label>星座借书榜</label>
                </h3>
                <div class="mCont-echarts">
                    <div id="publicNumbTop" class="echarTabs" style="position: relative; overflow: hidden; width: 100%; height: 510px">

                    </div>
                </div>
            </div>
        </div>
        <div class="m-w50 r">
            <p class="line2"><img src="/resources/yuqing/mcont-bg3.png"></p>
            <h3 class="mCont-tit mCont-tit-bg4 fs24 ar">
                <label>个人借书统计</label>
            </h3>
            <div id="hotWord" class="echarTabs" style="height: 350px;"></div>
        </div>
        <div class="m-w50 l">
            <p class="line2"><img src="/resources/yuqing/mcont-bg3.png"></p>
            <h3 class="mCont-tit mCont-tit-bg3 fs24">
                <label>学习强度占比</label>
            </h3>
            <div id="monitNum" class="echarTabs" style="height: 350px;" ></div>
        </div>
    </section>
</div>
<script>


    function NumDescSort(a,b){
        return b.value-a.value;
    }
    function NumAsceSort(a,b){
        return a.value-b.value;
    }

    // 先进行一次降序排序，找出最大的前十个
    //citydata.sort(NumDescSort);

    // for (var i = 0; i < 10; i++) {
    //     var top10 = {
    //         name: citydata[i].name,
    //         value: citydata[i].value
    //     };
    //     bartop10.push(top10);
    // }
    //
    // bartop10.sort(NumAsceSort);
    // for (var i = 0; i < bartop10.length; i++) {
    //     titledata.push(bartop10[i].name);
    // }


    var option = {
        title:
            {
                show: true,
                text: '星座排行榜',
                x:'center',
                textStyle: {
                    color: '#33f0f5',
                    fontSize: 18
                }
            },
        tooltip:{
            trigger: "item"
        },
        legend: {
            show: false
        },
        grid: {
            // 仅仅控制条形图的位置
            show: true,
            containLabel: false,
            left: 50,
            top: 40,
            bottom: 30,
            width: '80%'
        },
        xAxis: [
            {
                type: "value",
                position: 'top',
                inside: false,
                axisLabel: {
                    show: false
                },
                splitLine: {
                    show: false
                },
                margin: 10
            }
        ],
        yAxis: [
            {
                type: "category",
                boundaryGap: true,
                axisLine: {
                    show: false,
                    lineStyle:{
                        color: '#72f5d6'
                    }
                },
                axisLabel: {
                    align: "right",
                    margin: 10,
                    showMaxLabel: true,
                },
                //data: titledata
            }
        ],

        series:
            [{
                name: "借书总数",
                type: "bar",
                roam: false,
                visualMap: false,
                itemStyle: {
                    color: "#619cfc"
                },
                barWidth: 18,
                label: {
                    normal: {
                        show: true,
                        fontSize: 12,
                        position: 'insideLeft',

                    },
                    emphasis: {
                        show: true
                    }
                },
                //data: bartop10
            }]
    };
    $.ajax({
        url: '/bookborrow/getXingZuoRank',
        type: 'get',
        dataType: 'json',
        success: function (res) {
            //初始化echarts实例
            var myChart = echarts.init(document.getElementById('publicNumbTop'));
            var titledata = [];
            var bartop10 = [];
            for (var i = 0; i < res.length; i++) {
                var top10 = {
                    name: res[i].name,
                    value: res[i].count
                };
                bartop10.push(top10);
            }
            bartop10.sort(NumAsceSort);
            for (var i = 0; i < bartop10.length; i++) {
                titledata.push(bartop10[i].name);
            }
            option.series[0].data = bartop10;
            option.yAxis[0].data = titledata;
            //使用制定的配置项和数据显示图表
            myChart.setOption(option);
        }, error: function () {
            console.log('error');
        }
    });
</script>
<script>
    $("#query_button").click(function() {
        var outid = $("#outid").val();
        if (outid != null && outid != "" && outid.length == 12) {
            $.ajax({
                url: '/getUserBookTagsByOutid',
                type: 'get',
                dataType: 'json',
                data: {outid: outid},
                success: function (res) {
                    var myChart = echarts.init(document.getElementById('hotwordsCloud'));
                    var maskImage2 = new Image();
                    maskImage2.src = res.pic;
                    maskImage2.onload = function () {

                        myChart.setOption({
                            //backgroundColor: '#f7efff',
                            // title: {
                            //     text: 'Google Trends',
                            //     link: 'http://www.google.com/trends/hottrends'
                            // },
                            tooltip: {
                                show: true
                            },
                            series: [{
                                name: '用户画像',
                                size: ['35%', '40%'],
                                textPadding: 0,//文本间距离
                                type: 'wordCloud',
                                gridSize: 0,//分散度
                                //sizeRange: [0, 50],
                                shape: 'pentagon',
                                rotationRange: [-45, 0, 45, 80],
                                //maskImage: maskImage2,
                                drawOutOfBound: true,
                                textStyle: {
                                    normal: {
                                        color: function () {
                                            return 'rgb(' +
                                                Math.round(Math.random() * 240) +
                                                ', ' + Math.round(Math.random() * 240) +
                                                ', ' + Math.round(Math.random() * 240) + ')'
                                        },
                                        //fontSize: 5
                                    },
                                    emphasis: {
                                        shadowBlur: 5,
                                        shadowColor: '#f0ff57'
                                    }
                                },
                                x: 'center',
                                width: '100%',
                                height: '100%',
                                data: res.data
                            }]
                        })
                    }
                }, error: function () {
                    console.log('error');
                }
            });

            var option4 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'horizontal',
                    x: 'center',
                    y: 'bottom',
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    }
                },
                toolbox: {
                    show: true,
                    feature: {
                        mark: {show: true},
                        dataView: {show: true, readOnly: false},
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'center',
                                    max: 1548
                                }
                            }
                        },
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                calculable: true,
                series: [
                    {
                        name: '个人借阅统计',
                        type: 'pie',
                        radius: ['50%', '70%'],
                        itemStyle: {
                            normal: {
                                label: {
                                    show: true
                                },
                                labelLine: {
                                    show: true
                                }
                            },
                            emphasis: {
                                label: {
                                    show: true,
                                    position: 'center',
                                    textStyle: {
                                        fontSize: '30',
                                        fontWeight: 'bold'
                                    }
                                }
                            }
                        },
                    }
                ]
            };
            $.ajax({
                url: '/bookborrow/getPersonTotalBookBorrow',
                type: 'get',
                dataType: 'json',
                data: {outid: outid},
                success: function (res) {
                    var myChart4 = echarts.init(document.getElementById("hotWord"), "macarons");
                    option4.legend.data = ["借阅总数","借阅次数"]
                    option4.series[0].data = [{name: "借阅总数", value: res.total}, {
                        name: "借阅次数",
                        value: res.frequency
                    }]
                    myChart4.setOption(option4);
                }, error: function () {
                    console.log('error');
                }
            });
        }else{
            alert("请输入正确的学号！");
        }
    });
    $(function () {
        $.ajax({
            url: '/getUserBookTagsByOutid',
            type: 'get',
            dataType: 'json',
            data: {outid: "201508040134"},
            success: function (res) {
                var myChart = echarts.init(document.getElementById('hotwordsCloud'));
                var maskImage2 = new Image();
                maskImage2.src = res.pic;
                maskImage2.onload = function () {

                    myChart.setOption({
                        //backgroundColor: '#f7efff',
                        // title: {
                        //     text: 'Google Trends',
                        //     link: 'http://www.google.com/trends/hottrends'
                        // },
                        tooltip: {
                            show: true
                        },
                        series: [{
                            name: '用户画像',
                            size: ['35%', '40%'],
                            textPadding: 0,//文本间距离
                            type: 'wordCloud',
                            gridSize: 0,//分散度
                            //sizeRange: [0, 50],
                            shape: 'pentagon',
                            rotationRange: [-45, 0, 45, 80],
                            //maskImage: maskImage2,
                            drawOutOfBound: true,
                            textStyle: {
                                normal: {
                                    color: function () {
                                        return 'rgb(' +
                                            Math.round(Math.random() * 240) +
                                            ', ' + Math.round(Math.random() * 240) +
                                            ', ' + Math.round(Math.random() * 240) + ')'
                                    },
                                    //fontSize: 5
                                },
                                emphasis: {
                                    shadowBlur: 5,
                                    shadowColor: '#f0ff57'
                                }
                            },
                            x: 'center',
                            width: '100%',
                            height: '100%',
                            data: res.data
                        }]
                    })
                }
            }, error: function () {
                console.log('error');
            }
        });

    });
</script>
<script>
    $("#grade_select").change(function(){
        var selectedValue = $("#grade_select").val();
        if (selectedValue == "all") {
            var option3 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    y: 'bottom',
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    }
                },
                toolbox: {
                    show: true,
                    feature: {
                        mark: {show: true},
                        dataView: {show: true, readOnly: false},
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'center',
                                    max: 1548
                                }
                            }
                        },
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                calculable: true,
                series: [
                    {
                        name: '聚类结果',
                        type: 'pie',
                        radius: ['50%', '70%'],
                        itemStyle: {
                            normal: {
                                label: {
                                    show: true
                                },
                                labelLine: {
                                    show: true
                                }
                            },
                            emphasis: {
                                label: {
                                    show: true,
                                    position: 'center',
                                    textStyle: {
                                        fontSize: '30',
                                        fontWeight: 'bold'
                                    }
                                }
                            }
                        },
                    }
                ]
            };
            $.ajax({
                url: '/bookborrow/getKmeansPercent',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    var myChart3 = echarts.init(document.getElementById("monitNum"), "macarons");
                    option3.legend.data = ["学习强度强 借阅狂人 热爱学习 图书馆 考研", "学习强度一般 学习勤奋 考研 图书馆 阅读爱好者", "学习强度低 不爱阅读 不爱去图书馆","学习强度较高 阅读爱好者 热爱学习"]
                    option3.series[0].data = [{name: "学习强度强 借阅狂人 热爱学习 图书馆 考研", value: res.one}, {
                        name: "学习强度一般 学习勤奋 考研 图书馆 阅读爱好者",
                        value: res.two
                    }, {name: "学习强度低 不爱阅读 不爱去图书馆", value: res.three}, {name: "学习强度较高 阅读爱好者 热爱学习", value: res.four}]
                    myChart3.setOption(option3);
                }, error: function () {
                    console.log('error');
                }
            });

            var option = {
                title:
                    {
                        show: true,
                        text: '星座排行榜',
                        x:'center',
                        textStyle: {
                            color: '#33f0f5',
                            fontSize: 18
                        }
                    },
                tooltip:{
                    trigger: "item"
                },
                legend: {
                    show: false
                },
                grid: {
                    // 仅仅控制条形图的位置
                    show: true,
                    containLabel: false,
                    left: 50,
                    top: 40,
                    bottom: 30,
                    width: '80%'
                },
                xAxis: [
                    {
                        type: "value",
                        position: 'top',
                        inside: false,
                        axisLabel: {
                            show: false
                        },
                        splitLine: {
                            show: false
                        },
                        margin: 10
                    }
                ],
                yAxis: [
                    {
                        type: "category",
                        boundaryGap: true,
                        axisLine: {
                            show: false,
                            lineStyle:{
                                color: '#72f5d6'
                            }
                        },
                        axisLabel: {
                            align: "right",
                            margin: 10,
                            showMaxLabel: true,
                        },
                        //data: titledata
                    }
                ],

                series:
                    [{
                        name: "借书总数",
                        type: "bar",
                        roam: false,
                        visualMap: false,
                        itemStyle: {
                            color: "#619cfc"
                        },
                        barWidth: 18,
                        label: {
                            normal: {
                                show: true,
                                fontSize: 12,
                                position: 'insideLeft',

                            },
                            emphasis: {
                                show: true
                            }
                        },
                        //data: bartop10
                    }]
            };
            $.ajax({
                url: '/bookborrow/getXingZuoRank',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    //初始化echarts实例
                    var myChart = echarts.init(document.getElementById('publicNumbTop'));
                    var titledata = [];
                    var bartop10 = [];
                    for (var i = 0; i < res.length; i++) {
                        var top10 = {
                            name: res[i].name,
                            value: res[i].count
                        };
                        bartop10.push(top10);
                    }
                    bartop10.sort(NumAsceSort);
                    for (var i = 0; i < bartop10.length; i++) {
                        titledata.push(bartop10[i].name);
                    }
                    option.series[0].data = bartop10;
                    option.yAxis[0].data = titledata;
                    //使用制定的配置项和数据显示图表
                    myChart.setOption(option);
                }, error: function () {
                    console.log('error');
                }
            });
        }else{
            var option3 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    y: 'bottom',
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    }
                },
                toolbox: {
                    show: true,
                    feature: {
                        mark: {show: true},
                        dataView: {show: true, readOnly: false},
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'center',
                                    max: 1548
                                }
                            }
                        },
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                calculable: true,
                series: [
                    {
                        name: '聚类结果',
                        type: 'pie',
                        radius: ['50%', '70%'],
                        itemStyle: {
                            normal: {
                                label: {
                                    show: true
                                },
                                labelLine: {
                                    show: true
                                }
                            },
                            emphasis: {
                                label: {
                                    show: true,
                                    position: 'center',
                                    textStyle: {
                                        fontSize: '30',
                                        fontWeight: 'bold'
                                    }
                                }
                            }
                        },
                    }
                ]
            };
            $.ajax({
                url: '/bookborrow/getKmeansPercent',
                type: 'get',
                dataType: 'json',
                data: {grade: selectedValue},
                success: function (res) {
                    var myChart3 = echarts.init(document.getElementById("monitNum"), "macarons");
                    option3.legend.data = ["学习强度强 借阅狂人 热爱学习 图书馆 考研", "学习强度一般 学习勤奋 考研 图书馆 阅读爱好者", "学习强度低 不爱阅读 不爱去图书馆","学习强度较高 阅读爱好者 热爱学习"]
                    option3.series[0].data = [{name: "学习强度强 借阅狂人 热爱学习 图书馆 考研", value: res.one}, {
                        name: "学习强度一般 学习勤奋 考研 图书馆 阅读爱好者",
                        value: res.two
                    }, {name: "学习强度低 不爱阅读 不爱去图书馆", value: res.three}, {name: "学习强度较高 阅读爱好者 热爱学习", value: res.four}]
                    myChart3.setOption(option3);
                }, error: function () {
                    console.log('error');
                }
            });

            var option = {
                title:
                    {
                        show: true,
                        text: '星座排行榜',
                        x:'center',
                        textStyle: {
                            color: '#33f0f5',
                            fontSize: 18
                        }
                    },
                tooltip:{
                    trigger: "item"
                },
                legend: {
                    show: false
                },
                grid: {
                    // 仅仅控制条形图的位置
                    show: true,
                    containLabel: false,
                    left: 50,
                    top: 40,
                    bottom: 30,
                    width: '80%'
                },
                xAxis: [
                    {
                        type: "value",
                        position: 'top',
                        inside: false,
                        axisLabel: {
                            show: false
                        },
                        splitLine: {
                            show: false
                        },
                        margin: 10
                    }
                ],
                yAxis: [
                    {
                        type: "category",
                        boundaryGap: true,
                        axisLine: {
                            show: false,
                            lineStyle:{
                                color: '#72f5d6'
                            }
                        },
                        axisLabel: {
                            align: "right",
                            margin: 10,
                            showMaxLabel: true,
                        },
                        //data: titledata
                    }
                ],

                series:
                    [{
                        name: "借书总数",
                        type: "bar",
                        roam: false,
                        visualMap: false,
                        itemStyle: {
                            color: "#619cfc"
                        },
                        barWidth: 18,
                        label: {
                            normal: {
                                show: true,
                                fontSize: 12,
                                position: 'insideLeft',

                            },
                            emphasis: {
                                show: true
                            }
                        },
                        //data: bartop10
                    }]
            };
            $.ajax({
                url: '/bookborrow/getXingZuoRank',
                type: 'get',
                dataType: 'json',
                data: {grade: selectedValue},
                success: function (res) {
                    //初始化echarts实例
                    var myChart = echarts.init(document.getElementById('publicNumbTop'));
                    var titledata = [];
                    var bartop10 = [];
                    for (var i = 0; i < res.length; i++) {
                        var top10 = {
                            name: res[i].name,
                            value: res[i].count
                        };
                        bartop10.push(top10);
                    }
                    bartop10.sort(NumAsceSort);
                    for (var i = 0; i < bartop10.length; i++) {
                        titledata.push(bartop10[i].name);
                    }
                    option.series[0].data = bartop10;
                    option.yAxis[0].data = titledata;
                    //使用制定的配置项和数据显示图表
                    myChart.setOption(option);
                }, error: function () {
                    console.log('error');
                }
            });
        }
    });
</script>
<script>
    var option3 = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            y: 'bottom',
            textStyle: {
                fontSize: 11,
                fontWeight: 'bold',
                color: '#f5e558'
            }
        },
        toolbox: {
            show: true,
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {
                    show: true,
                    type: ['pie', 'funnel'],
                    option: {
                        funnel: {
                            x: '25%',
                            width: '50%',
                            funnelAlign: 'center',
                            max: 1548
                        }
                    }
                },
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        calculable: true,
        series: [
            {
                name: '聚类结果',
                type: 'pie',
                radius: ['50%', '70%'],
                itemStyle: {
                    normal: {
                        label: {
                            show: true
                        },
                        labelLine: {
                            show: true
                        }
                    },
                    emphasis: {
                        label: {
                            show: true,
                            position: 'center',
                            textStyle: {
                                fontSize: '30',
                                fontWeight: 'bold'
                            }
                        }
                    }
                },
            }
        ]
    };
    $.ajax({
        url: '/bookborrow/getKmeansPercent',
        type: 'get',
        dataType: 'json',
        success: function (res) {
            var myChart3 = echarts.init(document.getElementById("monitNum"), "macarons");
            option3.legend.data = ["学习强度强 借阅狂人 热爱学习 图书馆 考研", "学习强度一般 学习勤奋 考研 图书馆 阅读爱好者", "学习强度低 不爱阅读 不爱去图书馆","学习强度较高 阅读爱好者 热爱学习"]
            option3.series[0].data = [{name: "学习强度强 借阅狂人 热爱学习 图书馆 考研", value: res.one}, {
                name: "学习强度一般 学习勤奋 考研 图书馆 阅读爱好者",
                value: res.two
            }, {name: "学习强度低 不爱阅读 不爱去图书馆", value: res.three}, {name: "学习强度较高 阅读爱好者 热爱学习", value: res.four}]
            myChart3.setOption(option3);
        }, error: function () {
            console.log('error');
        }
    });
</script>
<script>
    var option4 = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'horizontal',
            x: 'center',
            y: 'bottom',
            textStyle: {
                fontSize: 11,
                fontWeight: 'bold',
                color: '#f5e558'
            }
        },
        toolbox: {
            show: true,
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {
                    show: true,
                    type: ['pie', 'funnel'],
                    option: {
                        funnel: {
                            x: '25%',
                            width: '50%',
                            funnelAlign: 'center',
                            max: 1548
                        }
                    }
                },
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        calculable: true,
        series: [
            {
                name: '个人借阅统计',
                type: 'pie',
                radius: ['50%', '70%'],
                itemStyle: {
                    normal: {
                        label: {
                            show: true
                        },
                        labelLine: {
                            show: true
                        }
                    },
                    emphasis: {
                        label: {
                            show: true,
                            position: 'center',
                            textStyle: {
                                fontSize: '30',
                                fontWeight: 'bold'
                            }
                        }
                    }
                },
            }
        ]
    };
    $.ajax({
        url: '/bookborrow/getPersonTotalBookBorrow',
        type: 'get',
        dataType: 'json',
        data: {outid: "201508040134"},
        success: function (res) {
            var myChart4 = echarts.init(document.getElementById("hotWord"), "macarons");
            option4.legend.data = ["借阅总数","借阅次数"]
            option4.series[0].data = [{name: "借阅总数", value: res.total}, {
                name: "借阅次数",
                value: res.frequency
            }]
            myChart4.setOption(option4);
        }, error: function () {
            console.log('error');
        }
    });
</script>
</body>
</html>
