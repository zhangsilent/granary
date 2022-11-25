<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8" http-equiv="Content-Type" content="text/html">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>实时温度</title>
    <style>
        .box {
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
            width: 750px;
            height: 500px;
            background-color: white;
            border: 1px solid #ddd;
        }
    </style>
    <script src="echarts.min.js"></script>
    <script src="JQuery.min.js"></script>
</head>

<body>

<div class="box" id="main"></div>
<script>
    var T = [];

    //调用ajax来实现异步的加载数据
    function getusers() {
        $.ajax({
            type: "post",
            async: false,
            url: "",
            data: {},
            dataType: "json",
            success: function(result){
                if(result){
                    for(var i = 0 ; i < result.length; i++){

                        T.push(result[i].T)
                    }
                }
            }
        });
        return T;
    }

    // 执行异步请求
    getusers();


    // 初始化 图表对象
    var mychart = echarts.init(document.getElementById("main"));
    // 进行相关项的设置，也就是所谓的搭搭骨架，方便待会的ajax异步的数据填充
    var option = {
        title : {
            text : '实时温度'
        },
        tooltip : {
            show : true
        },
        legend : {
            data : [ '温度' ]
        },
        xAxis : [ {
            data : ['0:00', '1:00', '2:00', '3"00', '4:00', '5:00', '6:00','7:00','8:00','9:00','10:00','11:00']
        } ],
        yAxis : [ {
            type : 'value'
        } ],
        series : [ {
            "name" : "温度",
            "type" : "bar",
            "data" : T
        } ]
    };

    // 将配置项赋给chart对象，来显示相关的数据
    mychart.setOption(option);




</script>

</script>
</body>

</html>