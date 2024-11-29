import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test2 {
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
        }

        // 合并两个已排序链表的方法
        public static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
            ListIterator iterator1 = new ListIterator(l1);
            ListIterator iterator2 = new ListIterator(l2);

            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;

//            while (iterator1.hasNext() && iterator2.hasNext()) {


            while (iterator1.hasNext() && iterator2.hasNext()) {
                System.out.println("1111");

                int val1 = iterator1.current.val;
                int val2 = iterator2.current.val;

                if (val1 <= val2) {
                    System.out.println("----------------------------");
                    System.out.println(val1);
                    System.out.println(val2);
                    tail.next = new ListNode(val1);
                    iterator1.hasNext(); // 提前检查hasNext，因为next()已经调用了
                    val1 = iterator1.next();
                } else {
                    System.out.println("==============================");
                    System.out.println(val1);
                    System.out.println(val2);
                    tail.next = new ListNode(val2);
                    iterator2.hasNext(); // 提前检查hasNext，因为next()已经调用了
                    val2 = iterator2.next();
                }
                tail = tail.next;
            }

            // 处理剩余元素
            while (iterator1.hasNext()) {
                System.out.println("aaaaaaaaaaa");
                tail.next = new ListNode(iterator1.next());
                tail = tail.next;
            }

            while (iterator2.hasNext()) {
                System.out.println("bbbbbbbbbbbb");
                tail.next = new ListNode(iterator2.next());
                tail = tail.next;
            }

            return dummyHead.next;
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

        public static void main(String[] args) {
            // 创建两个已排序链表
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(3);
            l1.next.next = new ListNode(5);

            ListNode l2 = new ListNode(2);
            l2.next = new ListNode(4);
            l2.next.next = new ListNode(6);

            // 合并链表
            ListNode mergedList = mergeSortedLists(l1,l2);

            // 打印合并后的链表
            printList(mergedList);
        }

}
