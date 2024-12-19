package org.example.Test20241219;

public class Test1 {



//    public static void bubbleSort(int[] array) {
//        int n = array.length;
//        boolean swapped;
//
//        // 外層循環控制遍歷的次數
//        for (int i = 0; i < n - 1; i++) {
//            swapped = false;
//
//            // 內層循環進行相鄰元素的比較和交換
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (array[j] < array[j + 1]) {
//                    // 交換相鄰元素
//                    int temp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//
//                    // 設置標記表示已經發生交換
//                    swapped = true;
//                }
//            }
//
//            // 如果內層循環沒有進行交換，說明數組已經有序，提前退出
//            if (!swapped) {
//                break;
//            }
//        }
//    }

//    public static int[] removeDuplicates(int[] s) {
//        // 基本情况：如果字符串为空或只有一个字符，则直接返回
//        if (s == null) {
//            return s;
//        }
//
//        int[] check;
//
//        // 递归情况：比较第一个和第二个字符
//        int first = s[0];
//        int second = s[1];
//
//        // 如果第一个和第二个字符相同，则递归调用时跳过第二个字符
//        if (first == second) {
//            check = new int[s.length - 2];
//            for (int i = 0; i < s.length - 2; i++) {
//                check[i] = s[i+2];
//            }
//            return removeDuplicates(check);
//        } else {
//            a.add(s[0]);
//            check = new int[s.length - 1];
//            for (int i = 0; i < s.length - 1; i++) {
//                check[i] = s[i+1];
//            }
//            // 如果不同，则保留第一个字符，并对剩余字符串进行递归调用
//            return removeDuplicates(check);
//        }
//    }

    // 題目號 1047 刪除字符串中所有的相鄰重複項
    public static void main(String[] args) {
        String S = "azxxzy";

//        public String removeDuplicates(String S) {
            char[] s = S.toCharArray();
            int top = -1;
            for (int i = 0; i < S.length(); i++) {
                if (top == -1 || s[top] != s[i]) {
                    s[++top] = s[i];
                } else {
                    top--;
                }
            }
            System.out.println(String.valueOf(s, 0, top + 1));

//        }

//        String s = "azxxzy";
////        String s = "abbaca";
//
//        char[] ch1 = s.toCharArray();
//
//        int[] nums = new int[ch1.length];
//        int[] nums2 = new int[ch1.length];
//
//        for (int i = 0; i < ch1.length; i++) {
//            nums[i] = (int) ch1[i];
//        }
//
//        for (int i = 0; i < ch1.length; i++) {
//            bubbleSort(nums);
//        }
//
//        for (int i = 0; i < ch1.length; i++) {
//            System.out.print(nums[i]);
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < ch1.length - 1; i++) {
//            while (i < ch1.length - 1 && nums[i] != nums[i+1]) {
//                nums2[i] = nums[i];
//                System.out.println("寫出i" + i);
//                i++;
//            }
//            System.out.println("i=" + i);
//            if (i < ch1.length - 1) {
//                if (nums[i] == nums[i+1]) {
//                    int count = 0;
//                    while (i + count + 1 < ch1.length && nums[i] == nums[i+1+count]) {
//                        count++;
//                    }
//                    if (count % 2 != 1) {
//                        nums2[i] = nums[i];
////                        i = i + count;
//                    }
//                }
//            }
//            if (i == ch1.length - 1) {
//                if (nums[i] != nums[i - 1]) {
//                    nums2[i] = nums[i];
//                }
//
//            }
//            i = i + 1;
//
////            if (i == ch1.length && nums[i] != nums[i - 1]) {
////                nums2[i] = nums[i];
////            }
//        }
//
//        ArrayList<Character> a = new ArrayList();
//
//        for (int i = 0; i < nums2.length; i++) {
//            if (nums2[i] != 0) {
//                a.add((char)nums2[i]);
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (char c : a) {
//            sb.append(c);
//        }
//        String result = sb.toString();
//
//        System.out.println(result);

    }
}
