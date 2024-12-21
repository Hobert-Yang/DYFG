package org.example.Test20241221;

import java.util.ArrayList;
import java.util.List;

// 題目號 989 數組形式的整數加法
public class Test1 {

    public static int[] splitNumber(int number) {
        // 将数字转换为字符串，以便我们可以获取其长度
        String numberStr = Integer.toString(number);
        int length = numberStr.length();

        // 创建一个长度为length的数组来存储每一位数字
        int[] digits = new int[length];

        // 遍历字符串，将每一位字符转换为整数并存储在数组中
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        return digits;
    }

    public static int arrayToInt(int[] digits) {
        int number = 0;
        int powerOfTen = 1; // 10^0

        // 从数组的最后一个元素开始，因为最低位（个位）应该在结果数字的最低位
        for (int i = digits.length - 1; i >= 0; i--) {
            number += digits[i] * powerOfTen;
            powerOfTen *= 10; // 移动到下一个更高的10的幂
        }

        return number;
    }

    public static void main(String[] args) {

        int num[] = {1,2,0,0};
        int k = 34;
        int num2 = arrayToInt(num);

        int nums = k + num2;

        int[] digits = splitNumber(nums);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < digits.length; i++) {
            list.add(digits[i]);
        }

        System.out.println(list);
    }
}
