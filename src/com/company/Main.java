package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "I am feeling great";
        String anotherResponse = "q";
        String input = "";
        while ((input != response) || (input != anotherResponse)) {

            System.out.println("How are you feeling?");
            input = scanner.nextLine();
            if ((input.equalsIgnoreCase("q") || (input.equalsIgnoreCase("I am feeling great")))) {
                System.out.println("Great to hear you're doing well");
                System.exit(0);

            }

        }
    }
}
