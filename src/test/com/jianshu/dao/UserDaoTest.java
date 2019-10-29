package com.jianshu.dao;
import cn.hutool.db.Entity;
import com.jianshu.dao.impl.UserDaoImpl;
import com.jianshu.entity.User;
import com.jianshu.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

/**
*@ClassName UserDaoTest
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class UserDaoTest {
    private UserDao userDao = DaoFactory.getUserDaoInstance();

    @Test
    public void insertUser() throws SQLException{
        User user = new User();
        user.setAccount("test1");
        user.setPassword("123");
        user.setNickname("测试用户");
        user.setAvatar("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/10.jpg");
        user.setAddress("安徽");
        user.setJoinDate(LocalDate.now());
        user.setDescription("新增一个测试用户");
        int id = userDao.insertUser(user);
        System.out.println(id);
    }

     @Test
     public void deleteUser() throws SQLException{
        int id = userDao.deleteUserById(58);
        System.out.println(id);

}
    @Test
    public void updateUser() throws SQLException{
        Entity entity = userDao.getUser(11);
        entity.set("nickname","新的昵称");
        entity.set("address","新的地址");
        int n = userDao.updataUser(entity.toBean(User.class));
        assertEquals(1,n);
    }

    @Test
    public void getUser() throws SQLException{
        Entity user = userDao.getUser(1);
        System.out.println(user.toBean(User.class));
    }

    @Test
    public void findAll() {
        List<Entity> entityList = null;
        try {
            entityList = userDao.findAll();
        } catch (SQLException e) {
            System.out.println("查询用户数据信息出现异常");
        }
        if (entityList != null) {
            entityList.forEach(entity -> System.out.println(entity.get("nickname")));
        }else {
            System.out.println("没有数据");
        }
    }
}
