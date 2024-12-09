package org.example.Test20241130;

import java.util.ArrayList;

// 題目號27.移除元素
public class Test1 {
    public static void main(String[] args) {


        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int checkNum1 = 2;


        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != checkNum1) {
                count++;
                list.add(nums[i]);
            }
        }

        // 更新舊的數組
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(count);
    }
}