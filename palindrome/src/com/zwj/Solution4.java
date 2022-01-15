package com.zwj;

/**
 * @author zwj
 * @date 2022/1/15 - 0:03
 * 反转一半数字  , 节约空间 , 10的次方反转时结果都是1 为true所以要将10的次方全部剔除 ， 结尾为0的数，反转时会少一位，也需要剔除，
 * 所以，结尾带0的也包括10的次方，所以直接剔除所有结尾带0的数
 *
 * 中间带0的数，因为会乘以十再相加，所以0不会消失，只有开头是0不可以
 */
public class Solution4 {

    public static boolean isPalindrome(int x) {

        int endReserveNum = 0;
        int count = x;
        if (x<0 || (x%10 == 0 && x != 0)){
            return false;
        }
        while (count>endReserveNum){

            endReserveNum = count % 10 + (endReserveNum * 10);
            count = count / 10;
        }
        return count == endReserveNum || count == endReserveNum / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-100));
    }

}
