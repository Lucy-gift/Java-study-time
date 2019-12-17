package com.lucygift.java.demo1.string;

import org.junit.Test;

import java.util.Arrays;

public class ArraysFillTest {
    @Test
    public void testArrayFill() {
        int[] num = new int[10];
        Arrays.fill(num,5);
        System.out.println(Arrays.toString(num));
        Arrays.fill(num,num.length - 3,num.length,3);
        System.out.println(Arrays.toString(num));
    }

    @Test
    public void testOldArraysFill() {
        int [] num = new int[10];
        for (int i = 0; i < num.length; i++){
            num[i] = 5;
        }

        System.out.println(Arrays.toString(num));
        for (int i = num.length-3; i < num.length; i++){
            num[i] = 3;
        }
        System.out.println(Arrays.toString(num));
    }
}
