import java.util.ArrayList;
import java.util.List;

public class Test20241125 {


    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    class Solution1 {
        public int theMaximumAchievableX(int num, int t) {
            int theMaximumAchievableX = num + 2 * t;
            return theMaximumAchievableX;
        }
    }

    class Solution2 {
        public int scoreOfString(String s) {
            int ans = 0;
            char[] arr = s.toCharArray();
            for (int i = 1;i < arr.length; i++){
                ans += Math.abs(arr[i - 1] - arr[i]);
            }
            return ans;
        }
    }

    class Solution3 {
        public List<Integer> stableMountains(int[] height, int threshold) {
            List<Integer> stableHeights = new ArrayList<>();
            int n = height.length;
            for (int i = 1; i < n; i++){
                if(height[i - 1] > threshold) {
                    stableHeights.add(i);
                }else{
                }
            }
            return stableHeights;
        }
    }
}
