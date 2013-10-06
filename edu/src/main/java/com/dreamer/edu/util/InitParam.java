package com.dreamer.edu.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @since 2013-10-5 下午5:13:37
 * @author broken_xie
 */
public class InitParam {
    
    /** 初始化文件路径 */
    private static final String PATH = "classpath:conf/*.properties";
    
    /** 初始化参数集合 */
    private static final Map<String, String> PARAMS = new HashMap<String, String>();
    
    /**
     * 根据参数获取参数值
     * @param param 参数
     * @return
     * @author broken_xie
     */
    public static String getValue(String param) {
        return PARAMS.get(param);
    }
    
    /**
     * 程序启动，装载配置文件
     * @author broken_xie
     */
    static {
        try {
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = resolver.getResources(PATH);
            for (Resource resource : resources) {
                Properties properties = new Properties();
                properties.load(resource.getInputStream());
                for (Object key : properties.keySet()) {
                    PARAMS.put(key.toString(), properties.getProperty(key.toString()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
