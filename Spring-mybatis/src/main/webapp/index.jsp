<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ECharts实例</title>
</head>
<body>
<%--为Echarts准备一个具备大小（宽高）的Dom--%>
<div id = "main" style="width: 1000px;height: 400px"></div>
<%--    引入echarts--%>
<script src="https://cdn.bootcdn.net/ajax/libs/echarts/5.1.1/echarts.common.js"></script>
<script type="text/javascript">
    //基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    //指定图标的配置项和数据
    var option = {
        title:{
          text:'ECharts入门示例'
        },
        tooltip:{},
        legend:{
            data:['得分']
        },
        xAxis:{
            data:["哈登","杜兰特","戴维斯","詹姆斯","阿德托昆博","恩比德","利拉德","沃克","伦纳德","拉文"]
        },
        yAxis:{},
        series:[{
            name:'得分',
            type:'bar',
            data:[30.6,30.0,28.2,27.8,27.6,27.0,27.0,26.5,25.5,25.0]
        }]
    };
    //使用刚指定的配置项和数据显示图标
    myChart.setOption(option);
</script>


</body>
</html>