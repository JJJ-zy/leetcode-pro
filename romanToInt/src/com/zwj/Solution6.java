package com.zwj;

/**
 * @author zwj
 * @date 2022/1/15 - 22:03
 * MCMXCIV 1994 罗马数字的原理看一看
 * M 1000;   CM 900;   XC 90;  IV  4
 */
public class Solution6 {
        public static int romanToInt(String s) {
            int sum = 0;
            int preNum = getValue(s.charAt(0));
            for(int i = 1;i < s.length(); i ++) {
                int num = getValue(s.charAt(i));
                if(preNum < num) {
                    sum -= preNum;
                } else {
                    sum += preNum;
                }
                preNum = num;
            }
            sum += preNum;
            return sum;
        }


        public static int getValue(char ch) {
            switch (ch) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
        }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
