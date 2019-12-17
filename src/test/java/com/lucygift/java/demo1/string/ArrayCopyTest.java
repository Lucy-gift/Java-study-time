package com.lucygift.java.demo1.string;

import org.junit.Test;

import java.util.Arrays;

public class ArrayCopyTest {
    @Test
    public void testCopy() {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,19};
        // 拷⻉数组 arr1 的前 3 个元素,生成新的数组
        Integer[] arr11 = new Integer[3];
        for (int i = 0; i < arr11.length; i++){
            arr11[i] = arr1[i];
        }
        System.out.println(arr11);
        System.out.println("ar11 = "+Arrays.toString(arr11));
        // 拷⻉数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        // 拷⻉数组 arr2 的后 3 位到 arr1 到后 3 位
    }
    @Test
    public void testCopyRight(){
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,19};
        Integer[] arr12 = Arrays.copyOf(arr1,3);
        Integer[] arr3 = Arrays.copyOfRange(arr1,arr1.length - 3,arr1.length);
        Integer[] arr4 = Arrays.copyOfRange(arr1,0,3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr12));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.arraycopy(arr2,arr2.length - 3,arr1,arr1.length - 3,3);
        System.out.println(Arrays.toString(arr1));
    }
}
