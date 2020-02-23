# MangoCRM 
수강생분들과 개발한 대규모 CRM 프로젝트입니다.
CRM의 기초적인 요소, 기능을 갖춰져 있습니다.(미완성)

# Project Info
## Project Info
- 프로젝트 명 : Mango CRM
- 개발 기간 : 2019.08.12 ~ 2020.02.07
- 참여 인원 : 18명
- 담당 업무 : DB설계, 화면구현, 기능, 개발
## Use Technology
- 개발 환경 : Windows 10
- 사용 도구 : Eclipse Kepler Release, OracleDeveloper
- 사용 기술 : Java, oracle, jQuery, JSON, Ajax, HTML, CSS, JSP, XML

## Contributors
[내부 2팀]
- 이성준(sujl950620)(팀장) : 고객 등록/편집/상세보기/목록 페이지
- 송혜호 : 사원 등록/편집/상세보기/목록 페이지, 고객사 등록/편집/상세보기/목록 페이지 개발, 공용 디자인 템플릿 개발
- 김현 : 일정 등록/편집/상세보기 페이지
- 김태호 : 리드 목록(테이블보기)/등록/편집 페이지
- 박희재 : 리드 목록(간판보기)/상세보기 페이지
- 서원빈 : 고객/고객사 등급관리 페이지(차트)
- 김우용 : 일정 달력/목록 페이지

- 이외 많은 여러분이 참가해주셨습니다.

# Preview 
![고객목록](https://user-images.githubusercontent.com/58777597/75110448-93409d80-5671-11ea-8d25-d908ecd3a942.PNG)
![S-고객등록](https://user-images.githubusercontent.com/58777597/75110456-b66b4d00-5671-11ea-8d8b-7e180465abce.PNG)
![S-고객상세](https://user-images.githubusercontent.com/58777597/75110459-b8cda700-5671-11ea-81d1-f48e05cd6d66.PNG)
![S-고객상세1](https://user-images.githubusercontent.com/58777597/75110460-b9fed400-5671-11ea-809f-491c0dc0ebb6.PNG)
![S-고객등록](https://user-images.githubusercontent.com/58777597/75110462-bd925b00-5671-11ea-8473-f63bde743ebf.PNG)

- 구현화면
## Plan
![기획1](https://user-images.githubusercontent.com/58777597/75105943-967d5e80-565c-11ea-8a00-8c47fe7cabe2.png)
![기획2](https://user-images.githubusercontent.com/58777597/75105945-99784f00-565c-11ea-8127-5b184c0d804a.png)
- Ovenapp.io를 사용하여 디자인 기획을 진행 하였습니다
![기능정의서](https://user-images.githubusercontent.com/58777597/75110687-840f1f00-5674-11ea-976d-6c3c6d481c90.png)
- 기능정의서 작성
![메타데이터](https://user-images.githubusercontent.com/58777597/75110718-f67fff00-5674-11ea-9a3c-883d5a2a70cd.PNG)
- 기능정의서를 기반으로 나온 명사들의 명을 정의
- 회의를 통하여 팀원간 중복된 메타명 조정
## DB Design 
![스키마](https://user-images.githubusercontent.com/58777597/75110667-3abecf80-5674-11ea-9b67-5f6c679d898a.PNG)
![스키마1](https://user-images.githubusercontent.com/58777597/75110668-3c889300-5674-11ea-9e22-8a8dc88d633e.PNG)
- Oracle을 사용하여 DB설계를 하였습니다

# DB 설계
## [메타관리]
- 메타데이터를 관리하여 개발에 있어 공통 사전 활용

## [모듈화]
- 모듈화된 DB설계를 통하여 확장성 확보
- 공통 코드 사용을 통하여 데이터 사이즈 축소

## [모델링]
- drawio를 사용하여 DB모델링


## Table Definition
![테이블 정의서](https://user-images.githubusercontent.com/58777597/75110682-7063b880-5674-11ea-8442-4d9e46c540f5.png)
- 모델링 데이터를 기준으로 테이블 정의서 작성

## DB ERD
![MangoCRM논리ERD](https://user-images.githubusercontent.com/58777597/75110606-7907bf00-5673-11ea-9864-f25680a8661b.png)
- Drawio를 이용하여 ERD설계를 하였습니다




## Framework Design
[Spring 3.9]
- Annotation Driven을 통한 컨트롤러 호출
- Resource Mappting을 통한 리소스 폴더 관리

[MyBatis]
- MyBatis와 Oracle 연동 구현
- Connection Pool 셋팅을 통한 DB 연결 최적화

[MAVEN]
자바 프로젝트의 빌드(build)를 자동화 해주는 빌드 툴(build tool)이다.
즉, 자바 소스를 compile하고 package해서 deploy하는 일을 자동화 해주는 것이다.

## Devlop
[SVN을 통한 공동작업]
- SVN을 활용하여 팀 작업을 진행
- 파트별 개발을 통한 개발일정 단축



## Development Tools
- eclipse
- sqldeveloper

## Using Language
- Java
- HTML, CSS3, JavaScript, jQuery

## Development Environment
- JDK 1.8.0
- Spring Framework 3.9.10
- maven-eclipse-plugin 2.9
- Mybatis 3.2.7
- Log4j 1.2.15
- Servlet 3.0.1
- DB : Oracle 12.1.0.2.0
- Server : Tomcat 8.5
- jQuery 1.12.4

## DevOps
- SVN
