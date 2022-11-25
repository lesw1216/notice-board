package toyproject.noticeboard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private String name;
    private String password;
    private String userId;
    private Long id;
    private Date birthday;
    private String sex;
}
