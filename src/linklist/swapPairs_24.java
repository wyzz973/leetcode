package linklist;

public class swapPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummynode = new ListNode(-1,head);
        ListNode cur = dummynode;
        ListNode first = null;
        ListNode second = null;
        ListNode temp = null;
        while (cur.next != null && cur.next.next != null){
            temp = cur.next.next.next;
            first = cur.next;
            second = cur.next.next;
            cur.next = second;
            second.next = first;
            first.next = temp;
            cur = first;
        }
        return dummynode.next;
    }
}
