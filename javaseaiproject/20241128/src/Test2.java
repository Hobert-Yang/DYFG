// 題目號2.兩數相加
public class Test2 {

// 定义链表节点类
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
        this.val = val;
        this.next = null;
        }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }
}
    // 定义链表类
    static class LinkedList {
        public LinkedList() {
        }

        public LinkedList(ListNode head) {
            this.head = head;
        }

        ListNode head;

        public void add(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                ListNode currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }

        // 将链表转换为数组的方法
        public int[] toArray() {
            // 使用一个ArrayList来动态存储链表的值，然后转换为数组
            java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
            ListNode currentNode = head;
            while (currentNode != null) {
                list.add(currentNode.val);
                currentNode = currentNode.next;
            }

            // 将ArrayList转换为数组
            int[] array = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }

            return array;
        }

        public static ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            ListNode next = null;

            while (current != null) {
                next = current.next; // 保存當前節點的下一個節點
                current.next = prev; // 將當前節點的next指向前一個節點
                prev = current;      // 前一個節點移到當前節點
                current = next;      // 當前節點移到下一個節點
            }

            return prev; // prev會是新頭節點
        }

        // 打印链表的方法
        public void traverse() {
            ListNode currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.val);
                currentNode = currentNode.next;
            }
        }
    }

    public static int convertToMultiDigitInteger(int[] digits) {
        int result = 0;
        int multiplier = 1; // 这个乘数将用于将每个数字放在正确的位置上

        // 从数组的最后一个元素开始，因为它是最低位
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i] * multiplier;
            multiplier *= 10; // 每次迭代都将乘数乘以10，以移动到下一个更高的位置
        }

        return result;
    }

    // 将整数转换为数组的方法
    public static int[] convertToDigitsArray(int number) {
        // 将整数转换为字符串
        String numberString = Integer.toString(number);
        // 根据字符串的长度创建一个整数数组
        int[] digits = new int[numberString.length()];

        // 遍历字符串，将每个字符转换为整数并存储到数组中
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        // 注意：如果原整数是负数，上面的代码只会处理其绝对值。
        // 如果你想要保留负号，可以在数组的第一个元素之前或之后做特殊处理。
        // 但在这个例子中，我们假设输入是非负的。

        return digits;
    }






    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();
        ListNode l4;


        // 向链表中添加元素
        l1.add(3);
        l1.add(4);
        l1.add(2);


        l2.add(4);
        l2.add(6);
        l2.add(5);


        // 将链表转换为数组
        int[] array1 = l1.toArray();
        int[] array2 = l2.toArray();

        // 數組轉換為一個整數
        int nums1 = convertToMultiDigitInteger(array1);
        int nums2 = convertToMultiDigitInteger(array2);

        // 進行相加
        int num3 = nums1 + nums2;

        // 相加結果轉為String
        String s = String.valueOf(num3);

        System.out.println(s);
        // 將結果重新放回鏈錶
        int[] finalNums = convertToDigitsArray(num3);
        for (int i = 0; i < finalNums.length; i++) {
            l3.add(finalNums[i]);
        }

        l4 = l3.reverseList(l3.head);

        while (l4 != null) {
            System.out.println(l4.val);
            l4 = l4.next;
        }

    }
}
