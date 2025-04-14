package com.pluralsight;
import java.util.*;
public class MathApp {
    public static void main(String[] args) {

        int bobSalary=100000;
        int garySalary=55000;
        int highestsalary= Math.max(bobSalary,garySalary);
            System.out.println("The highest salary is :"+ highestsalary);

            System.out.println("```````````````````````````2````````````````````````````");


            int carPrice =32000;
            int truckPrice =44000;
            System.out.println("The lowest price is" + Math.min(carPrice, truckPrice));

            System.out.println("```````````````````````````3````````````````````````````");


            double radius = 7.25;
            System.out.println("The area of a circle is : "+ Math.PI * Math.pow(radius,2));

             System.out.println("```````````````````````````4````````````````````````````");

             double setValue=5.0;
             System.out.println("The square root of the given value is : "+ Math.sqrt(setValue));

        System.out.println("```````````````````````````5````````````````````````````");
        

    }

}
