package toyproject.noticeboard.repository.postsRepository.user;

import toyproject.noticeboard.domain.User;

/*
* 생성, 조회, 수정, 삭제
* */
public interface UserRepository {
    void create(User user);

    User read(String userId);

    void update(User user);

    void delete(String userId);
}
