package com.jianshu.factory;

import com.jianshu.dao.UserDao;
import com.jianshu.dao.impl.UserDaoImpl;

/**
*@ClassName DaoFactory
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }
}
