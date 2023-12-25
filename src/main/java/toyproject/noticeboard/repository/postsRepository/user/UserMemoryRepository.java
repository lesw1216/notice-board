package toyproject.noticeboard.repository.postsRepository.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import toyproject.noticeboard.domain.User;

import java.util.HashMap;

@Slf4j
@Repository
public class UserMemoryRepository implements UserRepository{

    private final HashMap<String, User> userStore = new HashMap<>();

    @Override
    public void create(User user) {
        String createMemberId = user.getUserId();
        userStore.put(createMemberId, user);
        User saveUser = userStore.get(user.getUserId());

        log.info("새로 생성된 유저={}", saveUser);
    }

    @Override
    public User read(String userId) {
        return userStore.get(userId);
    }

    @Override
    public void update(User user) {
        String updateUserId = user.getUserId();
        userStore.put(updateUserId, user);
        User updateUser = this.read(user.getUserId());
        log.info("수정된 유저={}", updateUser);
    }

    @Override
    public void delete(String userId) {
        User removeUser = userStore.remove(userId);
        log.info("삭제된 유저={}", removeUser);
    }
}
