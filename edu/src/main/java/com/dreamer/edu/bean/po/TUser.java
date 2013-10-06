package com.dreamer.edu.bean.po;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 用户表实体类
 * @since 2013-10-5 下午3:16:41
 * @author broken_xie
 */
@Entity
@Table(name = "t_user")
public class TUser implements Serializable {
    
    /**  */
    private static final long serialVersionUID = -4217049658357544925L;
    
    /** 主键 */
    @Id
    @Column(unique = true, nullable = false, length = 36)
    private String uuid;
    
    /** 住址 */
    @Column(length = 255)
    private String caddress;
    
    /** 学历 */
    @Column(length = 36)
    private String ceducation;
    
    /** 固话 */
    @Column(length = 36)
    private String cfixedline;
    
    /** 身份证 */
    @Column(length = 18)
    private String cidcard;
    
    /** 登录名 */
    @Column(length = 36)
    private String clogin;
    
    /** 备注 */
    @Column(length = 255)
    private String cmemo;
    
    /** 手机号码 */
    @Column(length = 11)
    private String cmobile;
    
    /** MSN号码 */
    @Column(length = 36)
    private String cmsn;
    
    /** 姓名 */
    @Column(length = 36)
    private String cname;
    
    /** 籍贯 */
    @Column(length = 36)
    private String cnativeplace;
    
    /** 密码 */
    @Column(length = 36)
    private String cpassword;
    
    /** QQ号码 */
    @Column(length = 36)
    private String cqq;
    
    /** 性别 */
    @Column(length = 2)
    private String csex;
    
    /** 状态（0:停用 1:启用） */
    @Column(length = 1)
    private String cstatus;
    
    /** 出生日期 */
    @Temporal(TemporalType.TIMESTAMP)
    private Date dbirthday;
    
    /** 创建时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dcreate;
    
    /** 入职日期 */
    @Temporal(TemporalType.TIMESTAMP)
    private Date dentry;
    
    /** 离职日期 */
    @Temporal(TemporalType.TIMESTAMP)
    private Date dmission;
    
    /** 更新时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dupdate;
    
    /** 用户权限表实体类 */
    @OneToMany(mappedBy = "TUser")
    private Set<TUserAuthority> tuserAuthorities;
    
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
     * 获取 住址
     * @return caddress
     */
    public String getCaddress() {
        return caddress;
    }
    
