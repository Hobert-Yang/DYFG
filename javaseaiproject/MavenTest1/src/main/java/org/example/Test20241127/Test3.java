package org.example.Test20241127;

public class Test3 {
    // 題目號：9 回文数
    public static void main(String[] args) {

        int x = 121;
        String s = String.valueOf(x);
        boolean flag = true;
        char[] charArray = s.toCharArray();

        // i为第几个字母
        for (int i = 1; i < charArray.length; i++) {
            int j = charArray.length - i;
                System.out.print("i=" + i);
                System.out.print("j=" + j);
                // 这里的等于是用于偶数位情况的检查
                if ((i >= j) && charArray[i-1] != charArray[j]) {
                    flag = false;
            }
        }
        System.out.println(flag);
    }
}
