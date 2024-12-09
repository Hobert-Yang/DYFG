<<<<<<< HEAD
package org.example.Test20241204;

public class Test3DP {
    // 題目號72 編輯距離
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // 创建一个 (m+1) x (n+1) 的二维数组，并初始化为0
        int[][] dp = new int[m + 1][n + 1];

        // 初始化dp数组
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // 将word1的前i个字符转换成空字符串需要i次删除操作
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // 将空字符串转换成word2的前j个字符需要j次插入操作
        }

        // 填充dp数组
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // 字符相同，不需要操作，继承之前的操作数
                } else {
                    // 取插入、删除、替换三种操作中的最小值，并加1
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],    // 删除word1的第i个字符
                            Math.min(dp[i][j - 1], // 插入到word1的第i个位置
                                    dp[i - 1][j - 1])); // 替换word1的第i个字符
                }
            }
        }

        // 返回将word1转换成word2所需的最少操作数
        return dp[m][n];
    }

    public static void main(String[] args) {
//        String word1 = "intention";
//        String word2 = "execution";
//        int finalCount = 0;
//        int returnCount = 0;
//
//
//        char[] dir1 = word1.toCharArray();
//        char[] dir2 = word2.toCharArray();
////        int count = 0;
//        for (int i = 0; i < dir1.length; i++) {
//            int count = 0;
//            for (int j = 0; j < dir2.length; j++) {
//                if (dir1[i] == dir2[j]){
//                    for (int k = 0; i+k < dir1.length && j+k < dir2.length && dir1[i] == dir2[j];k++) {
//                        count++;
//                        System.out.println(dir1[i] + " " + "count=" + count);
//                    }
//                }
//
//            }
//            finalCount = Math.max(finalCount, count);
//        }
//
//        System.out.println("finalCount=" + finalCount);
//        returnCount = word1.length() - finalCount;
//        System.out.println("returnCount=" + returnCount);

        String word1 = "horse";
        String word2 = "ros";
        System.out.println("将 " + word1 + " 转换成 " + word2 + " 的最少操作数是: " + minDistance(word1, word2));


    }
}
=======
package org.example.Test20241204;

public class Test3DP {
    // 題目號72 編輯距離
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // 创建一个 (m+1) x (n+1) 的二维数组，并初始化为0
        int[][] dp = new int[m + 1][n + 1];

        // 初始化dp数组
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // 将word1的前i个字符转换成空字符串需要i次删除操作
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // 将空字符串转换成word2的前j个字符需要j次插入操作
        }

        // 填充dp数组
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // 字符相同，不需要操作，继承之前的操作数
                } else {
                    // 取插入、删除、替换三种操作中的最小值，并加1
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],    // 删除word1的第i个字符
                            Math.min(dp[i][j - 1], // 插入到word1的第i个位置
                                    dp[i - 1][j - 1])); // 替换word1的第i个字符
                }
            }
        }

        // 返回将word1转换成word2所需的最少操作数
        return dp[m][n];
    }

    public static void main(String[] args) {
//        String word1 = "intention";
//        String word2 = "execution";
//        int finalCount = 0;
//        int returnCount = 0;
//
//
//        char[] dir1 = word1.toCharArray();
//        char[] dir2 = word2.toCharArray();
////        int count = 0;
//        for (int i = 0; i < dir1.length; i++) {
//            int count = 0;
//            for (int j = 0; j < dir2.length; j++) {
//                if (dir1[i] == dir2[j]){
//                    for (int k = 0; i+k < dir1.length && j+k < dir2.length && dir1[i] == dir2[j];k++) {
//                        count++;
//                        System.out.println(dir1[i] + " " + "count=" + count);
//                    }
//                }
//
//            }
//            finalCount = Math.max(finalCount, count);
//        }
//
//        System.out.println("finalCount=" + finalCount);
//        returnCount = word1.length() - finalCount;
//        System.out.println("returnCount=" + returnCount);

        String word1 = "horse";
        String word2 = "ros";
        System.out.println("将 " + word1 + " 转换成 " + word2 + " 的最少操作数是: " + minDistance(word1, word2));


    }
}
>>>>>>> 0dc6ebe (“Java”)
