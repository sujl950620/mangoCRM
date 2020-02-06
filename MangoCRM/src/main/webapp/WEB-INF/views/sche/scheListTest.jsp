<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contents Test</title>
<c:import url="/header"></c:import>
<script type="text/javascript">
$(document).ready(function() {
	reload();
	
	$("#scheAdd").on("click",function(){
		location.href = "scheAdd"
	});
	
	$("#tbody_content").on("click","tr",function(){
		$("#sche_no").val($(this).attr("name"));
		$("#scheDivNoM").val($(this).children("#scheDivNo").attr("name"));
		$("#actionForm").attr("action","scheDet");
		$("#actionForm").submit();
		
	});
});

function reload(){
	
	var params = $("#actionForm").serialize();
	
	$.ajax({
		
		type : "post",
		dataType : "json",
		url : "listAjax",
		data : params,
		
		success : function(result){
			reloadList(result.list);
		} , 
		error : function(request,status,error) {
			console.log("status : "+request.status);
			console.log("text : "+request.responseText);
			console.log("error : "+error);
		}
		
	});
}

function reloadList(list){

	var html;
	
	for(var i in list){
		html += "<tr name=\""+list[i].SCHE_NO+"\">";
		if(list[i].SCHE_DIV_NO == 0){
			html +=		"<td style=\"text-align:center\">일정</td>";
		}
		else if(list[i].SCHE_DIV_NO == 1){
			html +=		"<td style=\"text-align:center\">리드</td>";
		}
		else if(list[i].SCHE_DIV_NO == 2){
			html +=		"<td style=\"text-align:center\">영업</td>";
		}
		html +=		"<td style=\"text-align:center\" id=\"scheDivNo\" name=\""+list[i].SCHE_DIV_NO+"\">"+list[i].SCHE_ACTI_NO+"</td>";
		html +=		"<td style=\"text-align:center\">"+list[i].SCHE_IMPORTANCE+"</td>";
		html +=		"<td style=\"text-align:center\">"+list[i].NAME+"</td>";
		html += "</tr>";
	}
	
	$("#tbody_content").html(html);
}
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">8</c:param>
	</c:import>
	<div class="title_area">Main Title</div>
	<div class="content_area">
	<form action="#" method="post" id="actionForm">
	<input type="hidden" name="sche_no" id="sche_no"/>
	<input type="hidden" name="scheDivNoM" id="scheDivNoM"/>
 		<table>
			<thead>
				<tr>
					<td style="text-align:center">일정 구분</td>
					<td style="text-align:center">활동 분류</td>
					<td style="text-align:center">중요도</td>
					<td style="text-align:center">일정등록 사원</td>
				</tr>
			</thead>		
			<tbody id="tbody_content">
			</tbody>
		</table>
		</form>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>