package org.example.Test20241126;

public class Test1 {

    // 第一題，題目號2974.最小數字遊戲
    public static void main(String[] args) {

        int[] N1 = {5, 4, 2, 3};

        int[] Charge = new int[N1.length];
        bubbleSort(N1);

        for (int i = 0; i < N1.length; i++){

            // 獲取當前數字為數組中奇數或偶數個
            int Wk1 = (i + 1) % 2;

            // 第偶數個的數字，向前進一位
            if (Wk1 == 0 & i > 0){
                Charge[i - 1] = N1[i];
            }else{
                // 第一位數向後退一位
                if (i == 0){
                    Charge[i + 1] = N1[i];
                }else {
                    // 第奇數個的數字，向後退一位
                    if(i + 1 < N1.length){
                        Charge[i + 1] = N1[i];
                    }
                }
            }
        }
        printArray(Charge);
    }

    // 此後面為從AI獲取的冒泡代碼

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // 外層循環控制遍歷次數
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 內層循環進行比較和交換
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 交換元素
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // 標記為已交換
                    swapped = true;
                }
            }

            // 如果內層循環沒有進行交換，說明數組已經有序，可以提前退出
            if (!swapped) {
                break;
            }
        }
    }

    // 打印數組
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
