package Heaps;

import java.util.ArrayList;

public class MyHeap {
    ArrayList<Integer> heap;

    MyHeap() {
        heap = new ArrayList<>();
    }

    public void add(int value) {
        this.heap.add(value);
        upheap(this.heap.size() - 1);
    }

    public void upheap(int index) {
        if (index == 0) {
            return; // because first element added hence nothing would be there to compare and
                    // traverse.
        }
        int parentIndex = (index - 1) / 2;
        if (this.heap.get(parentIndex) < this.heap.get(index)) {
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
        swap(0, this.heap.size());
        int removedVal = this.heap.remove(this.heap.size() - 1);
        downheap(0);
        return removedVal;
    }

    public void downheap(int index) {
        int min = index;
        int leftChild = 2 * index + 1;
        if (leftChild < this.heap.size() && this.heap.get(index) > this.heap.get(leftChild)) {
            min = leftChild;
        }
        int rightChild = 2 * index + 2;
        if (rightChild < this.heap.size() && this.heap.get(index) > this.heap.get(rightChild)) {
            min = rightChild;
        }

        if (min != index) {
            swap(index, min);
            downheap(min);
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