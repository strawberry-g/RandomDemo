<%--
  Created by IntelliJ IDEA.
  User: gaop
  Date: 2019/9/23
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        label {
            display: inline-block;
            width: 90px;
            text-align: right;
            margin-top: 100px;
        }
        #shape{
            background:transparent;
            margin-left: 100px;
        }
        div + canvas {
            margin-top: 1em;
        }
    </style>
</head>
<body>
<div>
    <label for="number"></label>
    <input type="text" id="number" name="number">
    <button onclick="getNum()">点击获取随机数</button>
</div>

<canvas id="shape" width="150px" height="350px" style="border:1px solid #000;"></canvas>

<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
    function getNum(){
        let num = Math.floor(Math.random()*8);
        console.log(num);
        document.getElementById("number").value = num;

        let can = document.getElementById("shape");
        let context = can.getContext("2d");
        context.clearRect(0,0,150,350);
        context.fillStyle = "#0000ff";

        for (let i = 0;i < 8;i++){
            if (num == i && num != 0){
                context.fillRect(0,(can.height-can.height*num/7),can.width,can.height*num/7);
            }else{
                context.fillRect(0,can.height,0,0);
            }
        }
    }
</script>
</body>
</html>
