package com.zwj;

/**
 * @author zwj
 * @date 2022/1/15 - 21:43
 * 罗马数字转数字  个人做法
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * I 可以放在 V(5) 和 X(10) 的左边，来表示 4 和 9。
 * X 可以放在 L(50) 和 C(100) 的左边，来表示 40 和 90。
 * C 可以放在 D(500) 和 M(1000) 的左边，来表示 400 和 900。
 *
 *     27 写做  XXVII    56 写作 LVI   48写作  XLVIII
 *     只可能能第一位比第二位小，做判断
 */
public class Solution5 {

    public static int romanToInt(String s) {
        int sum = 0;
        char[] str = s.toCharArray();
        sum = justify(str[0]);
        for (int i = 1; i < str.length; i++) {
            int num = justify(str[i]);
            if (sum < num){
                sum = num - sum;
            }else {
                sum = sum + num;
            }
        }
        return sum;
    }

    public static int justify(char x){
        switch (x){
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
        System.out.println(romanToInt("LVIII"));
    }

}
