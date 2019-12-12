<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>E-chart</title>
<script type="text/javascript"  src="../static/js/echarts.js"></script>
<script type="text/javascript"  src="../static/js/echarts.min.js"></script>
<script type="text/javascript"  src="../static/js/jquery.min.js"></script>

</head>
<body>
    <h1>Echarts_strain</h1>
    <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
     // 显示标题，图例和空的坐标轴
		 myChart.setOption({
		     title: {
		         text: '异步数据加载示例'
		     },
		     tooltip: {},
		     legend: {
		         data:['销量']
		     },
		     xAxis: {
		         data: []
		     },
		     yAxis: {},
		     series: [{
		         name: '销量',
		         type: 'bar',
		         data: []
		     }]
		 });
		
		 // 异步加载数据
		 $.get('../echart/getchartsdata.do').done(function (data) {
			 var name=[];
			 var keys=[]
			 console.log(data)
			 console.log(data[0])
			 
			for(var k in data[0]){
				
				name.push(k)
				keys.push(data[0][k])
			}
		     // 填入数据
		     myChart.setOption({
		         xAxis: {
		             data: name
		         },
		         series: [{
		             // 根据名字对应到相应的系列
		             name: '销量',
		             data: keys
		         }]
		     });
		 });
      
    
        myChart.setOption(option);
    

 </script>
    
</body>
</html>