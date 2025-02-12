package linklist;

public class detectCycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            if (slow == fast){
                //说明有环，还要找到入口;
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index2 != index1){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}
