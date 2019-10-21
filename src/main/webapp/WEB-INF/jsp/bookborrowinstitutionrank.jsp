<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0032)http://www.gsdata.cn/rank/wxrank -->
<html lang="zh-CN">
<script src="/resources/rank/hm.js"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
    <meta name="csrf-param" content="_csrf-frontend">
    <meta name="csrf-token" content="OEoyeWZERmhUAWYUEg0DEWsTBzcNExQvThtQLBUhNjdzCX8IVh03Ig==">
    <title>榜单首页</title>
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
    <link href="/resources/rank/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/rank/base.css" rel="stylesheet">
    <link href="/resources/rank/custom.css" rel="stylesheet">
    <link href="/resources/rank/dataTables.bootstrap.css" rel="stylesheet">
    <link href="/resources/rank/jquery.mCustomScrollbar.css" rel="stylesheet">
    <link href="/resources/rank/perfect-scrollbar.min.css" rel="stylesheet">
    <link href="/resources/rank/chosen.css" rel="stylesheet">
    <link href="/resources/rank/style.css" rel="stylesheet">
    <link href="/resources/rank/wx-detail.css" rel="stylesheet">

    <script src="/resources/rank/jquery.cookie.js"></script>
    <script src="/resources/rank/bootstrap.min.js"></script>
    <script src="/resources/rank/common.js"></script>
    <script src="/resources/rank/jquery.mCustomScrollbar.concat.min.js"></script>

    <script src="/resources/rank/jquery.metisMenu.js"></script>
    <script type="text/javascript" src="/resources/rank/jquery.tinyscrollbar.min.js.下载"></script>
    <script type="text/javascript" src="/resources/rank/website.js"></script>
    <script type="text/javascript">
        $(function () {
            //异步加载书籍借阅排行百人榜
            $.ajax({
                url: '/bookborrow/getInstitutionRank',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    $("#rank_data").append("<tbody>");
                    $(res).each(function (i, n) {
                        $("#rank_data").append("<tr><td><span class='num-span no1'>"
                            + (i + 1) + "</span></td><td>" + "<a target='_blank' " +
                            "href='#' class='mg0'> <div class='word'> <span>" +
                            n.institution + "</span></div></a></td><td>" + n.total + "</td></tr>");
                    });
                    $("#rank_data").append("</tbody>");
                }, error: function () {
                    console.log('error');
                }
            });

            $("#rank_query").click(function () {
                $("#rank_data tbody").remove();
                var grade = $('#grade_select').val();
                //查询所有年级所有学院排行
                if (grade == "all") {
                    $.ajax({
                        url: '/bookborrow/getInstitutionRank',
                        type: 'get',
                        dataType: 'json',
                        success: function (res) {
                            $("#rank_data").append("<tbody>");
                            $(res).each(function (i, n) {
                                $("#rank_data").append("<tr><td><span class='num-span no1'>"
                                    + (i + 1) + "</span></td><td>" + "<a target='_blank' " +
                                    "href='#' class='mg0'> <div class='word'> <span>" +
                                    n.institution + "</span></div></a></td><td>" + n.total + "</td></tr>");
                            });
                            $("#rank_data").append("</tbody>");
                        }, error: function () {
                            console.log('error');
                        }
                    });
                }else{//按照年级
                    $.ajax({
                        url: '/bookborrow/getInstitutionRank',
                        type: 'get',
                        dataType: 'json',
                        data: {grade: grade},
                        success: function (res) {
                            $("#rank_data").append("<tbody>");
                            $(res).each(function (i, n) {
                                $("#rank_data").append("<tr><td><span class='num-span no1'>"
                                    + (i + 1) + "</span></td><td>" + "<a target='_blank' " +
                                    "href='#' class='mg0'> <div class='word'> <span>" +
                                    n.institution + "</span></div></a></td><td>" + n.total + "</td></tr>");
                            });
                            $("#rank_data").append("</tbody>");
                        }, error: function () {
                            console.log('error');
                        }
                    });
                }

            });

        });
    </script>
