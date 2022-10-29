package toyproject.noticeboard.repository.postsRepository;

import toyproject.noticeboard.domain.Posts;

public interface PostsRepository {

    // 저장
    void create(Posts posts);

    // 게시글 id로 조회
    Posts read(Long id);

    // 게시글 id로 삭제
    void drop(Long id);

    // 게시글 수정
    Posts update(Posts posts);
}
