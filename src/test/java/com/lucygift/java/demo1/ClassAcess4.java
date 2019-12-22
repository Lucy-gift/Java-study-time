package com.lucygift.java.demo1;

import com.lucygift.java.demo1.classobject.ClassAssess;
import org.junit.Test;

public class ClassAcess4 extends ClassAssess {
    @Test
    public void test001(){

        ClassAssess ca = new ClassAssess();
        System.out.println(ca.pub);
//       System.out.println(ca.pro);
//       System.out.println(ca.def);
//       System.out.println(ca.pri);
    }
}
