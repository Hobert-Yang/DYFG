<<<<<<< HEAD
package org.example.Test20241202;

import java.util.ArrayList;
import java.util.List;

// 題目號2363.合併相似的物品
public class Test3 {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        // 外層循環控制遍歷的次數
        for (int i = 0; i < n - 1; i++) {
            // 設置一個標誌位，用於優化，如果在某一趟排序中沒有發生交換，則說明數組已經有序
            boolean swapped = false;
            // 內層循環進行元素的比較和交換
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 交換array[j]和array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 設置標誌位為true，表示發生了交換
                    swapped = true;
                }
            }
            // 如果內層循環沒有發生交換，則說明數組已經有序，提前退出
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortRows(int[][] array) {

        int n = array.length; // 假设所有行的列数相同
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j][0] > array[j + 1][0]) {
                    int temp = array[j][0];
                    array[j][0] = array[j + 1][0];
                    array[j + 1][0] = temp;

                    int temp2 = array[j][1];
                    array[j][1] = array[j + 1][1];
                    array[j + 1][1] = temp2;
                    swapped = true;
                }
//                swapped = false;
//                for (int k = 0; k < cols - 1 - j; k++) {
//                    if (array[i][k] > array[i][k + 1]) {
//                        // 交换array[i][k]和array[i][k+1]
//                        int temp = array[i][k];
//                        array[i][k] = array[i][k + 1];
//                        array[i][k + 1] = temp;
//                        swapped = true;
//                    }
//                }
                // 如果没有发生交换，说明这一行已经有序，可以提前退出内层循环
//                if (!swapped) {
//                    break;
//                }
            }
            if (!swapped) {
                    break;
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        int[][] items1 = {{1,1},{4,5},{3,8},{5,5}};
////        int[][] items2 = {{3,1},{1,5},{2,4}};
          int[][] items1 = {{1,3},{2,2}};
          int[][] items2 = {{7,1},{2,2},{1,4}};

        int baseJ = 0;
        bubbleSortRows(items1);
        bubbleSortRows(items2);
        // 最終數組的第一位角標
        int count = 0;
        // 最終數組的第二位數字
        int num = 0;
        print2DArray(items1);
        print2DArray(items2);
        System.out.println("===================================");

        int[][] finalItems = new int[(items1.length + items2.length)][2];

        System.out.println("items1.length + items2.length=" + (items1.length + items2.length));

        // 下面這段寫的有點亂，大致意思為寫了一個之後用baseJ控制不要將內循環的items2再寫一次。其餘length控制輸出個數
        for (int i = 0; i < items1.length; i++) {
            if(baseJ < items2.length & i < items1.length){
                for (int j = baseJ;i < items1.length && j < items2.length && (items1[i][0] <= items2[items2.length-1][0]); j++) {
                    System.out.println("i="+ i);
                    System.out.println("j="+ j);

                    if(items1[i][0] > items2[j][0]){
                        System.out.println("輸出j="+j);
                        finalItems[count][0] = items2[j][0];
                        finalItems[count][1] = items2[j][1];
                        count++;
                        baseJ++;
                    }


                    // item1與item2碰上的情況
                    if (items1[i][0] == items2[j][0]) {
                        System.out.println("入NUM," + "i=" + i + ",j=" + j);
                        num = (items1[i][1] + items2[j][1]);
                        finalItems[count][0] = items1[i][0];
                        finalItems[count][1] = num;
                        count++;
                        i++;
                        baseJ++;
                    }
                }
            }


            if(i < items1.length && items1[i][0] > items2[items2.length-1][0]){
                System.out.println("輸出i="+i);
                finalItems[count][0] = items1[i][0];
                finalItems[count][1] = items1[i][1];
                count++;
            }

            while (baseJ < items2.length){
                finalItems[count][0] = items2[baseJ][0];
                finalItems[count][1] = items2[baseJ][1];
                count++;
                baseJ++;
            }
        }
        System.out.println(count);

        List<List<Integer>> listOfLists = new ArrayList<>();

        // 使用 for 循环遍历二维数组的每一行
        for (int i = 0; i < count; i++) {
            // 为当前行创建一个新的 ArrayList<Integer>
            List<Integer> listRow = new ArrayList<>();

            // 遍历当前行的每一个元素，并将其添加到 listRow 中
            for (int j = 0; j < finalItems[i].length; j++) {
                listRow.add(finalItems[i][j]);
            }

            // 将 listRow 添加到 listOfLists 中
            listOfLists.add(listRow);
        }
        print2DArray(finalItems);

    }
}
=======
package org.example.Test20241202;

