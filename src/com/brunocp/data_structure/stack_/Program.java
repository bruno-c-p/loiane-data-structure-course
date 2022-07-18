package com.brunocp.data_structure.stack_;

public class Program {

    public static void main(String[] args) {

        Stackk<Integer> stackk = new Stackk<>();

        System.out.println(stackk);
        System.out.println(stackk.getSize());

        for (int i = 0; i <= 10; i++) {
            stackk.stackUp(i);
        }

        System.out.println(stackk);
        System.out.println(stackk.isEmpty());
        System.out.println(stackk.top());
        System.out.println(stackk.unstack());
    }
}
