<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/header"></c:import>
<link rel="stylesheet" type="text/css" href="resources/css/perfAnalyze/perfAnalyze.css" />

</head>
<body>
	<c:import url="/topLeft">
		<c:param name="menuNo">13</c:param>
	</c:import>
	<div class="title_area">성과분석</div>
	<div class="content_area">
		<div class="contents_wrap">
			<div class="cmp_title">[ 캠페인 명이 들어올 자리 ]</div>
			<div class="cmp_title_wrap"></div>
			<div class="select_btn_area">
				<!-- 드랍다운을 묶을 영역div -->
				<div class="year_left_wrap"></div>
				<div class="select_area">
					<select class="year_select">
						<!-- 년도 선택 셀렉트-->
						<option>2019</option>
						<option>2018</option>
						<option>2017</option>
						<option>2016</option>
					</select> <select class="month_select">
						<!-- 년도 선택 셀렉트-->
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
						<option>7</option>
						<option>8</option>
						<option>9</option>
						<option>10</option>
						<option>11</option>
						<option>12</option>
					</select>
				</div>
				<div class="chart_btn_area">
					<!-- 차트 구분보기 버튼을 넣을 영역div -->
					<div class="first_btn_area">
						<div class="first_year_btn">연별</div>

						<div class="first_month_btn">월별</div>
						<div class="first_day_btn">일별</div>
						<!-- <input type="button" value="연별" class="yearBtn" />
					<input type="button" value="월별" class="yearBtn" />
					<input type="button" value="열별" class="yearBtn" /> -->
					</div>
					<div class="first_vertical_btn_space"></div>
					<div class="second_btn_area">
						<div class="second_economy_btn">수익</div>
						<div class="second_guest_btn">방문자수</div>
						<div class="second_visit_btn">참여자수</div>
					</div>
					<div class="third_btn_area">
						<!-- <div class="visit_list_btn">참여고객 명단</div> -->
					</div>
				</div>
			</div>
			<div class="graph_area">
				<!-- 그래프가 들어올 영역  -->
				<div class="graph"></div>
			</div>
			<div class="bottom_title_wrap">
					<div class="bottom_title">피드백 목록</div>
			</div>
			<!-- <div class="analyze_list_txt">
			성과분석 목록
		</div>	 -->
			<table>
				<tr class="table_head">
					<td class="table_num">번호</td>
					<td class="table_name">작성자</td>
					<td class="table_content">내용</td>
					<td class="table_visit_date">작성일</td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
				<tr class="table_row">
					<td><input class="num_txt" type="text" readonly="readonly" /></td>
					<td><input class="name_txt" type="text" readonly="readonly" /></td>
					<td><input class="content_txt" type="text" readonly="readonly" /></td>
					<td><input class="visit_date_txt" type="text"
						readonly="readonly" /></td>
				</tr>
			</table>


			<!-- 성과분석 입력창과 버튼들이 들어올겁니다. 크기아직 안줘서 안보일듯 -->
			<div class="feedback_content_bottom">
				<span class="content_bottom_1_span">
				<input type="button" class="bottom_btn_1" value="<< " />
				<input type="button" class="bottom_btn_1" value="< " />
				<input type="button" class="bottom_btn_2" value="1" />
				<input type="button" class="bottom_btn_2" value="2" />
				<input type="button" class="bottom_btn_2" value="3" />
				<input type="button" class="bottom_btn_2" value="4" />
				<input type="button" class="bottom_btn_1" value=">" />
				<input type="button" class="bottom_btn_1" value=">>" />
				</span>
			</div>
			<div class="analyze_write_area">
				<div class="review_wrap">
					<div class="review_area">
						<div class="review_text">피드백</div>
						<textarea class="review_bar"></textarea>
						<div class="review_btn_area">
							<div class="review_btn">등록</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:import url="/bottom"></c:import>
</body>
</html>