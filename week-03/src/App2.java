/* Student: Rustam Zokirov
   ID: U1910049
   Lab: #2 BMI Calculator
*/
import java.util.Scanner; // Import the Scanner class

public class App2 { // Create a Class App
    public static void calculate(int choice){
        boolean isCalculate = true;
        float height = 0, weight = 0, BMI; // declaring some variables
        int choice2;

        while(isCalculate) {
            Scanner input = new Scanner(System.in); // Create a scanner object

            for (int i = 0; i == 0; ) { //taking data from user and check for validation
                System.out.println("Enter height: ");
                height = input.nextFloat(); // read height input
                System.out.println("Enter weight: ");
                weight = input.nextFloat(); // read weight input

                if (height > 0 && weight > 0) // validate for >0
                    i = 1;
                else
                    System.out.println("Enter correct values!");
            }

            if (choice == 1) { // for kg
                BMI = weight / (height * height);
            }
            else { // for pounds
                BMI = 703 * weight / (height * height);
            }

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

            System.out.println("\nDo you want to calculate again? (1. YES / Any key. NO) ");
            choice2 = input.nextInt(); // read the input

            if (choice2 != 1)
                isCalculate = false; // exit from the loop
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a scanner object
        int choice;

        System.out.println("*** Welcome to BMI Calculator! ***");
        System.out.println("Please enter only numbers!\n" + "1. Kilograms and meters\n" + "2. Pounds and inches\n" + "0. Exit\n" + "Choose option: ");
        choice = input.nextInt();

        switch (choice) { // switch for the menu
            case 0: { // Pounds and inches
                System.exit(0); //
            }break;
            case 1: { // Kilograms and meters
                calculate(1);
            }break;
            case 2: { // Pounds and inches
               calculate(2);
            }break;
            default:{
                System.out.println("Invalid input!");
            }break;
        } // switch
    } // main()
} // Class App
