package LeetCodeQuestionsSolved;

import LinkedLists.Node;

public class RotateLinkedList {
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        int length = 2;
        while (k > 0) {
            Node curr = head;
            Node nextNode = head.next;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
                curr = curr.next;
                length++;
            }
            k = k % length;
            if (k > 0) {
                Node newNode = new Node(nextNode.data);
                curr.next = null;
                newNode.next = head;
                head = newNode;
                k--;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // [1,2,3,4,5]
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;
        Node current = rotateRight(head, k);
        // should print 4 -> 5 -> 1 -> 2 -> 3
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
