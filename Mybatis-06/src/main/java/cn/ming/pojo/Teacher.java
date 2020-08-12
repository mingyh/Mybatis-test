package cn.ming.pojo;

import java.util.List;

/**
 * Created by ASUS on 2020/8/1.
 */
//@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> student;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Teacher() {

    }

    public Teacher(int id, String name, List<Student> student) {

        this.id = id;
        this.name = name;
        this.student = student;
    }
}
