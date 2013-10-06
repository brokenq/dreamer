package com.dreamer.edu.bean.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 操作日志表实体类
 * @since 2013-10-5 下午3:13:09
 * @author broken_xie
 */
@Entity
@Table(name = "t_operate_log")
public class TOperateLog implements Serializable {
    
    /**  */
    private static final long serialVersionUID = -6001249129880729867L;
    
    /** 主键 */
    @Id
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    
    /** 操作ip地址 */
    @Column(nullable = false, length = 15)
    private String cip;
    
    /** 备注 */
    @Column(nullable = false, length = 255)
    private String cmemo;
    
    /** 操作类型 */
    @Column(length = 36)
    private String ctype;
    
    /** 操作url */
    @Column(nullable = false, length = 128)
    private String curl;
    
    /** 操作日期 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date doperate;
    
    /** 用户id */
    @Column(nullable = false, length = 36)
    private String uuserid;
    
    /**
     * 获取 主键
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }
    
    /**
     * 设置 主键
     * @param uuid 主键
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    /**
     * 获取 操作ip地址
     * @return cip
     */
    public String getCip() {
        return cip;
    }
    
    /**
     * 设置 操作ip地址
     * @param cip 操作ip地址
     */
    public void setCip(String cip) {
        this.cip = cip;
    }
    
    /**
     * 获取 备注
     * @return cmemo
     */
    public String getCmemo() {
        return cmemo;
    }
    
    /**
     * 设置 备注
     * @param cmemo 备注
     */
    public void setCmemo(String cmemo) {
        this.cmemo = cmemo;
    }
    
    /**
     * 获取 操作类型
     * @return ctype
     */
    public String getCtype() {
        return ctype;
    }
    
    /**
     * 设置 操作类型
     * @param ctype 操作类型
     */
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
    
    /**
     * 获取 操作url
     * @return curl
     */
    public String getCurl() {
        return curl;
    }
    
    /**
     * 设置 操作url
     * @param curl 操作url
     */
    public void setCurl(String curl) {
        this.curl = curl;
    }
    
    /**
     * 获取 操作日期
     * @return doperate
     */
    public Date getDoperate() {
        return doperate;
    }
    
    /**
     * 设置 操作日期
     * @param doperate 操作日期
     */
    public void setDoperate(Date doperate) {
        this.doperate = doperate;
    }
    
    /**
     * 获取 用户id
     * @return uuserid
     */
    public String getUuserid() {
        return uuserid;
    }
    
    /**
     * 设置 用户id
     * @param uuserid 用户id
     */
    public void setUuserid(String uuserid) {
        this.uuserid = uuserid;
    }
    
}
