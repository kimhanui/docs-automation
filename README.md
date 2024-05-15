# API 문서 자동화
Spring REST Docs 로 문서 자동화  
생성된 문서 미리보기: [get-member.html](https://htmlpreview.github.io/?https://github.com/kimhanui/docs-automation/blob/main/result-docs/get-member.html)

> 프로젝트 스펙: spring boot 3.2.5 , maven 3.9.6 ([셋팅 가이드 참고](https://berrrrr.github.io/programming/2021/01/24/how-to-use-spring-rest-docs/))

## How to run
API 문서 생성하기
1) 테스트 코드 실행 
2) `mvn install`




## How to work
1) 테스트 코드로 API 요청/응답 예시 작성 (코드: [MemberControllerTest.java](src%2Ftest%2Fjava%2Forg%2Fexample%2FMemberControllerTest.java)[](src/main/test/org/example/member/MemberControllerTest.class))
2) 테스트 코드 실행 시 문서가 .adoc 확장자로 생성됨 (경로: src/asciidoc 하위)
3) `mvn install`시 ascii-doctor에 의해 문서가 .adoc -> .html 변환됨. (경로: target/generated-docs 하위)

## Feedback
- adoc 문법의 장점: 각 API 문서를 include해서 재활용가능
- 문서 가시성: 요청/응답 데이터 구조, 예시 가시성 좋음
- 하지만, 요청/응답 데이터 구조가 복잡해서 2D table로 표현이 어려운 등의 needs는 개발자가 커스터마이징 필요