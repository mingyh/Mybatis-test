package cn.ming.dao;

import cn.ming.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ASUS on 2020/8/1.
 */
public interface TeacherMapper {
    @Select("select * from teacher where id = #{id}")
    Teacher getTeacher(@Param("id") int id);
}
