package org.example.Test20241202;

public class Test2 {
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int firstTarget = 0;
        int finalTarget = 0;
        boolean alreadyFind = false;
        int[] returnNums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                finalTarget = i;
                if (alreadyFind == false) {
                    firstTarget = i;
                    alreadyFind = true;
                }
            }
        }

        if (alreadyFind){
            returnNums[0] = firstTarget;
            returnNums[1] = finalTarget;
        }else {
            returnNums[0] = -1;
            returnNums[1] = -1;
        }

        for (int i = 0; i < returnNums.length; i++) {
            System.out.println(returnNums[i]);
        }



    }
}
