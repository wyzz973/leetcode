package linklist;

public class reverseList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp;
        while (cur.next != null){
            temp = cur.next;
            cur.next = pre;
            cur = temp;
        }
        return head;
    }
}
