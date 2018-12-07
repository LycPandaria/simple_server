<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试返回JSON格式的数据</title>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	testResponseBody();
});
function testResponseBody(){
	$.post("${pageContext.request.contextPath}/trunk/select",
			{
				trunkType : 1,
				itemCode : "39"
			},
			function(data){ 
		
			var tr  = $("<tr align='center'/>");
            $("<td/>").html(data.trunkType).appendTo(tr);
            $("<td/>").html(data.itemCode).appendTo(tr);
            $("<td/>").html(data.itemName).appendTo(tr);
            $("#itemtable").append(tr);
        
	},"json");
}
</script>
</head>
<body>
<table id="itemtable" border="1"  style="border-collapse: collapse;">
	<tr align="center">
	  <th>尾箱类型</th>
	  <th>物品代码</th>
	  <th>物品名称</th>
	</tr>
	
</table>
	
</body>
</html>