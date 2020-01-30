<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/msg/msgList.css" />
<c:import url="/header"></c:import>
<script type="text/javascript">
$(document).ready(function() {
	
	
});
function reloadList() {
	var params = $("#actionForm").serialize();
	
	$.ajax({
		type : "post", //데이터 전송방식
		url :"msgListAjax", //주소
		dataType : "json", //데이터 전송 규격
		data : params, //보낼 데이터
		// { 키:값, 키:값, .....} --> json
		success : function(result) {
			redrawList(result.list);
			redrawPaging(result.pb);
		},
		error : function(request, status, error) {
			console.log("text : " + request.responseText);
			console.log("error : " + error);
		}
	});
}
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">16</c:param>
	</c:import>
	<div class="title_area">목록</div>
	<div class="content_area">
		<div class="contents_wrap">
			<div class="msg">
				<div class="top_bar">
					<div class="srch">
						<input type="text" class="write" /> <input type="button"
							class="srch_btn" value="검색" />
					</div>
					<div class="invite_btn">초대하기</div>
				</div>
				<div class="board_wrap">
					<div class="title_wrap">
						<div class="left_title_wrap">
							<div class="left_title">즐겨찾기 목록</div>
						</div>
						<div class="right_title_wrap">
							<div class="right_title">채팅방 목록</div>
						</div>
					</div>
					<div class="left">

						<div class="p_left_space"></div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
						<div class="left_one">
							<!-- <div class="p_left"></div> -->
							<div class="t_left">
								<br />OOO님과의 채팅방<br /> ~~~ 분 전
							</div>
						</div>
					</div>

					<div class="right">
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
							<div></div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
						<div class="right_area">
							<div class="nick_name">이름</div>
							<div class="chat">채팅 내용 내용 내용 내용</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>