package com.pluralsight;
import java.util.*;

public class SandwichShop {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("\n1:Regular: base price $5.45 \n2:Large: base price $8.95");
        System.out.print("Which type of sandwich option you want:");
        int option = input.nextInt();
        double sandwichPrice=choice(option);

        input.nextLine();
        System.out.print("\nDo you want to do loaded sandwich(double everything):");
        String loadedChoice= input.nextLine().toLowerCase();
        if(loadedChoice.equals("yes") && option ==1){
            sandwichPrice+=1;
        }
        else if (loadedChoice.equals("yes") && option ==2){
            sandwichPrice+=1.75;
        }

        System.out.println("\nStudent (17 old or younger) receive a 10% discount");
        System.out.println("Senior (65 old or older) receive a 20% discount");
        System.out.print("what is your age: ");
        int age =input.nextInt();

        double discountAmount=discount(age,sandwichPrice);
        double finalPrice=sandwichPrice-discountAmount;
        System.out.printf("\nThe cost of the sandwich is $%.2f", finalPrice);

    }
    public static double choice(int op){
        if (op == 1) return 5.45;
        else return 8.95;
    }

    public static double discount (int age,double sandwichPrice){
        if (age <=17) return 0.1*sandwichPrice;
        else if (age >=65) return 0.2*sandwichPrice;
        else return 0;
    }

}
