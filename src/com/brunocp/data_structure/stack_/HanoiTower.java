package com.brunocp.data_structure.stack_;

import java.util.Stack;

public class HanoiTower {

    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destination = new Stack<>();
        Stack<Integer> assistant = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        hanoiTower(original.size(), original, destination, assistant);
    }

    public static void hanoiTower(int n, Stack<Integer> original, Stack<Integer> destination, Stack<Integer> assistant) {

        if (n > 0) {

            hanoiTower(n-1, original, assistant, destination);

            destination.push(original.pop());

            System.out.println("------");
            System.out.println("Original: " + original);
            System.out.println("Destination: " + destination);
            System.out.println("Assistant: " + assistant);

            hanoiTower(n - 1, assistant, destination, original);
        }
    }
}
