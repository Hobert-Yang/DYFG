import java.util.Arrays;

// 題目號1.兩數之和
public class Test1 {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int nums2[] = {3, 2, 4};
        int target = 9;
        int target2 = 6;
        String answer = Arrays.toString(twoSum(nums2, target2));
        System.out.println(answer);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                // 選取相加結果為target的兩個數字，且不重複使用
                if ((nums[i] + nums[j] == target) & (i != j)) {

                    // 從前往後存入數組
                    if (i > j){
                        result[0] = j;
                        result[1] = i;
                    }else{
                        result[0] = i;
                        result[1] = j;
                    }
                    flag = true;
                }
            }
        }
        if (flag) {
            return result;
        }else {
            return null;
        }
    }
}