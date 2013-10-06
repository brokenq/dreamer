package com.dreamer.edu.util;

import java.util.UUID;

/**
 * 工具类
 * @since 2013-10-5 下午4:24:56
 * @author broken_xie
 */
public class Utils {
    
    /**
     * 获取主键
     * @return
     * @author broken_xie
     */
    public static String getPrimaryKey() {
        return UUID.randomUUID().toString();
    }
}
