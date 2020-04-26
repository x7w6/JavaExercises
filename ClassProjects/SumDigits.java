/*
Zachary Weaver
4/26/20
Assignment 5.3
Bellevue University
-------------------
Program computes the sum of all digits in a given integer
SumDigits.java
*/

// import scanner class
import java.util.Scanner;

public class SumDigits {

 

    // method computes and returns the sum of digits in an integer
    public static int sumDigits(long lg) {

        //cast long parameter to int type
        int a = (int)lg;

        // other variables
        int b,sum = 0;
  
        // loop to break down value into individual digits
        while ( a > 0) {

            // extract last digit using % 10
            b = a % 10;
            System.out.print(b);

            // starts at (0 + extracted digit) then adds value plus extracted digit
            sum = sum + b;

            //removes last digit and stores to variables until a = 0
            a /= 10; // same as: a = a / 10

            // used to format output of printing + or = sign
           if (a != 0) {
               System.out.print(" + ");
           } else System.out.print(" = ");

        }

        return sum;
    }

    // start of program
    public static void main(String[] args) {

        // initialize scanner class 
        Scanner input = new Scanner(System.in);     
        
        // label for directions
        System.out.print("Please enter a number: ");

        // get user input
        long userInput = input.nextLong();

        // return value of sumDigits()
        System.out.println( sumDigits(userInput) );
    }


}