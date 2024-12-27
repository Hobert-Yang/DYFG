package org.example.Test20241227;

import java.util.ArrayList;
import java.util.List;

// 題目號 728 自除數
public class Test1 {
    // 检查一个数字是否为自除数
    public static boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    // 在给定范围内找到所有的自除数
    public static List<Integer> findSelfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                selfDividingNumbers.add(i);
            }
        }
        return selfDividingNumbers;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> result = findSelfDividingNumbers(left, right);
        System.out.println("Self-dividing numbers between " + left + " and " + right + ": " + result);
    }
}
