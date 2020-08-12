package cn.ming.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ASUS on 2020/7/30.
 */
//@Alias("user") 为User类设置别名
@Data  //无参构造，toString，get，set，hashcode，equals
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
public class User {
    private int id;
    private String name;
    private String pwd;

}
