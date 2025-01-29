package LinkedLists;

class Node {
    public int data;
    public Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class LinkedLists {
    private Node head;

    LinkedLists() {
        head = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        Node current = this.head;
        if (head == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public String toString() {
        StringBuffer strbfr = new StringBuffer();
        Node current = head;
        if (head == null) {
            return "Empty list";
        } else {
            while (current.next != null) {
                strbfr.append(current.getData() + "->");
                current = current.next;
            }
            strbfr.append(current.getData());

        }
        return strbfr.toString();
    }
}

class LinkedListsImplementation {
    public static void main(String[] args) {
        LinkedLists linkedList = new LinkedLists();
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);
        System.out.println(linkedList);
    }

}