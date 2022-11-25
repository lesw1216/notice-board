package toyproject.noticeboard.repository.postsRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import toyproject.noticeboard.domain.Posts;

import java.util.HashMap;

@Slf4j
@Repository
public class MemoryPostsRepository implements PostsRepository {

    private static final HashMap<Long, Posts> store = new HashMap<>();

    @Override

    public void create(Posts posts) {
        store.put(posts.getId(), posts);
        log.info("저장 성공");
    }

    @Override
    public Posts read(Long id) {
        log.info("{} 번 게시물 불러오기", id);
        return store.get(id);
    }

    @Override
    public void drop(Long id) {
        store.remove(id);
        log.info("{} 게시물 삭제", id);
    }

    @Override
    public Posts update(Posts posts) {
        log.info("{} 게시물 수정", posts.getId());
        return store.put(posts.getId(), posts);
    }
}
