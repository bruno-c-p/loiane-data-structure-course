package com.brunocp.data_structure.vector_;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);
        System.out.println(arrayList.contains("A"));

        int pos = arrayList.indexOf("C");

        if (pos > -1) {

            System.out.println("Element exists in array at position: " + pos);

        } else {

            System.out.println("Element not found in array");
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("C");

        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
