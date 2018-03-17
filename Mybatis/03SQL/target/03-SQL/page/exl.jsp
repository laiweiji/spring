<%--
  Created by IntelliJ IDEA.
  User: 维吉的笔记本
  Date: 2018/2/3
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考生个人成绩</title>
</head>

<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>

<script type="text/javascript">

    $(function(){

        xx();

        xd();

        xg();



    })

    function  xg() {

        var jk=$("#jk");

      var o= $("#error").val();

      alert(o);

      if (o.trim()!=null && o.trim()!=""){



          $.ajax({
              url: "/cn.study.servlet/EnterServlet?action=addl",
              type: 'POST',
              data: "ii=" + o,
              success: function (data) {
                  var ia = eval("(" + data + ")");

                  alert(ia);

                  htmll =[];
                  htmll[0]="<tr> <td>题目数</td> <td>错误人数</td>  </tr>";
                  $.each(ia,function (ia,text) {
                      //  alert(dom.gname);
                      //  alert(dom.id);
                      //html[i]="<option selected='selected' value='"+dom.id+"' >" + dom.gname + "</option>";
                      htmll[i+1]=" <tr> <td>"+text.tid+"</td> <td>"+text.falseNumber+"</td>  </tr>";
                  })


                  jk.html(htmll);

              }
          })


      }

    }

    function xd() {
        //alert("111111");
        var i=$("#bgp").val();
        var oo=$("#oo");
        var tt=$("#tt");
        var three=$("#three");

        if(i.trim()!=null &&  i.trim()!="") {


            $.ajax({
                url: "/cn.study.servlet/EnterServlet?action=addK",
                type: 'POST',
                data: "ii=" + i,
                success: function (data) {
                    var ia = eval("(" + data + ")");

                    //alert(ia);

                    var hp=[];

                    var hl=[];

                    var hm=[];

                   hp[0]=" <td>班级最高分</td>";
                    hp[1]="<td>"+ia[0]+"</td>";

                    hl[0]=" <td>班级最低分</td>";
                    hl[1]="<td>"+ia[1]+"</td>";

                    hm[0]=" <td>班级平均分</td>";
                   hm[1]="<td>"+ia[2]+"</td>";

                    oo.html(hp);

                    tt.html(hl);

                    three.html(hm);
                }
            })
        }
    }

    function  xx() {


        var iip=$("#zs");
        var  i=$("#bgh").val();

       // alert(i);



        if(i!=null) {
            $.ajax({
                    url:  "/cn.study.servlet/EnterServlet?action=addf",
                    type: 'POST',
                    data:"ii="+i,
                    success:function (data) {

                        var ia=eval("("+data+")");
                        //  alert(i);

                        var  html=[];
                        html[0]=" <tr> <td>班级</td><td>姓名</td><td>分数</td> </tr>";
                        $.each(ia,function (i,dom) {
                            //  alert(dom.gname);
                            //  alert(dom.id);
                            //html[i]="<option selected='selected' value='"+dom.id+"' >" + dom.gname + "</option>";
                            html[i+1]=" <tr> <td>"+dom.classd+"</td> <td>"+dom.name+"</td> <td>"+dom.fen+"</td> </tr>";
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
<form method="post" action="">
    <h3>以下表格为班内成绩 （所有） </h3>
      请输入班级班级：<input type="text" name="class"  id="bgh" placeholder="请输入班级名称" onblur="xx()" /><br>

     <table id="zs"  style="color: #95B8E7"  width="1350px">
</table>

    <h3> 以下为班内部成绩（最高最低）  </h3>
    班级：<input type="text" name="class"  id="bgp" placeholder="请输入班级名称" onblur="xd()" /><br>
    <table>
        <tr id="oo">
            <td>班级最高分</td>
        </tr>

        <tr id="tt">
            <td>班级最低分</td>
        </tr>

        <tr id="three">
            <td>班级平均分</td>
        </tr>

    </table>

    <h3>这是错误题数</h3>
    <input type="text" id="error" placeholder="请输入班级名称" onblur="xg()" />
    <table id="jk">



    </table>
</form>
</body>
</html>
