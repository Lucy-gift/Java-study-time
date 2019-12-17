package com.lucygift.java.demo1.array;

import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArrayDeclare(){
        int[] arr1;
        String[] arr2;
        int[] arr3 = {3,5,(int)'a',5};
        System.out.println(arr3);
        System.out.println(Arrays.toString(arr3));
//        变String为char.
        String arr = null;
        char[] cha1 = arr.toCharArray();
    }

    @Test
    public void testBianLi(){
    Integer[] arr = {1,2,3,4,5};
    System.out.println("---------for循环遍历---------");
    for (int index = 0; index < arr.length; index++){
//        System.out.println("下标"+index+"存放的值是数组中第"+(index+1)+"位数："+arr[index]);
        System.out.println(String.format(("下标 %d 存放的是数组中第 %d 位数 %d"),index,(index+1),arr[index]));
    }
    System.out.println("---------for each循环遍历---------");
    int index1 = 0;
//    for(变量：数组)
    for (int val : arr){
        System.out.println(String.format(("下标 %d 存放的是数组中第 %d 位数 %d"),index1,(index1+1),arr[index1]));
//      输出语句index1改成val会造成下标越界。val是值
        index1++;
    }
    System.out.println("---------Lambda循环遍历---------");
        Arrays.asList(arr).forEach(val -> {
            System.out.println(String.format(("值是： %d"),val));
        });
    }
    @Test
    public void testForEach(){
        int[] arr = {1,2,3,4,5,6};
        for(int val: arr){
            System.out.print(val);
        }
        System.out.println();
        Integer[] arr1 = {1,2,3,4,5,6};
        Arrays.asList(arr1).forEach(val -> {
            System.out.println("值是"+val);
//            Integer 变为 int，val%2==0报错。前者类型为int[],后者类型为int；
            if (val % 2 == 0){
                System.out.println("它是一个偶数");
            }else{
                System.out.println("它是一个奇数");
            }
        });
    }
    @Test
    public void testForMe(){
        Object[] arr = {1,"都会",null,0};
        System.out.println(arr);
        System.out.println(arr.toString());
    }

}
