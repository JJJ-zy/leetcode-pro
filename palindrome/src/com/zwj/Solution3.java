package com.zwj;

/**
 * @author zwj
 * @date 2022/1/14 - 23:48
 * 回文数  回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是
 * 自己的解决方法  转字符串
 * 字符串更优解
 *          String reversedStr = (new StringBuilder(x + "")).reverse().toString();
 *          return (x + "").equals(reversedStr);
 *
 */
public class Solution3 {

    public static boolean isPalindrome(int x) {
        String newStr = String.valueOf(x);
        int length = newStr.length();
        char[] chars = newStr.toCharArray();
        if (length % 2 == 0){
            for (int i = 0; i < length / 2; i++) {
                if (chars[i] != chars[length-i]){
                    break;
                }
                if (i == (length/2)-1){
                    return true;
                }
            }
            return false;
        }else {
            for (int i = 0; i < (length+1) / 2; i++) {
                if (chars[i] != chars[(length-1)-i]){
                    break;
                }
                if (i == ((length+1)/2)-1){
                    return true;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }

}
