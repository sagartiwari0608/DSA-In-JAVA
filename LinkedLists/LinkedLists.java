package LinkedLists;

import javax.xml.stream.events.NotationDeclaration;

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
    private Node tail;

    LinkedLists() {
        head = null;
        tail = null;
    }

    public void insertWithTail(int data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail= node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public void insertWithoutTail(int data) {
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

    public int removeFirst() {
        int headData = head.getData();
        this.head = this.head.next;
        return headData;
    }
//    public int removeLast(){
//
//        int headData = head.getData();
//    }

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
        linkedList.insertWithTail(3);
        linkedList.insertWithTail(4);
        linkedList.insertWithTail(5);
        linkedList.insertWithTail(6);
        linkedList.insertWithTail(7);
        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());;
        System.out.println(linkedList);
        ;
    }

}
