package cn.ming.dao;

import cn.ming.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    //更细博客
    int updateBlog(Map map);

    //查询前1~3的博客
    List<Blog> queryBlogForeach(HashMap map);
}
