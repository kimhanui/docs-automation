# API 문서 자동화
Spring REST Docs 로 문서 자동화  
생성된 문서 미리보기: [get-member.html](https://htmlpreview.github.io/?https://github.com/kimhanui/docs-automation/blob/main/result-docs/get-member.html)

> 프로젝트 스펙: spring boot 3.2.5 , maven 3.9.6 ([셋팅 가이드 참고](https://berrrrr.github.io/programming/2021/01/24/how-to-use-spring-rest-docs/))

## How to run
1,3번은 작성 완료. **2,4번만 실행**
1) 테스트 코드로 API 요청/응답 예시 작성 (코드: [MemberControllerTest.java](src%2Ftest%2Fjava%2Forg%2Fexample%2FMemberControllerTest.java)[](src/main/test/org/example/member/MemberControllerTest.class))  

2) 테스트 코드 실행
   > `output-directory` 하위에 .adoc 확장자인 스니펫들 생성. (ex: target/generated-snippets/get-member/curl-request.adoc)

3) adoc 문서 작성 (문서: [get-member.adoc](src%2Fasciidoc%2Fget-member.adoc))
   > 생성된 스니펫을 기반으로 api 문서가 되는 asciidoc 문서를 작성.
   
4) `mvn install`
   > maven의 경우, src/main/asciidoc/*.adoc 에 adoc(asciidoc)을 작성하면 maven install시 target/generated-docs/*.html 에 html 파일이 생성된다. (ex: target/generated-docs/api-doc.html)

## Feedback
- adoc 문법의 장점: 각 API 문서를 include해서 재활용가능
- 문서 가시성: 요청/응답 데이터 구조, 예시 가시성 좋음
- 하지만, 요청/응답 데이터 구조가 복잡해서 2D table로 표현이 어려운 등의 needs는 개발자가 커스터마이징 필요