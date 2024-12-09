package org.example.Test20241204;

// 題目號 64 最小路徑和
public class Test1DP {

    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        // 创建一个二维数组 dp 来存储最小路径和
        int[][] dp = new int[m][n];

        // 初始化 dp 数组
        dp[0][0] = grid[0][0];

        // 初始化第一行
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // 初始化第一列
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // 填充 dp 数组
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // 返回右下角的最小路径和
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {

        Test1DP solution = new Test1DP();
        int[][] grid = {
                {1, 3, 4},
                {1, 5, 2},
                {8, 2, 1}
        };
        System.out.println("Minimum Path Sum: " + solution.minPathSum(grid));  // 输出 7
    }



}