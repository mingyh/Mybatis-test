import cn.ming.dao.UserMapper;
import cn.ming.pojo.User;
import cn.ming.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by ASUS on 2020/8/3.
 */
public class MyTest {
    @Test
    public void selectUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        //mapper.updateUser(new User(2,"dandan","666666"));
        sqlSession.clearCache();//清理缓存  一级缓存

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        sqlSession.close();

    }

    @Test
    public void selectUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user2 = mapper1.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);
        sqlSession1.close();
    }
}
