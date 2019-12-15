package com.lucygift.java.demo1.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void test字符串内存使用(){
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);

        String str3 = "hello world";
        String str4 = str2 + " world";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println("str5 = str6"+str5 == str6);

        String str7 = str6.intern();
        System.out.println("str7 = str6"+str7 == str6);
    }
    @Test
    public void testLength(){
        String str1 = "hello world";
        System.out.println(str1.length());
        System.out.println(str1.codePointCount(0,str1.length()));//字符串长度
    }
    @Test
    public void testSubString(){
        String str1 = "hello, China";
        String str2 = str1.substring(7,str1.length());
        String str3 = str1.substring(7);
        System.out.println(str2);
        System.out.println(str3);
    }

    @Test
    public void testMerge拼接(){
        String str1 = "hello";
        String str2 = str1 += "world";
        System.out.println(str2);
    }

    @Test
    public void testFormat格式化(){
//    %s 字符串  //    %c 字符类型  //    %b 布尔类型
//    %d 整数类型（⼗进制数）  //    %x 整数类型（⼗六进制数）
//    %o 整数类型（⼋进制数）  %f 浮点类型
//    %a 浮点类型（⼗六进制数）   //    %% 百分⽐类型  %n 换⾏
        System.out.printf("hello, %s %n", "world");
        System.out.printf("⼤写a：%c,它的 ASCII 码值是： %d %n", 'A',(int)'A');
        System.out.printf("100 > 50：%b %n", 100 > 50);
        System.out.printf("100除以2：%d %n", 100 / 2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("100元打8.5折扣是：%f 元%n", 50 * 0.85);
        System.out.printf("上述价格的16进制数是：%a %n", 50 * 0.85);
        System.out.printf("上⾯的折扣是%d%% %n", 85);
    }

    @Test
    public void testEqual(){
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testju(){
        String str1 = "hello";
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.contains("l"));
    }
    @Test
    public void testFind(){
        String str1 = "hello, world, today is my birthing, say hi to me.";
        System.out.println(str1.indexOf("o"));
        System.out.println(str1.lastIndexOf("m"));
        System.out.println(str1.indexOf("z"));
        System.out.println(str1.indexOf("w",2));
        System.out.println(str1.lastIndexOf("h",7));
    }
    @Test
    public void testIndex(){
        String str1 = "hello, world, today is my birthing, say hi to me.";
        int ind = -1;
        do {//从前往后找
            int at1 = str1.indexOf("o",ind+1);
            if (at1 == -1){
                break;
            }
            System.out.println(String.format("第 %d 位是字母z",at1+1));
            ind = at1;
        }while(true);
        int ind2 = str1.length();
        do {//从后往前找
            int at1 = str1.lastIndexOf("o",ind2-1);
            if (at1 == -1){
                break;
            }
            System.out.println(String.format("第 %d 位是字母z",at1+1));
            ind2 = at1;
        }while(true);
    }

    @Test
    public void testRepl(){
        System.out.println("hello".replace('o','O'));
        System.out.println("hello,world".replaceAll("o","OOO"));
    }
    @Test
    public void testRemovePlace(){
        String str1 = "   hello , w o r l d   ";
        System.out.println(str1.trim());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim().toLowerCase());
        String str2 = "";//空串
        String str3 = null;//null串
    }
    @Test
    public void testSB(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        sb1.append("hello");
        sb1.append(',');
        sb1.append("world");
        sb1.append('.');
        System.out.println(sb1.toString());
        sb1.setLength(10);
        System.out.println(sb1.toString());
        sb1.setCharAt(5,'l');
        System.out.println(sb1.toString());
    }
    @Test
    public void testOpt(){
        long start = System.currentTimeMillis();
        String str1 = "";
        for(int i = 0; i < 20000; i++){
            str1 += i;
        }
        System.out.println(str1.length());
        System.out.println(String.format("耗时： %d ms",System.currentTimeMillis()-start));
    }
    @Test
    public void testOpt1(){
        long start = System.currentTimeMillis();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < 20000; i++){
            temp.append(i);
        }
        System.out.println(temp.toString().length());
        System.out.println(String.format("耗时： %d ms",System.currentTimeMillis()-start));
    }


}
