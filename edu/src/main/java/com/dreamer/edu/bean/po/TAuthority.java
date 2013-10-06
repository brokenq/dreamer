package com.dreamer.edu.bean.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 权限表实体类
 * @since 2013-10-5 下午3:08:19
 * @author broken_xie
 */
@Entity
@Table(name = "t_authority")
public class TAuthority implements Serializable {
    
    /**  */
    private static final long serialVersionUID = 9122167588026054492L;
    
    /** 主键 */
    @Id
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    
    /** 代码 */
    @Column(nullable = false, length = 36)
    private String ccode;
    
    /** 名称 */
    @Column(nullable = false, length = 36)
    private String cname;
    
    /** 上级模块代码 */
    @Column(length = 36)
    private String cparent;
    
    /** 类型 */
    @Column(nullable = false, length = 36)
    private String ctype;
    
    /** 等级 */
    @Column(nullable = false)
    private int ilevel;
    
    /** 权限、权限组关联表实体类 */
    @OneToOne
    @JoinColumn(name = "uuid", referencedColumnName = "uauthorityid", nullable = false, insertable = false, updatable = false)
    private TAuthorityLink tauthorityLink;
    
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
     * 获取 上级模块代码
     * @return cparent
     */
    public String getCparent() {
        return cparent;
    }
    
    /**
     * 设置 上级模块代码
     * @param cparent 上级模块代码
     */
    public void setCparent(String cparent) {
        this.cparent = cparent;
    }
    
    /**
     * 获取 类型
     * @return ctype
     */
    public String getCtype() {
        return ctype;
    }
    
    /**
     * 设置 类型
     * @param ctype 类型
     */
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
    
    /**
     * 获取 等级
     * @return ilevel
     */
    public int getIlevel() {
        return ilevel;
    }
    
    /**
     * 设置 等级
     * @param ilevel 等级
     */
    public void setIlevel(int ilevel) {
        this.ilevel = ilevel;
    }
    
    /**
     * 获取 权限、权限组关联表实体类
     * @return tauthorityLink
     */
    public TAuthorityLink getTauthorityLink() {
        return tauthorityLink;
    }
    
    /**
     * 设置 权限、权限组关联表实体类
     * @param tauthorityLink 权限、权限组关联表实体类
     */
    public void setTauthorityLink(TAuthorityLink tauthorityLink) {
        this.tauthorityLink = tauthorityLink;
    }
    
}
