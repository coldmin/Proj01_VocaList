## ▶ 우리말 단어장 ◀

## -- Update 현황 --
### [v1.1.0]
### 개선 필요 사항
 - 저장한 단어 목록을 저장하고 불러올 수 있어야 한다.
 - 목록의 번호가 자동으로 생성되어야 한다.
### 기능 업데이트
 <b>① 데이터 파일로 저장 및 불러오기</b>
  - saveList() 메소드 추가. FileWriter 클래스 사용
  - loadList() 메소드 추가. BufferedReader, FileReader 클래스 사용

 <b>② 날짜 정보를 문자열로 다루도록 수정</b>
  - current_date 변수 타입을 Date에서 String 타입으로 변경하고, SimpleDateFormat 클래스를 사용해 문자열로 저장하도록 변경
  
 <b>③ 전체 목록 조회 시, 항목 번호가 자동으로 출력</b>
  - 항목 번호를 위한 count 변수를 선언하고, 마지막에 count++로 번호를 증가시킴

![image](https://user-images.githubusercontent.com/130851245/235314768-bddd8b0c-b6f1-4d73-9fe9-7067d157d34a.png)
![image](https://user-images.githubusercontent.com/130851245/235314725-0220897f-2e30-4c26-8dc8-48a0f760b439.png)



## 1. 개발 배경 및 목적
자바와 콘솔 입출력 기능만을 활용해 기초 프로젝트를 진행하고자 했다. 프로젝트 주제는 평소 신문, 책 등 글을 읽을 때 정확히 모르거나 헷갈리는 단어를 엑셀에 정리해 왔는데, 이것을 단어장 형태로 만들어보기 위해 <b>'우리말 단어장'</b>이라는 프로그램을 개발했다.

## 2. 명세
 - 단어장 관리 메뉴 소개
 - 메뉴의 명령어를 입력하여 원하는 기능 실행
 - 저장된 단어를 조회, 수정, 삭제, 정렬 기능 제공
 - 정렬은 가나다순, 날짜순으로 지정 가능
 
 ## 3. 주요 기능
 - add: 단어 추가
 - del: 단어 삭제
 - edit: 단어 수정
 - list: 전체 조회
 - list_name: 가나다순 정렬
 - list_date: 날짜순 정렬
 
 ## 4. 개발 기획
![image](https://user-images.githubusercontent.com/130851245/232711469-3fcf9e42-9b24-4e5c-a541-12fdab6fc468.png)

 ## 5. 실행 화면
  - 시작 화면
  
![image](https://user-images.githubusercontent.com/130851245/232724721-ec8054a2-d674-4d46-a267-7e75ad987934.png)

  - 단어 추가, 삭제, 수정: add, del, edit 명령어를 실행 시 동작 화면

![image](https://user-images.githubusercontent.com/130851245/232737816-a2549b6f-6c56-477f-ac7e-2eadabc167cd.png)

  - 단어 중복 검사 및 오류 메시지

![image](https://user-images.githubusercontent.com/130851245/232741839-ed44acf2-9569-445f-8def-d01e1f3ec804.png)

  - 저장된 단어 조회: 저장시간순(기본), 가나다순

![image](https://user-images.githubusercontent.com/130851245/232742197-72f8cdc7-b802-4808-9ffe-291b416d526b.png)
