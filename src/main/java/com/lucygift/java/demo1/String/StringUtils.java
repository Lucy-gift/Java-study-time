package com.lucygift.java.demo1.String;

public class StringUtils {
    public static String trimAll(String str) {
//        StringBuilder temp = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
////            第一种：
////            if (str.charAt(i) == ' '){
////                continue;
////            }temp.append(str.charAt(i));
////            第二种
//            char c = str.charAt(i);
//            if (c == ' '){
//                continue;
//            }temp.append(c);
//        }
//        第三种
        StringBuilder temp = new StringBuilder();
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                continue;
            }temp.append(chars[i]);
        }
        return temp.toString();


    }
    public static String reverse(String str) {
        StringBuilder temp = new StringBuilder();
        char [] chars = str.toCharArray();
        for (int i = chars.length-1; i > -1; i--){
            if (chars[i] == ' '){
                continue;
            }temp.append(chars[i]);
        }
        return temp.toString();
    }
}
