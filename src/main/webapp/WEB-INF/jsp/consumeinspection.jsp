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
<script src="chrome-extension://ljdobmomdgdljniojadhoplhkpialdid/page/prompt.js"></script>
<script src="chrome-extension://ljdobmomdgdljniojadhoplhkpialdid/page/runScript.js"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生消费大数据平台</title>
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
    <link href="/resources/yuqing/style.css" type="text/css" rel="stylesheet">
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
        <h2 class="fs34">学生消费大数据平台</h2>
        <div class="time fs20 cr06">2013.09.01-2018.01.20</div>
    </header>
    <section class="main clearfix">
        <div class="m-r r">

            <div class="mCont mb10">
                <p class="line2"><img src="/resources/yuqing/mcont-bg2.png"></p>
                <h3 class="mCont-tit mCont-tit-bg2 fs24 ar">
                    <label>用户画像</label>
                </h3>
                <div id="hotwordsCloud" class="echarTabs"
                     style="position: relative; overflow: hidden; width: 100%; height: 510px"></div>

            </div>

        </div>
        <div class="m-l l">
            <div class="mCont mb10">
                <p class="line2"><img src="/resources/yuqing/mcont-bg2.png"></p>
                <h3 class="mCont-tit fs24 ">
                    <label>省份排名</label>
                </h3>
                <div class="mCont-echarts">
                    <div id="publicNumbTop" class="echarTabs"
                         style="position: relative; overflow: hidden; width: 100%; height: 510px">

                    </div>
                </div>
            </div>
        </div>
        <div class="m-c l" style="width: 40%;">
            <div id="publicNumMap" class="echarTabs" _echarts_instance_="ec_1555638964270"
                 style="height: 550px; -webkit-tap-highlight-color: transparent; user-select: none; position: relative; background: transparent;">

            </div>
        </div>
        <div class="m-w50 r">
            <p class="line2"><img src="/resources/yuqing/mcont-bg3.png"></p>
            <h3 class="mCont-tit mCont-tit-bg4 fs24 ar">
                <label>个人消费频次统计</label>
            </h3>
            <div id="hotWord" class="echarTabs" style="height: 350px;">
            </div>
        </div>
        <div class="m-w50 l">
            <p class="line2"><img src="/resources/yuqing/mcont-bg3.png"></p>
            <h3 class="mCont-tit mCont-tit-bg3 fs24">
                <label>个人消费统计</label>
            </h3>
            <div id="monitNum" class="echarTabs" style="height: 350px;">

            </div>
        </div>
        <div class="m-w50 r">
            <p class="line2"><img src="/resources/yuqing/mcont-bg3.png"></p>
            <h3 class="mCont-tit mCont-tit-bg4 fs24 ar">
                <label>生活规律占比</label>
            </h3>
            <div id="hotWord2" class="echarTabs" style="height: 350px;">
            </div>
        </div>
        <div class="m-w50 l">
            <p class="line2"><img src="/resources/yuqing/mcont-bg3.png"></p>
            <h3 class="mCont-tit mCont-tit-bg3 fs24">
                <label>消费水平占比</label>
            </h3>
            <div id="monitNum2" class="echarTabs" style="height: 350px;">

            </div>
        </div>

    </section>
