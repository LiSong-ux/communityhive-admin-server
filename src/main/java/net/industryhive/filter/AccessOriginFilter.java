package net.industryhive.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 未央
 * @create 2019-10-30 10:55
 */
public class AccessOriginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse rep = (HttpServletResponse) response;
        // 设置允许多个域名请求
        String[] allowDomains = {
                "http://localhost:8080"
        };
        Set allowOrigins = new HashSet(Arrays.asList(allowDomains));

        //获取发起当前请求的域名
//        String originHeads = req.getHeader("Origin");

        // 判断发起当前请求的域名 是否包含在允许访问当前服务的域名之内
//        if (allowOrigins.contains(originHeads)) {
//            //设置允许跨域的配置
//            // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
//            rep.setHeader("Access-Control-Allow-Origin", originHeads);
//            // 允许携带cookie跨域
//            rep.setHeader("Access-Control-Allow-Credentials", "true");
//            chain.doFilter(request, response);
//        }

        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP），允许所有ip访问
        rep.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
        // 允许携带cookie跨域
        rep.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {
    }
}
