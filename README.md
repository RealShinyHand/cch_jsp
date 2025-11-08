# cch_jsp
2025-10-24 프로젝트 세팅 완료</br>
<ul>
<li>https://main.tistory.com/249</li>
<li>https://velog.io/@byeongk/Spring-legacy-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%83%9D%EC%84%B1-%EB%B0%8F-%EC%84%B8%ED%8C%85</li>
</ul>
<br/>
위 블로그에서 설정
Maven Build 시 slf4j의 구현체가 중복된다고 경고가 계속 발생 ->STS(eclipse)와 Maven의 플러그인 한쪽 구현체 삭제 시 에러 발생
톰캣으로 서버 구동 시 에러 미 발생
Tomcat(WAS) / (root)로 접근 시 바로 cch web application으로 이동하도록 route 수정

<tb>아래 기능 구현 예정</tb><br/>
<img src="https://private-user-images.githubusercontent.com/57449358/505170221-f408b6a7-2f82-42fe-9670-243fd8242011.png?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NjEyOTU2MzYsIm5iZiI6MTc2MTI5NTMzNiwicGF0aCI6Ii81NzQ0OTM1OC81MDUxNzAyMjEtZjQwOGI2YTctMmY4Mi00MmZlLTk2NzAtMjQzZmQ4MjQyMDExLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTEwMjQlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUxMDI0VDA4NDIxNlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTZhM2M1MWMxMmJiZTdmNDAyZWNhNjE5NmVmNGYxNzQyYjAwZTNmMjY2NmUyZjBmN2JkYTJmN2UyY2MwYjBiYzAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.GSQS7nGDUDmVWRtT5jPJVhwuDVMNtfNyWLg1sIzNqmY">


대략적 erd(개념)<br/>

<img width="384" height="311" alt="image" src="https://github.com/user-attachments/assets/66809cb5-e9e5-48df-90d4-4a80ddd91c46" /><br/>


2025-11-01 ERD(논리적)
<img width="1751" height="612" alt="jsp_cch" src="https://github.com/user-attachments/assets/f354b741-cb97-4eb0-a87d-bc3b24f0fbbc" /><br/>
<ol>
  <li>메뉴의 자신 테이블과 참조는 작성자가 글 작성 시, 답글에 대한 관계를 나타낸다.</li>
  <li>비식별 관계에는 FK 제약 조건을 적용하지 않는다. Appplication 단에서 처리하도록 한다.</li>
</ol>

2025-11-04 (물리적)<br/>
(메뉴 image 누락되어 수정)
<code>
CREATE TABLE t_user (
    user_id NUMBER GENERATED ALWAYS AS IDENTITY,
    username NVARCHAR2(30) NOT null,
    password NVARCHAR2(100) NOT null,
    user_nickname NVARCHAR2(30) NOT null,
    grade CHAR(10) NOT null,
    created_at DATE NOT null,
    deleted_at DATE,
    is_delete CHAR(1) DEFAULT 'N',
    CONSTRAINT PK_T_USER PRIMARY KEY (user_id)
);


CREATE TABLE t_inquery_board (
    inquery_board_id NUMBER GENERATED ALWAYS AS IDENTITY ,
    title NVARCHAR2(100) NOT NULL,
    content NVARCHAR2(2000) NOT NULL,
    is_reply CHAR(1) DEFAULT 'N',
    updated_at DATE,
    created_at DATE NOT NULL,
    deleted_at DATE,
    is_delete CHAR(1) DEFAULT 'N',
    user_id NUMBER NOT NULL,
    inquery_board_parent_id NUMBER,
    CONSTRAINT PK_T_INQUERY_BOARD PRIMARY KEY(inquery_board_id)
);

CREATE INDEX idx_t_inquery_board_user_id
    ON t_inquery_board (user_id);


CREATE TABLE t_inquery_board_image (
    inquery_board_image_id NUMBER GENERATED ALWAYS AS IDENTITY,
    uri NVARCHAR2(1000) NOT NULL,
    created_at DATE NOT NULL,
    is_delete CHAR(1) DEFAULT 'N',
    inquery_board_id NUMBER,
    CONSTRAINT PK_T_INQUERY_BOARD_IMAGE PRIMARY KEY (inquery_board_image_id)
    
);
CREATE INDEX idx_t_inquery_board_image_inquery_board_id
    ON t_inquery_board_image(inquery_board_id);

CREATE TABLE t_menu_category (
    menu_category_id NUMBER GENERATED ALWAYS AS IDENTITY,
    name NVARCHAR2(100) NOT null,
    ordering NUMBER,
    CONSTRAINT PK_T_MENU_CATEGORY PRIMARY KEY (menu_category_id)
);

CREATE TABLE t_menu (
    menu_id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    menu_category_id NUMBER NULL,
    name NVARCHAR2(100) NOT NULL,
    price NVARCHAR2(100) ,
    "desc" NVARCHAR2(500) ,
    ordering NUMBER ,
    created_at DATE,
    updated_at DATE,
    CONSTRAINT FK_T_MENU_TO_CATEGORY
        FOREIGN KEY (menu_category_id)
        REFERENCES t_menu_category (menu_category_id)
);
CREATE INDEX idx_t_menu_menu_category_id
    ON t_menu (menu_category_id);


CREATE TABLE t_menu_image (
    menu_image_id NUMBER GENERATED ALWAYS AS IDENTITY,
    uri NVARCHAR2(1000) NOT NULL,
    created_at DATE NOT NULL,
    is_delete CHAR(1) DEFAULT 'N',
    menu_id NUMBER,
    CONSTRAINT PK_T_MENU_IMAGE PRIMARY KEY (menu_image_id)
    
);

CREATE INDEX idx_t_menu_image_menu_id
    ON t_menu_image(menu_id);


</code>
<br/>
<h5>이전 ERD(논리적)과 많이 변했다.</h5>
<h5>기본키들은 GENERATED ALWAYS AS IDENTITY을 써서 Auto Increment로 설정</h5>
<h5>직접적인 FK는 T_Menu에만 존재</h5>
<h5>이외 Not NULL 설정과 Join을 위한 Index설정 등을 시행</h5>
