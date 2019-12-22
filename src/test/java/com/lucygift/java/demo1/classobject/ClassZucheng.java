package com.lucygift.java.demo1.classobject;

import java.util.Scanner;
public class ClassZucheng {
//    类变量，静态域变量
    private static String count;
//    实例变量，域变量
    private String name;
    {
//        实例代码块，初始化代码块
        System.out.println("类里/方法之外，用大括号的代码块");
    }
    static{
//        静态代码块，静态初始化代码块
        System.out.println("与实例区别为：static");
    }
//    构造方法,构造器，与类名一致，无返回值
    public ClassZucheng() {
    }
//    方法
    public void println() {
        {
            System.out.print("代码块");
        }
    }
//    静态方法
    public static void classprintln() {
    }
//    内部类
    class InnerClass{
}
}
