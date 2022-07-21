package com.brunocp.data_structure.stack_;

import java.util.Stack;

public class BalancedSymbols {

    public static void main(String[] args) {

        printResult("A + B");
        printResult("A + B + (C - D)");
        printResult("{[)]}");
        printResult("A + B)");
    }

    public static void printResult(String expression) {

        System.out.println("Is " + expression + " balanced? " + verifyBalancedSymbols(expression));
    }

    final static String OPEN = "({[";
    final static String CLOSE = ")}]";

    public static boolean verifyBalancedSymbols(String expression) {

        Stack<Character> stack = new Stack<>();

        int index = 0;
        char symbol, top;

        while (index < expression.length()) {

            symbol = expression.charAt(index);

            if (OPEN.indexOf(symbol) > -1) {

                stack.push(symbol);

            } else if (CLOSE.indexOf(symbol) > -1) {

                if (stack.isEmpty()) {

                    return false;

                } else {

                    top = stack.pop();

                    if (OPEN.indexOf(top) == CLOSE.indexOf(symbol)) {

                        return false;
                    }
                }
            }

            index++;
        }

        return false;
    }
}
