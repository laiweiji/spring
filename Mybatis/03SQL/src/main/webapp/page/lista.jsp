<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/2/1
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>微冷的雨考试成绩统计系统</title>
    <style type="text/css">
        body {
            font-size: 30px;
            background:white ;
            font-family: "楷体";
        }

        #container {
            margin: 0px auto;
        }

        #nj{
            background-color: Gray ;
            color:white;
            text-align:center;
            height: 40px;

        }

        #box {
            border:1px solid Snow;
            overflow: hidden;
        }

        #box label {
            color:LightPink;
            margin-top: 5px;
            background: Azure ;
            width: 80px;
            display: inline-block;
            text-align:center;
            margin-left: 50px;
        }
    </style>

<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

    <script type="text/javascript">
        //加载完所有的标签，图片和css后执行
        window.onload=function(){
            var row = 3;
            var col = 2;
            var mybody=document.getElementById('mybody');

            if(col>4){
                mybody.style.width=document.body.scrollWidth+(col-4)*350;
            }

            //mybody.style.width="3333px";
            initOptions(row,col);
            //alert(body.documentElement.clientWidth);
            // document.body.scrollWidth=3333;
            var cbxs=document.getElementsByName("rchoice");
            for ( var i = 0; i < cbxs.length; i++) {
                cbxs[i].style.cssText="margin-left:20px;";
            }
        };


        function print(){

            $("#box").empty();

            var row=document.getElementById("width").value;
            var col=document.getElementById("height").value;

            var mybody=document.getElementById('mybody');

            if(col>4){
                mybody.style.width=document.body.scrollWidth+(col-4)*350;
            }

            //mybody.style.width="3333px";

            initOptions(row,col);

            //alert(body.documentElement.clientWidth);
            // document.body.scrollWidth=3333;
            var cbxs=document.getElementsByName("rchoice");
            for ( var i = 0; i < cbxs.length; i++) {
                cbxs[i].style.cssText="margin-left:20px;";
            }


        }

        /*          function print(){
         var width=document.getElementById("width").value;
         var height=document.getElementById("height").value;
         alert(width);
         alert(height);

         }   */


        //动态加载答题区控件！
        function initOptions(row,column){

            var box=document.getElementById('box');


            //题目编号，从0开始
            var count = 0;

            var mytag; //CheckBox的Tag属性值



            //
            for (var i = 1; i <=row ; i++){  //默认i的值为15
                count++;
                var mydiv=document.createElement("div");

                mydiv.setAttribute("name","no");




                box.appendChild(mydiv);
                //mydiv.style.border="1px solid blue";
                // mydiv.style.paddingRight="700px";
                mydiv.style.overflow="auto";
                for (var j = 1; j <=column; j++){   //默认j的值为2
                    //创建一个label
                    var label=document.createElement('label');



                    //设置座位号
                    if (j == 1)
                    {
                        label.innerHTML = count+ "题";
                        mytag = count;
                    }
                    else
                    {
                        //多列的情况下创建题目编号的方式
                        label.innerHTML = (count +row*(j-1)) + "题";
                        mytag = count + row*(j-1);
                    }
                    var littlediv=document.createElement("div");



                    littlediv.style.float ="left";

                    //littlediv.style.border="3px solid blue";
                    mydiv.appendChild(littlediv);
                    littlediv.appendChild(label);
                    //创建四个选项
                    var checkbox1=document.createElement("input");
                    checkbox1.setAttribute("type","checkbox");
                    checkbox1.setAttribute("value","A");
                    checkbox1.setAttribute("name","rchoice"+mytag);
                    var cbtxt=document.createTextNode("A");
                    littlediv.appendChild(checkbox1);
                    littlediv.appendChild(cbtxt);

                    //第二个checkbox
                    var checkbox2=document.createElement("input");
                    checkbox2.setAttribute("type","checkbox");
                    checkbox2.setAttribute("value","B");
                    checkbox2.setAttribute("name","rchoice"+mytag);
                    var cbtxt2=document.createTextNode("B");
                    littlediv.appendChild(checkbox2);
                    littlediv.appendChild(cbtxt2);
                    //第三个checkbox
                    var checkbox3=document.createElement("input");
                    checkbox3.setAttribute("type","checkbox");
                    checkbox3.setAttribute("value","C");
                    checkbox3.setAttribute("name","rchoice"+mytag);
                    var cbtxt3=document.createTextNode("C");
                    littlediv.appendChild(checkbox3);
                    littlediv.appendChild(cbtxt3);

                    //第四个checkbox
                    var checkbox4=document.createElement("input");
                    checkbox4.setAttribute("type","checkbox");
                    checkbox4.setAttribute("value","D");
                    checkbox4.setAttribute("name","rchoice"+mytag);
                    var cbtxt4=document.createTextNode("D");

                    littlediv.appendChild(checkbox4);
                    littlediv.appendChild(cbtxt4);
                    var myline=document.createElement("br");

                    if(j==column){
                        mydiv.appendChild(myline);
                    }
                }


            }

        }
    </script>


</head>
<body id="mybody">
<form method="post" action="/cn.study.servlet/answerServlet">
<div id="container">
    <!-- <fieldset>
      <legend>答题区 :本软件由微冷的雨出品!如有问题，请发送反馈信息到：yymqqc@126.com</legend> -->

    <div id="box">
    </div>
    <!-- </fieldset> -->
    <input id="width" name="width" type="text" value="2" />
    <input id="height" name="height" type="text" value="3" />
    <input type="button" name="button" value="制作" onclick="print()" />

        <input type="submit" value="提交答案" />
    <br>
    <p>&nbsp;</p>

</div>
</form>
</body>
</html>
