package com.lucygift.java.demo1.inteference;

public interface Interface {
    class InnerClass{
    }
    interface InnerInterface{
    }
    //常量，未使用static和final修饰；
    int MAX_COUNT = 100;
    void method();
    default void print() {
        System.out.println("这是一个默认方法。");
    }
    static void print0() {
        System.out.println("静态方法只能接口名访问。");
    }
 }
