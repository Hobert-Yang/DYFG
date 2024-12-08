package org.example.Test20241126;

public class Test20241126 {

    static class ListNode {
        int value;
        ListNode next;
        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA; // 如果不为空，则两个链表相交，并返回相交点
    }
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
//*********************************************************************************************************
//  從這裡開始第二題，題目號2980.檢查安位或是否存在尾隨0,因當前還未找到github上傳文件夾的方法

        int[] N2 = {5, 1, 2, 3, 4, 6};

        int Wk2 = 0;
        boolean Check2 = false;

        // 檢查是奇數或偶數
        for (int i = 0; i < N2.length; i++){
            int Wk1 = N2[i] % 2;

            if(Wk1 == 0){
                Wk2 = Wk2 + 1;
            }

            // 若有兩個及以上偶數，則返回true
            if (Wk2 > 1){
                Check2 = true;
            }else {
                Check2 = false;
            }
        }
        System.out.println(Check2);
//*********************************************************************************************************
//  從這裡開始第三題，題目160，相交鏈錶,因當前還未找到github上傳文件夾的方法

        // 创建链表A: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode node3 = new ListNode(3);
        headA.next.next = node3;

        // 创建链表B: 4 -> 5 -> 2 (与链表A在节点2相交)
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = node3; // 让链表B与链表A在节点2相交

        Test20241126 intersection = new Test20241126();
        ListNode intersectionNode = intersection.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("两个链表相交于节点: " + intersectionNode.value);
        } else {
            System.out.println("两个链表不相交");
        }
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
