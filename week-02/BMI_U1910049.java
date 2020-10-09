// Body-Mass-Index Calculator in Java

/*
Student: Rustam Zokirov
ID: U1910049
Lab: Week#2
*/

import java.util.Scanner;  // Import the Scanner class

class Main { // Create a class Main
  public static void main(String[] args) { // Create main() method
    Scanner input = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter the weight (kg): ");
    double weight = input.nextDouble();  // Read user input
    System.out.println("Weight is: " + weight + "kg");  // Output user input

    System.out.println("Enter the height (m): ");
    double height = input.nextDouble();  // Read user input
    System.out.println("Height is: " + height + "m");  // Output user input

    double BMI_calc = weight/(height*height);
    System.out.println("BMI is: " + BMI_calc);  // Output BMI

    System.out.println("Underweight: Under 18.5");
    System.out.println("Normal: 18.5-24.9 ");        System.out.println("Overweight: 25-29.9");
    System.out.println("Obese: 30 or over");

  }
}