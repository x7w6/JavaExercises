import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get weight in pounds
        System.out.print("Enter your weight (pounds): ");
        int userPounds = input.nextInt();

        // Get Height in inches
        System.out.print("Enter your height (inches): ");
        int userHeight = input.nextInt();

        // convert pounds to kilograms
        double userKilogram = userPounds * 0.45359237 ;

        // convert inches to meters
        double userMeters = userHeight * 0.0254 ;

        double BMI = userKilogram / (userMeters * userMeters);
        String results;

        if (BMI < 18.5) {
                results = "underweight";
        } else if (BMI >= 18.5 && BMI < 25.0) {
            results = "normal";
        } else if (BMI >= 25.0 && BMI < 30.0 ) {
            results = "overweight";
        } else {
            results = "obese";
        }
        
        System.out.println("Your Body Mass Index shows you are currently " + results);
    
    }   

}