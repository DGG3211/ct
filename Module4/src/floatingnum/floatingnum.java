package floatingnum;

import java.util.Scanner;

public class floatingnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double total = 0;
        Double max = null;
        Double min = null;

        System.out.println("Please enter 5 floating-point numbers:");

        while (count < 5) {
            System.out.print("Enter value " + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                total += number;

                if (min == null || number < min) {
                    min = number;
                }
                if (max == null || number > max) {
                    max = number;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next();
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("\nResults:");
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Interest on Total at 20%%: %.2f\n", interest);

        scanner.close();
    }
}