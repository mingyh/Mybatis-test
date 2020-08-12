package cn.ming.dao;

import cn.ming.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ASUS on 2020/8/3.
 */
public interface UserMapper {
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
    
}
