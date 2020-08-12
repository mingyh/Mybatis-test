package cn.ming.dao;

import cn.ming.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * Created by ASUS on 2020/8/1.
 */
public interface TeacherMapper {
    //<List>Teacher getTeacher();

    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
