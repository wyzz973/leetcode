package linklist;

public class MyLinkedList_707 {


    class Listnode {
        int val;
        Listnode next;

        public Listnode() {
        }

        public Listnode(int val) {
            this.val = val;
        }

        public Listnode(int val, Listnode next) {
            this.val = val;
            this.next = next;
        }
    }

    private int size;
    private Listnode head;

    public MyLinkedList_707() {
        this.size = 0;
        this.head = new Listnode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            return -1;
        }
        Listnode cur = this.head.next;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Listnode node = new Listnode(val);
        node.next = this.head.next;
        this.head.next = node;
        this.size++;
    }

    public void addAtTail(int val) {
        Listnode node = new Listnode(val);
        Listnode cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size) {
            return;
        }
        Listnode node = new Listnode(val);
        Listnode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
        this.size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            return;  // 如果索引不合法，直接返回
        }
        Listnode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        cur.next = cur.next.next;
        this.size--;
    }

    public void printList() {
        Listnode cur = this.head.next;  // 从头节点的下一个节点开始
        while (cur != null) {
            System.out.print(cur.val + " ");  // 打印当前节点的值
            cur = cur.next;  // 移动到下一个节点
        }
        System.out.println();  // 打印完后换行
    }

    public static void main(String[] args) {
        MyLinkedList_707 linkedList = new MyLinkedList_707();
        // Create a new linked list
        linkedList.printList();  // 输出: （空链表）

        // Add at head: 7
        linkedList.addAtHead(7);
        linkedList.printList();  // 输出: 7

        // Add at head: 2
        linkedList.addAtHead(2);
        linkedList.printList();  // 输出: 2 7

        // Add at head: 1
        linkedList.addAtHead(1);
        linkedList.printList();  // 输出: 1 2 7

        // Add at index 3: 0
        linkedList.addAtIndex(3, 0);
        linkedList.printList();  // 输出: 1 2 7 0

        // Delete at index 2
        linkedList.deleteAtIndex(2);
        linkedList.printList();  // 输出: 1 2 0

        // Add at head: 6
        linkedList.addAtHead(6);
        linkedList.printList();  // 输出: 6 1 2 0

        // Add at tail: 4
        linkedList.addAtTail(4);
        linkedList.printList();  // 输出: 6 1 2 0 4

        // Get index 4
        System.out.println(linkedList.get(4));  // 输出: 4

        // Add at head: 4
        linkedList.addAtHead(4);
        linkedList.printList();  // 输出: 4 6 1 2 0 4

        // Add at index 5: 0
        linkedList.addAtIndex(5, 0);
        linkedList.printList();  // 输出: 4 6 1 2 0 0 4

        // Add at head: 6
        linkedList.addAtHead(6);
        linkedList.printList();  // 输出: 6 4 6 1 2 0 0 4
    }
}
