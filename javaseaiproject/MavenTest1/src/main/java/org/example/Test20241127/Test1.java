package org.example.Test20241127;

public class Test1 {
    public static void main(String[] args) {
        int k = 2;
        int nums[] = {1, 0, 0, 0, 1, 0, 1};

        System.out.println(kLengthApart(nums, k));

        int nums2[][] = {{1,2,3},{3,1,5},{3,2,1}};


    }

    // 題目號：1437 是否所有1都至少相隔k個元素
    public static boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count++;
            }else {
                if(count < k & count != 0){
                    flag = false; // 若中間有相隔小於k
                    count = 0;    // 此初始化已不必要，但為保持運算正確
                }else {
                    count = 0;    // 清空count
                }
            }
        }
        return flag;
    }
}