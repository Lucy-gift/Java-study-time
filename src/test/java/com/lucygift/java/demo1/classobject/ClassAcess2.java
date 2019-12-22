package com.lucygift.java.demo1.classobject;

import org.junit.Test;

public class ClassAcess2 {
    @Test
    public void testVisit() {
//        同包下private 不可以！
        ClassAssess ca = new ClassAssess();
        System.out.println(ca.pub);
        System.out.println(ca.pro);
        System.out.println(ca.def);
//        System.out.println(ca.pri);
    }
}
