package com.lucygift.java.demo1.classobject;

public class PublicStaticTest {
    public static final int MAX_COUNT;
    private static int count = 0;
    static {
        MAX_COUNT = 6;
        System.out.println("执行 static 代码块");
    }

    {
//        代码块，初始化代码块
//        每个new ，都会执行普通代码块
        System.out.println("代码块1");
    }

    public PublicStaticTest() throws Exception {
        count++;
        if (count > MAX_COUNT) {
            throw new Exception("只能创建6个对象");
        }
    }
    public static void printCount() {
        System.out.println(String.format("总共有 %d 个实例。",count));
    }

    public static void main(String[] args) throws Exception {
        new PublicStaticTest();
//        new PublicStaticTest();
//        new PublicStaticTest();
        new PublicStaticTest();
        new PublicStaticTest();
        new PublicStaticTest();
        new PublicStaticTest();

        PublicStaticTest.printCount();
    }
}