import java.util.ArrayList;
import java.util.List;

// 題目號2363.合併相似的物品
public class Test3 {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        // 外層循環控制遍歷的次數
        for (int i = 0; i < n - 1; i++) {
            // 設置一個標誌位，用於優化，如果在某一趟排序中沒有發生交換，則說明數組已經有序
            boolean swapped = false;
            // 內層循環進行元素的比較和交換
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 交換array[j]和array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // 設置標誌位為true，表示發生了交換
                    swapped = true;
                }
            }
            // 如果內層循環沒有發生交換，則說明數組已經有序，提前退出
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortRows(int[][] array) {

        int n = array.length; // 假设所有行的列数相同
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j][0] > array[j + 1][0]) {
                    int temp = array[j][0];
                    array[j][0] = array[j + 1][0];
                    array[j + 1][0] = temp;

                    int temp2 = array[j][1];
                    array[j][1] = array[j + 1][1];
                    array[j + 1][1] = temp2;
                    swapped = true;
                }
//                swapped = false;
//                for (int k = 0; k < cols - 1 - j; k++) {
//                    if (array[i][k] > array[i][k + 1]) {
//                        // 交换array[i][k]和array[i][k+1]
//                        int temp = array[i][k];
//                        array[i][k] = array[i][k + 1];
//                        array[i][k + 1] = temp;
//                        swapped = true;
//                    }
//                }
                // 如果没有发生交换，说明这一行已经有序，可以提前退出内层循环
//                if (!swapped) {
//                    break;
//                }
            }
            if (!swapped) {
                    break;
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        int[][] items1 = {{1,1},{4,5},{3,8},{5,5}};
////        int[][] items2 = {{3,1},{1,5},{2,4}};
          int[][] items1 = {{1,3},{2,2}};
          int[][] items2 = {{7,1},{2,2},{1,4}};

        int baseJ = 0;
        bubbleSortRows(items1);
        bubbleSortRows(items2);
        // 最終數組的第一位角標
        int count = 0;
        // 最終數組的第二位數字
        int num = 0;
        print2DArray(items1);
        print2DArray(items2);
        System.out.println("===================================");

        int[][] finalItems = new int[(items1.length + items2.length)][2];

        System.out.println("items1.length + items2.length=" + (items1.length + items2.length));

        // 下面這段寫的有點亂，大致意思為寫了一個之後用baseJ控制不要將內循環的items2再寫一次。其餘length控制輸出個數
        for (int i = 0; i < items1.length; i++) {
            if(baseJ < items2.length & i < items1.length){
                for (int j = baseJ;i < items1.length && j < items2.length && (items1[i][0] <= items2[items2.length-1][0]); j++) {
                    System.out.println("i="+ i);
                    System.out.println("j="+ j);

                    if(items1[i][0] > items2[j][0]){
                        System.out.println("輸出j="+j);
                        finalItems[count][0] = items2[j][0];
                        finalItems[count][1] = items2[j][1];
                        count++;
                        baseJ++;
                    }


                    // item1與item2碰上的情況
                    if (items1[i][0] == items2[j][0]) {
                        System.out.println("入NUM," + "i=" + i + ",j=" + j);
                        num = (items1[i][1] + items2[j][1]);
                        finalItems[count][0] = items1[i][0];
                        finalItems[count][1] = num;
                        count++;
                        i++;
                        baseJ++;
                    }
                }
            }


            if(i < items1.length && items1[i][0] > items2[items2.length-1][0]){
                System.out.println("輸出i="+i);
                finalItems[count][0] = items1[i][0];
                finalItems[count][1] = items1[i][1];
                count++;
            }

            while (baseJ < items2.length){
                finalItems[count][0] = items2[baseJ][0];
                finalItems[count][1] = items2[baseJ][1];
                count++;
                baseJ++;
            }
        }
        System.out.println(count);

        List<List<Integer>> listOfLists = new ArrayList<>();

        // 使用 for 循环遍历二维数组的每一行
        for (int i = 0; i < count; i++) {
            // 为当前行创建一个新的 ArrayList<Integer>
            List<Integer> listRow = new ArrayList<>();

            // 遍历当前行的每一个元素，并将其添加到 listRow 中
            for (int j = 0; j < finalItems[i].length; j++) {
                listRow.add(finalItems[i][j]);
            }

            // 将 listRow 添加到 listOfLists 中
            listOfLists.add(listRow);
        }
        print2DArray(finalItems);

    }
}
>>>>>>> 0dc6ebe (“Java”)
