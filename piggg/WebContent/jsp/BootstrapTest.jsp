<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bootstrap Test</title>
<link href="../Content/Plugins/bootstrap-3.3.0/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="../Content/Plugins/jquery-2.1.4/jquery.min.js"></script>
<script src="../Content/Plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script src="../Content/Plugins/ECharts/echarts.common.min.js"></script>
</head>
<body>

<div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        option = {
        	    backgroundColor: '#2c343c',

        	    title: {
        	        text: 'Customized Pie',
        	        left: 'center',
        	        top: 20,
        	        textStyle: {
        	            color: '#ccc'
        	        }
        	    },

        	    tooltip : {
        	        trigger: 'item',
        	        formatter: "{a} <br/>{b} : {c} ({d}%)"
        	    },

        	    visualMap: {
        	        show: false,
        	        min: 80,
        	        max: 600,
        	        inRange: {
        	            colorLightness: [0, 1]
        	        }
        	    },
        	    series : [
        	        {
        	            name:'访问来源',
        	            type:'pie',
        	            radius : '55%',
        	            center: ['50%', '50%'],
        	            data:[
        	                {value:335, name:'直接访问'},
        	                {value:310, name:'邮件营销'},
        	                {value:274, name:'联盟广告'},
        	                {value:235, name:'视频广告'},
        	                {value:400, name:'搜索引擎'}
        	            ].sort(function (a, b) { return a.value - b.value}),
        	            roseType: 'angle',
        	            label: {
        	                normal: {
        	                    textStyle: {
        	                        color: 'rgba(255, 255, 255, 0.3)'
        	                    }
        	                }
        	            },
        	            labelLine: {
        	                normal: {
        	                    lineStyle: {
        	                        color: 'rgba(255, 255, 255, 0.3)'
        	                    },
        	                    smooth: 0.2,
        	                    length: 10,
        	                    length2: 20
        	                }
        	            },
        	            itemStyle: {
        	                normal: {
        	                    color: '#c23531',
        	                    shadowBlur: 200,
        	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
        	                }
        	            }
        	        }
        	    ]
        	};

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>

</body>

<script type="text/javascript">

</script>
</html>

