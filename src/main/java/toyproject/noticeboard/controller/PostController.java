package toyproject.noticeboard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class PostController {



    /*
        URL 패턴 : /posts
        요청 : POST
        POST 방식의 /posts 요청이 들어오면 form 형식을 입력한 게시글을 저장
     */
    @PostMapping("/posts")
    public String createPost() {
        int id = 10;
        log.info("임시 id 생성 {}", id);

        // 게시글 작성완료하고, 작성 완료한 게시물 읽기 페이지로 이동, id로 작성게시글 접근 가능.
        return "redirect:/posts/" + id;
    }

    /*
        URL 패턴 "/posts"
        요청 : GET
        GET 방식의 /posts 요청이 들어오면 게시글 작성 페이지로 이동
     */
    @GetMapping("/posts")
    public String createPostForm() {

        return "postPages/createPostsPage";
    }

    /*
        URL 패턴 "/posts/list"
        요청 : GET
        GET 방식의 /posts/lists 요청이 들어오면 전체 게시물 페이지로 이동
     */
    @GetMapping("/posts/lists")
    public String listPost() {

        return "postPages/listPostsPage";
    }


    /*
     * URL 패턴 "/posts/{id}", PathVariable 통해 게시글의 고유 id로 게시글 불러오기
     * 요청 : GET
     * GET /posts/{id} 요청이 들어오면 해당 id를 가지고 있는 게시물 모델에 담아서 읽기 페이지로 이동
     */
    @GetMapping("/posts/{id}")
    public String readPost(@PathVariable int id) {
        log.info("받은 id = {}", id);
        /*
            URL id 받아서, 해당 DB id에 맞는 게시글 가져온다?
            전체 리스트 목록에서 화면에는 보여주지 않지만 ID 까지 끌어 오면 될까?
            수정페이지, 읽기 페이지로 이동할 지 결정.
            그러면 수정페이지 이동 요청시 딸려오는 데이터가 필요?
         */
        return "postPages/readPostsPage";
    }

    /*
     * 선택한 게시물 페이지 수정
     * URL 패턴 "/posts/{id}", PathVariable 통해 게시글의 고유 id로 게시글 수정
     * 요청 : PUT
     * PUT /posts/{id} 요청이 들어오면 게시글 수정후 redirect GET /posts/{id} 요청
     */
    @PutMapping("/posts/{id}")
    public String updatePost(@PathVariable int id) {

        return "redirect:/posts/" + id;
    }

    /*
     * URL 패턴 "/posts/{id}", PathVariable 통해 게시글의 고유 id로 게시글 삭제
     * 요청 : DELETE
     * DELETE /posts/{id} 요청이 들어오면 게시글 삭제 후 redirect GET /posts/{id} 요청
     */
    @DeleteMapping("/posts/{id}")
    public String deletePost(@PathVariable int id) {

        // 삭제를 성공하면 전체 게시물 목록 페이지로 이동?
        // 삭제 실패하면? 어카지? 모달창을 띄어 줘야 할까?
        return "redirect:/posts/lists";
    }
}
