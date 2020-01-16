package net.industryhive.interceptor;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import net.industryhive.bean.User;
import net.industryhive.entity.UnifiedResult;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * 登录校验拦截器
 *
 * @author 未央
 * @create 2020-01-16 9:10
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        HttpSession session = request.getSession();
        User admin = (User) session.getAttribute("admin");
        if (admin == null) {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json;charset=utf-8");
            PrintWriter writer = response.getWriter();
            JSONObject result = JSONUtil.parseObj(UnifiedResult.build(400, "您还未登录，请登录", null));
            writer.write(result.toString());
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
