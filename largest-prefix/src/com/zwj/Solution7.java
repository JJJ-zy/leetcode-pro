package com.zwj;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwj
 * @date 2022/1/15 - 22:24
 * 字符串数组公共前缀
 */
public class Solution7 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String standard = strs[0];
        int count = 0;
        for (int i = 1; i < strs.length; i++) {
            standard = longestCommonPrefix(standard,strs[i]);
            if (standard.length() == 0){
                break;
            }
        }
        return standard;
    }

    public static String longestCommonPrefix(String standard, String nextStr) {
        int length = Math.min(standard.length(), nextStr.length());
        int index = 0;
        while (index < length && (standard.charAt(index) == nextStr.charAt(index))) {
            index++;
        }
        return standard.substring(0, index);
    }
}
