package com.dreamer.edu.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.dreamer.edu.base.test.BaseTest;

/**
 * 常用测试
 * @since 2013-10-5 下午5:23:53
 * @author broken_xie
 */
public class CommonTest extends BaseTest {
    
    @Test
    public void test() {
        try {
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = resolver.getResources("classpath:conf/init.properties");
            for (int i = 0; i < resources.length; i++) {
                Resource resource = resources[resources.length-i-1];
                Properties properties = new Properties();
                properties.load(resource.getInputStream());
                for (Object key : properties.keySet()) {
                    System.out.println(key.toString());
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
