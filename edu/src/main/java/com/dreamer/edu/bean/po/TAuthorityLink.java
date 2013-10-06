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
 * 权限、权限组关联表实体类
 * @since 2013-10-5 下午3:12:10
 * @author broken_xie
 */
@Entity
@Table(name = "t_authority_link")
public class TAuthorityLink implements Serializable {
    
    /**  */
    private static final long serialVersionUID = -1197424466838559015L;
    
    /** 主键 */
    @Id
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    
    /** 权限表实体类 */
    @OneToOne
    @JoinColumn(name = "uauthorityid", nullable = false)
    private TAuthority TAuthority;
    
    /** 权限组表实体类 */
    @ManyToOne
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
     * 获取 权限表实体类
     * @return tAuthority
     */
    public TAuthority getTAuthority() {
        return TAuthority;
    }
    
    /**
     * 设置 权限表实体类
     * @param tAuthority 权限表实体类
     */
    public void setTAuthority(TAuthority tAuthority) {
        TAuthority = tAuthority;
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
