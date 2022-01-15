package com.zwj;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwj
 * @date 2022/1/14 - 23:03
 * hash表比对   map的hash表查询最快
 */
public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
        long b = System.currentTimeMillis();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target-nums[i])){
                long e = System.currentTimeMillis();
                System.out.println(e-b);
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++){
            nums[i] = i;
        }
        twoSum(nums,189999);
    }
}
