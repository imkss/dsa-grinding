package linkedList;
public class LinkedList {
    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void traverseLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int LLSize(Node head) {
        Node temp = head;
        int llSize = 0;
        while (temp != null) {
            llSize++;
            temp = temp.next;
        }
        return llSize;
    }

    public static boolean searchInLL(Node head, int x) {
        Node temp = head;
        while (temp != null) {
            if(x == temp.data) return true;
            temp = temp.next;
        }
        return false;
    }

    public static Node reverseList(Node head) {
        Node newHead = null;
        while (head != null) {
            Node next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {22, 4, 1, 9, 7};
//        Node y = new Node(arr[0]);
//        System.out.println(y.data);
        Node head = convertArr2LL(arr);
//        System.out.println(head.data);
        traverseLL(head);
        System.out.println("Linked List size:: " + LLSize(head));
        System.out.println("searching:: " + searchInLL(head, 19));
        reverseList(head);
    }
}

class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
