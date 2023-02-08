package com.bridelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contacts contacts;
    ArrayList<Contacts> list = new ArrayList<>();

    public void addNewContact() {
        contacts = new Contacts();
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(sc.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
        System.out.println("Enter First Name :");
        String firstName = sc.next();
        if (contacts.getFirstname().equalsIgnoreCase(firstName)) {
            System.out.println("Name already Exist----!!");
        } else {
            contacts = new Contacts();
            System.out.println("----------------------------------");
            System.out.println("Enter the Contact Details :-");
            System.out.println("Enter the First Name :");
            contacts.setFirstname(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastname(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the PIN Code :");
            contacts.setPin(sc.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(sc.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
            System.out.println("Contacts Added Successfully------!!!");
            System.out.println("-----------------------------------------");
            list.add(contacts);
        }
    }

    public void displayContact() {
        if (contacts.getFirstname() == null) {
            System.out.println("Contact Not Found");
        } else {
            for (Contacts cont : list) {
                System.out.println(cont);
            }
        }
    }

    public void editContact() {
        contacts = new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            contacts.setFirstname(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastname(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the PIN Code :");
            contacts.setPin(sc.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(sc.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }

    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            list.remove(contacts);
            System.out.println("Contact Deleted Successfully-------!!!");
        } else {
            System.out.println("Not Found");
        }
    }

    public void searchByCity() {
        System.out.println("Enter city Name:");
        String city = sc.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
    }

    public void searchByState() {
        System.out.println("Enter State Name:");
        String state = sc.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
    }

    public void countByCity() {
        System.out.println("Enter the city Name:");
        String city = sc.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
    }

    public void countByState() {
        System.out.println("Enter the State Name:");
        String state = sc.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
    }
}
