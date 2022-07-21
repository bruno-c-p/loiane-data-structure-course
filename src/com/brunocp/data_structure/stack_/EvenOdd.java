package com.brunocp.data_structure.stack_;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Stackk<Integer> stackk = new Stackk<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.println("Number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {

                System.out.println("Pushing number: " + num);
                stackk.stackUp(num);

            } else {

                Integer unstacked = stackk.unstack();

                if (unstacked == null) {

                    System.out.println("Stack is empty");

                } else {

                    System.out.println("Odd number, popping one element of the stack" + stackk.unstack());
                }
            }
        }

        System.out.println("All numbers readed. Popping all elements from the stack");

        while (!stackk.isEmpty()) {

            Integer unstacked = stackk.unstack();

            if (unstacked == null) {

                System.out.println("Stack is empty");

            } else {

                System.out.println("Odd number, popping one element of the stack" + stackk.unstack());
            }
        }
    }
}
