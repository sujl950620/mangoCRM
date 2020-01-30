<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/cmp/channelSelect.css" />
<c:import url="/header"></c:import>
<script type="text/javascript">
$(document).ready(function() {
	console.log("${param}");
	$(".save_Btn").on("click", function(){
		
		if($.trim($("#Email_input").val()) ==""){
			alert("내용을 입력하세요.");
			$("#Email_input").focus();
		}/* else if($.trim($("#mmsArea").val()) == ""){
			alert("내용을 입력하세요.");
			$("#mmsArea").focus();
		}else if($.trim($("#smsArea").val()) == ""){
				alert("내용을 입력하세요.");
				$("#smsArea").focus();
		} */else {
			
			var params = $("#saveForm").serialize();

			$.ajax({
				type : "post",
				url : "SaveAjax",
				dataType : "json",
				data : params,
				success : function(result) {
					if(result.res == "SUCCESS"){
						alert("저장에 성공하였습니다.");
					}else{
						alert("작성에 실패하였습니다.");
						}
				},
				error : function(request, status, error) {
					console.log("text : " + request.responseText);
					console.log("error : " + error);
				}
			});
		}
	});
	
	$("#cancelBtn").on("click", function(){
		history.back();
	});	
	
	/* $('button').each(function() {
		if ($(this).html().length > 2) {
			var leng_diff = $(this).html().length - 2;
			$(this).width($(this).width() + (10 * leng_diff) + "px");
		}
	});
	$('.top_bar > div').each(function() {
		if ($(this).html().length > 2) {
			var leng_diff = $(this).html().length - 2;
			$(this).width($(this).width() + (10 * leng_diff) + "px");
		}
	});
	$('.bottom_bar > div').each(function() {
		if ($(this).html().length > 2) {
			var leng_diff = $(this).html().length - 2;
			$(this).width($(this).width() + (10 * leng_diff) + "px");
		}
	}); */
	
	
	$("#allChk").on("click", function() {
		// .is(셀렉터) : 해당 셀렉터인지 확인. 맞으면 true
		if($(this).is(":checked")) {
			//$("#checkWrap [type='checkbox']").attr("checked", "checked");
			$("#chkWrap [type='checkbox']").prop("checked", true);
		} else {
			//$("#checkWrap [type='checkbox']").removeAttr("checked");
			$("#chkWrap [type='checkbox']").prop("checked", false)
		}
	});
	
	$("#chkWrap").on("click", "[type='checkbox']", function() {
		if(!$(this).is(":checked")) {
			$("#all").prop("checked", false);
		} else {
			var cnt = 0;
			
			//$(셀렉터).each(함수) : 셀렉터의 개수만큼 함수를 실행
			$("#chkWrap [type='checkbox']").each(function() {
				if(!$(this).is(":checked")) {
					cnt++;
				}
			});
			
			if(cnt == 0) {
				$("#allChk").prop("checked", true);
			}
		}
	});
	
	$("#a").on("click", function() {
		//click() : 클릭이벤트를 발생
		//click(함수) : 클릭시 함수가 동작하도록 이벤트 할당. on("click", 함수)와 동일
		$("#allChk").click();
	});
	
	/* $("tbody").on("click", "tr", function() {
		$("#no").val($(this).attr("name"));
		$("#actionForm").attr("action", "aDetail");
		$("#actionForm").submit();
	}); 
	
	이놈이 div 클릭견본이다.
	*/
	
	$("#select_btn").on("click", "div", function() {
		if($("#EmailChk").is(":checked")) {
			var html = "";
			html += "<div class=\"Email_area\">"
			html += "<br><b>E-mail 업체선정</b><br>"
			html += "<br><br>채널"
			html += "</div>"
			
			$("#Email_write_area").html(html);
		}
	});
	
	
	
	
	
	
	
	
	
	$("#writeBtn").on("click", "div", function() {
		if($("#EmailChk").is(":checked")) {
			
		var html = "";
		html += "<div class=\"Email_area\">"
		html += "<br><b>E-mail 미리보기</b><br>"
		html += "<textarea id=\"Email_input\" name=\"Email_input\" cols=\"30\" rows=\"15\" style=\"resize: none; width: 500px\"></textarea>"
		html += "</div>";
		
		$("#Email_write_area").html(html);
		}
		
		if($("#MMSChk").is(":checked")) {
			var html = "";
			
			html += "<div class=\"mms_area\">";
			html += "<div class=\"mms_title\"><b>MMS 작성란</b></div><br/>"
			html += "<textarea class=\"mms_content\" id=\"mmsArea\" name=\"mmsArea\" col=\"10\" rows=\"8\" style=\"resize: none;\"></textarea><br>"
			html += "<div class=\"mms_number\"><input type=\"text\" class =\"file_add_input\" placeholder=\"첨부파일\" style=\"\"/><div class=\"mms_btn\"><div>첨부</div></div></div>";
			html += "<div class=\"mms_bottom_area\"></div>";
			html += "</div><br/>";
			
			$("#MMS_write_area").html(html);
		}
		
		if($("#SMSChk").is(":checked")) {
			var html = "";
			
			html += "<div class=\"sms_area\">";
			html += "<div class=\"sms_title\"><b>SMS 작성란</b></div><br/>"
			html += "<textarea class=\"sms_content\" id=\"smsArea\" name=\"smsArea\" col=\"10\" rows=\"8\" style=\"resize: none;\"></textarea><br>"
			html += "</div><br/>";
			
			
			$("#SMS_write_area").html(html);
		}
	});
	
	
	
	
	
	$("#MMSBtn").on("click", function() {
		
	});
	
	$("#sendBtn").on("click", function() {
		alert("저장 되었습니다.")
		location.href = "./analyze.html";
		//지금 경로 맞지않음, 수정요망
	});
	
});
</script>
</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">14</c:param>
	</c:import>
	<div class="title_area">채널선정</div>
	<div class="content_area">
		<div class="contents_wrap">
			<div class="btn_area">
				<div class="circle" >1</div> &nbsp;&nbsp;
				<div class="circle" >2</div> &nbsp;&nbsp;
				<div class="circle1" >3</div> &nbsp;&nbsp;
				<div class="circle" >4</div> &nbsp;&nbsp;
				
				<div class="save_Btn">저장</div>
				<div class="next_Btn">시뮬레이션 수행</div>
				<div class="back_Btn">이전</div>
			</div>
			
			<div class="fieldset_area">
				<fieldset class="box_area">
					<legend>채널선정</legend>
						<input type="checkbox" name="allChk" id="allChk" />전체
					  
						<div class="chkWrap" id="chkWrap" >
							<input type="hidden" name="" id="" value="" />
							<input type="checkbox" name="EmailChk" id="EmailChk" />E-Mail(건당 30원)<br/>
							<input type="checkbox" name="MMSChk" id="MMSChk" />MMS(건당 20원)<br />
							<input type="checkbox" name="SMSChk" id="SMSChk" />SMS(건당 10원)<br/><br />
						</div>
						<div class="writeBtn" id="select_btn" name="select_btn" >
							<div>업체선정</div>
						</div>
				</fieldset>
				
				<fieldset class="reserv_area">
					<legend>예약어 안내</legend>
						<div class="reserv_txt_area">
							<div class="reserv_txt_title">#이름#</div>
							<div class="reserv_txt_exp">고객의 이름 자동적으로 입력</div>
						</div>
						<div class="reserv_txt_area">
							<div class="reserv_txt_title">#전화번호#</div>
							<div class="reserv_txt_exp">고객의 전화번호 자동적으로 입력</div>
						</div>
						<div class="reserv_txt_area">
							<div class="reserv_txt_title">#수신거부#</div>
							<div class="reserv_txt_exp">수신거부 방법 안내</div>
							<div class="reserv_txt_exp"> ex) 수신거부 : 114</div>
						</div>
				</fieldset>
			</div>
			
			
			<br />
			
			<form action="#" id="saveForm" method="post">
			<div class="Email_write_area" id="Email_write_area" name="Email_write_area"></div>
			<div class="MMS_write_area" id="MMS_write_area" name="MMS_write_area" ></div>
			<div class="SMS_write_area" id="SMS_write_area" name="SMS_write_area" ></div>
			</form>
			<!-- jQuery이용해서 초기화 후 추가 되는 부분 -->
			
			<input type="hidden" name="sendBtn" id="sendBtn" value="발송" />
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>