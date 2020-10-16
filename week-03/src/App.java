/* Student: Rustam Zokirov
   ID: U1910049
   Lab: #2 BMI Calculator
*/
import java.util.Scanner; // Import the Scanner class

public class App { // Create a Class App
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a scanner object
        int choice;
        boolean isCalculate = true;
        float height = 0, weight = 0, BMI;
        int choice2;

        while(isCalculate) {
            System.out.println("*** Welcome to BMI Calculator! ***");
            System.out.println("Please enter only numbers!\n" + "1. Kilograms and meters\n" + "2. Pounds and inches\n" + "0. Exit\n" + "Choose option: ");
            choice = input.nextInt();

            switch (choice) {
                case 0: {
                    isCalculate = false;
                }break;
                case 1: { // Kilograms and meters
                    for (int i = 0; i == 0; ) { //taking data from user and check for validation
                        System.out.println("Enter height (meters): ");
                        height = input.nextFloat();
                        System.out.println("Enter weight (kg): ");
                        weight = input.nextFloat();

                        if (height > 0 && weight > 0)
                            i = 1;
                        else
                            System.out.println("Enter correct values!");

                    }

                    BMI = weight / (height * height);

                    if (BMI < 18.5)
                        System.out.printf("BMI: %.2f Underweight", BMI);
                    else if (BMI >= 18.5 && BMI < 25)
                        System.out.printf("BMI: %.2f Normal", BMI);
                    else if (BMI >= 25 && BMI < 30)
                        System.out.printf("BMI: %.2f Overweight", BMI);
                    else if (BMI >= 30 && BMI < 35)
                        System.out.printf("BMI: %.2f Obese", BMI);
                    else
                        System.out.printf("BMI: %.2f Extremely Obese", BMI);

                    System.out.println("\nDo you want to calculate again? (1. YES / Any key. NO)");
                    choice2 = input.nextInt();

                    if (choice2 != 1)
                        isCalculate = false;

                }break;
                case 2: { // Pounds and inches
                    for (int i = 0; i == 0; ) { //taking data from user and check for validation
                        System.out.println("Enter height (inches): ");
                        height = input.nextFloat();
                        System.out.println("Enter weight (pounds): ");
                        weight = input.nextFloat();

                        if (height > 0 && weight > 0)
                            i = 1;
                        else
                            System.out.println("Enter correct values!");

                    }

                    BMI = 703 * weight / (height * height);

                    if (BMI < 18.5)
                        System.out.printf("BMI: %.2f Underweight", BMI);
                    else if (BMI >= 18.5 && BMI < 25)
                        System.out.printf("BMI: %.2f Normal", BMI);
                    else if (BMI >= 25 && BMI <= 30)
                        System.out.printf("BMI: %.2f Overweight", BMI);
                    else if (BMI >= 30 && BMI <= 35)
                        System.out.printf("BMI: %.2f Obese", BMI);
                    else
                        System.out.printf("BMI: %.2f Extremely Obese", BMI);

                    System.out.println("\nDo you want to calculate again? (1. YES / 0. NO) ");
                    choice2 = input.nextInt();

                    if (choice2 != 1)
                        isCalculate = false;

                }break;
                default: {
                    System.out.println("Please enter correct values!");
                }break;
            } // switch

        } //while

    } // main()

} // Class App
