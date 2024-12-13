package org.example.Test20241213;

public class Test1 {
    public static void main(String[] args) {

        int n = 11;
        int count = 0;

        // 逐位检查整数 n 的二进制表示
        while (n != 0) {
            // 检查最低位是否为 1
            if ((n & 1) == 1) {
                count++;
            }
            // 右移一位
            n >>= 1;
        }

        System.out.println(count);
    }
}
