package com.dreamer.edu.exception;

/**
 * 异常处理类
 * @since 2013-10-5 下午3:32:07
 * @author broken_xie
 */
public class DreamerException extends RuntimeException {
    
    /**  */
    private static final long serialVersionUID = -2143531363017964021L;
    
    /** 错误信息 */
    private String error;
    
    /**
     * @author broken_xie
     */
    public DreamerException() {}
    
    /**
     * @param error 错误信息
     * @author broken_xie
     */
    public DreamerException(String error) {
        this.error = error;
    }
    
    /**
     * 获取 错误信息
     * @return error
     */
    public String getError() {
        return error;
    }
    
    /**
     * 设置 错误信息
     * @param error 错误信息
     */
    public void setError(String error) {
        this.error = error;
    }
    
}
