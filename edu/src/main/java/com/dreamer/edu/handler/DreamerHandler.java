package com.dreamer.edu.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 权限拦截器
 * @since 2013-10-5 下午3:36:05
 * @author broken_xie
 */
public class DreamerHandler extends HandlerInterceptorAdapter {
    
    /** url拦截正则表达式 */
    private static final String URL_PATTERN = "/((?!index)|main/(?!login)).+";
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if (request.getRequestURI().matches(URL_PATTERN)) {
//            response.sendRedirect("http://localhost/");
//            return false;
//        }
        return super.preHandle(request, response, handler);
    }
}
