<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script src="./static/js/jquery.min.js"></script>

<link rel="stylesheet" href="./static/css/bootstrap.min.css">
<link rel="stylesheet" href="./static/css/bootstrap-table.css">

<script src="./static/js/bootstrap.min.js"></script>
<script src="./static/js/bootstrap-table.js"></script>

<script src="./static/js/bootstrap-table-zh-CN.js"></script>


<title>用户信息</title>
</head>
<body>
  <h1>用户信息表</h1>
  <div class="row-fluid">
    <div class="span12">
        <div class="portlet box grey">
        
		    <div class="portlet-body">
			    <table id="table-javascript" data-click-to-select="true"></table>
		    </div>

	    </div>
    </div>
    
</div>

<script type="text/javascript">
        var $table;
        $(function () {

            initTable();
        });
        
        function initTable() {
            var queryUrl = './get_userdata.do';
            
            $table = $('#table-javascript').bootstrapTable({
                method: 'get',
                url: queryUrl,
                height: $(window).height() - 200,
                striped: true,
                pagination: true,
                pageSize: 20,
                pageList: [20, 40, 60, 100, 200],
                search: true,
                showColumns: true,
                
                
                columns: [{
                    field: 'id',
                    title: 'ID',
                    radio: true
                }, {
                    field: 'business',
                    title: '专业',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }, {
                    field: 'sex',
                    title: '性别',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }, {
                    field: 'username',
                    title: '性别',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }
                , {
                    field: 'sex',
                    title: '性别',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }
                
                , {
                    field: 'sex',
                    title: '性别',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }
                , {
                    field: 'sex',
                    title: '性别',
                    width: 100,
                    align: 'center',
                    valign: 'middle',
                    sortable: true
                }
                
                
                ]
            });
        }
        
    </script>
</body>
    



</html>