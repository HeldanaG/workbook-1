package com.pluralsight;
import java.util.*;

public class RentalCarCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        double finalPrice = 0;
        welcome();

        System.out.print("\nWhen do you want to pick up.(mm/dd/yy) =");
        String pickupDate = input.nextLine();

        System.out.print("\nFor how many days you want to rent:");
        int numRental = input.nextInt();

        input.nextLine();
        System.out.print("Do you want to include electronic toll tag on your rental $3.95/day (yes/no):");
        String toll = input.nextLine().toLowerCase();
        double tollTagPrice = tollTag(toll, numRental);

        System.out.print("Do you want to include GPS on your rental $2.95/day (yes/no):");
        String gps = input.nextLine().toLowerCase();
        double gpsPrice = GPS(gps, numRental);

        System.out.print("Do you want to include roadside assistance on your rental $3.95/day (yes/no):");
        String roadside = input.nextLine().toLowerCase();
        double roadsidePrice = roadAssistance(roadside, numRental);


        System.out.print("\nThere is 30% surcharge if you are under 25,Please provide your age:");
        int age = input.nextInt();
        totalPrice = surcharge(age, numRental);

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

    public static void welcome() {
        System.out.println("\nHello, Welcome to Heldana's car rental services!" +
                "\nwe are excited to provide the service you deserve :)" +
                "\nPlease fill out the form. Thank you!");
    }

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

    public static double tollTag(String toll, int numRental) {
        double tollPrice = 3.95;
        if (toll.equals("yes")) {
            return tollPrice * numRental;
        } else {
            return 0;
        }
    }

    public static double GPS(String gps, int numRental) {
        double gpsPrice = 2.95;
        if (gps.equals("yes")) {
            return gpsPrice * numRental;
        } else {
            return 0;
        }
    }

    public static double roadAssistance(String roadside, int numRental) {
        double roadPrice = 3.95;
        if (roadside.equals("yes")) {
            return roadPrice * numRental;
        } else {
            return 0;
        }
    }
}
