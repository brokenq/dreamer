package com.dreamer.edu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具
 * @since 2013-9-29 下午1:32:36
 * @author broken_xie
 */
public class Encryption {
    
    /**
     * MD5加密【32位】
     * @param content 需要加密的内容
     * @return
     * @author broken_xie
     * @throws NoSuchAlgorithmException
     */
    public static String MD5(String content) {
        MessageDigest md;
        StringBuilder sb = new StringBuilder();
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(content.getBytes());
            int n;
            for (int i = 0; i < digest.length; i++) {
                n = digest[i];
                if (n < 0) n += 256;
                if (n < 16) sb.append("0");
                sb.append(Integer.toHexString(n));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    /**
     * MD5加密【16位】
     * @param content 需要加密的内容
     * @return
     * @author broken_xie
     */
    public static String shortMD5(String content) {
        return MD5(content).substring(8, 24);
    }
    
}
