package toyproject.noticeboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import toyproject.noticeboard.domain.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UsersController {
    // 로그인페이지 이동
    @GetMapping("/login")
    public String loginForm() {
        return "users/loginForm";
    }

    // 회원 가입 페이지로 이동. 어차피 사용자 조회는 사용자 id별로 /uers/{id} 형태로 할 것.
    @GetMapping("/users")
    public String joinForm(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "users/joinForm";
    }

    // 회원 가입 실제 로직, 회원을 등록
    @PostMapping("/users")
    public String join(@ModelAttribute User user) {
        System.out.println(user);
        // 완료 후 로그인 페이지로 리다이렉트
        return "redirect:/login";
    }
}
