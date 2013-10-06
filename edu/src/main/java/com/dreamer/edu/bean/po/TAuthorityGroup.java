package com.dreamer.edu.bean.po;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 权限组表实体类
 * @since 2013-10-5 下午3:10:42
 * @author broken_xie
 */
@Entity
@Table(name = "t_authority_group")
public class TAuthorityGroup implements Serializable {
    
    /**  */
    private static final long serialVersionUID = 2566283391166336926L;
    
    /** 主键 */
    @Id
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    
    /** 代码 */
    @Column(nullable = false, length = 36)
    private String ccode;
    
    /** 名称 */
    @Column(nullable = false, length = 128)
    private String cname;
    
    /** 用户权限表实体类 */
    @OneToOne
    @JoinColumn(name = "uuid", referencedColumnName = "uauthoritygroupid", nullable = false, insertable = false, updatable = false)
    private TUserAuthority TUserAuthority;
    
    /** 权限、权限组关联表实体类集合 */
    @OneToMany(mappedBy = "TAuthorityGroup")
    private Set<TAuthorityLink> tauthorityLinks;
    
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
     * 获取 代码
     * @return ccode
     */
    public String getCcode() {
        return ccode;
    }
    
    /**
     * 设置 代码
     * @param ccode 代码
     */
    public void setCcode(String ccode) {
        this.ccode = ccode;
    }
    
    /**
     * 获取 名称
     * @return cname
     */
    public String getCname() {
        return cname;
    }
    
    /**
     * 设置 名称
     * @param cname 名称
     */
    public void setCname(String cname) {
        this.cname = cname;
    }
    
    /**
     * 获取 用户权限表实体类
     * @return tUserAuthority
     */
    public TUserAuthority getTUserAuthority() {
        return TUserAuthority;
    }
    
    /**
     * 设置 用户权限表实体类
     * @param tUserAuthority 用户权限表实体类
     */
    public void setTUserAuthority(TUserAuthority tUserAuthority) {
        TUserAuthority = tUserAuthority;
    }
    
    /**
     * 获取 权限、权限组关联表实体类集合
     * @return tauthorityLinks
     */
    public Set<TAuthorityLink> getTauthorityLinks() {
        return tauthorityLinks;
    }
    
    /**
     * 设置 权限、权限组关联表实体类集合
     * @param tauthorityLinks 权限、权限组关联表实体类集合
     */
    public void setTauthorityLinks(Set<TAuthorityLink> tauthorityLinks) {
        this.tauthorityLinks = tauthorityLinks;
    }
    
}
