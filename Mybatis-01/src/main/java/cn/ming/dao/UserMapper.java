package cn.ming.dao;

import cn.ming.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2020/7/30.
 */
public interface UserMapper {
    //模糊查询
    List<User> getUserLike(String value);

    //获取全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //map精准查询
    User getUserById2(Map<String,Object> map);

    //插入一个用户
    int addUser(User user);

    //万能的Map
    int addUser2(Map<String,Object> map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