    /**
     * 设置 住址
     * @param caddress 住址
     */
    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }
    
    /**
     * 获取 学历
     * @return ceducation
     */
    public String getCeducation() {
        return ceducation;
    }
    
    /**
     * 设置 学历
     * @param ceducation 学历
     */
    public void setCeducation(String ceducation) {
        this.ceducation = ceducation;
    }
    
    /**
     * 获取 固话
     * @return cfixedline
     */
    public String getCfixedline() {
        return cfixedline;
    }
    
    /**
     * 设置 固话
     * @param cfixedline 固话
     */
    public void setCfixedline(String cfixedline) {
        this.cfixedline = cfixedline;
    }
    
    /**
     * 获取 身份证
     * @return cidcard
     */
    public String getCidcard() {
        return cidcard;
    }
    
    /**
     * 设置 身份证
     * @param cidcard 身份证
     */
    public void setCidcard(String cidcard) {
        this.cidcard = cidcard;
    }
    
    /**
     * 获取 登录名
     * @return clogin
     */
    public String getClogin() {
        return clogin;
    }
    
    /**
     * 设置 登录名
     * @param clogin 登录名
     */
    public void setClogin(String clogin) {
        this.clogin = clogin;
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
     * 获取 手机号码
     * @return cmobile
     */
    public String getCmobile() {
        return cmobile;
    }
    
    /**
     * 设置 手机号码
     * @param cmobile 手机号码
     */
    public void setCmobile(String cmobile) {
        this.cmobile = cmobile;
    }
    
    /**
     * 获取 MSN号码
     * @return cmsn
     */
    public String getCmsn() {
        return cmsn;
    }
    
    /**
     * 设置 MSN号码
     * @param cmsn MSN号码
     */
    public void setCmsn(String cmsn) {
        this.cmsn = cmsn;
    }
    
    /**
     * 获取 姓名
     * @return cname
     */
    public String getCname() {
        return cname;
    }
    
    /**
     * 设置 姓名
     * @param cname 姓名
     */
    public void setCname(String cname) {
        this.cname = cname;
    }
    
    /**
     * 获取 籍贯
     * @return cnativeplace
     */
    public String getCnativeplace() {
        return cnativeplace;
    }
    
    /**
     * 设置 籍贯
     * @param cnativeplace 籍贯
     */
    public void setCnativeplace(String cnativeplace) {
        this.cnativeplace = cnativeplace;
    }
    
    /**
     * 获取 密码
     * @return cpassword
     */
    public String getCpassword() {
        return cpassword;
    }
    
    /**
     * 设置 密码
     * @param cpassword 密码
     */
    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
    /**
     * 获取 QQ号码
     * @return cqq
     */
    public String getCqq() {
        return cqq;
    }
    
    /**
     * 设置 QQ号码
     * @param cqq QQ号码
     */
    public void setCqq(String cqq) {
        this.cqq = cqq;
    }
    
    /**
     * 获取 性别
     * @return csex
     */
    public String getCsex() {
        return csex;
    }
    
    /**
     * 设置 性别
     * @param csex 性别
     */
    public void setCsex(String csex) {
        this.csex = csex;
    }
    
    /**
     * 获取 状态（0:停用 1:启用）
     * @return cstatus
     */
    public String getCstatus() {
        return cstatus;
    }
    
    /**
     * 设置 状态（0:停用 1:启用）
     * @param cstatus 状态（0:停用 1:启用）
     */
    public void setCstatus(String cstatus) {
        this.cstatus = cstatus;
    }
    
    /**
     * 获取 出生日期
     * @return dbirthday
     */
    public Date getDbirthday() {
        return dbirthday;
    }
    
    /**
     * 设置 出生日期
     * @param dbirthday 出生日期
     */
    public void setDbirthday(Date dbirthday) {
        this.dbirthday = dbirthday;
    }
    
    /**
     * 获取 创建时间
     * @return dcreate
     */
    public Date getDcreate() {
        return dcreate;
    }
    
    /**
     * 设置 创建时间
     * @param dcreate 创建时间
     */
    public void setDcreate(Date dcreate) {
        this.dcreate = dcreate;
    }
    
    /**
     * 获取 入职日期
     * @return dentry
     */
    public Date getDentry() {
        return dentry;
    }
    
    /**
     * 设置 入职日期
     * @param dentry 入职日期
     */
    public void setDentry(Date dentry) {
        this.dentry = dentry;
    }
    
    /**
     * 获取 离职日期
     * @return dmission
     */
    public Date getDmission() {
        return dmission;
    }
    
    /**
     * 设置 离职日期
     * @param dmission 离职日期
     */
    public void setDmission(Date dmission) {
        this.dmission = dmission;
    }
    
    /**
     * 获取 更新时间
     * @return dupdate
     */
    public Date getDupdate() {
        return dupdate;
    }
    
    /**
     * 设置 更新时间
     * @param dupdate 更新时间
     */
    public void setDupdate(Date dupdate) {
        this.dupdate = dupdate;
    }
    
    /**
     * 获取 用户权限表实体类
     * @return tuserAuthorities
     */
    public Set<TUserAuthority> getTuserAuthorities() {
        return tuserAuthorities;
    }
    
    /**
     * 设置 用户权限表实体类
     * @param tuserAuthorities 用户权限表实体类
     */
    public void setTuserAuthorities(Set<TUserAuthority> tuserAuthorities) {
        this.tuserAuthorities = tuserAuthorities;
    }
    
}
