package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String input = scnr.nextLine().trim();
        String[] userName = input.split(" ");
        String firstName = userName[0];
        String lastName = userName[1];
        System.out.print("What date will you be coming (MM/dd/yy): ");
        String dateInput = scnr.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(dateInput, formatter);
        System.out.print("How many tickets would you like?");
        int ticketNumbers = scnr.nextInt();
        System.out.printf("%d tickets reserved for %s under %s, %s ", ticketNumbers, reservationDate, lastName, firstName);
    }
}