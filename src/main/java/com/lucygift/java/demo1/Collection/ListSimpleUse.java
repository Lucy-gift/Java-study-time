package com.lucygift.java.demo1.Collection;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionSimpleUse {
    private static void printAllElements(List<String> list){
        System.out.println("list的元素个数：" + list.size());
        //遍历
        System.out.print("使用for 循环遍历:");
        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
            if (i > 0){
                System.out.print(',');
            }
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println("使用 迭代器 iterator 遍历");
        Iterator<String> iterator = list.iterator();
        //迭代器在元素之间，如果有n个元素，会有n+1个迭代器位置。
        // next表示越过某个对象并返回刚刚越过的对象，remove为删除上次next所返回的对象。即：先next 后 remove。
        // 否则 抛出异常：IllegalStateException
        // 迭代器 一开始默认在 第一个对象之前
        // 迭代器超出 list.size() ,抛出异常 NoSuchElementException
        while(iterator.hasNext()){
            //next 的方法有两个作用：
            // 1.将迭代器的位置移至下一个位置（迭代器位置始终位于元素之间）
            // 2.返回越过的元素
            System.out.print(iterator.next() + "\t");
        }
        //        iterator.remove();
//        list.remove(1);
//        list.remove("F");
//        list.add(" ");
//        list.add(3,"O");
//        System.out.println(list);
    }
    public static void main(String[] args){
        //集合分为两大类：
        // 1.单个元素的序列，全部都实现了 Collection Interface
        // 1.1 List 列表，有序的，按照插入顺序排序，可以有重复元素，也可以包含多个空
        // 1.2 Set  集  ，不能有重复元素，可以包含null
        // 1.3 Queue队列，按一定规则进行添加/删除
        // 2.键值对 ，全部都实现了 Map Interface

        //可以通过<>指定列表中存放的元素类型,泛型
        //三种创造 list 的方式
//        List<String> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
//        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("F");

//        CollectionSimpleUse.printAllElements(list);
        printAllElements(list);
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("3");
        list1.add("5");
        list1.add("2");
        list1.add("4");
        list1.add("6");
        list1.add("7");
        printAllElements(list1);

        List list3 = new ArrayList();
        list3.add(1);
        list3.add("字符串");
        list3.add('W');
        list3.add(new Date());
        list3.add(new sadEnding());
        list3.add((new CollectionSimpleUse()).new happyEnding());
//        printAllElements(list3);
        //需要进行强制数据类型转换时，先使用 instanceof 判断变量的实际类型
        for (int i = 0; i < list3.size(); i++) {
            Object obj = list3.get(i);
            if (obj instanceof String){
                String str = (String) obj;
                System.out.println("字符串：" + str);
            }else if (obj instanceof Integer){
                Integer n = (Integer) obj;
                System.out.println("int型数据：" + n);
            }else if (obj instanceof Date){
                Date date = (Date) obj;
                System.out.println("日期类型：" + date);
            }else {
                System.out.println("不支持类型" + obj.getClass().getName());
            }
        }

    }
    class happyEnding{}
    static class sadEnding{}
}
