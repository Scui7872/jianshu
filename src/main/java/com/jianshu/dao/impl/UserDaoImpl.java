package com.jianshu.dao.impl;/**
*@ClassName UserDaoImpl
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.jianshu.dao.UserDao;
import com.jianshu.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author xxq
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Date 2019/10/10
 * @Version 1.0
 **/
public class UserDaoImpl implements UserDao {

    @Override
    public int insertUser(User user) throws SQLException {
        long id = Db.use().insertForGeneratedKey(
                Entity.create("t_user")
                        .set("account",user.getAccount())
                        .set("password",user.getPassword())
                        .set("nickname",user.getNickname())
                        .set("avatar",user.getAvatar())
                        .set("address",user.getAddress())
                        .set("join_date",user.getJoinDate())
                        .set("description",user.getDescription())

        );
        return (int) id;
    }

    @Override
    public int deleteUserById(int id) throws SQLException {
        return Db.use().del(
                Entity.create("t_user").set("id",id));
    }

    @Override
    public int updataUser(User user) throws SQLException {
        return Db.use().update(
                Entity.create().set("nickname",user.getNickname()).set("address",user.getAddress()),
                Entity.create("t_user").set("id",user.getId())
        );
    }

    @Override
    public Entity getUser(int id) throws SQLException {
        return Db.use().find(Entity.create("t_user").set("id",id)).get(0);
    }


    @Override
    public List<Entity> findAll() throws SQLException {
        return Db.use().query("SELECT * FROM db_jianshu.t_user ORDER BY id DESC ");
    }


}
