package com.zwj;

/**
 * @author zwj
 * @date 2022/1/14 - 22:55
 * 暴力循环     两数之和，给定一个数组，和一个target数，求数组中能够相加得target的下标
 */
public class Solution1 {

    public static int[] twoSum(int[] nums, int target) {
        long b = System.currentTimeMillis();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                    long e = System.currentTimeMillis();
                    System.out.println(e-b);
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++){
            nums[i] = i;
        }
        twoSum(nums,189999);
    }

}
