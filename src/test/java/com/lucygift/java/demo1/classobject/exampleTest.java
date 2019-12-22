package com.lucygift.java.demo1.classobject;

import org.junit.Test;

public class exampleTest {
    private void print(int... numbs) {
        if (numbs == null) {
            System.out.println("param is null");
            return;
        }
        if (numbs.length == 0) {
            System.out.println("参数个数为0");
            return;
        }
        System.out.println("共" + numbs.length + "个参数");
        for (int numb : numbs) {
            System.out.println(numb);
        }
    }
    @Test
    public void testExample(){
        this.print();
        this.print(null);
        this.print(1);
        this.print(1, 5, 3);
    }

}
