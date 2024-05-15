# API 문서 자동화

## How to run
API 문서 생성하기
1) 테스트 코드 실행 (Spring REST Docs로 .adoc 문서 생성)
2) `mvn install` (ascii docter로 .adoc -> .html 변환)

## How to work
1) 테스트 코드로 API 요청/응답 예시 작성 (예시: [MemberControllerTest.java](src%2Ftest%2Fjava%2Forg%2Fexample%2FMemberControllerTest.java)[](src/main/test/org/example/member/MemberControllerTest.class) )
2) 