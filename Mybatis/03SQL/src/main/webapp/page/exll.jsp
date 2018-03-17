<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/2/1
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>答案填写页面</title>
</head>

  <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

 <script type="text/javascript">

     $(function(){

         xx();



     })

  function  xx() {


         var iip=$("#cvb");
      var  i=$("#nn").val();

      //alert(i);



      if(i!=null) {
          $.ajax({
                  url:  "/cn.study.servlet/EnterServlet?action=add",
                  type: 'POST',
                  data:"ii="+i,
              success:function (data) {

                   var ia=eval("("+data+")");
                 //  alert(i);

                  var  html=[];
                  $.each(ia,function (i,dom) {
                    //  alert(dom.gname);
                    //  alert(dom.id);
                      html[i]="<option selected='selected' value='"+dom.id+"' >" + dom.gname + "</option>";
                  })
                  iip.empty();
                  iip.html(html);
              /*    for(var i=0;i<ia.length;i++){
                if (i==1) {
                  html[i] = "<option selected='selected' >" + ia.getGname() + "</option>";
}
                  }


               */
              }

              }
          )
      }
  }


 </script>

<body>

<form action="/cn.study.servlet/EnterServlet?action=addd" method="post">

    <div align="center">

   请输入您的姓名：  <input type="text" name="uname" onblur="xx()"  id="nn" placeholder="姓名-密码  例如  aa-123"/>
    请选择您的班级： <select name="se" id="cvb">
        <option selected="selected">请输入您的姓名</option>


</select>
    <br>
        <br>

    <textarea name="text" id="tt" rows="30" cols="30">



    </textarea>

        <textarea name="text" id="uy" rows="30" cols="30" readonly="readonly">
（不要输入题号）
 例如：
 A,
 B,
 C
    </textarea>





<input type="submit" value="提交答案">
    </div>
</form>

</body>
</html>
