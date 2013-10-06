package com.dreamer.edu.bean.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 用户权限表实体类
 * @since 2013-10-5 下午3:20:33
 * @author broken_xie
 */
@Entity
@Table(name = "t_user_authority")
public class TUserAuthority implements Serializable {
    
    /**  */
    private static final long serialVersionUID = -5001529866273657697L;
    
    /** 主键 */
    @Id
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    
    /** 用户表实体类 */
    @ManyToOne
    @JoinColumn(name = "uuserid", nullable = false)
    private TUser TUser;
    
    /** 权限组表实体类 */
    @OneToOne
    @JoinColumn(name = "uauthoritygroupid", nullable = false)
    private TAuthorityGroup TAuthorityGroup;
    
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
     * 获取 用户表实体类
     * @return tUser
     */
    public TUser getTUser() {
        return TUser;
    }
    
    /**
     * 设置 用户表实体类
     * @param tUser 用户表实体类
     */
    public void setTUser(TUser tUser) {
        TUser = tUser;
    }
    
    /**
     * 获取 权限组表实体类
     * @return tAuthorityGroup
     */
    public TAuthorityGroup getTAuthorityGroup() {
        return TAuthorityGroup;
    }
    
    /**
     * 设置 权限组表实体类
     * @param tAuthorityGroup 权限组表实体类
     */
    public void setTAuthorityGroup(TAuthorityGroup tAuthorityGroup) {
        TAuthorityGroup = tAuthorityGroup;
    }
    
}
