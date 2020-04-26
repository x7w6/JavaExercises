/*
Zachary Weaver
4/26/20
Assignment 5.2
Find square root of even numbers 0 - 20 using sqrt() method
Bellevue University
SquareRoot.java
*/

// import math class
import java.math.* ;

class SquareRoot {

    public static void main(String[] args) {
        // labels for chart
        System.out.println("Number" + " | " + "SquareRoot");

        // loop for finding even number 0 - 20
        for(int num = 0; num <= 20; num++) {

            if ( num % 2 != 0){
                continue;
            } 
            // use sqrt method and store values 
            float squaredNumber = (float)Math.sqrt(num);
            // display even numbers from loop above and use spaces for formatting
            System.out.print(num + "         ");
            // format and print squaredNumber variable with 4 decimal places
            System.out.printf("%.4f", squaredNumber);
            // line break for formatting
            System.out.println();
        } // end of loop

    }
}