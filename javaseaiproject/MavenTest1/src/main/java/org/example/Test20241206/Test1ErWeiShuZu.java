package org.example.Test20241206;

import java.util.ArrayList;

// 題目號1122 數組的相對排序
public class Test1ErWeiShuZu {



    // 冒泡排序算法
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // 外層循環控制遍歷的次數
        for (int i = 0; i < n - 1; i++) {
            // 內層循環進行鄰近元素的比較和交換
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前面的元素比後面的元素大，就交換它們
                if (array[j] > array[j + 1]) {
                    // 交換array[j]和array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


        public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        int[] arr3 = arr1;
        int[] arr4 = arr2;

        // 第一位記錄是哪個數，第二位記錄有多少個
        int[][] arr5 = new int[arr4.length][2];

        ArrayList<Integer> arr3List = new ArrayList<Integer>();
        ArrayList<Integer> arr4List = new ArrayList<Integer>();

        // 形成二維數組，記錄arr2的數據在arr1中有多少個

        for (int a = 0; a < arr4.length; a++){
            int count = 0;
            for (int k = 0; k < arr3.length; k++){
                if (arr3[k] == arr4[a]){
                    count++;
                }
            }
            arr5[a][0] = arr4[a];
            arr5[a][1] = count;
        }

        // 將arr2中有的數字放進arr3List，同時記錄count數量，按arr2的排序
            for (int i = 0; i < arr5.length; i++) {
                for (int j = 0; j < arr5[i][1]; j++) {
                    arr3List.add(arr5[i][0]);
                }
            }

            // 將arr2中沒有的數字放入arr4List中
            for (int a = 0; a < arr1.length; a++){
                boolean canWriteNoEqual = true;
                for (int k = 0; k < arr2.length; k++){
                    if (arr1[a] == arr2[k]){
                        canWriteNoEqual = false;
                    }
                }
                if (canWriteNoEqual){
                    arr4List.add(arr1[a]);
                }
            }

            // 拼接arrList4到arrList3的結尾
        int[] intArray1 = arr3List.stream().mapToInt(Integer::intValue).toArray();
        int[] intArray2 = arr4List.stream().mapToInt(Integer::intValue).toArray();

            bubbleSort(intArray2);

            // 創建一個新的數組，其大小是兩個原始數組大小之和
            int[] combinedArray = new int[intArray1.length + intArray2.length];

            // 將第一個數組的元素復製到新數組中
            System.arraycopy(intArray1, 0, combinedArray, 0, intArray1.length);

            // 將第二個數組的元素復製到新數組中，從第一個數組之後的位置開始
            System.arraycopy(intArray2, 0, combinedArray, intArray1.length, intArray2.length);

            // 輸出拼接後的數組
            for (int i : combinedArray) {
                System.out.print(i + " ");
            }
    }
}