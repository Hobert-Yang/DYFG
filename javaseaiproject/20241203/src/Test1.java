import java.util.ArrayList;

// 題目號66 加一
public class Test1 {
    public static void main(String[] args) {
        int[] digits = {1, 4, 9};

        ArrayList<Integer> a1 = new ArrayList();

        // 因為不止具體長度，用集合存儲
        for (int i = 0; i < digits.length; i++) {
            if (i + 1 != digits.length) {
                a1.add(digits[i]);
            }else {
                if (digits[i] == 9) {
                    a1.add(1);
                    a1.add(0);
                }else {
                    a1.add((digits[i]+1));
                }
            }
        }

        int nums[] = new int[a1.size()];
        for (int i = 0; i < a1.size(); i++) {
            nums[i] = (int)a1.get(i);
        }

    }
}
