package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class InbuiltPriorityQueues {
    public static void main(String[] args) {
        // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // by adding
                                                                                                // collections.reverseOrder
                                                                                                // we get max headp
        int[] ranks = { 4, 5, 6, 1, 2, 3 };
        for (int i : ranks) {
            priorityQueue.add(i); // time complexity of this loop is n*logn because loop goes for n times and add
            // has logn complexity.
        }
        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.peek());
            // priorityQueue.remove(); // this loop also runs n log n because remove is logn 
            priorityQueue.poll();
        }

    }
}
