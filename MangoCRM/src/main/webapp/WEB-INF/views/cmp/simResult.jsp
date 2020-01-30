<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contents Test</title>
<c:import url="/header"></c:import>
<script type="text/javascript">
$(document).ready(function() {

	function reloadList() {
		var params = $("#actionForm").serialize();

		$.ajax({
			type : "post",
			url : "Sim_resultAjax",
			dataType : "json",
			data : params,
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
	
	function redrawList(list) {
		var html = "";
		
		if (list.length == 0) {
			html += "<tr>";
			html += "<td colspan=\"5\">조회된 데이터가 없습니다.</td>";
			html += "</tr>";
		} else {
			for ( var i in list) {
				html += "<tr name=\"" + list[i].SIM_NO + "\"id=\""+ list[i].DP_NO +"\" >";
				html += "<td>" + list[i].CMP_NO + "</td>";
				html += "<td>" + list[i].SEND_SIZE + "</td>";
				html += "<td>" + list[i].REPONSE_SIZE + "</td>";
				html += "<td>" + list[i].ACTUAL_RESPONSE_SIZE + "</td>";
				html += "</tr>";
			}
		}
		$("tbody").html(html);
	}
});
</script>
<style type="text/css">
html, body {
	margin: 0;
	font-size: 0pt;
	width: 100%;
	height: 100%;
}

table {
	text-align: center;
	border-bottom: 1px solid #9E9E9E;
	height: 100px;
	margin: 0 auto;
}

/*버튼을 div로 만들었습니다.

  버튼 속성입니다.

  버튼은 float:right을 썼기때문에 반대로 적어주세요.

*/
* {
	box-sizing: border-box;
}

.content_area {
	width: 100% !important;
	font-size: 14pt;
}

.otbox {
	width: 1200px;
	height: 130px;
	margin-top: 30px;
}

.fbox {
	background-color: white;
	width: 500px;
	height: 200px;
}

/* .ibox {
	width: 1400px;
	height: 450px;
} */0

.ttr {
	color: white;
	background-color: gray;
}

.ftb {
	background-color: white;
	color: black;
	font-size: 40pt;
	width: 150px;
	height: 60px;
}

.kwc {
	display: block;
	height: 50px;
	margin-top: 40px;
}

.kwc>div {
	vertical-align: top;
}

.file_txt {
	width: 150px;
	height: 30px;
	display: inline-block;
}

.content_srch_btn>div {
	display: table;
	width: 80px;
	height: 30px;
	font-size: 10pt;
	font-weight: bold;
	color: white;
	text-align: center;
	border-radius: 5px;
	float: right;
	background-color: #595959;
	padding-top: 5px;
	margin-top: 10px;
	margin-left: 10px;
}

.content_srch {
	width: 1200px;
	height: 50px;
}

.content_srch_txt {
	display: inline-block;
	width: 200px;
	height: 25px;
	font-size: 10pt;
	margin-top: 10px;
	margin-left: 10px;
	border: 1px solid #ccc;
	float: right;
	border-radius: 5px;
}

.content_srch_btn {
	display: inline-block;
	width: 300px;
	height: 50px;
	min-width: 220px;

	/* margin-left: 895px; */
}

.content_srch_DD {
	display: inline-block;
	width: 100px;
	height: 30px;
	font-size: 10pt;
	margin-top: 10px;
	margin-left: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	float: right;
}

.content_srch_DD1 {
	display: none;
}

.content {
	width: 100px;
	height: 30px;
	display: inline-block;
	margin-left: 1000px;
}

.test1 {
	width: 150px;
	height: 50px;
	margin-left: 600px;
}

/* 두표꺼 */
.select_btn_area {
	display: inline-block;
	width: 62%;
	height: 160px;
}

.select_area {
	margin-left: 419px;
	display: inline-block;
	width: 210px;
	height: 30px;
	vertical-align: bottom;
	margin-bottom: -37px;
	margin-top: 7px;
}

.full_area {
	height: 150px;
	width: 400px;
}

.select_area>select {
	display: inline-block;
	font-size: 14pt;
	width: 100px;
	height: 30px;
	text-align: center;
	vertical-align: top;
	border-radius: 5px;
}

.year_select {
	display: inline-block;

	/*margin-left: calc(100% - 450px);*/
}

.month_select {
	display: inline-block;
}

.btn_area {
	display: inline-block;
	width: 350px;
	height: 100px;
	min-width: 220px;
	margin-left: 920px;
}

.first_btn_area {
	display: inline-block;
	width: 275px;
	height: 40px;
	text-align: center;
}

.first_btn_area>div {
	display: table;
	width: 80px;
	height: 30px;
	font-size: 10pt;
	color: #595959;
	text-align: center;
	border-radius: 5px;
	float: right;
	background-color: #F2B807;
	padding-top: 5px;
	margin-top: 10px;
	margin-left: 10px;
}

/*버튼의 hover입니다.*/
.first_btn_area>div:hover {
	background-color: #F2CB07;
	cursor: pointer;
}

* /

.second_vertical_btn_space {
	display: block;
	width: 250px;
	height: 10px;
}

.second_btn_area {
	display: inline-block;
	width: 275px;
	height: 50px;
	text-align: center;
}

.second_btn_area>div {
	display: table;
	width: 80px;
	height: 30px;
	font-size: 10pt;
	color: #595959;
	text-align: center;
	border-radius: 5px;
	float: right;
	background-color: #F2B807;
	padding-top: 5px;
	margin-top: 10px;
	margin-left: 10px;
}

/*버튼의 hover입니다.*/
.second_btn_area>div:hover {
	background-color: #F2CB07;
	cursor: pointer;
}

.third_btn_area {
	display: block;
}

.circle {
	display: inline-block;
	width: 30px;
	height: 30px;
	border-radius: 50%;
	background: #595959;
	font-size: 16px;
	color: white;
	text-align: center;
	line-height: 30px;
	font-weight: bold;
}

.circle1 {
	display: inline-block;
	width: 30px;
	height: 30px;
	border-radius: 50%;
	background: #F2CB07;
	font-size: 16px;
	color: black;
	text-align: center;
	line-height: 30px;
	font-weight: bold;
}



.btn_size_normal {
	width: 80px;
	height: 30px;
	line-height: 30px;
}

.btn_yellow {
	width: 80px;
	height: 30px;
	line-height: 30px;
	display: inline-block;
	margin-left: 10px;
	text-align: center;
	vertical-align: middle;
	border-radius: 3px;
	background-color: #F2B807;
	border: 1px solid #c5960a;
	color: #272727;
	font-size: 10pt;
	font-weight: bold;
	cursor: pointer;
	float: right;
}

.btn_yellow:hover {
	background-color: #F2CB07;
}

.enroll_btn {
	width: 1200px;
	height: 50px;
}
/*버튼을 div로 만들었습니다.
  버튼 속성입니다.
  버튼은 float:right을 썼기때문에 반대로 적어주세요.
*/
.enroll_btn>div {
	display: table;
	width: 80px;
	height: 30px;
	font-size: 10pt;
	color: #595959;
	text-align: center;
	border-radius: 5px;
	float: right;
	background-color: #F2B807;
	padding-top: 7px;
	margin-top: 20px;
	margin-left: 10px;
}
/*버튼의 hover입니다.*/
.enroll_btn>div:hover {
	background-color: #F2CB07;
	cursor: pointer;
}
 .content_btn {
   width : 1200px;
   height : 50px;
   /* text-align : center; */
   vertical-align:top;
} 

.content_btn > div {
	display: inline-block;
	width : 400px;
	height: 50px;
	font-size: 10pt;
	text-align:center;
	color: black;
	border-radius : 5px;
	background-color : white;
	padding-top : 10px;
	border : 2px solid #595959;
	margin-right:400px;
}

.react{
	color: red;
	font-weight: bold;
}
.real_react{
	color : green;
	font-weight: bold;
}
.send{
	color : blue;
	font-weight: bold;
}

.sample_1 {
   width: 100%;
   height: 50px;
   border-bottom: 1px solid #cccccc;
}
.sample_2 {
   width: 100%;
   height: 50px;
   border-bottom: 1px solid #cccccc;
}
.sample_2 input{
outline: none;
}

.sample_title1{
background-color : #595959;
font-size : 10pt;
font-weight: bold;
color : #ffffff;
width: 75px;
}
.sample_title2 {
background-color : #595959;
font-size : 10pt;
font-weight: bold;
color : #ffffff;
width: 150px;
}
.sample1_txt {
border : 0;
width: 150px;
text-align:center;

}
.sample_title3 {
background-color : #595959;
font-size : 10pt;
font-weight: bold;
color : #ffffff;
width: 150px;

}
.sample2_txt {
border : 0;
width: 150px;
text-align:center;
}
.sample_title4{
background-color : #595959;
font-size : 10pt;
font-weight: bold;
color : #ffffff;
width: 150px;

}
.sample3_txt {
border : 0;
width: 150px;
text-align:center;
}
.sample_title5{
background-color : #595959;
font-size : 10pt;
font-weight: bold;
color : #ffffff;
width: 150px;
}
.sample4_txt {
border : 0;
width: 150px;
text-align:center;
}

.otbox {
	width: 1200px;
	height: 130px;
	margin-top: 30px;
}


</style>
</head>
<body>

	<c:import url="/topLeft">
		<c:param name="menuNo">11</c:param>
	</c:import>
	<div class="title_area">Main Title</div>
	<div class="content_area">
		<div class="contents_wrap">
			<!-- 내용쓰기 -->


			<div class="circle">1</div>
			&nbsp;&nbsp;
			<div class="circle">2</div>
			&nbsp;&nbsp;
			<div class="circle">3</div>
			&nbsp;&nbsp;
			<div class="circle1">4</div>
			&nbsp;&nbsp; <br />

			<!-- 첨부파일  -->

			<br />
			<!--  두표꺼 끝aaaaaaaaaaaaaaaa -->

			<!-- 그래프 영역  -->

			<a href="#"
				onClick="saveNDrive('https://cafeattach.naver.net/07921ba8bde5e33f10f294a5987b0375dd8f719356/20190822_59_cafefile/28933132_1566465844559_PhHh5W_rtf/%EC%A0%95%EB%A6%AC.rtf?type=attachment', '%EC%A0%95%EB%A6%AC.rtf', '4318');return false"></a>

			

				<img src="./images/common/그래프.png"
					style="width: 1200px; height: 450px;">

			
			<br />
			<!-- 테이블 -->
			<div class="content_btn">
				<div style="border: inset;">
					<span class="react">■</span>: (반응값) <span class="real_react">●</span>:
					(실반응값) <span class="send">▲</span>: (전송량)
				</div>
			</div>
			<br />
			<div class="otbox">

				<div id="con" class="list">

				<table>

					<tr class="sample_1">

						<td class="sample_title1">캠페인 명</td>
						<td class="sample_title2">전송량</td>
						<td class="sample_title3">반응값</td>
						<td class="sample_title4">반응률(%)</td>
						<td class="sample_title4">실반응값</td>
						<td class="sample_title5">담당자</td>
						
					</tr>
					<tr class="sample_2">



						<td class="smp" type="text"style="font-size:13px;">000캠페인</td>

						<td><input class="sample1_txt" type="text" readonly
							value="10" /></td>
						<td><input class="sample2_txt" type="text"
							readonly="readonly" value="100" /></td>
						<td><input class="sample3_txt" type="text"
							readonly="readonly" value="10%" /></td>
						<td><input class="sample4_txt" type="text"
							readonly="readonly" value="10" /></td>
						<td><input class="sample4_txt" type="text"
							readonly="readonly" value="담당자" /></td> 
						</tr>

				</table>
</div>
			</div>

			

			<div class="enroll_btn">
				<div>결재 올리기</div>
			</div>

			
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>