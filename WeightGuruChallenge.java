// Part 2: Weight Guru Challenge


// Create a Java program that tells whether your body to weight ratio is good or could be better.
// The java app should take in your weight and height from the console and calculate your body to weight ratio.
// You can use this article as a standardized guide for how to apply the logic.

import java.util.Scanner;

public class WeightGuruChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();


        double bmi = calculateBMI(weight, height);


        System.out.printf("Your BMI is: %.2f\n", bmi);
        evaluateBodyWeightRatio(bmi);


        scanner.close();
    }

   
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

   
    private static void evaluateBodyWeightRatio(double bmi) {
        System.out.print("Body-to-Weight Ratio: ");
        if (bmi < 18.5) {
            System.out.println("Underweight - could be better.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight - good!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight - could be better.");
        } else {
            System.out.println("Obese - consider consulting with a healthcare professional.");
        }
    }
}
