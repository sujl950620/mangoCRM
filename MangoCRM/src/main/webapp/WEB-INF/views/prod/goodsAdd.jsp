<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품/서비스 등록</title>
<c:import url="/header"></c:import>
<script type="text/javascript">
	//버튼에 한글자씩 추가되면 길이가 10씩 늘어납니다.
	$(document).ready(function() {
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
		$("#cancel").on("click", function(){
			history.back();
		});
		
		
	});
</script>
<style type="text/css">
.jasa{
	width: 100px;
	height: 25px;
	font-size: 10pt;
	border: 1px solid #ccc;
	border-radius: 5px;
	float: left;
}
.jasa:focus {
	border: 1px solid #F2B807;
	box-shadow: none;
	outline: none;
}
.jasa::placeholder {
	color: #cacaca;
}
</style>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">21</c:param>
	</c:import>

		<div class="title_area">제품/서비스 등록</div>
		<div class="content_area">
			<!-- 여기에 내용을 구현 -->
			<div class="contents_wrap">
				<div class="table_top_area">
					<div class="top_title_area">
						<select class="jasa">
							<option >보안</option>
							<option >인터넷</option>
						</select>
						<select class="jasa">
							<option value="1">제품</option>
							<option value="2">서비스</option>
						</select>					
					</div>
					<div class="top_btn_area">
						<div class="btn_yellow btn_size_normal del" >삭제</div>
						<div class="btn_yellow btn_size_normal cancel" id="cancel">취소</div>
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
						<td class="field_name first_field_name" id="ent_purposedate">
							제품번호 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="ent_purposedate_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
						<td class="field_name" id="manager">
							제품코드 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="manager_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name" id="ent_purposesales">
							제품단가 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="ent_purposesales_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
						<td class="field_name first_field_name" id="ent_purposesales">
							사이즈 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="ent_purposesales_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name" id="resolution">비고</td>
						<td class="field_contents" id="resolution_contents" colspan=3>
							<input type="text" class="input_normal" id="resolution_text" />
						</td>
					</tr>
				</table>
				
				<table class="table_normal"  >
					<colgroup>
						<col width="10%" />
						<col width="40%" />
						<col width="10%" />
						<col width="40%" />
					</colgroup>
					<tr>
						<td class="field_name first_field_name" id="ent_purposedate">
							서비스번호 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="ent_purposedate_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
						<td class="field_name" id="manager">
							서비스코드 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="manager_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name" id="ent_purposesales">
							기간 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="ent_purposesales_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
						<td class="field_name first_field_name" id="ent_purposesales">
							가격 <span class="acc_txt">*</span>
						</td>
						<td class="field_contents" id="ent_purposesales_contents">
						<input type="text" class="input_normal" id="ent_purposesales_text" />
						</td>
					<tr>
						<td class="field_name first_field_name" id="resolution">설치료</td>
						<td class="field_contents" id="resolution_contents" colspan=3>
							<input type="text" class="input_normal" id="resolution_text" />
						</td>
					</tr>
					<tr>
						<td class="field_name first_field_name" id="resolution">비고</td>
						<td class="field_contents" id="resolution_contents" colspan=3>
							<input type="text" class="input_normal" id="resolution_text" />
						</td>
					</tr>
				</table>
				</div>
			</div>
</body>
</html>