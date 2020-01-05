package com.lucygift.java.demo1.proxy;

/**
 * 数据库读写层，Dao层
 */
public class UserDao {
    public boolean save(User user){
        System.out.println("保存完毕" + user.getName() + user.getAge());
        return true;
    }
}
