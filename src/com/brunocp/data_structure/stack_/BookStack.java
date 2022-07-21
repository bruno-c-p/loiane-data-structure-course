package com.brunocp.data_structure.stack_;

import java.util.Stack;

public class BookStack {

    public static void main(String[] args) {

        Stack<Book> books = new Stack<>();

        Book book1 = new Book();
        book1.setName("Learning JavaScript Data Structures and Algorithms - Second Edition");
        book1.setAuthor("Loiane Groner");
        book1.setReleaseDate(2016);
        book1.setIsbn("B01C2XX8Y2");

        Book book2 = new Book();
        book2.setName("Learning JavaScript Data Structures and Algorithms");
        book2.setAuthor("Loiane Groner");
        book2.setReleaseDate(2014);
        book2.setIsbn("B00OYTCT02");

        Book book3 = new Book();
        book3.setName("Mastering Ext JS - Second Edition");
        book3.setAuthor("Loiane Groner");
        book3.setReleaseDate(2015);
        book3.setIsbn("B00U01QQWU");

        Book book4 = new Book();
        book4.setName("JavaScript Regular Expressions");
        book4.setAuthor("Loiane Groner");
        book4.setReleaseDate(2015);
        book4.setIsbn("B00YHBVHGO");

        System.out.println("Books is empty?" + books.isEmpty());

        System.out.println("Pushing books to stack");
        books.push(book1);
        books.push(book2);
        books.push(book3);
        books.push(book4);

        System.out.println(books.size() + " books added to the stack");
        System.out.println(books);

        System.out.println("Peeking top of stack: " + books.peek());

        System.out.println("Popping out books from the stack");

        while (!books.isEmpty()) {

            System.out.println("Popping book: " + books.pop());
        }
    }
}
