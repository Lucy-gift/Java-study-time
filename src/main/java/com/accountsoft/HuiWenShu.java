package com.accountsoft;

public class dfgublf {
    public boolean isPalindrome(int x) {
        if(x < 0 ){
            return false;
        }
        String str = String.valueOf(x);
        int L = str.length() - 1;
        int R = 0;
        while (L > R) {
            if (str.charAt(L) != str.charAt(R))
                return false;
            L--;
            R++;
        }
        return true;
    }

    public static void main(String[] args) {
        dfgublf d = new dfgublf();
        boolean a = d.isPalindrome(121);
        boolean b = d.isPalindrome(1332);
        boolean c = d.isPalindrome(0);
        boolean e = d.isPalindrome(10);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);

    }
}
