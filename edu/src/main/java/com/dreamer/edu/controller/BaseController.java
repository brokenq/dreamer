package com.dreamer.edu.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 控制器基类
 * @since 2013-10-5 下午4:44:37
 * @author broken_xie
 */
public class BaseController {
    
    /** 日志 */
    protected Logger logger = Logger.getLogger(this.getClass());
    
    /**
     * 返回main目录下的jsp页面
     * @return
     * @author broken_xie
     */
    protected String mainPage() {
        return "main/" + requestPage();
    }
    
    /**
     * 返回web目录下的jsp页面
     * @return
     * @author broken_xie
     */
    protected String webPage() {
        return "web/" + requestPage();
    }
    
    /**
     * 请求jsp页面
     * @return
     * @author broken_xie
     */
    protected String requestPage() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request.getRequestURI().substring(request.getContextPath().length() + 1);
    }
}
