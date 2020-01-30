<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>제품 </title>
<c:import url="/header"></c:import>
<script type="text/javascript">
//버튼에 한글자씩 추가되면 길이가 10씩 늘어납니다.
//버튼에 한글자씩 추가되면 길이가 10씩 늘어납니다.
$(document).ready(function() {
// Button Auto Sizing
	$('button').each(function() {
		if($(this).html().length > 2) {
			var leng_diff = $(this).html().length - 2;
			$(this).width($(this).width() + (10 leng_diff) + "px");
			}
		})
	$('.content_btn>div').each(function() {
		if($(this).html().length > 2) {
			var leng_diff = $(this).html().length - 2;
			$(this).width($(this).width() + (10 leng_diff) + "px");
			}
		})
});
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">21</c:param>
	</c:import>
		<div class="title_area">제품</div>
		<div class="content_area">
			<!-- 여기에 내용을 구현 -->
			<div class="contents_wrap">
				<div class="table_top_area">
					<div class="top_title_area"></div>
					<div class="top_btn_area">
						<div class="btn_yellow btn_size_normal edit">수정</div>
						<div class="btn_yellow btn_size_normal del">삭제</div>
						<div class="btn_yellow btn_size_normal list">목록</div>
					</div>
				</div>
				
				
				
				
				<table class="table_normal">
					<colgroup>
						<col width="10%" />
						<col width="40%" />
						<col width="10%" />
						<col width="40%" />
					</colgroup>
					<tr>
						<td class="field_name first_field_name">제품번호
						<span class="acc_txt"></span>
						</td>
						<td class="field_contents" colspan="">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
						<td class="field_name">제품코드
						<span class="acc_txt"></span>
						</td>
						<td class="field_contents" colspan="">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name">제품 단가
						</td>
						<td class="field_contents">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
						<td class="field_name">사이즈
						</td>
					    <td class="field_contents">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name">비고
						</td>
						<td class="field_contents"colspan="3">
							<input type="text" class="input_border_0" readonly="readonly" />

					</tr>
					
					
					
				</table>
				<table class="table_normal">
					<colgroup>
						<col width="10%" />
						<col width="40%" />
						<col width="10%" />
						<col width="40%" />
					</colgroup>
					<tr>
						<td class="field_name first_field_name">서비스 번호
						<span class="acc_txt"></span>
						</td>
						<td class="field_contents" colspan="">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
						<td class="field_name">서비스 코드
						<span class="acc_txt"></span>
						</td>
						<td class="field_contents" colspan="">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name">기간
						</td>
						<td class="field_contents">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
						<td class="field_name">가격
						</td>
					    <td class="field_contents">
							<input type="text" class="input_border_0" readonly="readonly" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name">설치료
						</td>
						<td class="field_contents"colspan="3">
							<input type="text" class="input_border_0" readonly="readonly" />

					</tr>
					<tr>
						<td class="field_name first_field_name">비고
						</td>
						<td class="field_contents"colspan="3">
							<input type="text" class="input_border_0" readonly="readonly" />

					</tr>
					
					
					
				</table>
			</div>
		</div>
</body>
</html>