package org.example.Test20241223;

import java.util.function.Function;

// 題目號 709 轉換成小寫字母
public class Test1 {

    public static String change(String s, Function<String, String> f) {
        String ss = f.apply(s);
        return ss;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = change(s,(String str)->{
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'A') {
                    chars[i] = 'a';
                }
                if (chars[i] == 'B') {
                    chars[i] = 'b';
                }
                if (chars[i] == 'C') {
                    chars[i] = 'c';
                }
                if (chars[i] == 'D') {
                    chars[i] = 'd';
                }
                if (chars[i] == 'E') {
                    chars[i] = 'e';
                }
                if (chars[i] == 'F') {
                    chars[i] = 'f';
                }
                if (chars[i] == 'G') {
                    chars[i] = 'g';
                }
                if (chars[i] == 'H') {
                    chars[i] = 'h';
                }
                if (chars[i] == 'I') {
                    chars[i] = 'i';
                }
                if (chars[i] == 'J') {
                    chars[i] = 'j';
                }
                if (chars[i] == 'K') {
                    chars[i] = 'k';
                }
                if (chars[i] == 'L') {
                    chars[i] = 'l';
                }
                if (chars[i] == 'M') {
                    chars[i] = 'm';
                }
                if (chars[i] == 'N') {
                    chars[i] = 'n';
                }
                if (chars[i] == 'O') {
                    chars[i] = 'o';
                }
                if (chars[i] == 'P') {
                    chars[i] = 'p';
                }
                if (chars[i] == 'Q') {
                    chars[i] = 'q';
                }
                if (chars[i] == 'R') {
                    chars[i] = 'r';
                }
                if (chars[i] == 'S') {
                    chars[i] = 's';
                }
                if (chars[i] == 'T') {
                    chars[i] = 't';
                }
                if (chars[i] == 'U') {
                    chars[i] = 'u';
                }
                if (chars[i] == 'V') {
                    chars[i] = 'v';
                }
                if (chars[i] == 'W') {
                    chars[i] = 'w';
                }
                if (chars[i] == 'X') {
                    chars[i] = 'x';
                }
                if (chars[i] == 'Y') {
                    chars[i] = 'y';
                }
                if (chars[i] == 'Z') {
                    chars[i] = 'z';
                }
            }
            String s3 = new String(chars);

            return s3;
        });

        System.out.println(s2);
    }
}
