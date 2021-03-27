package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        String textToConvert;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                textToConvert = scanner.nextLine();
                int convertedString = Integer.parseInt(textToConvert.trim());
                System.out.println(convertedString);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Try again!");
            }
        }
    }
}