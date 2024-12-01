
// 題目號33 搜素旋轉排序數組
public class Test3 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int search = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                search = i;
            }
        }
        System.out.println(search);
    }
}
