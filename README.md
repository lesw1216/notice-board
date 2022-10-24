# notice-board

----

## 2022-10-25
* ```HomeController, index.html```등 사용하지 않는 리소스 삭제
* URI 재설정
  * ```/``` : 게시글 전체 목록 보여주는 페이지로 이동
  * ```GET /posters``` : 게시글 작성 페이지로 이동
  * ```POST /posters``` : 작성한 내용 Controller로 요청
  * ```PUT /posters/{id} : ``` : 게시글의 고유 id 번호를 통해 해당 게시글 수정 페이지 요청
  * ```Delete /posters/{id}``` : 고유 id를 통해 게시글 삭제
  * ```GET /posters/{id}``` : 고유 id를 통해 게시글 읽기

* 정리 필요한 것들
  * ```PostController```에서 정의한 요청 메서드들 velog에 정리
  * 스프링에서 resource 자원 경로 설정 정리 -> tailwind가 안되서 부트스트랩으로 바꾼건데, 스프링 MVC 설정을 애초에 잘못한듯;
  * ```thymeleaf``` 사용한거 정리하기

* 다음에
  * 전체 목록 화면에서 아래 페이지 이동 버튼 활성화 처리 필요
  * DB 저장?
  * 회원이 먼저 필요?, 회원별로 게시글을 모아 놓아야 한다.
  * 그러면 로그인페이지 구성? => JWT? UsernamePassword? 해본건 UsernamePassword,
  * DB도 필수적으로 필요.