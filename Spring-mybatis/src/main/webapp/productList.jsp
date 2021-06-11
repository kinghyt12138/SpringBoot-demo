<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品数量统计图</title>
    <%--    引入echarts--%>

</head>
<body>
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/echarts/5.1.1/echarts.common.js"></script>
<%--为echarts准备一个具备大小(宽高)的Dom--%>
<div id="main" style="width: 600px;height: 400px;">
</div>
<script type="text/javascript">
    //基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    //显示标题 图例和空的坐标轴
    myChart.setOption(
        {
            title: {
                text: '商品数量'
            },
            tooltip: {},
            legend: {
                data: ['库存量']
            },
            xAxis: {
                data: []
            },
            yAxis: {},
            series: [{
                name: '库存量',
                type: 'bar',
                data: []
            }]
        });
    //加载动画
    myChart.showLoading();
    //异步加载数据
    $.get("${pageContext.request.contextPath}/product/findAll",function (data) {
        console.log(data.productName)
        //填入数据
        var option = {
            xAxis:{
                data:data.productName
                // data:["鞋子","袜子","衣服","裤子"]
            },
            series:[{
                //根据名字对应到相应的系列
                name:'库存量',
                type:'bar',
                data:data.num
            }]
        }
        //使用刚指定的配置项和数据显示图标
        myChart.setOption(option);
        myChart.hideLoading();
    })
</script>

</body>
</html>
