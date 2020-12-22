import java.util.Scanner; // Import the Scanner class

public class TemplateMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        int option; // Initializing some variables
        
        while(true) {
            System.out.println("\n***** MAIN MENU *****");
            System.out.println("1. TV");
            System.out.println("2. Mobile");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            option = input.nextInt(); // get user option from above menu

            switch (option) { // main menu
                case 1:
                    System.out.println("11111...");
                    break;

                case 2:
                    System.out.println("2222...");
                    break;

                case 0:
                    System.out.println("Quitting Program...");
                    System.exit(0); // program ends
                    break;

                default:
                    System.out.println("Please enter a valid option!");
            } // end of switch

        } // end of while
          
    }
    
}
