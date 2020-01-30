<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<script src=''></script>
<meta charset="UTF-8">
<title>일정 관리</title>
<c:import url="/header"></c:import>
<link rel="stylesheet" href="resources/script/fullcalendar/fullcalendar.css">
<link rel="stylesheet" href="resources/script/fullcalendar/fullcalendar.min.css">
<style type="text/css">
.fc-button {
	background-image: none !important;
	width: 80px !important;
	height: 80px !important;
}

.fc-state-hover,
.fc-state-down,
.fc-state-active,
.fc-state-disabled {
  color: #333333;
  background-color: none; }

.fc-state-hover {
  color: #333333;
  text-decoration: none;
  background-position: 0 -80px !important;
  -webkit-transition: background-position 0.1s linear;
  -moz-transition: background-position 0.1s linear;
  -o-transition: background-position 0.1s linear;
  transition: background-position 0.1s linear; }
</style>

<script src="resources/script/jquery/moment.js"></script>
<script src="resources/script/fullcalendar/fullcalendar.js"></script>
<script src="resources/script/fullcalendar/locale-all.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$(function () {
		// page is now ready, initialize the calendar...
		$("#calendar").fullCalendar({
			// put your options and callbacks here
			header : { // 버튼 위치선정
				left : "title",
				right : "today, prevYear, prev, next, nextYear"
			},
			height : "auto",
			droppable : true,
			/* editable : true, */ // 이벤트 이동
			locale : "ko",
			/* eventLimit : true, */ // 스케줄 많을시 압축
			events : [
/* 				for(list in data) {
					{
						id : list.id,
						title : list.title,
						start : list.start,
						end : list.end,
					}
				}
*/
				{ // 일정 하나
					title : "asdf",
					start : "2020-01-20"
				},
				{
					title : "qwer",
					start : "2020-01-19", 
					end : "2020-01-21"
				},
				{
					title : "1234",
					start : "2020-01-20",
					end : "2020-01-27"
				},
				{
					title : "bgt5",
					start : "2020-01-18",
					end : "2020-01-23",
					no: "3"
				},
				{
					title : "zxcv",
					start : "2020-01-07T16:20:00"
				}
			],
			eventClick : function(calEvent, jsEvent, view) {

			    alert('Event: ' + calEvent.no + "," + calEvent.title + "," + calEvent.start);

			    // change the border color just for fun

			  },
			dayClick : function(date, jsEvent, view) { // 날짜 클릭
			   alert('Clicked on: ' + date.format());
 			},
 			/* hiddenDays : [0, 6] */ //주말제거
		});
	});



/* 	$("#alertBtn").on("click", function() {
		makeAlert(1, "하이", "내용임", null);
	});
	
	$("#oneBtn").on("click", function() {
		makeOneBtnPopup(1, "버튼하나팝업", "내용들감", true, 400, 200, null, "하이", function() {
			closePopup(1);
		});
	});
	
	$("#twoBtn").on("click", function() {
		makeTwoBtnPopup(1, "버튼둘팝업", "내용들감", true, 600, 400, null, "어라라", function() {
			makeAlert(2, "하이", "내용임", null);
		},"하이", function() {
			closePopup(1);
		});
	});
	
	$("#threeBtn").on("click", function() {
		makeThreeBtnPopup(1, "버튼셋팝업", "내용들감", false, 400, 600, null, "어라라", function() {
			closePopup(1);
		},"하이", function() {
			closePopup(1);
		},"마지막", function() {
			closePopup(1);
		});
	});
	
	$("#scheAdd").on("click",function(){
		location.href = "scheAdd"
	}); */
});
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">7</c:param>
	</c:import>
	<div class="title_area">Main Title</div>
	<div class="content_area">
		<div class="contents_wrap">
<!-- 			<input type="button" value="알림창" id="alertBtn" />
			<input type="button" value="1버튼" id="oneBtn" />
			<input type="button" value="2버튼" id="twoBtn" />
			<input type="button" value="3버튼" id="threeBtn" />
			<input type="button" value="일정 등록" id="scheAdd"/>
 -->			<div id="calendar"></div>
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>