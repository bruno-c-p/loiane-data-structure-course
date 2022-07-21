package com.brunocp.data_structure.stack_;

import javax.swing.*;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Word: ");
        System.out.println(word + " is palindrome: " + palindromeTester(word));
    }

    public static boolean palindromeTester(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {

            stack.push(word.charAt(i));
        }

        String reverseWord = "";

        while (!stack.isEmpty()) {

            reverseWord += stack.pop();
        }

        if (reverseWord.equalsIgnoreCase(word)) {

            return true;
        }

        return false;
    }
}
