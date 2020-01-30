<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품</title>
<c:import url="/header"></c:import>
<script type="text/javascript">
	//버튼에 한글자씩 추가되면 길이가 10씩 늘어납니다.
	$(document).ready(function() {
		reloadServiceList()
	//	reloadGoodsList()
		// Button Auto Sizing
		$('button').each(function() {
			if ($(this).html().length > 2) {
				var leng_diff = $(this).html().length - 2;
				$(this).width($(this).width() + (10 * leng_diff) + "px");
			}
		})
		$('.content_btn>div').each(function() {
			if ($(this).html().length > 2) {
				var leng_diff = $(this).html().length - 2;
				$(this).width($(this).width() + (10 * leng_diff) + "px");
			}
		})
		//리스트 아작스 서비스
		function reloadServiceList() {
		var params = $("#actionForm").serialize();

		$.ajax({
			type : "post",
			url : "ServicelistAjax",
			dateType : "json",
			data : params,
			success : function(result) {
				redrawServiceList(result.Service);
		//		redrawPaging(result.pb);

			},
			error : function(request, status, error) {
				console.log("text : " + request.responseText);
				console.log("error : " + error);
			}

		})

	}
		//리스트 테이블 서비스
		function redrawServiceList(Service) {
			var html = "";
console.log(Service.lenght);
			if (Service.length == 0) {
				html += "<tr>";
				html += "<td colspan=\"10\">조회된 데이터가 없습니다.</td>";
				html += "<tr>";
			
			} else {
				for ( var i in Service) {
					html += "<tr class=\"list_contents\" name=\" "+ Service[i].SERVICE_NO +"  \">"
					html += "<td><input type=\"checkbox\" class=\"chbox_lbl\" /></td>";
					html += "<td>" + Service[i].SERVICE_NO + "</td>"
					html += "<td>" + Service[i].SERVICE_CODE + "</td>"
					html += "<td>" + Service[i].SERVICE_PERIOD + "</td>"
					html += "<td>" + Service[i].SERVICE_PRICE + "</td>"
					html += "<td>" + Service[i].INSTALL_PRICE + "</td>"
					html += "<td>" + Service[i].REMARKS + "</td>"
					html += "</tr>"

				}

			}

			$("#tbody").html(html);
		}
		
		
		function reloadGoodsList() {
			var params = $("#actionForm").serialize();		
		
		$.ajax({
			type : "post",
			url : "GoodslistAjax",
			dateType : "json",
			data : params,
			success : function(result) {
				redrawGoodsList(result.Goods);
		//		redrawPaging(result.pb);

			},
			error : function(request, status, error) {
				console.log("text : " + request.responseText);
				console.log("error : " + error);
			}

		})

	}
		//리스트 테이블 서비스
		function redrawGoodsList(Goods) {
			var html = "";

			if (Goods.length == 0) {
				html += "<tr>";
				html += "<td colspan=\"10\">조회된 데이터가 없습니다.</td>";
				html += "<tr>";
			} else {
				for ( var i in Goods) {
					html += "<tr class=\"list_contents\" name=\" "+ Goods[i].GOODS_NO +"  \">"
					html += "<td><input type=\"checkbox\" class=\"chbox_lbl\" name=\"\" /></td>";
					html += "<td>" + Goods[i].GOODS_NO + "</td>"
					html += "<td>" + Goods[i].GOODS_CODE + "</td>"
					html += "<td>" + Goods[i].GOODS_PRICE + "</td>"
					html += "<td>" + Goods[i].GOODS_SIZE + "</td>"
					html += "<td>" + Goods[i].REAMARKS + "</td>"
					html += "</tr>"

				}

			}

			$("#tbody").html(html);
		}
		
		
		
		
		$("#add").on("click", function(){
			location.href =  "goodsAdd"
		});
		$("#goods").on("click", function(){
			

		});
		$("#service").on("click", function(){

		});
		
		
		
		
		
	});
</script>
</head>
<body>
<form action="#" method="post" id="actionform">
<input type="hidden" id="list" name="list" value="1"/>

</form>
	<c:import url="/topLeft">
		<c:param name="menuNo">21</c:param>
	</c:import>
	
		<div class="title_area">자사 제품
		</div>
		<div class="content_area">
				<!-- 여기에 내용을 구현 -->
				<div class="contents_wrap">
					<div class="table_top_area">
					<div class="top_title_area">
							<select class="input_short">
								<option selected="selected">인터넷</option>
								<option>보안</option>
							</select> <select class="input_short">
								<option selected="selected" value="1" id="goods">제품</option>
								<option value="2" id="service">서비스</option>
							</select>
					</div>

						<div class="top_btn_area">
							<div class="btn_yellow btn_size_normal add" id="add">등록</div>
							<div class="btn_yellow btn_size_normal delete">삭제</div>
						</div>
					</div>
					
					
					<div id = "searchBtn" class="content_srch_btn">
					<div>검색</div>
					<input type="text" name = "searchTxt" class="content_srch_txt" /> 
					<select name = "searchGbn2" class="content_srch_DD">
						<!-- 검색드랍다운리스트 -->
						<option class="content_srch_DD1"></option>
						<option selected="selected" value = "0">코드</option>
						<option value = "1">기간</option>
						<option value = "2">가격</option>
						<option value = "3">설치비용</option>
					</select> 
					<input type="text" class="cntPick" value="#개 항목중 #개 선택  " readonly="readonly" />
				</div>
					<table class="table_list">
						<colgroup>
							<col width="5%" />
							<col width="5%" />
							<col width="15%" />
							<col width="15%" />
							<col width="8%" />
							<col width="8%" />
							<col width="14%" />

						</colgroup>
						<tr class="table_list_header">
							<td><input type="checkbox" class="chbox_lbl" /></td>
							<td>no</td>
							<td> 코드</td>
							<td> 기간</td>
							<td> 가격</td>
							<td> 설치비용</td>
							<td>비고</td>
						</tr>
						<tbody>
<!-- 						<tr class="list_contents" id="list_contents" name="list_contents">

						</tr> -->
							</tbody>

					</table>
					
					<table class="table_list">
						<colgroup>
							<col width="5%" />
							<col width="5%" />
							<col width="15%" />
							<col width="15%" />
							<col width="8%" />
							<col width="8%" />

						</colgroup>
						<tr class="table_list_header">
							<td><input type="checkbox" class="chbox_lbl" /></td>
							<td>no</td>
							<td> 코드</td>
							<td> 단가</td>
							<td> 사이즈</td>
							<td> 비고</td>
						</tr>
						<tbody>
						<!-- <tr class="list_contents2" id="list_contents2" name="list_contents2">
						</tr> -->
						</tbody>
					</table>
					

					
					
					
					
					
					<div class="list_paging_area">
						<span class="btn_paging"><<</span> <span class="btn_paging"><</span>
						<span class="btn_paging">1</span> <span class="btn_paging">></span>
						<span class="btn_paging">>></span>
					</div>
				</div>
			</div>
</body>
</html>


















