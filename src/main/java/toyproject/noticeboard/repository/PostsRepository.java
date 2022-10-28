package toyproject.noticeboard.repository;

import toyproject.noticeboard.domain.Posts;

public interface PostsRepository {

    // 저장
    void save(Posts posts);

    // 게시글 id로 조회
    Posts findById(Long id);

    // 게시글 id로 삭제
    void delete(Long id);

    // 게시글 수정
    Posts updateById(Posts posts);
}
