package Stacks;

import java.util.Stack;

public class StacksInJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        for(int e : stack){
            System.out.println(stack.pop());
        }

    }
}
