package linklist;

public class getIntersectionNode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /**
        ListNode A = headA;
        ListNode B = headB;
        int size_A = 0;
        int size_B = 0;
        while (A != null){
            size_A++;
            A = A.next;
        }
        while (B != null){
            size_B++;
            B = B.next;
        }
        A = headA;
        B = headB;

        if (size_A < size_B){
            ListNode temp = null;
            temp = A;
            A =  B;
            B = temp;
            int temp1 = 0;
            temp1 = size_B;
            size_B = size_A;
            size_A = temp1;
        }

        for (int i = 0; i < size_A - size_B; i++) {
            A = A.next;
        }
        while (A != null){
            if (A == B){
                return A;
            }
            A = A.next;
            B = B.next;
        }
        return null;
        **/
       ListNode A = headA;
       ListNode B = headB;
       while (A != B){
           if (A != null){
               A = A.next;
           }else {
               A = headB;
           }
           if (B != null){
               B = B.next;
           }else {
               B = headA;
           }
       }
       return A;
    }
}
