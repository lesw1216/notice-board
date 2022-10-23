package toyproject.noticeboard.controller;

import org.apache.catalina.users.SparseUserDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    /**
     * @return 특정 게시글 보여주는 페이지 URL 반환
     */
    @GetMapping("/posters/{id}")
    public String readPost(@PathVariable int id) {
        /*
            URL에 id 받아서, DB에서 해당 id에 맞는 게시글 가져온다?
            전체 리스트 목록에서 화면에는 보여주지 않지만 ID 까지 끌어 오면 될까?
         */
        return "/postPages/readPostPages/{id}";
    }

    @PostMapping("/posters")
    public String createPost() {
        return "/postPages/createPostPage";
    }

    @PutMapping("/posters/{id}")
    public String updatePost(@PathVariable int id) {

        return "/postPages/updatePostPage";
    }

    @DeleteMapping("/posters/{id}")
    public String deletePost(@PathVariable int id) {

        // 삭제를 성공하면 전체 게시물 목록 페이지로 이동?
        // 삭제 실패하면? 어카지? 모달창을 띄어 줘야 할까?
        return "/postPages/postListPage";
    }
}
