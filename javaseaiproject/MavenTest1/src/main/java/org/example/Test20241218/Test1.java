package org.example.Test20241218;

// 題目號1046 最後一塊石頭的重量
public class Test1 {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // 外層循環控制遍歷的次數
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 內層循環進行相鄰元素的比較和交換
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    // 交換相鄰元素
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    // 設置標記表示已經發生交換
                    swapped = true;
                }
            }

            // 如果內層循環沒有進行交換，說明數組已經有序，提前退出
            if (!swapped) {
                break;
            }
        }
    }

    public static int sum(int n1,int n2) {
        if (n1 > n2) {
            return n1 - n2;
        }else {
            return n2 - n1;
        }
    }

    public static int forSum(int[] n1) {

        if(n1.length == 1){
            return n1[0];
        }

        int newSum[] = new int[n1.length - 1];

        // 粉碎石頭
        if (n1[0] > n1[1]) {
            newSum[0] = n1[0] - n1[1];
        }else {
            newSum[0] = n1[1] - n1[0];
        }

        for (int i = 1; i < newSum.length; i++) {
            newSum[i] = n1[i+1];
        }
        // 將剩餘的最大塊石頭放在最上面
        bubbleSort(newSum);

        for (int i = newSum.length - 1; i >= 0; i--) {
            System.out.print(newSum[i]);
        }
        System.out.println();

        // 遞歸，如果非最後兩個比，非0或1則繼續
        if (newSum[0] == 0 | newSum[0] == 1) {
            return (newSum[0]);
        }
            return forSum(newSum);
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        int finalNum = forSum(stones);
        System.out.println(finalNum);

    }
}
