package org.example.Test20241206;

public class Test3 {

    // 計算第N個泰波那契數的遞歸方法
    public static long tribonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return tribonacciRecursive(n - 1) + tribonacciRecursive(n - 2) + tribonacciRecursive(n - 3);
        }
    }

    // 計算第N個泰波那契數的迭代方法
    public static long tribonacciIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        long t0 = 0, t1 = 1, t2 = 1, tn = 0;
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }

        return tn;
    }

    public static void main(String[] args) {

        int N = 25; // 你可以更改這個值來計算不同的N
        System.out.println("第" + N + "個泰波那契數（遞歸方法）: " + tribonacciRecursive(N));
        System.out.println("第" + N + "個泰波那契數（迭代方法）: " + tribonacciIterative(N));

    }
}
