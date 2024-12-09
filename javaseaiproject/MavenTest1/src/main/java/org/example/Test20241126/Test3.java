<<<<<<< HEAD
package org.example.Test20241126;

class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

// 題目160，相交鏈錶
public class Test3 {
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

    public static void main(String[] args) {
        // 创建链表A: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode node3 = new ListNode(3);
        headA.next.next = node3;

        // 创建链表B: 4 -> 5 -> 2 (与链表A在节点2相交)
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = node3; // 让链表B与链表A在节点2相交

        Test3 intersection = new Test3();
        ListNode intersectionNode = intersection.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("两个链表相交于节点: " + intersectionNode.value);
        } else {
            System.out.println("两个链表不相交");
        }
    }
=======
package org.example.Test20241126;

class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

// 題目160，相交鏈錶
public class Test3 {
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

    public static void main(String[] args) {
        // 创建链表A: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode node3 = new ListNode(3);
        headA.next.next = node3;

        // 创建链表B: 4 -> 5 -> 2 (与链表A在节点2相交)
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = node3; // 让链表B与链表A在节点2相交

        Test3 intersection = new Test3();
        ListNode intersectionNode = intersection.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("两个链表相交于节点: " + intersectionNode.value);
        } else {
            System.out.println("两个链表不相交");
        }
    }
>>>>>>> 0dc6ebe (“Java”)
}