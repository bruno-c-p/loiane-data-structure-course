package com.brunocp.data_structure.stack_;

import java.util.Stack;

public class BinaryDecimal {

    public static void main(String[] args) {

        printResult(2);
        printResult(4);
        printResult(10);
        printResult(25);
        printResult(1035);
    }

    public static void printResult(int number) {

        System.out.println(number + " in binary number is: " + binaryDecimal(number));
    }

    public static String binaryDecimal(int number) {

        Stack<Integer> stack = new Stack<>();
        String binaryNumber = "";
        int rest;


        while (number > 0) {

            rest = number % 2;
            stack.push(rest);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            binaryNumber += stack.pop();
        }

        return binaryNumber;
    }
}
