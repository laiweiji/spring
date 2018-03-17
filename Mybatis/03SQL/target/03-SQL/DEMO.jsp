<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/2/6
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>demo</title>


    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/themes/default/easyui.css" >

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/themes/icon.css" >



    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/jquery.min.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.4.1/jquery.easyui.min.js"></script>

    <script type="text/javascript">


        function disable() {
            $('#dd').datebox('disable');
        }
        function enable() {
            $('#dd').datebox('enable');
        }

        /*
         将Date/String类型,解析为String类型.
         传入String类型,则先解析为Date类型
         不正确的Date,返回 ''
         如果时间部分为0,则忽略,只返回日期部分.
         */
        function formatDate(v) {
            if (v instanceof Date) {
                var y = v.getFullYear();
                var m = v.getMonth() + 1;
                var d = v.getDate();
                var h = v.getHours();
                var i = v.getMinutes();
                var s = v.getSeconds();
                var ms = v.getMilliseconds();
                if (ms > 0)
                    return y + '-' + m + '-' + d + ' ' + h + ':' + i + ':' + s
                        + '.' + ms;
                if (h > 0 || i > 0 || s > 0)
                    return y + '-' + m + '-' + d + ' ' + h + ':' + i + ':' + s;
                return y + '-' + m + '-' + d;
            }
            return '';
        }

        $( function() {
            $('#dd').datebox( {
                currentText : '今天',
                closeText : '关闭',
                disabled : false,
                required : true,
                missingMessage : '必填',
                formatter : formatDate

            });
        });



        function loadData(){
            $('#cc').combobox({
                url:'combobox_data.json',//该文件内容在下面
                valueField:'id',
                textField:'text'
            });
        }
        function setValue(){
            $('#cc').combobox('setValue','2');
        }
        function getValue(){
            var val = $('#cc').combobox('getValue');
            alert(val);
        }
        function disable(){
            $('#cc').combobox('disable');
        }
        function enable(){
            $('#cc').combobox('enable');
        }
        $( function() {
            $('#cc').combobox( {
                width:150,
                listWidth:150,
                listHeight:100,
//valuefield:'value',
//textField:'text',
//url:'combobox_data.json',
                editable:false
            });
        });




    </script>



</head>
<body>
<table class="easyui-datagrid" title="人 员 信 息 表" style="width:700px;height:250px"
       data-options="singleSelect:true,collapsible:true,url:'${pageContext.request.contextPath}/cn.study.servlet/INServlet',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'id',width:80">ID</th>
        <th data-options="field:'uname',width:100">用户名</th>
        <th data-options="field:'upassword',width:80,align:'right'">用户密码</th>
        <th data-options="field:'utype',width:80,align:'right'">用户类型</th>

    </tr>
    </thead>
</table>


<h2>Multiple Sorting</h2>
<p>Set 'multiSort' property to true to enable multiple column sorting.</p>
<div style="margin:20px 0;"></div>

<table class="easyui-datagrid" title="Multiple Sorting" style="width:700px;height:250px"
       data-options="singleSelect:true,collapsible:true,
				url:'datagrid_data1.json',
				method:'get',
				remoteSort:false,
				multiSort:true
			">
    <thead>
    <tr>
        <th data-options="field:'itemid',width:80,sortable:true">Item ID</th>
        <th data-options="field:'productid',width:100,sortable:true">Product</th>
        <th data-options="field:'listprice',width:80,align:'right',sortable:true">List Price</th>
        <th data-options="field:'unitcost',width:80,align:'right',sortable:true">Unit Cost</th>
        <th data-options="field:'attr1',width:250">Attribute</th>
        <th data-options="field:'status',width:60,align:'center'">Status</th>
    </tr>
    </thead>
</table>














<h1>ComboBox</h1>
<div style="margin-bottom: 10px;"><a href="#" onclick="loadData()">loadData</a>
    <a href="#" onclick="setValue()">setValue</a> <a href="#"
                                                     onclick="getValue()">getValue</a> <a href="#" onclick="disable()">disable</a>
    <a href="#" onclick="enable()">enable</a></div>

<span>Options: </span>
<select id="cc" name="dept" required="true">
    <option value="">==请选择==</option>
    <option value="0">苹果</option>
    <option value="1">香蕉</option>
    <option value="2">鸭梨</option>
    <option value="3">西瓜</option>
    <option value="4">芒果</option>
</select>










<h1>DateBox</h1>
<div style="margin-bottom: 10px;"><a href="#" onclick=
        disable();
>disable</a>
    <a href="#" onclick=
            enable();
    >enable</a></div>
<input id="dd"></input>








</body>
</html>
