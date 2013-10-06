package com.dreamer.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转控制器
 * @since 2013-10-5 下午5:53:21
 * @author broken_xie
 */
@Controller
@RequestMapping("/page")
public class PageController extends BaseController {
    
    /**
     * 跳转到指定的页面
     * @param page 页面路径
     * @return
     * @author broken_xie
     */
    @RequestMapping("/{page}")
    public String pageOne(@PathVariable("page") String page) {
        return page;
    }
    
    /**
     * 跳转到指定的页面
     * @param dir 文件夹
     * @param page 页面路径
     * @return
     * @author broken_xie
     */
    @RequestMapping("/{dir}/{page}")
    public String pageTwo(@PathVariable("dir") String dir, @PathVariable("page") String page) {
        return dir + "/" + page;
    }
    
    /**
     * 跳转到指定的页面
     * @param dir1 文件夹
     * @param dir2 文件夹
     * @param page 页面路径
     * @return
     * @author broken_xie
     */
    @RequestMapping("/{dir1}/{dir2}/{page}")
    public String pageThree(@PathVariable("dir1") String dir1, @PathVariable("dir2") String dir2, @PathVariable("page") String page) {
        return dir1 + "/" + dir2 + "/" + page;
    }
}
