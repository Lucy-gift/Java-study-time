package com.lucygift.java.demo1.classobject;

import org.junit.Test;

public class ClassMethodParamTest {
    private void changePrimitive(int num) {
        System.out.println("传入"+num);
        num += 30;
        num = 20;
        System.out.println("修改后"+num);
    }
    private void changeReference(StringBuilder sb) {
        System.out.println("传入"+sb.toString());
        sb.append("-追加");
        System.out.println("修改后"+sb.toString());
        sb = new StringBuilder();
        sb.append("新字符串");
    }
    @Test
    public void testModifityParam() {
//        ⼀个⽅法不能修改⼀个基本数据类型的参数，
//        也不能修改引⽤类型参数的指向，
//        但是却可以修改引⽤类型参数 指向的对象的值
        int num = 10;
        changePrimitive(num);
        System.out.println("num = "+ num);

        StringBuilder sb = new StringBuilder();
        sb.append("字符串");
        changeReference(sb);
        System.out.println("sb = "+ sb.toString());
    }


}
