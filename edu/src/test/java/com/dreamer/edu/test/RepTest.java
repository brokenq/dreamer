package com.dreamer.edu.test;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dreamer.edu.base.test.BaseTest;
import com.dreamer.edu.bean.po.TUser;
import com.dreamer.edu.repository.TUserRep;
import com.dreamer.edu.util.Utils;

/**
 * 数据仓库访问接口测试
 * @since 2013-10-5 下午3:50:52
 * @author broken_xie
 */
public class RepTest extends BaseTest {
    
    @Autowired
    private TUserRep userRep;
    
//    @Test
    public void findUser(){
        List<TUser> users = userRep.findAll();
        for (TUser user : users) {
            System.out.println(user.getUuid()+"\t"+user.getCname());
        }
    }
    
    /**
     * 新增用户
     * @author broken_xie
     */
    @Test
//    @Ignore
    public void addUser() {
        Date now = new Date();
        TUser user = new TUser();
        user.setUuid(Utils.getPrimaryKey());
        user.setClogin("brokenq");
        user.setCpassword("123456");
        user.setCname("brokenq");
        user.setCsex("男");
        user.setDcreate(now);
        user.setDupdate(now);
        userRep.save(user);
    }
}
