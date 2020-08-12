package cn.ming.dao;

import cn.ming.pojo.User;
import cn.ming.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by ASUS on 2020/7/31.
 */
public class UserDaoTest {
    @Test
    public void testGetUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userLike = mapper.getUserList();
        for (User user : userLike) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
