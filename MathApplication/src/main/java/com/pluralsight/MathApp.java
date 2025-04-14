package com.pluralsight;

import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.table.TableStringConverter;
import java.util.*;

public class MathApp {
    public static void main(String[] args) {

        /**
         *Create two variables to represent the salary for Bob and Gary, name them
         * bobSalary and garySalary. Create a new variable named
         * highestSalary. Determine whose salary is greater using Math.max() and
         * store the answer in highestSalary. Set the initial salary variables to any value
         * you want. Print the answer (i.e "The highest salary is ...")
         */
        int bobSalary = 100000;
        int garySalary = 55000;
        int highestsalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is :" + highestsalary);

        System.out.println("```````````````````````````2````````````````````````````");

        /**
         *Find and display the smallest of two variables named carPrice and
         * truckPrice. Set the variables to any value you want.
         */
        int carPrice = 32000;
        int truckPrice = 44000;
        System.out.println("The lowest price is" + Math.min(carPrice, truckPrice));

        System.out.println("```````````````````````````3````````````````````````````");

        /**
         *Find and display the area of a circle whose radius is 7.25
         */
        double radius = 7.25;
        System.out.println("The area of a circle is : " + Math.PI * Math.pow(radius, 2));

        System.out.println("```````````````````````````4````````````````````````````");
        /**
         *Find and display the square root a variable after it is set to 5.0
         */
        double setValue = 5.0;
        System.out.println("The square root of the given value is : " + Math.sqrt(setValue));

        System.out.println("```````````````````````````5````````````````````````````");

        /**
         *Find and display the distance between the points (5, 10) and (85, 50)
         */
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The distance is"+ distance);
        System.out.println("```````````````````````````6````````````````````````````");

        /**
         *Find and display the absolute (positive) value of a variable after it is set to -3.8
         */
        double x= -3.8;
        double abValue=Math.abs(x);

        System.out.println("The absolute value of "+ x + "is: "+ abValue);

        System.out.println("```````````````````````````7````````````````````````````");

        /**
         *Find and display a random number between 0 and 10
         */
        Random rand = new Random();
        int number = rand.nextInt(10);

        System.out.println("A random number between 0 and 1 is: "+ number);

    }

}
