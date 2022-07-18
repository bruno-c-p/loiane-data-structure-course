package com.brunocp.data_structure.vector_.contact_exercise;

import com.brunocp.data_structure.vector_.Contact;
import com.brunocp.data_structure.vector_.VectorList;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        VectorList<Contact> contacts = new VectorList<>(20);
        createContactsDinamically(30, contacts);

        int option = -1;

        while (option != 0) {

            option = menu(scan);

            switch (option) {
                case 1:
                    addContact(scan, contacts);
                    break;
                case 2:
                    addContactPosition(scan, contacts);
                    break;
                case 3:
                    getContactPosition(scan, contacts);
                    break;
                case 4:
                    getContact(scan, contacts);
                    break;
                case 5:
                    getLastIndexContact(scan, contacts);
                    break;
                case 6:
                    contactExists(scan, contacts);
                    break;
                case 7:
                    removeByPosition(scan, contacts);
                    break;
                case 8:
                    removeContact(scan, contacts);
                    break;
                case 9:
                    System.out.println(contacts.getVectorSize());
                    break;
                case 10:
                    contacts.clear();
                    break;
                case 11:
                    System.out.println(contacts);
                    break;
            }
        }

        System.out.println("You left");
    }

    private static void removeContact(Scanner scan, VectorList<Contact> contacts) {

        int position = readIntInformation("Enter the position to be removed: ", scan);

        try {

            Contact contact = contacts.search(position);

            contacts.removeElement(contact);
            System.out.println("Contact removed");

        } catch (Exception e) {

            System.out.println("Invalid position");
        }
    }

    private static void removeByPosition(Scanner scan, VectorList<Contact> contacts) {

        int position = readIntInformation("Enter the position to be removed: ", scan);

        try {

            contacts.removeElement(position);
            System.out.println("Contact removed");

        } catch (Exception e) {

            System.out.println("Invalid position");
        }
    }

    private static void contactExists(Scanner scan, VectorList<Contact> contacts) {

        int position = readIntInformation("Enter the position to be searched: ", scan);

        try {

            Contact contact = contacts.search(position);
            System.out.println("Contact exists: ");
            System.out.println(contact);

            boolean exists = contacts.contains(contact);

            if (exists) {

                System.out.println("Contact exists: ");
                System.out.println(contact);

            } else  {
                System.out.println("Contact not founded");
            }

        } catch (Exception e) {

            System.out.println("Invalid position");
        }
    }

    private static void getLastIndexContact(Scanner scan, VectorList<Contact> contacts) {

        int position = readIntInformation("Enter the position to be searched: ", scan);

        try {

            Contact contact = contacts.search(position);
            System.out.println("Contact exists: ");
            System.out.println(contact);

            System.out.println("Searching last index of founded contact");
            position = contacts.lastIndexOf(contact);

            System.out.println("Contact founded at " + position + " position");

        } catch (Exception e) {

            System.out.println("Invalid position");
        }
    }

    private static void getContact(Scanner scan, VectorList<Contact> contacts) {

        int position = readIntInformation("Enter the position to be searched: ", scan);

        try {

            Contact contact = contacts.search(position);
            System.out.println("Contact exists: ");
            System.out.println(contact);

            System.out.println("Searching founded contact");
            position = contacts.search(contact);

            System.out.println("Contact founded at " + position + " position");

        } catch (Exception e) {

            System.out.println("Invalid position");
        }
    }

    private static void getContactPosition(Scanner scan, VectorList<Contact> contacts) {

        int position = readIntInformation("Enter the position to be searched: ", scan);

        try {

            Contact contact = contacts.search(position);
            System.out.println("Contact exists: ");
            System.out.println(contact);

        } catch (Exception e) {

            System.out.println("Invalid position");
        }
    }

    private static void addContact(Scanner scan, VectorList<Contact> contacts) {

        System.out.println("Creating a contact, enter the information");
        String name = readInformation("Name: ", scan);
        String email = readInformation("Email: ", scan);
        String phone = readInformation("Phone: ", scan);

        Contact contact = new Contact(name, email, phone);
        contacts.addElement(contact);

        System.out.println("Contact successfully added");
        System.out.println(contact);
    }

    private static void addContactPosition(Scanner scan, VectorList<Contact> contacts) {

        System.out.println("Creating a contact, enter the information");
        String name = readInformation("Name: ", scan);
        String email = readInformation("Email: ", scan);
        String phone = readInformation("Phone: ", scan);

        Contact contact = new Contact(name, email, phone);

        int position = readIntInformation("Position to add contact: ", scan);

        try {

            contacts.addElement(position, contact);
            System.out.println("Contact successfully added");
            System.out.println(contact);

        } catch (Exception e) {

            System.out.println("Invalid position, contact not added");
        }
    }

    private static String readInformation(String message, Scanner scan) {

        System.out.println(message);
        String entry = scan.nextLine();

        return entry;
    }

    private static int readIntInformation(String message, Scanner scan) {

        boolean validEntry = false;
        int num = 0;

        while (!validEntry) {

            try {

                System.out.println(message);
                String entry = scan.nextLine();

                num = Integer.parseInt(entry);

                validEntry = true;

            } catch (Exception e) {

                System.out.println("Invalid entry, try again");
            }
        }

        return num;
    }

    private static int menu(Scanner scan) {

        boolean validEntry = false;
        int option = -1;
        String entry = "";

        while (!validEntry) {

            StringBuilder sb = new StringBuilder();
            sb.append("1 - Add contact at end of vector\n");
            sb.append("2 - Add contact at a specific position\n");
            sb.append("3 - Search contact at a specific position\n");
            sb.append("4 - Search contact\n");
            sb.append("5 - Search last index of a specific contact\n");
            sb.append("6 - Check if contact exists\n");
            sb.append("7 - Remove by position\n");
            sb.append("8 - Remove contact\n");
            sb.append("9 - Check vector size\n");
            sb.append("10 - Delete all contacts\n");
            sb.append("11 - PrintVector\n\n");
            sb.append("0 - Exit");

            try {

                entry = scan.nextLine();
                option = Integer.parseInt(entry);

                if (option >= 0 && option <= 11) {
                    validEntry = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Invalid entry, try again");
            }
        }

        return option;
    }

    private static void createContactsDinamically(int quantity, VectorList<Contact> contacts) {

        Contact contact = new Contact();

        for (int i = 0; i <= quantity; i++) {

            contact.setName("Contact " + i);
            contact.setEmail("contact " + i + "@gmail.com");
            contact.setPhone("11111111" + i);

            contacts.addElement(contact);
        }
    }
}
