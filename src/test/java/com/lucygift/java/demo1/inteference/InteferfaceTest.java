package com.lucygift.java.demo1.inteference;

import org.junit.Test;

public class InteferfaceTest {
    @Test
    public void tese001(){
        Interface i1 = new InterfaceImpl();
        Interface i2 = new InterfaceImpl();
        i1.method();
        i2.method();
        i2.print();
        System.out.println(i1 instanceof Interface);
        System.out.println(i2 instanceof Interface);
        Interface.print0();//静态方法只能接口名访问

//        接口常量访问，推荐 接口。常量
        System.out.println(Interface.MAX_COUNT);
        System.out.println(InterfaceImpl.MAX_COUNT);
        System.out.println(i1.MAX_COUNT);
    }
}
