package linklist;

public class reverseList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    public static void main(String[] args) {
        // 创建链表 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 输出原链表
        System.out.print("Original List: ");
        printList(head);

        // 反转链表
        reverseList_206 solution = new reverseList_206();
        ListNode reversedHead = solution.reverseList(head);

        // 输出反转后的链表
        System.out.print("Reversed List: ");
        printList(reversedHead);
    }

    // 打印链表的方法
    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
