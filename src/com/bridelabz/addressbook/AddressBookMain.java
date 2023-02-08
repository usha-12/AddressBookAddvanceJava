package com.bridelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book Program-------");
        Scanner sc=new Scanner(System.in);
        int choice;
        AddressBook addressBook = new AddressBook();
        do {
            System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Search by State\n6. Exit");
            System.out.println("Enter Choice: ");
            choice =sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                case 5:
                    System.out.println("1. Search by City\n2. Search by State\n3. Exit");
                    System.out.println("Choice :");
                    choice=sc.nextInt();
                    switch (choice){
                        case 1:
                            addressBook.searchByCity();
                            break;
                        case 2:
                            addressBook.searchByState();
                            break;
                        case 3:
                            System.out.println("Thank you");
                        default:
                            System.out.println("Please Select Valid Input");
                    }
                    break;
                case 6:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select between 1 to 6 only.");
                    break;
            }
        }
        while( choice != 6 );
    }
}
