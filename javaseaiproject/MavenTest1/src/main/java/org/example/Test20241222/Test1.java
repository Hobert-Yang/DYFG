package org.example.Test20241222;

// 題目號 896 單調數列
public class Test1 {

    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            // 如果已经确定不是递增也不是递减，则可以提前返回 false
            if (!increasing && !decreasing) {
                return false;
            }
        }

        // 数组要么是递增的，要么是递减的，所以返回 true
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        Test1 checker = new Test1();

        int[] nums1 = {1, 2, 2, 3}; // 单调递增
        int[] nums2 = {5, 4, 3, 2}; // 单调递减
        int[] nums3 = {1, 3, 2, 2, 4}; // 不是单调的

        System.out.println(checker.isMonotonic(nums1)); // 输出 true
        System.out.println(checker.isMonotonic(nums2)); // 输出 true
        System.out.println(checker.isMonotonic(nums3)); // 输出 false

    }
}
