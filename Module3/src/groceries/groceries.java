package groceries;

import java.util.Scanner;

public class groceries { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        double coupon;  
        double totalGroceries = 0.0;

        System.out.print("Enter your coupon amount as a decimal (example: .10 for 10%): ");
        coupon = input.nextDouble();

        if (coupon > 1.0 || coupon <= 0) {
            System.out.println("Invalid coupon amount. Setting coupon to 10%.");
            coupon = 0.10;
        }

        for (int week = 1; week <= 4; week++) {
            System.out.print("Enter grocery bill for week " + week + ": $");
            double bill = input.nextDouble();
            totalGroceries += bill;
        }

        double monthlyTotal = totalGroceries;
        double weeklyAverage = monthlyTotal / 4;

        double discountedMonthlyTotal = monthlyTotal * (1 - coupon);
        double discountedWeeklyAverage = discountedMonthlyTotal / 4;

        System.out.println("\n--- Grocery Bill Summary ---");
        System.out.printf("Monthly Total (no coupon): $%.2f\n", monthlyTotal);
        System.out.printf("Weekly Average (no coupon): $%.2f\n", weeklyAverage);
        System.out.printf("Monthly Total (with coupon): $%.2f\n", discountedMonthlyTotal);
        System.out.printf("Weekly Average (with coupon): $%.2f\n", discountedWeeklyAverage);

        input.close();
    }
}
