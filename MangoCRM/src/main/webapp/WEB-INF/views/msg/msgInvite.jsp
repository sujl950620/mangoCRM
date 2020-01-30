<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/header"></c:import>
<link rel="stylesheet" type="text/css" href="resources/css/msg/msgInvite.css" />
<script type="text/javascript">
$(document).ready(function() {
	reloadInviteList();
	
});
function reloadInviteList() {
	var params = $("#actionForm").serialize();
	
	$.ajax({
		type : "post", //데이터 전송방식
		url :"getMsgInviteListAjax", //주소
		dataType : "json", //데이터 전송 규격
		data : params, //보낼 데이터
		// { 키:값, 키:값, .....} --> json
		success : function(result) {
			redrawInviteList(result.list);
		},
		error : function(request, status, error) {
			console.log("text : " + request.responseText);
			console.log("error : " + error);
		}
	});
}

function redrawInviteList(list) {
	var html = "";
	
	if(list.length == 0) {
		html += "<tr>";
		html += "<td colspan=\"5\">조회된 데이터가 없습니다.</td>";
		html += "</tr>";
	} else {
		for(var i in list) {
			/*
			[ EMP TABLE ]
			EMP_NO 사원번호
			EMP_POSI_NO 직급번호
			TEAM_NO 팀번호
			EMP_NAME 사원명
			EMP_ID 사원아이디
			EMP_PHONE 사원 전화번호
			EMP_RESIGN_DATE 퇴사일자
			EMP_IMAGE 사원 이미지
			EMP_MEMO_CON 메모내용
			 */
			
			// JOIN TABLE LIST
			/*
			[ TEAM TABLE ]
			TEAM_NO 팀번호
			DEPART_NO 부서번호
			TEAM_NAME 팀명
			
			[ EMP_POSI TABLE ]
			EMP_POSI_NO = 직급번호
			EMP_POSI_NAME 직급명
			*/
			/* html += EMP_POSI_NO + TEAM_NO + EMP_NAME; */
			html += "<div class=\"chat_one\">";
			html += "<div class=\"chat_one_left\">";
			html += "<input type=\"checkbox\" id=\"chbox\" />";
			html += "</div>";
			html += "<div class=\"chat_one_right\">";
			html += "<div class=\"t_chat_one_right\">" + list[i].EMP_NAME + " ( " + list[i].DEPART_NAME + " / " + list[i].TEAM_NAME + " / " + list[i].EMP_PHONE + " ) " + "</div>";
			html += "</div>";
			html += "</div>";
		}
	}
	 $("#chat_board").html(html);
}
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">17</c:param>
	</c:import>
	<div class="title_area">초대하기</div>
	<div class="content_area">
		<div class="contents_wrap">
			<div class="msg">
				<div class="top_bar">
					<form action="#" method="post" name="actionForm">
					<div class="top_bar_left">
						<div class="select_depart_area">
							<select name="select_depart" id="select_depart" class="write2">
								<option value="">부서 선택</option>
								<!-- DEPART TABLE
								DEPART_NO
								1 = ?
								
								 -->
								<option value="영업1팀">영업 1팀</option>
								<option value="영업2팀">영업 2팀</option>
							</select>
						</div>
						<div class="select_class_area">
							<select name="select_class" id="select_class" name="select_class" class="write2">
								<option value="직위 선택">직위 선택</option>
								<!-- EMP_POSI TABLE 
								1 = 사원
								2 = 대리 
								3 = 팀장
								4 = 부장
								5 = 실장
								6 = 이사
								7 = 대표이사
								8 = Admin !!!
								-->
								<option value="1">사원</option>
								<option value="2">대리</option>
								<option value="3">팀장</option>
								<option value="4">부장</option>
								<option value="5">실장</option>
								<option value="6">이사</option>
								<option value="7">대표이사</option>
							</select>
						</div>
						<div class="srch">
							<input type="text" class="write" size="15" placeholder="검색" />
							<input type="button" class="srch_btn" value="검색" />
						</div>
					</div>
					</form>
					<!-- 				<div class = "cho_ent">
						<input type = "button" class = "cho_ent_btn" value = "전체선택" />
					</div>
					<div class = "cho_we_dpt">
						<input type = "button" class = "cho_we_dpt_btn" value = "우리부서 선택" />
					</div> -->
					<div class="top_bar_right">
						<div class="back">뒤로가기</div>
						<div>전체 선택</div>
						<div>우리부서 선택</div>
					</div>
				</div>
				<div class="board">
					<div class="board_title_wrap">
						<div class="board_chk_wrap"></div>
						<div class="board_title">회원정보</div>
					</div>
					<div class="chat_board" id="chat_board" name="chat_board">
						
					</div>
					<div class="invite">
						<div class="invite_btn">초대하기</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>