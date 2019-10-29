package com.jianshu.dao;

import cn.hutool.db.Entity;
import com.jianshu.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return List<Entity>
     * @throws SQLException
     */

    int insertUser(User user) throws SQLException;

    int deleteUserById(int id) throws SQLException;

    int updataUser(User user) throws SQLException;

    Entity getUser(int id) throws SQLException;

    List<Entity> findAll() throws  SQLException;
}
