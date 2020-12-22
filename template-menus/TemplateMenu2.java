import java.util.Scanner; // Import the Scanner class

public class TemplateMenu2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        int option, isExit; // Initializing some variables
        
        do { // Loop for reusing the program
            option = showMenu(); // The option value

            switch (option){
                case 1:
                    System.out.println("***** DISPLAY *****");
                
                break;

            case 2:
                System.out.println("***** INSERT RECORD *****");

                break;

            case 3:
                System.out.println("***** UPDATE RECORD *****");

                break;

            case 4:
                System.out.println("***** DELETE RECORD *****");

                break;

            case 0:
                System.out.println("Quitting Program...");
                System.exit(0); // program ends
                break;
            default:
                System.out.println("Please choose a valid option!");
        
            } // End of switch

            System.out.print("\nDo you want to continue? (0.No 1.Yes) - ");
            isExit = input.nextInt(); // validation checking

        } while(isExit == 1);
                
    } // end of main()

    public static int showMenu() {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        int option = 0;
        // Printing menu to screen
        System.out.println("\n***** MAIN MENU *****");
        System.out.println("1. Display records");
        System.out.println("2. Insert record");
        System.out.println("3. Update record");
        System.out.println("4. Delete record");
        System.out.println("0. Exit");

        // Getting user option from above menu
        System.out.print("Your choice: ");
        option = input.nextInt();
        System.out.println();

        return option;
    } // End of showMenu 
}
