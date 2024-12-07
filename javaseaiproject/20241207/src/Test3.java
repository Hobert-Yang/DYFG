public class Test3 {
    public static void main(String[] args) {

        int[] arr = {0,2,1,-6,6,-7,9,1,2,0,1};

        boolean flag = false;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // 如果总和不能被3整除，直接返回false
        if (sum % 3 != 0) {
            System.out.println("提前" + false);
        }

        int targetSum = sum / 3;
        int currentSum = 0;
        int partsFound = 0; // 记录已经找到的相等和的部分数量
        boolean foundZeroSumPart = false; // 标记是否找到过和为0的部分（可能是连续零）

        for (int i = 0 ;i< arr.length;i++) {
            int num = arr[i];
            currentSum += num;
            System.out.println("currentSum = " + currentSum);
            // 检查当前部分是否等于目标和
            if (currentSum == targetSum) {
                currentSum = 0; // 重置当前和
                partsFound++; // 增加已找到的部分数量
//                System.out.println("num = " + num);

                // 如果已经找到两个部分，并且当前部分（第三个部分之前）的和为0（可能是由连续零组成），也视为有效划分
                // 注意：这里假设数组中没有负数，否则这个检查可能不适用
                if (partsFound == 2 && (num == 0 || foundZeroSumPart)) {
                    System.out.println(flag);  // 可以划分，因为第三部分可以是剩余的所有元素（包括零）
                }
            } else if (currentSum > targetSum && !foundZeroSumPart && (num == 0 || (partsFound == 0 && currentSum == targetSum + num))) {
                // 如果当前和超过了目标和，并且之前没有找到过和为0的部分
                // 并且（当前是第一个元素且当前和正好是目标和加上当前元素，这通常意味着数组开头有零）
                // 则尝试将当前部分视为一个和为0的部分（由连续零组成），但这只适用于第一部分
                // 注意：这个检查是为了处理像 [0, 0, 0, 3, 3, 3] 这样的特殊情况
                currentSum = 0; // 将当前和重置为0，模拟找到了一个和为0的部分
                foundZeroSumPart = true; // 标记已找到和为0的部分
            }
        }
        // 简化后的判断条件：只要找到了两个有效的部分（partsFound == 2），就可以返回true。
        // 因为我们的逻辑已经确保了如果遍历结束还没有返回false，那么必然可以划分。

        if (partsFound == 3) {
            flag = true;
        }else {
            flag = false;
        }

        System.out.println(flag);
    }
}
