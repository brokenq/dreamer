package com.dreamer.edu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    
    public String index(){
        return "index";
    }
}
