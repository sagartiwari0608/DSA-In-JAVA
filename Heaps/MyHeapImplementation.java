package Heaps;

public class MyHeapImplementation {
    public static void main(String[] args) {

        MyHeap heap = new MyHeap(new int[] { 4, 3, 5, 2, 1, 8 });
        // MyHeap heap = new MyHeap();
        // heap.insert(4);
        // heap.insert(3);
        // heap.insert(5);
        // heap.insert(2);
        // heap.insert(1);
        // heap.insert(8);
        while (heap.size() > 0) {
            System.out.println(heap.peek());
            heap.remove();
        }

    }

}
