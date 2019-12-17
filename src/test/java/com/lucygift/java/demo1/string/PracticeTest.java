package com.lucygift.java.demo1.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class PracticeTest {
//    给定⼀个整数数组 nums 和⼀个⽬标值 target，请你在该数组中找出和为⽬标值的那 两个 整数，并返回他们的 数组下标。
//        你可以假设每种输⼊只会对应⼀个答案。但是，你不能重复利⽤这个数组中同样的元素。
//        给定 nums = [2, 7, 11, 15], target = 9
//        因为 nums[0] + nums[1] = 2 + 7 = 9
//        所以返回 [0, 1]
    public int[] tuoSum(int[] nums,int target) {
//        long startTime = System.currentTimeMillis();
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int [] {i,j};
                }
            }
        }
        return null;
    }
    public int[] tuoSum2(int[] nums,int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] >= target) {
                return null;
            } else {
                for (int j = i + 1; j < nums.length; j++) {
//                    默认每个数值大于0
                    if (nums[j] > target){
                        break;
                    }
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

        @Test
    public void testPractice() {
//        int[] num = {2,7,1,15};
//        int[] num = new (int)(Random().nextInt(10)) [8];
        int[] num = new int[10];
        for (int i = 0;i <num.length; i++){
            num[i] = new Random().nextInt(10);
        }
        int target = 9;
        System.out.println(Arrays.toString(tuoSum(num,target)));
        System.out.println(Arrays.toString(tuoSum2(num,target)));

        }

    @Test
    public void testMianShi() {
        int[] n = new int[3];
        String[] s = new String[3];
        System.out.println(n[1]);
        System.out.println(Arrays.toString(n));
        System.out.println(s[1]);
    }
}
