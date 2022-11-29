package toyproject.noticeboard.repository.postsRepository.user;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import toyproject.noticeboard.domain.User;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class UserRepositoryTest {

    UserRepository repository = new UserMemoryRepository();

    @Test
    void create() {
        repository.create(new User("김나영", "상우사랑해", "kim", LocalDate.of(1995, 8, 4), "여성"));
    }

    @Test
    void read() {
        create();
        User findUser = repository.read("kim");
        log.info("찾은 유저={}", findUser);
    }

    @Test
    void update() {
        
    }

    @Test
    void delete() {
    }
}