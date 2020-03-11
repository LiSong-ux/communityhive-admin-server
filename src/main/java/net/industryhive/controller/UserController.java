package net.industryhive.controller;

import net.industryhive.bean.Login;
import net.industryhive.bean.User;
import net.industryhive.entity.UnifiedResult;
import net.industryhive.service.LoginService;
import net.industryhive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户管理Controller
 *
 * @author 未央
 * @create 2019-12-23 15:52
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public UnifiedResult login(HttpServletRequest request) {
        HttpSession session = request.getSession();

        //先判断用户是否已经登录
        if (session.getAttribute("admin") != null) {
            return UnifiedResult.build(400, "您已登录", null);
        }

        String account = request.getParameter("account");
        if (!account.equals("LiSong-test")) {
            return UnifiedResult.build(400, "账号或密码错误", null);
        }

        String password = request.getParameter("password");

        User admin = userService.getUserByAccount("LiSong-test");
        if (admin == null || !admin.getPassword().equals(password)) {
            return UnifiedResult.build(400, "账号或密码错误", null);
        }

        session.setAttribute("admin", admin);

        // 用户登录次数+1
        admin.setLoginCount(admin.getLoginCount() + 1);
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

    @RequestMapping("/logout")
    public UnifiedResult logout(HttpSession session) {
        session.removeAttribute("admin");
        return UnifiedResult.ok();
    }

    @RequestMapping("/allUser")
    public UnifiedResult getAllUser(Integer page) {
        if (page == null) {
            page = 1;
        }
        List<User> userList = userService.getAllUser(page);
        long userCount = userService.getUserCount();
        Map<String, Object> map = new HashMap<>();
        map.put("userList", userList);
        map.put("userCount", userCount);
        return UnifiedResult.ok(map);
    }

    @RequestMapping("/lockUser")
    public UnifiedResult lockUser(HttpSession session, Integer id, Integer locked) {
        if (id == null || locked == null || (locked != 0 && locked != 1)) {
            return UnifiedResult.build(400, "参数错误", null);
        }
        User user = (User) session.getAttribute("admin");
        if ((id == 1 && user.getId() != 1) || (id == user.getId() && user.getId() != 1)) {
            return UnifiedResult.build(400, "权限不足", null);
        }
        UnifiedResult result = userService.lockUser(id, locked);
        return result;
    }

}
