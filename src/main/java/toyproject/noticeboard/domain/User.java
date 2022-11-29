package toyproject.noticeboard.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private String name;
    private String password;
    private String userId;
    private LocalDate birthday;
    private String sex;

    public User() {
    }

    @Override
    public String toString() {
        return "[" + name + "]" + "[" + password + "]" + "[" + userId + "]" + "[" + birthday + "]" + "[" + sex + "]";
    }
}
