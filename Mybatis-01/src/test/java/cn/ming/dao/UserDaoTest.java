package cn.ming.dao;

import cn.ming.pojo.User;
import cn.ming.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ASUS on 2020/7/30.
 */
public class UserDaoTest {

    @Test
    public void testGetUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userLike = mapper.getUserLike("dan");
        for (User user : userLike) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test(){
        //获取SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
//          方式一  getMapper  获取接口
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.getUserList();

            //方式二：不推荐
//          List<User> userList = sqlSession.selectList("cn.ming.dao.UserDao.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭sqlSession
            sqlSession.close();
        }
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testGetUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userId",1);

        User user = mapper.getUserById2(map);
        System.out.println(user);

        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void teatAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(4,"dan","123654"));

        //**** 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void teatAddUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userId",5);
        map.put("userName","danzi");
        map.put("userPwd","123654");

        mapper.addUser2(map);

        //**** 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //添加用户
    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4,"小单","714714"));


        //**** 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //删除用户
    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(4);


        //**** 提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