</div>
<script>
    $(function () {

        var optionMap = {
            //backgroundColor: '#4f8aff',
            title: {
                text: '全国地图消费大数据',
                subtext: '',
                top: 100,
                x: 'center',
                backgroundColor: '#a3b3ff'
            },
            tooltip: {
                trigger: 'item'
            },
            x: 'center',
            //左侧小导航图标
            // visualMap: {
            //     show: true,
            //     x: 'left',
            //     y: 'center',
            //     splitList: [
            //         {start: 200000, end: 3500000}, {start: 150000, end: 200000},
            //         {start: 100000, end: 150000}, {start: 50000, end: 100000},
            //         {start: 20000, end: 50000}, {start: 0, end: 20000},
            //     ],
            //     textStyle: {
            //         fontSize: 11,
            //         fontWeight: 'bold',
            //         color: '#f5e558'
            //     },
            //     color: ['#5475f5', '#9feaa5', '#85daef', '#74e2ca', '#e6ac53', '#9fb5ea']
            // },
            visualMap: {
                min: 800,
                max: 50000,
                text: ['High', 'Low'],
                realtime: false,
                calculable: true,
                textStyle: {
                    fontSize: 11,
                    fontWeight: 'bold',
                    color: '#f5e558'
                },
                inRange: {
                    color: ['#f5e558', '#88f5b5', '#6dc5f5']
                }
            },
            //配置属性
            series: [{
                name: '数据',
                type: 'map',
                mapType: 'china',
                roam: true,
                label: {
                    normal: {
                        show: true, //省份名称
                        textStyle: {
                            fontSize: 10,
                            fontWeight: 'bold',
                            color: '#f512a9'
                        }
                    },
                    emphasis: {
                        color: 'green',
                        fontSize: 14,
                        fontWeight: 'bold',
                    }
                },
                //data: mydata  //数据
            }]
        };
        $.ajax({
            url: '/consume/getEachProvinceConsume',
            type: 'get',
            dataType: 'json',
            success: function (res) {
                //初始化echarts实例
                var myChart = echarts.init(document.getElementById('publicNumMap'));
                optionMap.series[0].data = res;
                optionMap.visualMap.max = res[0].value;
                optionMap.visualMap.min = res[res.length - 1].value
                //使用制定的配置项和数据显示图表
                myChart.setOption(optionMap);
            }, error: function () {
                console.log('error');
            }
        });
    });

