package toyproject.noticeboard.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toyproject.noticeboard.domain.User;
import toyproject.noticeboard.repository.postsRepository.user.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    /*
        join
        findById
        modify
        withdraw
     */

    private final UserRepository repository;

    public void join(User user) {
        repository.create(user);
    }

    public User findById(String userId) {
        return repository.read(userId);
    }

    public void Modify(User user) {
        /*
            사용자 인증을 해야할까?
         */
        repository.update(user);
    }

    public void withdraw(User user) {
        repository.delete(user.getUserId());
    }
}
