package org.example.Test20241201;

// 題目號58，最後一個單詞的長度
public class Test2 {
    public static void main(String[] args) {

        String str = "   fly me   to   the moon  ";
        char[] strList = str.toCharArray();
        int count = 0;
        boolean world = false;

        for (int i = 0; i < strList.length; i++) {
            if (strList[i] != ' ') {
                // 找到最後一個單詞的位置，中間再次有空格則清空count
                if (world == false) {
                    count = 0;
                }
                world = true;
                count++;
            }else {
                world = false;
            }
        }

        System.out.println(count);
    }
}