<body>
<!--顶部-->
<div class="header">
    <div class="head">
        <div class="nav fl">
            <ul>
                <li>
                    <a class="a-one nav-menu-warp" target="_blank" href="/toBookBorrowRankIndex">榜单<i
                            class="icons"></i><span class="arrow-top"></span></a>
                </li>
                <li>
                    <a class="a-one nav-menu-warp" target="_blank" target="_blank" href="/toConsumeInspection">舆情<i
                            class="icons"></i><span class="arrow-top"></span></a>
                    <div class="nav-menu gw">
                        <div class="items-wrapper clearfix">
                            <div class="item clearfix">
                                <a class="nav-menu-a" target="_blank" href="/toConsumeInspection">
                                    <span class="name">消费大数据平台</span>
                                </a>
                            </div>
                            <div class="item clearfix">
                                <a class="nav-menu-a" target="_blank" href="/toStudyInspection">
                                    <span class="name">图书门禁大数据平台</span>
                                </a>
                            </div>
                        </div>
                    </div>
            </ul>
        </div>
        <%--<div class="useinfo fr">--%>
            <%--<a href="https://u.gsdata.cn/member/register">注册</a>--%>
            <%--<a href="https://u.gsdata.cn/member/login?url=http://www.gsdata.cn/">登录</a>--%>
        <%--</div>--%>
    </div>
</div>
<div class="header-after">
    <div class="head">
        <div class="input-group fl" style="">
            <input type="text" id="search_input" value="" class="form-control fl no" placeholder="输入学号查看排名">
            <button class="btn no btn-default fl search_wx" id="query_book" type="button">找图书</button>
            <button class="btn btn-border fl search_arc" type="button" id="query_outid">找人</button>
        </div>
    </div>
</div>


<div class="">
    <div class="container bg-white clearfix">
        <div class="plane">
            <div class="plane-head">
                <div class="hd clearfix">
                    <div class="tab-warp fl">
                        <a href="/toBookBorrowRankIndex">图书借阅榜</a>
                        <a href="/toBookRankIndex">书籍常阅榜</a>
                        <a href="/toBookBorrowXingZuoRankIndex">图书借阅星座榜</a>
                        <a class="active" href="/toBookBorrowInstitutionRankIndex">图书借阅学院榜</a>
                        <a href="/toConsumeInstitutionRankIndex">一卡通消费学院榜</a>
                        <a href="/toConsumeXingZuoRankIndex">一卡通消费星座榜</a>
                        <a href="/toConsumeProvicneRankIndex">一卡通消费省份榜</a>
                    </div>
                </div>
            </div>
            <div class="plane-body pd30">
                <div class="btn-group-warp clearfix">

                    <div class="form-inline fl">
                        <div class="form-group filter__time">
                            <select name="grade_select" id="grade_select" class="form-control width220">
                                <option value="all" selected>2013~2018级</option>
                                <option value="2013">2013级</option>
                                <option value="2014">2014级</option>
                                <option value="2015">2015级</option>
                                <option value="2016">2016级</option>
                                <option value="2017">2017级</option>
                                <option value="2018">2018级</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-inline mr fl">
                        <div class="form-group">
                            <button name="rank_query" id="rank_query" value="myrank"
                                    style="background-color: #f5f1f0; width: 70px;height: 34px;">榜单查询
                            </button>
                        </div>
                    </div>
                </div>

                <div class="table-warp mt20">
                    <table class="table" id="rank_data" width="100%" border="0" cellpadding="0" cellspacing="0">
                        <colgroup>
                            <col width="5%">
                            <col width="20%">
                            <col width="10%">
                        </colgroup>
                        <thead>
                        <tr>
                            <th>排名</th>
                            <th>学院</th>
                            <th>借阅数量</th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="footerf" style="align-content: center;">
    <div class="foots">
        <div class="navs fls" style="align-content: center;">
            <a target="_blank" href="http://home.gsdata.cn/recruiting-talents.html">诚聘英才</a>
            <a target="_blank" href="http://home.gsdata.cn/cooperation.html">咨询&amp;合作</a>
            <a target="_blank" href="http://home.gsdata.cn/contact-us.html">联系我们</a>
        </div>
    </div>
</div>

</body>
</html>