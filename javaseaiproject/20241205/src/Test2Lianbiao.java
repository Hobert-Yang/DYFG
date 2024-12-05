import java.util.Iterator;
import java.util.NoSuchElementException;

// 題目號83 刪除排序列表中的重複元素
public class Test2Lianbiao {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 自定义迭代器类
    static class ListIterator implements Iterator<Integer> {
        private ListNode current;

        public ListIterator(ListNode head) {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int val = current.val;
            current = current.next;
            return val;
        }

        // 工具方法：打印链表
        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // 工具方法：刪除鏈錶重複
    public static ListNode deleteList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next != null && (current.val == current.next.val)) {
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {

        // 创建两个已排序链表
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(2);

        // 合并链表
        ListNode l2 = deleteList(l1);

        // 打印合并后的链表
        ListIterator.printList(l2);

    }
}
