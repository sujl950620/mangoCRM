<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일정 관리</title>
<c:import url="/header"></c:import>
<link rel="stylesheet" type="text/css" href="resources/css/sche/scheList.css"/>
<script type="text/javascript">
$(document).ready(function() {	
	$("#scheAddBtn").on("click",function(){
		location.href = "scheAdd"
	});
	
	$("#scheSrchBtn").on("click",function(){
		
	});
	
	function checked() {
		reloadSche();
	}
	
	function reloadSche() {
		$("#actionForm").serialize();
		
		$.ajax({
			type : "post",
			url : "ScheListAjax",
			dataType : "json",
			data : params,
			success : function(result) {
				redrawSche(result.list);
				redrawPaging(result.pb);
			},
			error : function(request,status,error) {
				console.log("status : "+request.status);
				console.log("text : "+request.responseText);
				console.log("error : "+error);
			}
		});
	}
	
	function redrawSche(list) {
		var html = "";
		
		for(var i in list) {
			html += "<tr name=\"" + list[i].SCHE_NO + "\">/tr>";
			if(list[i].SCHE_DIV_NO == 0){
				html +=		"<td style=\"text-align:center\">일정</td>";
			}
			else if(list[i].SCHE_DIV_NO == 1){
				html +=		"<td style=\"text-align:center\">리드</td>";
			}
			else if(list[i].SCHE_DIV_NO == 2){
				html +=		"<td style=\"text-align:center\">기회</td>";
			}
			html += "<td>" + list[i]. + "</td>"
			html += "<td>" + list[i]. + "</td>"
			html += "<td>" + list[i]. + "</td>"
			html += "<td>" + list[i]. + "</td>"
		}
	}
});
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">8</c:param>
	</c:import>
	<div class="title_area">Main Title</div>
	<div class="content_area">
		<div class="contents_wrap">
			<div>
			<form action="#" id="actionForm">
				<div class="checkbox_area">
					<div>
						<div class="sche_text">일정 구분</div>
						<div class="sche">
							<input type="checkbox" id="sche" value="0" onclick="checked()" checked />일정
							<input type="checkbox" id="sche" value="1" onclick="checked()" checked />리드 
							<input type="checkbox" id="sche" value="2" onclick="checked()" checked />영업 
						</div>
					</div>
					<div>
						<div class="task_div_text">활동 분류</div>
						<div class="task_div">
							<input type="checkbox" id="task_div" value="0" onclick="checked()" checked />전화
							<input type="checkbox" id="task_div" value="1" onclick="checked()" checked />상담
							<input type="checkbox" id="task_div" value="2" onclick="checked()" checked />메일
							<input type="checkbox" id="task_div" value="3" onclick="checked()" checked />방문
							<input type="checkbox" id="task_div" value="4" onclick="checked()" checked />견적
							<input type="checkbox" id="task_div" value="5" onclick="checked()" checked />제안
							<input type="checkbox" id="task_div" value="6" onclick="checked()" checked />계약
							<input type="checkbox" id="task_div" value="7" onclick="checked()" checked />매출
							<input type="checkbox" id="task_div" value="8" onclick="checked()" checked />기타
						</div>
					</div>
				</div>
					<div id="scheAddBtn" class="add_btn">추가</div>
				<!-- 코드 -->
	         <div class="srch_area">
	            <div class="srch_btn">
	                  <div id="scheSrchBtn">검색</div>
	                  <input type="text" class="srch_text"/>
	                  <select class="srch_select">
	                     <option value="0">고객사 명</option>
	                     <option value="1">고객 명</option>
	                     <option value="2">고객사 명 + 고객 명</option>                     
	                  </select>   
	                  <input type="date" class = "srch_date">
	               </div>
	      	</div>
	      <!-- 코드 -->
				<table>
					<!-- 리스트 테이블 -->
					<colgroup>
						<col style="width: 30%;">
						<col style="width: 15%;">
						<col style="width: 15%;">
						<col style="width: 20%;">
						<col style="width: 20%;">
					</colgroup>
					<thead>
						<tr>
							<td>기간</td>
							<td>일정 구분</td>
							<td>활동 분류</td>
							<td>고객사 명</td>
							<td>고객 명</td>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
				<div class="paging_area">
				</div>
			</form>
			</div>
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>