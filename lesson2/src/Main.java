import java.util.Scanner;

import static java.lang.System.out;

public class Main {



    public static void main(String[] args) {

        double rate = 0.25; // percent deposit per year

        Scanner scanner = new Scanner(System.in);

        out.print("Enter your Name: ");
        String name = scanner.nextLine();

        out.print("Enter your Surname: ");
        String surName = scanner.nextLine();

        out.print("Enter the first installment: ");
        int sum = scanner.nextInt();

        out.println("Dear Mr " + name + " " + surName);
        out.println(" You profit for the year: " + (sum * rate));
        out.println("Profit for the five year: " + (5 * sum * rate));
        out.println("Profit for the ten year: " + (10 * sum * rate));
    }
}