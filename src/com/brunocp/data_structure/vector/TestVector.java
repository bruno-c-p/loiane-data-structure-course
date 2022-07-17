package com.brunocp.data_structure.vector;

public class TestVector {

    public static void main(String[] args) {

        Vector vector = new Vector(2);

        vector.addElement("element1");
        vector.addElement("element2");
        vector.addElement("element3");

        System.out.println(vector.toString());
        System.out.println(vector.getVectorSize());

        System.out.println(vector.search("element3"));
//        System.out.println(vector.search(5));

        vector.addElement(0, "element0");
        System.out.println(vector);

        vector.removeElement(0);
        System.out.println(vector);

        System.out.println("Remove element3");

        int pos = vector.search("element3");

        if (pos > -1) {

            vector.removeElement(pos);

        } else {

            System.out.println("element3 not found");
        }
    }
}
