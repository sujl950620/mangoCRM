<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/msg/msgChat.css" />
<c:import url="/header"></c:import>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">16</c:param>
	</c:import>
	<div class="title_area">ooo님과의 채팅방</div>
	<div class="content_area">
		<div class="contents_wrap">
			<div class="msg">
				<div class="top_bar">
					<div class="chat_top_btn_area">
						<div class="add_staff">초대</div>
						<div class="home_btn">홈</div>
					</div>
				</div>
				<div class="board">
					<div class="chat_board"></div>
					<div class="bottom_bar">
						<!-- 초대, 첨부파일, 텍스트창, 보내기버튼 -->
						<div class="file_area">
							<div class="file">+</div>
						</div>
						<input type="text" class="write" />
						<div class="send">보내기</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>