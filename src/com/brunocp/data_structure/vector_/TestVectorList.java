package com.brunocp.data_structure.vector_;

public class TestVectorList {

    public static void main(String[] args) {

        VectorList<String> vector = new VectorList(3);

        vector.addElement("element1");
        vector.addElement("element2");
        vector.addElement("element3");

        System.out.println(vector);
        System.out.println("Size: " + vector.getVectorSize());

        int pos = vector.search("element3");

        if (pos > -1) {

            System.out.println("Element exists in vector");

        } else {

            System.out.println("Element not found in vector");
        }
    }
}
