<%--
  Created by IntelliJ IDEA.
  User: ZUO-PC
  Date: 2017/7/29
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/default/easyui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function () {
            initGradeData();
        });
        function initGradeData(){
            $("#grade").datagrid({

                url:'${pageContext.request.contextPath}/grade/quryGrade.controller',
                method:'POST',
                //是否隔行变色
                striped:true,
                idField:'id',
                //是否显示行序号
                rownumbers:true,
                //标题
                title:'班级信息',
                queryParams:{},
                //是否分页
                pagination:true,
                pageSize:5,
                pageList:[2,5,10],
                toolbar:[
                    {
                        text:'删除',
                        iconCls:'icon-remove',
                        handler:function(){
                            deleteGradeByIdList();
                        }
                    }

                ],
                columns:[[
                    {field:'ck',checkbox:true},
                    {field:'gradeName',title:'班级名',width:100},
                    {field:'createDate',title:'创建时间',width:200,formatter:dataFormat},
                    {field:'id',title:'操作列',width:200,formatter:info}

                ]]
            });
        }
        //操作列
        function info(rowDate){
            var editStr='<a href="javascript:updateGrade(\''+rowDate+'\')">修改</a>';
            var queryGradeByIdStr='<a href="javascript:queryGradeById(\''+rowDate+'\')">详情</a>';
            var deleteGradeByIdStr='<a href="javascript:deletGrade(\''+rowDate+'\')">删除</a>';
            return editStr+' '+queryGradeByIdStr+' '+deleteGradeByIdStr;
        }

        //格式化创建时间显示
        function dataFormat(rowDate) {
            var date =new Date(rowDate);
            var year=date.getFullYear();//年
            var month=date.getMonth()+1;//月
            var day=date.getDate();//日
            var str=year+'-'+month+'-'+day;
            return str;
        }

        //按班级名称查询
        function queryGrade(){

            var gradeName=$("#gradeName").val();
            var queryParams=$("#grade").datagrid('options').queryParams;
            queryParams.gradeName=gradeName;

            $("#grade").datagrid('load');
        }
    </script>
</head>
<body>
    <!--按老师查询-->
    <div>
        <form id="queryGradeForm" method="post">
            <div>
                <label>老师名称：</label>
                <input type="text" name="gradeName" id="gradeName"/>
                <a href="javascript:void(0)" onclick="queryGrade()" class="easyui-linkbutton" iconCls="icon-search">查询</a>
            </div>
        </form>
    </div>
    <!--数据展示-->
    <div>
        <table id="grade"></table>
    </div>
</body>
</html>
