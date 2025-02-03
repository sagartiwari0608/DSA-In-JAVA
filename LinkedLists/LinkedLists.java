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
    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next= head;
        head = node;
    }
    public void insertAtIndex(int data, int index){
        if(isEmpty()) throw  new IllegalArgumentException();
        Node prev = null;
        Node current = head;
        Node node = new Node(data);
        while(index > 0 && current != null){
            prev = current;
            current =current.next;
            index--;
        }
        prev.next = node;
        node.next = current;

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
    public boolean isEmpty(){
        return head == null;
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
        tail = node;
    }

    public void removeFirst() {
        if(isEmpty()) return;
        if(head.next ==null) {
            head = null;
            return ;
        }
        int headData = head.getData();
        Node current = head;
        this.head = this.head.next;
        current.next = null; // so that garbage collector can free up this memory
    }
    public void removeLast(){
        if(isEmpty()) return;
        if(head.next ==null) {
            head = null;
            return ;
        }
        Node current = head;
        while (current.next.next !=null){
            current = current.next;
        }
        tail = current;
        tail.next = null;
    }

    public Node removeNthFromLast(int indexFromLast){
        // we are gonna use 2 pointers approach which will have one slow and one fast pointer
//        Node slow = head;
//        Node fast = head;
//
//        for(int i =0; i < indexFromLast; i++){
//            fast = fast.next;
//        }
//        while(fast.next != null){
//            fast = fast.next;
//            slow=slow.next;
//        }
//
//        slow.next = slow.next.next;
//        return;


//        the above solution works but totally eats shit in terms of edge cases. so we need to fix it by using 3 pointers
        if(head == null ) return null;
        if(head.next == null) return null;

        // now we need 3 pointers
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(indexFromLast > 1 && fast !=null ){
            fast = fast.next;
            indexFromLast--;
        }
        while(fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;

        }
        if(prev == null){
            head = slow.next;
            slow.next = null;
            return head;
        }
        prev.next = slow.next;
        slow.next = null;
        return head;

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

    public void reverseLL(){
        if(head == null || head.next == null) return;
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while(next !=null){
            current.next = prev;
            prev = current ;
            current = next;
            next = next.next;
        }
        current.next = prev;
        head = current;

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
        linkedList.insertAtStart(0);
        System.out.println(linkedList);

//        linkedList.insertAtIndex(10,3);
//        linkedList.reverseLL(); // we were seeing only first item because last link creation was pending
//        System.out.println(linkedList+"line 142");

        // linkedList.removeFirst();
        // linkedList.removeLast();
        linkedList.removeNthFromLast(3);

        System.out.println(linkedList);

    }

}
