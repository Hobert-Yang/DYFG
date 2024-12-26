package org.example.Test20241226;

// 題目號744 尋找比目標字母大的最小字母
public class Test1 {

    public static char findNextGreaterChar(char[] letters, char target) {
        // 遍历字符数组
        for (char letter : letters) {
            // 如果当前字符大于目标字符
            if (letter > target) {
                // 返回当前字符
                return letter;
            }
        }
        // 如果遍历完数组没有找到大于目标字符的字符，则返回数组的第一个字符
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'h', 'j'};
        char target = 'd';
        char result = findNextGreaterChar(letters, target);
        System.out.println("Result: " + result);  // 输出: f

        target = 'j';
        result = findNextGreaterChar(letters, target);
        System.out.println("Result: " + result);  // 输出: a

        target = 'a';
        result = findNextGreaterChar(letters, target);
        System.out.println("Result: " + result);  // 输出: c

    }
}
