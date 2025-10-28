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


대략적 erd(개념)
<img width="384" height="311" alt="image" src="https://github.com/user-attachments/assets/66809cb5-e9e5-48df-90d4-4a80ddd91c46" />
