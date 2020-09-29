<%--
  Created by IntelliJ IDEA.
  User: forsymphony
  Date: 2020/9/29
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        h1{
            text-align: center;
        }
        #div1{
            background: url("3.jpg") no-repeat;
            background-size: cover;
            width: 600px;
            height: 750px;
            position: relative;
            /*text-align: center;*/
            margin-left: auto;
            margin-right: auto;/
            /*让图片Position之后居中*/
        }
        #table1{
            border-collapse:collapse;
            font-size: 12px;
            border-spacing:0;
            border-left:1px solid #888;
            border-top:1px solid #888;
            width: 600px;
            height:750px;
            text-align: center;
            position: absolute;
            margin-left: auto;
            margin-right: auto;
            background:rgba(255,255,255,0.3);
        }
        td{
            border-right:1px solid #888;
            border-bottom:1px solid #888;
            padding:5px 15px;
        }
        #td1,#td3{
        height: 100px;
        }
        #td1,#td5,#td7{
            width:200px;
        }
        #td1{
            border-right:white;
            border-bottom-style: dashed;
        }
        #td2{
            border-bottom-style: dashed;
            height: 75px;
            text-align:left;
            vertical-align:bottom;
        }
        #td3{
            border-bottom-style: dashed;

        }
        #td5{
              text-align: left;
                height: auto;
            border-bottom-style: dashed;
            border-right-style: dashed;
          }
        #td6{
            text-align: left;
            font-size: 10px;
            border-bottom-style: dashed;
        }
        #td7{
            border-right-style: dashed;
        }
        #td9{
            border-bottom-style: dashed;
        }
        #img1{
            /*text-align: center;*/
            max-height: 150%;
            max-width: 150%;
        }

        #span1,#span2{
            font-weight:bold;
            font-size: 20px;
        }
        #span3,#span5,#span6,#span7,#span8,#span9{
            font-weight:bold;
            font-size: 14px;
        }
        #span4{
            font-weight:bold;
            font-size: 18px;
        }
    </style>
</head>
<body >
<h1 id="biaoti">简历</h1>
<div id="div1">
<table id="table1">
    <tr id="tr1">
        <td id="td1" rowspan="2"><img src="1.jpg" id="img1"></td>
        <td id="td2"><span id="span1">姓名：</span>forsymphony<br><span id="span2">求职意向：</span>前端工程师</td>
    </tr>

    <tr id="tr2">
        <td id="td3">自我评价：教育背景（含成绩绩点，交换经历）

            实习经历

            考证和成绩（四六级、口译、CPA 等）

            特长和职业发展目标</td>
<%--        <td id="td4">4</td>--%>
    </tr>

    <tr id="tr3">
        <td id="td5">
            <span id="span3">联系方式：</span><br>
            &nbsp;&nbsp;&nbsp;&nbsp;
            QQ：1282828282<br>
            &nbsp;&nbsp;&nbsp;&nbsp;
            电话：1313131313<br>
            &nbsp;&nbsp;&nbsp;&nbsp;
            邮箱:1282828282@qq.com
        </td>
        <td id="td6" rowspan="2"><span id="span4">实践经历</span><br><br><br>
            &nbsp;&nbsp;&nbsp;&nbsp;
            xxxxxx公司
            <ul>
                <li>负责白给</li>
                <li>端茶倒水</li>
                <li>捣蛋完美</li>
            </ul>
        </td>
    </tr>

    <tr id="tr4">
        <td id="td7" rowspan="3">
            <ul>
                <span id="span5">个人资料</span><br><br>
            <li>姓名：forsymphony</li>
            <li>出生年月：1999.9.9</li>
            <li>性别：男</li>
            <li>籍贯：浙江省余姚市</li>
            <li>毕业院校：xx大学</li>
            <li>专业：计算机科学与技术</li>
            <li>学历：本科</li>
        </ul>
        <ul>
            <br><br><br>
            <span id="span6">获得证书</span><br><br>
            <li>计算机二级</li>
            <li>英语四级</li>
            <li>PAT乙级</li>
        </ul>
        <ul>
            <br><br><br>
            <span id="span7">兴趣爱好</span><br><br>
        </ul>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;起飞&nbsp;&nbsp;降落&nbsp;&nbsp;起飞
    </tr>
    </td>
    <tr id="tr5">
        <td id="td9">
            <span id="span8">教育背景</span>
        <p>java c++ 计算机网络 oracle</p>
        </td>
<%--        <td id="td10">10</td>--%>
    </tr>

    <tr id="tr6">
        <td id="td11"> <span id="span9">获奖情况</span><br>
            java c++ 计算机网络 oraclejava c++ 计算机网络 oraclejava c++ 计算机网络 oraclejava c++ 计算机网络 oraclejava c++ 计算机网络 oracle
        </td>

<%--        <td id="td12">12</td>--%>
    </tr>
</table>
    <div>
</body>
</html>