</script>
<script>
    $("#query_button").click(function(){
        var outid = $("#outid").val();
        if (outid != null && outid != "" && outid.length == 12) {
            $.ajax({
                url: '/showUserTagsByOutid',
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
                                size: ['40%', '60%'],
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
                                        fontSize: 5
                                    },
                                    emphasis: {
                                        shadowBlur: 3,
                                        shadowColor: '#ffb5a6'
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

            var option3 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b}: {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    }
                },
                series: [
                    {
                        name: '消费明细',
                        type: 'pie',
                        selectedMode: 'single',
                        radius: [0, '30%'],
                        label: {
                            normal: {
                                position: 'inner'
                            }
                        },
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        y: 'center'
                    },
                    {
                        name: '消费明细',
                        type: 'pie',
                        radius: ['40%', '55%'],
                        x: 'right',
                        label: {
                            normal: {
                                formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                                //  backgroundColor: '#eee',
                                borderColor: '#aaa',
                                borderWidth: 1,
                                borderRadius: 4,
                                rich: {
                                    a: {
                                        color: '#7df56c',
                                        lineHeight: 22,
                                        align: 'center'
                                    },
                                    hr: {
                                        borderColor: '#aaa',
                                        width: '100%',
                                        borderWidth: 0.5,
                                        height: 0
                                    },
                                    b: {
                                        fontSize: 16,
                                        lineHeight: 33
                                    },
                                    per: {
                                        color: '#ffb5a6',
                                        backgroundColor: '#334455',
                                        padding: [2, 4],
                                        borderRadius: 2
                                    }
                                }
                            }
                        }
                    }
                ]
            };
            $.ajax({
                url: '/consume/getPersonConsumeDetail',
                type: 'get',
                dataType: 'json',
                data: {outid: outid},
                success: function (res) {
                    var myChart3 = echarts.init(document.getElementById("monitNum"), "macarons");
                    option3.legend.data = ['总消费额','早餐消费额','午餐消费额','晚餐消费额','超市购物','用水支出','医疗支出']
                    var data = [];
                    $(res.items).each(function (i, n) {
                        if (n.dscrp == "breakfast") {
                            data[i] = {name: "早餐消费额", value: n.total};
                        } else if (n.dscrp == "lunch") {
                            data[i] = {name: "午餐消费额", value: n.total};
                        } else if (n.dscrp == "dinner") {
                            data[i] = {name: "晚餐消费额", value: n.total};
                        } else if (n.dscrp == "商场购物") {
                            data[i] = {name: "超市购物", value: n.total};
                        } else if (n.dscrp == "用水支出") {
                            data[i] = {name: "用水支出", value: n.total};
                        } else if (n.dscrp == "医疗支出") {
                            data[i] = {name: "医疗支出", value: n.total};
                        }
                    });
                    option3.series[0].data = [{name: "总消费额", value: res.total.total}];
                    option3.series[1].data = data
                    myChart3.setOption(option3);
                },
                error: function () {
                    console.log('error');
                }
            });

            var option4 = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b}: {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    }
                },
                series: [
                    {
                        name: '消费明细',
                        type: 'pie',
                        selectedMode: 'single',
                        radius: [0, '30%'],
                        label: {
                            normal: {
                                position: 'inner'
                            }
                        },
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        y: 'center'
                    },
                    {
                        name: '消费明细',
                        type: 'pie',
                        radius: ['40%', '55%'],
                        x: 'right',
                        label: {
                            normal: {
                                formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                                //  backgroundColor: '#eee',
                                borderColor: '#aaa',
                                borderWidth: 1,
                                borderRadius: 4,
                                rich: {
                                    a: {
                                        color: '#7df56c',
                                        lineHeight: 22,
                                        align: 'center'
                                    },
                                    hr: {
                                        borderColor: '#aaa',
                                        width: '100%',
                                        borderWidth: 0.5,
                                        height: 0
                                    },
                                    b: {
                                        fontSize: 16,
                                        lineHeight: 33
                                    },
                                    per: {
                                        color: '#ffb5a6',
                                        backgroundColor: '#334455',
                                        padding: [2, 4],
                                        borderRadius: 2
                                    }
                                }
                            }
                        }
                    }
                ]
            };
            $.ajax({
                url: '/consume/getPersonConsumeDetail',
                type: 'get',
                dataType: 'json',
                data: {outid: outid},
                success: function (res) {
                    var myChart4 = echarts.init(document.getElementById("hotWord"), "macarons");
                    option4.legend.data = ['总消费次数','早餐次数','午餐次数','晚餐次数','超市购物次数','用水次数','医疗次数']
                    var data1 = [];
                    $(res.items).each(function (i, n) {
                        if (n.dscrp == "breakfast") {
                            data1[i] = {name: "早餐次数", value: n.frequency};
                        } else if (n.dscrp == "lunch") {
                            data1[i] = {name: "午餐次数", value: n.frequency};
                        } else if (n.dscrp == "dinner") {
                            data1[i] = {name: "晚餐次数", value: n.frequency};
                        } else if (n.dscrp == "商场购物") {
                            data1[i] = {name: "超市购物次数", value: n.frequency};
                        } else if (n.dscrp == "用水支出") {
                            data1[i] = {name: "用水次数", value: n.frequency};
                        } else if (n.dscrp == "医疗支出") {
                            data1[i] = {name: "医疗次数", value: n.frequency};
                        }
                    });
                    option4.series[0].data = [{name: "总消费次数", value: res.total.frequency}];
                    option4.series[1].data = data1
                    myChart4.setOption(option4);
                },
                error: function () {
                    console.log('error');
                }
            });
        }else {
            alert("请输入正确的学号！");
        }
    });
    $(function () {
        $.ajax({
            url: '/showUserTagsByOutid',
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
                            size: ['40%', '60%'],
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
                                    fontSize: 5
                                },
                                emphasis: {
                                    shadowBlur: 3,
                                    shadowColor: '#ffb5a6'
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
            var optionMap = {
                //backgroundColor: '#4f8aff',
                title: {
                    text: '全国地图消费大数据',
                    subtext: '',
                    top: 100,
                    x: 'center',
                    backgroundColor: '#a3b3ff'
                },
                tooltip: {
                    trigger: 'item'
                },
                x: 'center',
                //左侧小导航图标
                // visualMap: {
                //     show: true,
                //     x: 'left',
                //     y: 'center',
                //     splitList: [
                //         {start: 200000, end: 3500000}, {start: 150000, end: 200000},
                //         {start: 100000, end: 150000}, {start: 50000, end: 100000},
                //         {start: 20000, end: 50000}, {start: 0, end: 20000},
                //     ],
                //     textStyle: {
                //         fontSize: 11,
                //         fontWeight: 'bold',
                //         color: '#f5e558'
                //     },
                //     color: ['#5475f5', '#9feaa5', '#85daef', '#74e2ca', '#e6ac53', '#9fb5ea']
                // },
                visualMap: {
                    min: 800,
                    max: 50000,
                    text: ['High', 'Low'],
                    realtime: false,
                    calculable: true,
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    },
                    inRange: {
                        color: ['#f5e558', '#88f5b5', '#6dc5f5']
                    }
                },
                //配置属性
                series: [{
                    name: '数据',
                    type: 'map',
                    mapType: 'china',
                    roam: true,
                    label: {
                        normal: {
                            show: true, //省份名称
                            textStyle: {
                                fontSize: 10,
                                fontWeight: 'bold',
                                color: '#f512a9'
                            }
                        },
                        emphasis: {
                            color: 'green',
                            fontSize: 14,
                            fontWeight: 'bold',
                        }
                    },
                    //data: mydata  //数据
                }]
            };
            $.ajax({
                url: '/consume/getEachProvinceConsume',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    //初始化echarts实例
                    var myChart = echarts.init(document.getElementById('publicNumMap'));
                    optionMap.series[0].data = res;
                    optionMap.visualMap.max = res[0].value;
                    optionMap.visualMap.min = res[res.length - 1].value
                    //使用制定的配置项和数据显示图表
                    myChart.setOption(optionMap);
                }, error: function () {
                    console.log('error');
                }
            });

            var option5 = {
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
                url: '/consume/getConsumeTotalPercent',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    var myChart5 = echarts.init(document.getElementById("monitNum2"), "macarons");
                    option5.legend.data = ["低消费 消费稳定","高消费 消费稳定","偏低消费 校外消费 校外居住","中等消费 消费稳定"]
                    option5.series[0].data = [{name: "低消费 消费稳定", value: res.one}, {
                        name: "高消费 消费稳定",
                        value: res.two
                    }, {name: "偏低消费 校外消费 校外居住", value: res.three}, {name: "中等消费 消费稳定", value: res.four}]
                    myChart5.setOption(option5);
                }, error: function () {
                    console.log('error');
                }
            });

            var option6 = {
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
                        }
                    }
                ]
            };
            $.ajax({
                url: '/consume/getConsumeFrequencyPercent',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    var myChart6 = echarts.init(document.getElementById("hotWord2"), "macarons");
                    option6.legend.data = [ "生活不规律 早餐不规律 宿舍 校外消费","生活不规律 喜欢购物 校内消费 早餐不规律","生活不规律 打水少 校外居住 不爱吃早餐","生活规律 校内消费 标准消费群体"]
                    option6.series[0].data = [{name: "生活不规律 早餐不规律 宿舍 校外消费", value: res.one}, {
                        name: "生活不规律 喜欢购物 校内消费 早餐不规律",
                        value: res.two
                    }, {name: "生活不规律 打水少 校外居住 不爱吃早餐", value: res.three}, {name: "生活规律 校内消费 标准消费群体", value: res.four}]
                    myChart6.setOption(option6);
                }, error: function () {
                    console.log('error');
                }
            });

            var option = {
                title:
                    {
                        show: true,
                        text: 'TOP 10 排行榜',
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
                        name: "消费总额",
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
                url: '/consume/getEachProvinceConsume',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    //初始化echarts实例
                    var myChart = echarts.init(document.getElementById('publicNumbTop'));
                    var titledata = [];
                    var bartop10 = [];
                    for (var i = 0; i < 10; i++) {
                        var top10 = {
                            name: res[i].name,
                            value: res[i].value
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
            var optionMap = {
                //backgroundColor: '#4f8aff',
                title: {
                    text: '全国地图消费大数据',
                    subtext: '',
                    top: 100,
                    x: 'center',
                    backgroundColor: '#a3b3ff'
                },
                tooltip: {
                    trigger: 'item'
                },
                x: 'center',
                //左侧小导航图标
                // visualMap: {
                //     show: true,
                //     x: 'left',
                //     y: 'center',
                //     splitList: [
                //         {start: 200000, end: 3500000}, {start: 150000, end: 200000},
                //         {start: 100000, end: 150000}, {start: 50000, end: 100000},
                //         {start: 20000, end: 50000}, {start: 0, end: 20000},
                //     ],
                //     textStyle: {
                //         fontSize: 11,
                //         fontWeight: 'bold',
                //         color: '#f5e558'
                //     },
                //     color: ['#5475f5', '#9feaa5', '#85daef', '#74e2ca', '#e6ac53', '#9fb5ea']
                // },
                visualMap: {
                    min: 800,
                    max: 50000,
                    text: ['High', 'Low'],
                    realtime: false,
                    calculable: true,
                    textStyle: {
                        fontSize: 11,
                        fontWeight: 'bold',
                        color: '#f5e558'
                    },
                    inRange: {
                        color: ['#f5e558', '#88f5b5', '#6dc5f5']
                    }
                },
                //配置属性
                series: [{
                    name: '数据',
                    type: 'map',
                    mapType: 'china',
                    roam: true,
                    label: {
                        normal: {
                            show: true, //省份名称
                            textStyle: {
                                fontSize: 10,
                                fontWeight: 'bold',
                                color: '#f512a9'
                            }
                        },
                        emphasis: {
                            color: 'green',
                            fontSize: 14,
                            fontWeight: 'bold',
                        }
                    },
                    //data: mydata  //数据
                }]
            };
            $.ajax({
                url: '/consume/getEachProvinceConsume',
                type: 'get',
                dataType: 'json',
                data: {grade: selectedValue},
                success: function (res) {
                    //初始化echarts实例
                    var myChart = echarts.init(document.getElementById('publicNumMap'));
                    optionMap.series[0].data = res;
                    optionMap.visualMap.max = res[0].value;
                    optionMap.visualMap.min = res[res.length - 1].value
                    //使用制定的配置项和数据显示图表
                    myChart.setOption(optionMap);
                }, error: function () {
                    console.log('error');
                }
            });

            var option5 = {
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
                url: '/consume/getConsumeTotalPercent',
                type: 'get',
                dataType: 'json',
                data: {grade: selectedValue},
                success: function (res) {
                    var myChart5 = echarts.init(document.getElementById("monitNum2"), "macarons");
                    option5.legend.data = ["低消费 消费稳定","高消费 消费稳定","偏低消费 校外消费 校外居住","中等消费 消费稳定"]
                    option5.series[0].data = [{name: "低消费 消费稳定", value: res.one}, {
                        name: "高消费 消费稳定",
                        value: res.two
                    }, {name: "偏低消费 校外消费 校外居住", value: res.three}, {name: "中等消费 消费稳定", value: res.four}]
                    myChart5.setOption(option5);
                }, error: function () {
                    console.log('error');
                }
            });

            var option6 = {
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
                        }
                    }
                ]
            };
            $.ajax({
                url: '/consume/getConsumeFrequencyPercent',
                type: 'get',
                dataType: 'json',
                data: {grade: selectedValue},
                success: function (res) {
                    var myChart6 = echarts.init(document.getElementById("hotWord2"), "macarons");
                    option6.legend.data = [ "生活不规律 早餐不规律 宿舍 校外消费","生活不规律 喜欢购物 校内消费 早餐不规律","生活不规律 打水少 校外居住 不爱吃早餐","生活规律 校内消费 标准消费群体"]
                    option6.series[0].data = [{name: "生活不规律 早餐不规律 宿舍 校外消费", value: res.one}, {
                        name: "生活不规律 喜欢购物 校内消费 早餐不规律",
                        value: res.two
                    }, {name: "生活不规律 打水少 校外居住 不爱吃早餐", value: res.three}, {name: "生活规律 校内消费 标准消费群体", value: res.four}]
                    myChart6.setOption(option6);
                }, error: function () {
                    console.log('error');
                }
            });

            var option = {
                title:
                    {
                        show: true,
                        text: 'TOP 10 排行榜',
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
                        name: "消费总额",
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
                url: '/consume/getEachProvinceConsume',
                type: 'get',
                dataType: 'json',
                data: {grade: selectedValue},
                success: function (res) {
                    //初始化echarts实例
                    var myChart = echarts.init(document.getElementById('publicNumbTop'));
                    var titledata = [];
                    var bartop10 = [];
                    if (res.length < 10) {
                        for (var i = 0; i < res.length; i++) {
                            var top10 = {
                                name: res[i].name,
                                value: res[i].value
                            };
                            bartop10.push(top10);
                        }
                    }else{
                        for (var i = 0; i < 10; i++) {
                            var top10 = {
                                name: res[i].name,
                                value: res[i].value
                            };
                            bartop10.push(top10);
                        }
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
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            textStyle: {
                fontSize: 11,
                fontWeight: 'bold',
                color: '#f5e558'
            }
        },
        series: [
            {
                name: '消费明细',
                type: 'pie',
                selectedMode: 'single',
                radius: [0, '30%'],
                label: {
                    normal: {
                        position: 'inner'
                    }
                },
                labelLine: {
                    normal: {
                        show: false
                    }
                },
                y: 'center'
            },
            {
                name: '消费明细',
                type: 'pie',
                radius: ['40%', '55%'],
                x: 'right',
                label: {
                    normal: {
                        formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                      //  backgroundColor: '#eee',
                        borderColor: '#aaa',
                        borderWidth: 1,
                        borderRadius: 4,
                        rich: {
                            a: {
                                color: '#7df56c',
                                lineHeight: 22,
                                align: 'center'
                            },
                            hr: {
                                borderColor: '#aaa',
                                width: '100%',
                                borderWidth: 0.5,
                                height: 0
                            },
                            b: {
                                fontSize: 16,
                                lineHeight: 33
                            },
                            per: {
                                color: '#ffb5a6',
                                backgroundColor: '#334455',
                                padding: [2, 4],
                                borderRadius: 2
                            }
                        }
                    }
                }
            }
        ]
    };
    $.ajax({
        url: '/consume/getPersonConsumeDetail',
        type: 'get',
        dataType: 'json',
        data: {outid: "201508040134"},
        success: function (res) {
            var myChart3 = echarts.init(document.getElementById("monitNum"), "macarons");
            option3.legend.data = ['总消费额','早餐消费额','午餐消费额','晚餐消费额','超市购物','用水支出','医疗支出']
            var data = [];
            $(res.items).each(function (i, n) {
                if (n.dscrp == "breakfast") {
                    data[i] = {name: "早餐消费额", value: n.total};
                } else if (n.dscrp == "lunch") {
                    data[i] = {name: "午餐消费额", value: n.total};
                } else if (n.dscrp == "dinner") {
                    data[i] = {name: "晚餐消费额", value: n.total};
                } else if (n.dscrp == "商场购物") {
                    data[i] = {name: "超市购物", value: n.total};
                } else if (n.dscrp == "用水支出") {
                    data[i] = {name: "用水支出", value: n.total};
                } else if (n.dscrp == "医疗支出") {
                    data[i] = {name: "医疗支出", value: n.total};
                }
            });
            option3.series[0].data = [{name: "总消费额", value: res.total.total}];
            option3.series[1].data = data
            myChart3.setOption(option3);
        },
        error: function () {
            console.log('error');
        }
    });
</script>
<script>
    var option3 = {
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            textStyle: {
                fontSize: 11,
                fontWeight: 'bold',
                color: '#f5e558'
            }
        },
        series: [
            {
                name: '消费明细',
                type: 'pie',
                selectedMode: 'single',
                radius: [0, '30%'],
                label: {
                    normal: {
                        position: 'inner'
                    }
                },
                labelLine: {
                    normal: {
                        show: false
                    }
                },
                y: 'center'
            },
            {
                name: '消费明细',
                type: 'pie',
                radius: ['40%', '55%'],
                x: 'right',
                label: {
                    normal: {
                        formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                        //  backgroundColor: '#eee',
                        borderColor: '#aaa',
                        borderWidth: 1,
                        borderRadius: 4,
                        rich: {
                            a: {
                                color: '#7df56c',
                                lineHeight: 22,
                                align: 'center'
                            },
                            hr: {
                                borderColor: '#aaa',
                                width: '100%',
                                borderWidth: 0.5,
                                height: 0
                            },
                            b: {
                                fontSize: 16,
                                lineHeight: 33
                            },
                            per: {
                                color: '#ffb5a6',
                                backgroundColor: '#334455',
                                padding: [2, 4],
                                borderRadius: 2
                            }
                        }
                    }
                }
            }
        ]
    };
    $.ajax({
        url: '/consume/getPersonConsumeDetail',
        type: 'get',
        dataType: 'json',
        data: {outid: "201508040134"},
        success: function (res) {
            var myChart3 = echarts.init(document.getElementById("hotWord"), "macarons");
            option3.legend.data = ['总消费次数','早餐次数','午餐次数','晚餐次数','超市购物次数','用水次数','医疗次数']
            var data1 = [];
            $(res.items).each(function (i, n) {
                if (n.dscrp == "breakfast") {
                    data1[i] = {name: "早餐次数", value: n.frequency};
                } else if (n.dscrp == "lunch") {
                    data1[i] = {name: "午餐次数", value: n.frequency};
                } else if (n.dscrp == "dinner") {
                    data1[i] = {name: "晚餐次数", value: n.frequency};
                } else if (n.dscrp == "商场购物") {
                    data1[i] = {name: "超市购物次数", value: n.frequency};
                } else if (n.dscrp == "用水支出") {
                    data1[i] = {name: "用水次数", value: n.frequency};
                } else if (n.dscrp == "医疗支出") {
                    data1[i] = {name: "医疗次数", value: n.frequency};
                }
            });
            option3.series[0].data = [{name: "总消费次数", value: res.total.frequency}];
            option3.series[1].data = data1
            myChart3.setOption(option3);
        },
        error: function () {
            console.log('error');
        }
    });
</script>
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
                text: 'TOP 10 排行榜',
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
                name: "消费总额",
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
        url: '/consume/getEachProvinceConsume',
        type: 'get',
        dataType: 'json',
        success: function (res) {
            //初始化echarts实例
            var myChart = echarts.init(document.getElementById('publicNumbTop'));
            var titledata = [];
            var bartop10 = [];
            for (var i = 0; i < 10; i++) {
                var top10 = {
                    name: res[i].name,
                    value: res[i].value
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
    var option5 = {
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
        url: '/consume/getConsumeTotalPercent',
        type: 'get',
        dataType: 'json',
        success: function (res) {
            var myChart5 = echarts.init(document.getElementById("monitNum2"), "macarons");
            option5.legend.data = ["低消费 消费稳定","高消费 消费稳定","偏低消费 校外消费 校外居住","中等消费 消费稳定"]
            option5.series[0].data = [{name: "低消费 消费稳定", value: res.one}, {
                name: "高消费 消费稳定",
                value: res.two
            }, {name: "偏低消费 校外消费 校外居住", value: res.three}, {name: "中等消费 消费稳定", value: res.four}]
            myChart5.setOption(option5);
        }, error: function () {
            console.log('error');
        }
    });
</script>
<script>
    var option6 = {
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
                }
            }
        ]
    };
    $.ajax({
        url: '/consume/getConsumeFrequencyPercent',
        type: 'get',
        dataType: 'json',
        success: function (res) {
            var myChart6 = echarts.init(document.getElementById("hotWord2"), "macarons");
            option6.legend.data = [ "生活不规律 早餐不规律 宿舍 校外消费","生活不规律 喜欢购物 校内消费 早餐不规律","生活不规律 打水少 校外居住 不爱吃早餐","生活规律 校内消费 标准消费群体"]
            option6.series[0].data = [{name: "生活不规律 早餐不规律 宿舍 校外消费", value: res.one}, {
                name: "生活不规律 喜欢购物 校内消费 早餐不规律",
                value: res.two
            }, {name: "生活不规律 打水少 校外居住 不爱吃早餐", value: res.three}, {name: "生活规律 校内消费 标准消费群体", value: res.four}]
            myChart6.setOption(option6);
        }, error: function () {
            console.log('error');
        }
    });

</script>
</body>
</html>
