package com.pluralsight;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first numbers: ");
    double num1=input.nextFloat();

    System.out.print("Enter the second numbers: ");
    double num2=input.nextFloat();

    System.out.println("\nPossible calculation: ");
    char option=choice();

    if (option == 'A' ){
        System.out.println(num1 + " + " + num2 + " = " + addNumbers(num1,num2));
    }
    else if (option=='S'){
        System.out.println(num1 + " - " + num2 + " = " + substractNumbers(num1,num2));
    }
    else if(option=='M') {
        System.out.println(num1 + " * " + num2 + " = " + multiplyNumbers(num1, num2));
    }
    else if(option=='D'){
        System.out.println(num1 + " * " + num2 + " = " + divisionNumbers(num1,num2));
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
    public static double addNumbers(double num1, double num2){
        return num1+num2;
    }
    public static double substractNumbers(double num1,double num2){
        return num1-num2;
    }
    public static double multiplyNumbers(double num1,double num2){
        return num1*num2;
    }
    public static double divisionNumbers(double num1,double num2){
        return num1/num2;
    }
}
