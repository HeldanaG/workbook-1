package com.pluralsight;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first numbers: ");
    Float num1=input.nextFloat();

    System.out.print("Enter the second numbers: ");
    Float num2=input.nextFloat();

    System.out.println("\nPossible calculation: ");
    char option=choice();

    if (option== 'A' || option=='D' || option=='M' || option=='S'){
        System.out.println(num1 + " * " + num2 + " = " + num1*num2);
    }

    }
    public static char choice(){
        Scanner input = new Scanner(System.in);
        System.out.println("(A) ADD \n(S) SUBSTRACT \n(M) MULTIPLY \n(D) DIVIDE");
        System.out.println("Please select an option: ");
        String option = input.nextLine();
        char listOption = option.charAt(0);
        return listOption;
    }
}
