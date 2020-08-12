package cn.ming.dao;

import cn.ming.pojo.Student;

import java.util.List;

/**
 * Created by ASUS on 2020/8/1.
 */
public interface StudentMapper {
    //查询所有的学生信息以及老师的信息
    //@Select("select * from student")
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
