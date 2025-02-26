package Heaps;

import java.util.ArrayList;

public class MyHeap {
    ArrayList<Integer> heap;

    MyHeap() {
        heap = new ArrayList<>();
    }

    // now why din't we use our own add method here because that method has
    // complexity log n and combined with adding n items we end up
    MyHeap(int[] list) {
        heap = new ArrayList<>();
        for (int i : list) {
            this.heap.add(i);
        }
        for (int i = this.heap.size() / 2 - 1; i >= 0; i--) {
            downheap(i);
        }

    }

    public void insert(int value) {
        this.heap.add(value);
        upheap(this.heap.size() - 1);
    }

    public void upheap(int index) {
        if (index == 0) {
            return; // because first element added hence nothing would be there to compare and
                    // traverse.
        }
        int parentIndex = (index - 1) / 2;
        if (this.heap.get(parentIndex) < this.heap.get(index)) { // currently this condition and conditions in remove
                                                                 // are working to make sure we have a max heap means
                                                                 // max priority.
            swap(parentIndex, index);
            upheap(parentIndex);
        }
    }

    public void swap(int i, int j) {
        int temp = this.heap.get(i);
        this.heap.set(i, this.heap.get(j));
        this.heap.set(j, temp);
    }

    public int remove() {
        swap(0, this.heap.size() - 1);
        int removedVal = this.heap.remove(this.heap.size() - 1);
        downheap(0);
        return removedVal;
    }

    public void downheap(int index) {
        int max = index;
        int leftChild = (2 * index) + 1;
        if (leftChild < this.heap.size() && this.heap.get(max) < this.heap.get(leftChild)) {
            max = leftChild;
        }
        int rightChild = (2 * index) + 2;
        if (rightChild < this.heap.size() && this.heap.get(max) < this.heap.get(rightChild)) {
            max = rightChild;
        }

        if (max != index) {
            swap(index, max);
            downheap(max);
        }
    }

    public int peek() {
        return this.heap.get(0);
    }

    public int size() {
        return this.heap.size();
    }

    public String toString() {
        return this.heap.toString();
    }

}