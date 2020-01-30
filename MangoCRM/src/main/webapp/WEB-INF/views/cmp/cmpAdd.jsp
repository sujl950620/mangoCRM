<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mango CRM</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/cmp/cmpAdd.css" />
<c:import url="/header"></c:import>
</head>
<script type="text/javascript">
$(document).ready(function() {
	
	// 다음 버튼 클릭 Event
	$("#next_Btn").on("click", function() {
		$("#actionForm").attr("action","targetSelect");
		$("#actionForm").submit();
	});

});
	</script>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">10</c:param>
	</c:import>
	<div class="title_area">캠페인 등록</div>
	<div class="content_area">
		<div class="contents_wrap">
			

			<div class="btn_area">
				<div class="next_Btn" id="next_Btn">다음</div>

				<div class="circle1">1</div>
				&nbsp;&nbsp;
				<div class="circle">2</div>
				&nbsp;&nbsp;
				<div class="circle">3</div>
				&nbsp;&nbsp;
				<div class="circle">4</div>
				&nbsp;&nbsp;

			</div>


			<div class="tbl">
				<form action="#" id="actionForm" method="post">
				
					<table>
						<colgroup>
							<!-- 테이블열들의 너비입니다. -->
							<col width="10%" />
							<col width="40%" />
							<col width="10%" />
							<col width="40%" />
						</colgroup>
						<tr>
							<th>캠페인 명</th>
							<td><input type="text" class="table_txt" name="cmpName"/></td>
							<th>담당자</th>
							<td><input type="text" class="table_txt" name="mgrName"/></td>
						</tr>
						<tr>
							<th>시작일</th>
							<td><input type="text" class="table_txt" name="sdate"/></td>
							<th>종료일</th>
							<td><input type="text" class="table_txt" name="edate"/></td>
						</tr>
						<tr>
							<th>캠페인 유형</th>
							<td colspan="3"><select class="content_srch_DD2">
									<option class="content_srch_DD1">00캠페인</option>
									<option >나중순</option>
									<option>입맛별로</option>
							</select></td>
						</tr>
					</table>
				</form>
			</div>
			<br />
			<table>
				<tr class="sample_1">

					<td class="sample_title1">일련번호</td>
					<td class="sample_title2">캠페인명</td>
					<td class="sample_title3">진행기간</td>
					<td class="sample_title4">진행상태</td>
					<td class="sample_title5">담당자</td>
				</tr>
				<tr class="sample_2">

					<td>1</td>
					<td><input class="sample1_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample2_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample3_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample4_txt" type="text" readonly="readonly" /></td>

				</tr>
				<tr class="sample_2">

					<td>2</td>
					<td><input class="sample1_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample2_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample3_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample4_txt" type="text" readonly="readonly" /></td>

				</tr>
				<tr class="sample_2">

					<td>3</td>
					<td><input class="sample1_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample2_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample3_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample4_txt" type="text" readonly="readonly" /></td>

				</tr>
				<tr class="sample_2">

					<td>4</td>
					<td><input class="sample1_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample2_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample3_txt" type="text" readonly="readonly" /></td>
					<td><input class="sample4_txt" type="text" readonly="readonly" /></td>

				</tr>
				</table>
				<br />
				<br />
				<div class="tbl">

					<table>
						<colgroup>
							<!-- 테이블열들의 너비입니다. -->
							<col width="10%" />
							<col width="40%" />
							<col width="10%" />
							<col width="40%" />
						</colgroup>
						<div class="title_area">상세 설명</div>
						<tr>
							<th></th>
							<td colspan="3"><textarea rows="3" cols="3"
									class="table_txt2"></textarea> <!-- resize="none" --></td>
						</tr>
					</table>
				</div>


				</div>
				</div>
				</div>
				<c:import url="/bottom"></c:import>
</body>
</html>