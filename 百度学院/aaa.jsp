<%--
  Created by IntelliJ IDEA.
  User: forsymphony
  Date: 2020/9/29
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .demo2-bg{
            background: url("3.jpg") no-repeat;
            background-size: cover;
            width: 500px;
            height: 300px;
            position: relative;
        }
        .demo2{
            position: absolute;
            left: 0;
            right: 0;
            top: 0;
            bottom: 0;
            width: 500px;
            height: 300px;
            line-height: 50px;
            text-align: center;
            background:rgba(255,255,255,0.3);
        }
    </style>
</head>
<body>

<div class="demo2-bg">
    <div class="demo2">背景图半透明，文字不透明<br />方法：定位+ background:rgba(255,255,255,0.3)</div>
</div>
</body>
</html>
