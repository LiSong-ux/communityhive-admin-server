package net.industryhive.controller;

import net.industryhive.bean.Login;
import net.industryhive.bean.User;
import net.industryhive.entity.UnifiedResult;
import net.industryhive.service.LoginService;
import net.industryhive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * 用户管理Controller
 *
 * @author 未央
 * @create 2019-12-23 15:52
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public UnifiedResult login(HttpServletRequest request) {
        HttpSession session = request.getSession();

        //先判断用户是否已经登录
        if (session.getAttribute("admin") != null) {
            return UnifiedResult.build(400, "您已登录", null);
        }

        String account = request.getParameter("account");
        if (account != "LiSong-ux") {
            return UnifiedResult.build(400, "账号或密码错误", null);
        }

        String password = request.getParameter("password");

        User admin = userService.getUserByAccount("LiSong-ux");
        if (admin == null || !admin.getPassword().equals(password)) {
            return UnifiedResult.build(400, "账号或密码错误", null);
        }

        session.setAttribute("admin", admin);

        // 用户登录次数+1
        admin.setLogincount(admin.getLogincount() + 1);
        userService.updateUser(admin);

        //记录用户登录ip、时间
        Login newLogin = new Login();
        newLogin.setIp(request.getRemoteAddr());
        newLogin.setUserId(admin.getId());
        newLogin.setTime(new Date());
        //记录用户登录终端
        String terminal = request.getParameter("terminal");
        newLogin.setTerminal(terminal);
        newLogin.setSystem(1);

        loginService.addLogin(newLogin);

        return UnifiedResult.ok(admin);
    }

    @RequestMapping("/allUser")
    @ResponseBody
    public UnifiedResult getAllUser(HttpServletRequest request, Integer page) {
//        User admin = (User) request.getSession().getAttribute("admin");
//        if (admin == null) {
//            return UnifiedResult.build(400, "您还未登录，请先登录", null);
//        }
        if (page == null) {
            page = 1;
        }
        List<User> userList = userService.getAllUser(page);
        return UnifiedResult.ok(userList);
    }

}
