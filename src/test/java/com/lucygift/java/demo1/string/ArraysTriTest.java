package com.lucygift.java.demo1.string;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTriTest {
    @Test
    public void testArrysTri() {
//        定义⼀个⼆维数组，第⼀维表示⽤户，第⼆维表示⽤户的具体信息（1. 编码, 2. 姓名, 3.性别, 4.年龄）。
//        定义赋值并打印。
        String[] [] users = new String[3][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "女";
        users[0][3] = "23";

        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
        users[1][3] = "42";
        System.out.println(Arrays.toString(users));
        Arrays.asList(users).forEach(user ->{
            System.out.println(Arrays.toString(user));
        });
        for (String[] user: users){
            System.out.println(Arrays.toString(user));
        }
    }
}
