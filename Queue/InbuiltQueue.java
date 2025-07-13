package Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        // there are multiple ways to create  a queue  in java
        // 1. using LinkedList
        // 2. using ArrayDeque
        // 3. using PriorityQueue

        // Using LinkedList
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // poll() retrieves and removes the head of the queue
        }

        // Using ArrayDeque
        java.util.Queue<Integer> arrayDequeQueue = new java.util.ArrayDeque<>();
        arrayDequeQueue.offer(5);
        arrayDequeQueue.offer(6);
        arrayDequeQueue.offer(7);

        while (!arrayDequeQueue.isEmpty()) {
            System.out.println(arrayDequeQueue.poll());
        }
    }
}
