package com.lucygift.java.demo1.classobject;

import org.junit.Test;

public class ClaeeThisTest {
    private int index;
    public ClaeeThisTest() {
        
    }
    public void println(String name) {
        System.out.println(this.index + ".hello," + name);
    }
    public void println1(int... numbs){
        if (numbs == null) {
            System.out.println("is null");
            return;
        }
        if (numbs.length == 0) {
            System.out.println("param length is zero");
            return;
        }
        System.out.println("打印参数。。。。。。");
        for (int i: numbs) {
            System.out.println(i);
        }
    }

    @Test
    public void test1() {
        new ClaeeThisTest().println("wendy");
    }

    @Test
    public void testPrintParam() {
        this.println1(1,2,3,4);
        this.println1();
        this.println1(null);
        this.println1(1);

    }
}
