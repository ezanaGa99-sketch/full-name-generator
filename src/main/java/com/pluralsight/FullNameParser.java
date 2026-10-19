
package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split("\\s+");

        if (nameParts.length == 2) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + nameParts[1]);

        } else if (nameParts.length == 3) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);

        } else {
            System.out.println("Please enter a first and last name, with an optional middle name.");
        }

        scanner.close();
    }
}
