package cn.ming.dao;

import cn.ming.pojo.User;

import java.util.List;

/**
 * Created by ASUS on 2020/7/30.
 */
public interface UserMapper {

    //获取全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //添加一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
