package com.brunocp.data_structure.stack_;

import java.util.Scanner;

public class EvenOddStack {

    public static void main(String[] args) {

        Stackk<Integer> even = new Stackk<>();
        Stackk<Integer> odd = new Stackk<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            int num = scan.nextInt();

            if (num == 0) {

                Integer unstacked = even.unstack();

                if (unstacked == null) {

                    System.out.println("Even stack empty");

                } else {

                    System.out.println("Popping from even stack" + unstacked);
                }

                unstacked = odd.unstack();

                if (unstacked == null) {

                    System.out.println("Odd stack empty");

                } else {

                    System.out.println("Popping from odd stack" + unstacked);
                }

            } else if (num % 2 == 0) {

                System.out.println("Even number");
                even.stackUp(num);

            } else {

                System.out.println("Odd number");
                odd.stackUp(num);
            }
        }

        System.out.println("Popping all elements from even stack");

        while (!even.isEmpty()) {

            Integer unstacked = even.unstack();

            if (unstacked == null) {

                System.out.println("Stack is empty");

            } else {

                System.out.println("Even number, popping one element of the stack" + even.unstack());
            }
        }

        System.out.println("Popping all elements from odd stack");

        while (!odd.isEmpty()) {

            Integer unstacked = odd.unstack();

            if (unstacked == null) {

                System.out.println("Stack is empty");

            } else {

                System.out.println("Odd number, popping one element of the stack" + odd.unstack());
            }
        }
    }
}
