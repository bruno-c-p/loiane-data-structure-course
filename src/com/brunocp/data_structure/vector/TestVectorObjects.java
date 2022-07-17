package com.brunocp.data_structure.vector;

public class TestVectorObjects {

    public static void main(String[] args) {

        VectorObjects vector = new VectorObjects(3);

        Contact c1 = new Contact("Contato1", "123456789", "contato1@gmail.com");
        Contact c2 = new Contact("Contato2", "123456788", "contato2@gmail.com");
        Contact c3 = new Contact("Contato3", "123456778", "contato3@gmail.com");

        Contact c4 = new Contact("Contato1", "123456789", "contato1@gmail.com");

        vector.addElement(c1);
        vector.addElement(c2);
        vector.addElement(c3);

        System.out.println(vector);
        System.out.println("Size: " + vector.getVectorSize());

        int pos = vector.search(c4);

        if (pos > -1) {

            System.out.println("Element exists in vector");

        } else {

            System.out.println("Element not found in vector");
        }
    }
}
