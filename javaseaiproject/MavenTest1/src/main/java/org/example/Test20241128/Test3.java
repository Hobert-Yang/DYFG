<<<<<<< HEAD
package org.example.Test20241128;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 題目號13.羅馬數字轉整數
public class Test3 {
    public static void main(String[] args) {
        int romanToInt = 0;
        String str = "MCMXCIV";
        String[] stringArray = new String[str.length()];

        // 編寫一個正則表達式，用於匹配任意單個字符（包括Unicode字符）
        String regex = "(.)";

        // 編譯正則表達式並創建一個Pattern對象
        Pattern pattern = Pattern.compile(regex);

        // 使用Pattern對象的matcher()方法來處理字符串
        Matcher matcher = pattern.matcher(str);

        int index = 0;
        // 迭代查找所有匹配項，並將它們轉換為String存入數組
        while (matcher.find()) {
            stringArray[index++] = matcher.group();
        }

        // 打印結果數組
        for (String s : stringArray) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals("M")){
                if (i > 0 && stringArray[i - 1].equals("C")){
                    romanToInt = romanToInt + 800;
                }else {
                    romanToInt = romanToInt + 1000;
                }
            }
            if(stringArray[i].equals("D")){
                if (i > 0 && stringArray[i - 1].equals("C")){
                    romanToInt = romanToInt + 300;
                }else {
                    romanToInt = romanToInt + 500;
                }
            }
            if(stringArray[i].equals("C")){
                if (i > 0 && stringArray[i - 1].equals("X")){
                    romanToInt = romanToInt + 80;
                }else {
                    romanToInt = romanToInt + 100;
                }
            }
            if(stringArray[i].equals("L")){
                if (i > 0 && stringArray[i - 1].equals("X")){
                    romanToInt = romanToInt + 30;
                }else {
                    romanToInt = romanToInt + 50;
                }
            }
            if(stringArray[i].equals("X")){
                if (i > 0 && stringArray[i - 1].equals("I")){
                    romanToInt = romanToInt + 8;
                }else {
                    romanToInt = romanToInt + 10;
                }
            }
            if(stringArray[i].equals("V")){
                if (i > 0 && stringArray[i - 1].equals("I")){
                    romanToInt = romanToInt + 3;
                }else {
                    romanToInt = romanToInt + 5;
                }
            }
            if(stringArray[i].equals("I")){
                romanToInt = romanToInt + 1;
            }
        }

        System.out.println(romanToInt);
    }
}
=======
package org.example.Test20241128;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 題目號13.羅馬數字轉整數
public class Test3 {
    public static void main(String[] args) {
        int romanToInt = 0;
        String str = "MCMXCIV";
        String[] stringArray = new String[str.length()];

        // 編寫一個正則表達式，用於匹配任意單個字符（包括Unicode字符）
        String regex = "(.)";

        // 編譯正則表達式並創建一個Pattern對象
        Pattern pattern = Pattern.compile(regex);

        // 使用Pattern對象的matcher()方法來處理字符串
        Matcher matcher = pattern.matcher(str);

        int index = 0;
        // 迭代查找所有匹配項，並將它們轉換為String存入數組
        while (matcher.find()) {
            stringArray[index++] = matcher.group();
        }

        // 打印結果數組
        for (String s : stringArray) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals("M")){
                if (i > 0 && stringArray[i - 1].equals("C")){
                    romanToInt = romanToInt + 800;
                }else {
                    romanToInt = romanToInt + 1000;
                }
            }
            if(stringArray[i].equals("D")){
                if (i > 0 && stringArray[i - 1].equals("C")){
                    romanToInt = romanToInt + 300;
                }else {
                    romanToInt = romanToInt + 500;
                }
            }
            if(stringArray[i].equals("C")){
                if (i > 0 && stringArray[i - 1].equals("X")){
                    romanToInt = romanToInt + 80;
                }else {
                    romanToInt = romanToInt + 100;
                }
            }
            if(stringArray[i].equals("L")){
                if (i > 0 && stringArray[i - 1].equals("X")){
                    romanToInt = romanToInt + 30;
                }else {
                    romanToInt = romanToInt + 50;
                }
            }
            if(stringArray[i].equals("X")){
                if (i > 0 && stringArray[i - 1].equals("I")){
                    romanToInt = romanToInt + 8;
                }else {
                    romanToInt = romanToInt + 10;
                }
            }
            if(stringArray[i].equals("V")){
                if (i > 0 && stringArray[i - 1].equals("I")){
                    romanToInt = romanToInt + 3;
                }else {
                    romanToInt = romanToInt + 5;
                }
            }
            if(stringArray[i].equals("I")){
                romanToInt = romanToInt + 1;
            }
        }

        System.out.println(romanToInt);
    }
}
>>>>>>> 0dc6ebe (“Java”)
