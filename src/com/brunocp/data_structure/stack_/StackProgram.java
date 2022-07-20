package com.brunocp.data_structure.stack_;

import java.util.Stack;

public class StackProgram {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.toString());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
