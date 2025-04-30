package temptracker;

import java.util.ArrayList;
import java.util.Scanner;

public class temptracker {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        
        Scanner scanner = new Scanner(System.in);
        
        for (String day : daysOfWeek) {
            System.out.print("Enter average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }
        
        System.out.println("\nTemperatures for the week:");
        for (int i = 0; i < daysOfWeek.size(); i++) {
            System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
        }
        
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double weeklyAverage = sum / temperatures.size();
        
        System.out.println("\nWeekly average temperature: " + weeklyAverage);
        
        scanner.close();
    }
}