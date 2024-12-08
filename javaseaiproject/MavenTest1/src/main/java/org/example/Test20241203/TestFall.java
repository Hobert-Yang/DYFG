package org.example.Test20241203;

import java.util.ArrayList;

// 題目號30，串聯所有單詞的字串，卡在將不確定個數的數組，其中每個數字取出，然後ckeck公差數相同。
public class TestFall {

    public static ArrayList bubbleSort(String source, String dest) {
        char[] char1 = source.toCharArray();
        char[] char2 = dest.toCharArray();
        ArrayList list = new ArrayList();
        int point = 0;
        boolean flag = false;

        for (int i = 0; i < char1.length - 1; i++) {
            if (char1[i] == char2[0]) {
                point = i;
                for (int j = 0; j < char2.length - 1; j++) {
                    if (char1[i+j] == char2[j]) {
                        flag = true;
                    }else {
                        flag = false;
                    }
                }
                if (flag) {
                    list.add(point);
                }
            }
        }
        return list;
    }

    public static void findArithmeticSequences(int[][] arrays, int currentIndex, int[] sequence, int difference) {
        if (currentIndex == arrays.length) {
            // 如果已經遍歷了所有數組，則檢查當前序列是否為等差數列
            if (isArithmeticSequence(sequence)) {
                System.out.println("Found arithmetic sequence: " + java.util.Arrays.toString(sequence));
            }
            return;
        }

        for (int i = 0; i < arrays[currentIndex].length; i++) {
            // 如果不是第一個數組，則需要檢查當前數字與前一個數字之間的差值是否相等
            if (currentIndex > 0 && sequence[currentIndex - 1] - arrays[currentIndex][i] != difference) {
                continue; // 差值不相等，則跳過當前循環
            }

            sequence[currentIndex] = arrays[currentIndex][i]; // 將當前數字添加到序列中

            // 遞歸調用下一個數組
            findArithmeticSequences(arrays, currentIndex + 1, sequence, sequence[currentIndex] - sequence[currentIndex - 1]);
        }
    }

    private static boolean isArithmeticSequence(int[] sequence) {
        // 因為我們在遞歸過程中已經確保了每相鄰兩個數字之間的差值相等，
        // 所以這裡只需要檢查序列長度是否大於等於2即可（一個數字無法構成等差數列）
        return sequence.length >= 2;
        // 如果需要更嚴格的檢查，可以取消以下注釋並使用以下代碼：
        /*
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] - sequence[i - 1] != sequence[1] - sequence[0]) {
                return false;
            }
        }
        return true;
        */
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        String[] words = {"foo","bar","the"};
        String s = "barfoofoobarthefoobarman";
        String s2 = "00000";
        int finalnums [][];

        int index = s.indexOf(words[0]);
        int lengthWords = words[0].length();
        int lengthSingleWord = words.length;
        int lengthS = s.length();

        System.out.println("lengthWords=" + lengthWords);
        System.out.println("lengthSingleWord=" + lengthSingleWord);
        System.out.println("lengthS=" + lengthS);

        for (int i = 0; i < words.length; i++) {
            list.add(bubbleSort(s, words[i]));
        }
//        list.add(bubbleSort(s, words[0]));
//        list.add(bubbleSort(s, words[1]));
//        list = bubbleSort(s, words[0]);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


//        while(index != -1){
//            System.out.println(index);
//        }

//        System.out.println(index);
    }
}