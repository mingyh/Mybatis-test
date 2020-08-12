package cn.ming.utils;

import java.util.UUID;

/**
 * Created by ASUS on 2020/8/2.
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    /*@Test
    public void test(){

        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
    }*/

}
