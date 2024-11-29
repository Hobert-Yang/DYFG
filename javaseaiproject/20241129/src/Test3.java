import java.util.ArrayList;

// 題目號26 刪除有序數組中的重複項
public class Test3 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        int checkNum1;

        // 題目提示有數字範圍大於等於-10000
        int checkNum2 = -10001;
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            checkNum1 = nums[i];

            // 判斷是否為新數字，為新數字才更新
            if (checkNum1 == checkNum2) {
            }else {
                list.add(checkNum1);
                checkNum2 = checkNum1;
                count++;
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
