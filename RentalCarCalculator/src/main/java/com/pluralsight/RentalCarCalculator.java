
package com.pluralsight;
import java.util.*;

public class RentalCarCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        double finalPrice = 0;

        // welcome message for user
        welcome();
        // asking pick up date and assigning to a variable called pickupDate
        System.out.print("\nWhen do you want to pick up.(mm/dd/yy) =");
        String pickupDate = input.nextLine();

        // asking for how many days they need rental and assigning to a variable called numRental
        System.out.print("\nFor how many days you want to rent:");
        int numRental = input.nextInt();

        // asking for their age and let them know there will be a charge based on their age and assigning to a variable called age
        System.out.print("\nThere is 30% surcharge if you are under 25,Please provide your age:");
        int age = input.nextInt();

        // asking for optional services(toll tag) on their rental and assigning to a variable called toll
        input.nextLine(); // to clear buffer
        System.out.print("Do you want to include electronic toll tag on your rental $3.95/day (yes/no):");
        String toll = input.nextLine().toLowerCase();

        // asking for optional services(gps) on their rental and assigning to a variable called gps
        System.out.print("Do you want to include GPS on your rental $2.95/day (yes/no):");
        String gps = input.nextLine().toLowerCase();

        // asking for optional services(roadside assistance) on their rental and assigning to a variable called roadside
        System.out.print("Do you want to include roadside assistance on your rental $3.95/day (yes/no):");
        String roadside = input.nextLine().toLowerCase();

        // used information to call specific methods to calculate operations and assigning to a variable accordingly
        double tollTagPrice = tollTag(toll, numRental);
        double gpsPrice = GPS(gps, numRental);
        double roadsidePrice = roadAssistance(roadside, numRental);
        totalPrice = surcharge(age, numRental);

        // used if condition to tailored an output
        if (age < 25) {
            finalPrice = totalPrice+tollTagPrice+gpsPrice+roadsidePrice;
            System.out.printf("The total price for " + numRental + " days including the surcharge is $%.2f",finalPrice);
            System.out.println("\nYour rental car will be ready by: "+pickupDate);
        } else {
            finalPrice = totalPrice+tollTagPrice+gpsPrice+roadsidePrice;
            System.out.printf("The total price for " + numRental + " days is $%.2f", finalPrice);
            System.out.println("\nYour rental car will be ready by "+pickupDate);
        }
    }

    // welcoming method to output
    public static void welcome() {
        System.out.println("\nHello, Welcome to Heldana's car rental services!" +
                "\nwe are excited to provide the service you deserve :)" +
                "\nPlease fill out the form. Thank you!");
    }

    // used to calculate the surcharge based on the age
    public static double surcharge(int age, int numRental) {
        double basicRental = 29.99;
        double surchargePrice = 0;
        if (age < 25) {
            surchargePrice = basicRental * 0.3 + basicRental * numRental;
            return surchargePrice;
        } else {
            surchargePrice = basicRental * numRental;
            return surchargePrice;
        }
    }

    // used to calculate the cost for total days in need
    public static double tollTag(String toll, int numRental) {
        double tollPrice = 3.95;
        if (toll.equals("yes")) {
            return tollPrice * numRental;
        } else {
            return 0;
        }
    }
    // used to calculate the cost for total days need
    public static double GPS(String gps, int numRental) {
        double gpsPrice = 2.95;
        if (gps.equals("yes")) {
            return gpsPrice * numRental;
        } else {
            return 0;
        }
    }
    // used to calculate the cost for total days need
    public static double roadAssistance(String roadside, int numRental) {
        double roadPrice = 3.95;
        if (roadside.equals("yes")) {
            return roadPrice * numRental;
        } else {
            return 0;
        }
    }
}
