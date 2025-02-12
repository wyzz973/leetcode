package linklist;

public class removeNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /**int size = 0;
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            size++;
        }
        if (size == n){
            return head.next;
        }

        cur = head;
        for (int i = 0; i < size - n - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;**/
        ListNode dummynode = new ListNode(-1,head);
        ListNode slow = dummynode;
        ListNode fast = dummynode;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummynode.next;
    }
}
