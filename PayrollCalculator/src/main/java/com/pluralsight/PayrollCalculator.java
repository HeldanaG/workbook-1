package com.pluralsight;
import java.util.*;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float GrossPay;
        float overTime;

        System.out.print("Please enter your name: ");
        String name= input.nextLine();

        System.out.print("Please enter the hour you have worked: ");
        float hourWorked= input.nextFloat();

        System.out.print("Please enter your pay rate: ");
        float payRate= input.nextFloat();

        if (hourWorked <= 40){
            GrossPay=hourWorked * payRate;
            System.out.println("The gross pay for "+ name + " is $" + GrossPay);
        }
        else {
            overTime = hourWorked-40; //
            GrossPay= 40 *payRate + overTime * payRate * 1.5f;
            System.out.println("The gross pay for "+ name + " including overtime is $" + GrossPay);

        }



    }

}
