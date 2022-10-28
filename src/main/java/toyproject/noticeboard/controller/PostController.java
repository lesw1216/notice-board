package toyproject.noticeboard.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.users.SparseUserDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class PostController {



    /*
        작성한 게시글을 저장요청 하는 메서드
        URL 패턴 : /posters
        요청 : POST
     */
    @PostMapping("/posters")
    public String createPost() {
        int id = 10;
        log.info("임시 id 생성 {}", id);
        // 게시글 작성완료하고, 작성한 게시물 화면으로 갈지, 목록화면으로 갈지 결정필요.
        return "redirect:/posters/" + id;
    }

    /*
        게시글 작성 페이지로 이동
        URL 패턴 "/posters"
        요청 : GET
     */
    @GetMapping("/posters")
    public String createPostForm() {

        return "postPages/createPostPage";
    }

    /*
        전체 게시물 페이지로 이동
        URL 패턴 "/posters/list"
        요청 : GET
     */
    @GetMapping("/posters/lists")
    public String listPost() {

        return "/postPages/listPosterPage";
    }


    /*
     * 선택한 게시물 페이지 이동
     * URL 패턴 "/posters/{id}", PathVariable 통해 게시글의 고유 id로 게시글 불러오기
     * 요청 : GET
     */
    @GetMapping("/posters/{id}")
    public String readPost(@PathVariable int id) {
        log.info("받은 id = {}", id);
        /*
            URL id 받아서, 해당 DB id에 맞는 게시글 가져온다?
            전체 리스트 목록에서 화면에는 보여주지 않지만 ID 까지 끌어 오면 될까?
            수정페이지, 읽기 페이지로 이동할 지 결정.
            그러면 수정페이지 이동 요청시 딸려오는 데이터가 필요?
         */
        return "/postPages/readPostPage";
    }

    /*
     * 선택한 게시물 페이지 수정
     * URL 패턴 "/posters/{id}", PathVariable 통해 게시글의 고유 id로 게시글 수정
     * 요청 : PUT
     */
    @PutMapping("/posters/{id}")
    public String updatePost(@PathVariable int id) {

        return "redirect:/posters/{id}";
    }

    /*
     * 선택한 게시물 페이지 삭제
     * URL 패턴 "/posters/{id}", PathVariable 통해 게시글의 고유 id로 게시글 삭제
     * 요청 : DELETE
     */
    @DeleteMapping("/posters/{id}")
    public String deletePost(@PathVariable int id) {

        // 삭제를 성공하면 전체 게시물 목록 페이지로 이동?
        // 삭제 실패하면? 어카지? 모달창을 띄어 줘야 할까?
        return "redirect:/posters/lists";
    }
}
