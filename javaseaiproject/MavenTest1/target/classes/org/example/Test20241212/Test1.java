package org.example.Test20241212;

public class Test1 {
    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        int[][] numsList = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            numsList[i][0] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++){
                if (nums[i] == numsList[j][0]){
                    numsList[j][1] = numsList[j][1] + 1;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsList[i][1] == 1){
                System.out.println(numsList[i][0]);
            }
        }

    }
}
