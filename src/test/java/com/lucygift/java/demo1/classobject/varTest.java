package com.lucygift.java.demo1.classobject;

import org.junit.Test;

public class varTest {
    public int index;//实例变量,每个都单独；
    public static int count = 0; //类变量，所有实例共享；count创建实例个数.
    public varTest() {
    }
    public varTest(int index) {
        this.index = index;
    }
    public varTest(int index, int count) {
//        必须有this，不然变量不会变化；
        this(index);//构造器调用构造器,this调用另一个构造器，只能第一句
        this.count = count;
    }
    public void println() {
    String logstr = String.format("当前创建第 %d 个实例，共 %d 个变量。",index,count);
        System.out.println(logstr);
    }
    public static void main(String[] args) {
        varTest v1 = new varTest();
        v1.index = 1;
        varTest.count++;
//        System.out.println(String.format("当前创建第 %d 个实例，共 %d 个变量",v1.index,varTest.count));
        v1.println();

        varTest v2 = new varTest();
        v2.index = 2;
        varTest.count++;
//        System.out.println(String.format("当前创建第 %d 个实例，共 %d 个变量",v2.index,varTest.count));
        v2.println();

        varTest v3 = new varTest(3,3);
//        System.out.println(String.format("当前创建第 %d 个实例，共 %d 个变量",v3.index,varTest.count));
        v3.println();
    }
}
