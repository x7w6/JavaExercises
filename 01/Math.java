/* 
    Zachary Weaver
    Assignment 1.4
    3/25/2020
    ---------------
    ( Program displays area and perimeter of a rectangle 
    with the following formulas:  Area = L x W and P = 2(L+W) )  
*/

public class Math {

    // both calculate functions below take in two decimal numbers as perimeters: length, width and return the results
    public static double calculateA(double length, double width) {
        return length * width;
    }

    public static double calculateP(double length, double width) {
        return 2 * (length + width);
    }

    // main method below prints out results to console
    public static void main(String[] args) {
        // calling the calculate functions above with these given values width = 4.5 and height: 7.9
        System.out.println( "Area: " + calculateA(4.5, 7.9) + "\n" + "Perimeter: " + calculateP(4.5, 7.9) );
        System.out.println("Done! - Program completed by Zachary Weaver");
    }
}