/*
Rustam Zokirov, U1910049
Lab Assignment #3
*/

import java.util.Scanner; // import Scanner class

class Mobile { // Mobile class
    // attributes of class
    private String company, model; // model and company of phone
    private boolean isOn, hasCamera; // booleans isOn and hasCamera
    private int memory, volume; // volume from 0 to 10

    public Mobile(){ // default constructor
        company = "Samsung";
        model = "Z Fold 2";
        isOn = true;
        hasCamera = true;
        memory = 512;
        volume = 10;
    } // End

    public Mobile(String company,String model, boolean isOn, boolean hasCamera, int memory, int volume){ // parametrized constructor
        this.company = company;
        this.model = model;
        this.isOn = isOn;
        this.hasCamera = hasCamera;
        this.memory = memory;
        this.volume = volume;
    } // End

    public void setCompany(String company){ // Setter for company
        this.company = company;
    }

    public String getCompany(){ // Getter for company
        return company;
    }

    public void setModel(String model){ // Setter for model
        this.model = model;
    }

    public String getModel(){ // Getter for model
        return model;
    }

    public void setIsOn(boolean isOn){ // Setter for isOn
        this.isOn = isOn;
    }

    public boolean getIsOn(){ // Getter for isOn
        return isOn;
    }

    public void setHasCamera(boolean hasCamera){ // Setter for hasCamera
        this.hasCamera = hasCamera;
    }

    public boolean getHasCamera(){ // Getter for hasCamera
        return hasCamera;
    }

    public void setMemory(int memory){ // Setter for volume
        this.memory = memory;
    }

    public int getMemory(){ // Getter for volume
        return memory;
    }

    public void setVolume(int volume){ // Setter for volume
        this.volume = volume;
    }

    public int getVolume(){ // Getter for volume
        return volume;
    }

    public void switchOn(){
        if (!isOn) // Validating for on, off
            setIsOn(true);
        else
            System.out.println("\nMobile phone is already switched on!");
    } // End

    public void switchOff() {
        if (isOn) // Validating for on, off
            setIsOn(false);
        else
            System.out.println("\nMobile phone is already switched off");
    } // End

    public void increaseVolume() {
        if (isOn && volume < 10) {// validating volume (0, 10) and on, off
            volume++; // increasing volume
            System.out.println("Volume is " + getVolume()); // outputting the volume
        }
        else if (!isOn)
            System.out.println("\nMobile phone is switched off!");
        else
            System.out.println("\nVolume is 10!");
    }// End

    public void decreaseVolume() {
        if (isOn && volume >= 0) { // validating volume (0, 10) and on, off
            volume--; // decreasing volume
            System.out.println("Volume is " + getVolume()); // outputting the volume
        }
        else if (!isOn)
            System.out.println("\nMobile phone is switched off!");
        else
            System.out.println("\nVolume is 0!");
    } // End

    public void setDetail() { // this function will set all the needed info for object
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("\n***** Mobile phone details *****");

        System.out.println("Company: ");
        String inputCompany = input.next();
        setCompany(inputCompany); // setting the company to inputCompany

        System.out.println("\nModel: ");
        String inputModel = input.next();
        setModel(inputModel); // setting the model to inputModel

        setIsOn(true); // phone is On

        while(true){ // validating the input
            System.out.println("\nHas Camera? (1.Yes 2.No) ");
            int inputHasCamera= input.nextInt(); // taking the input
            if (inputHasCamera == 1) {
                setHasCamera(true); // setting the hasCamera
                break;
            }
            else if (inputHasCamera == 2) {
                setHasCamera(false); // setting the hasCamera
                break;
            }
            else{
                System.out.println("\nPlease enter values 1 or 2!");
            }
        }

        while (true){ // validation the memory input
            System.out.println("\nMemory: ");
            int inputMemory = input.nextInt();

            if(inputMemory > 0){
                setMemory(inputMemory);
                break;
            }
            else
                System.out.println("\nPlease enter correct values!");
        }

        while (true) { // validating the volume
            System.out.println("\nVolume (0, 10): ");
            int inputVolume = input.nextInt();

            if(inputVolume >= 0 && inputVolume <= 10){
                setVolume(inputVolume);
                break;
            }
            else
                System.out.println("\nPlease enter correct values!");
        } // End
    }

    public void getDetail(){
        System.out.println("\n***** Mobile phone details *****");
        System.out.println("Company: " + getCompany());
        System.out.println("Model: " + getModel());
        System.out.println("On: " + getIsOn());
        System.out.println("Has Camera: " + getHasCamera());
        System.out.println("Memory: " + getMemory());
        System.out.println("Volume: " + getVolume());
    }
} // End

public class MobileTest { // MobileTest class
    public static Scanner input = new Scanner(System.in); // Create a Scanner object

    public static void main(String[] args){ // main method
        int option, isExit; // initializing some variables
        Mobile mobile = new Mobile(); // creating object of Mobile

        do {
            option = showMenu(); // the option for switch
            switch (option){
                case 1:
                    mobile.setDetail();
                    break;
                case 2:
                    mobile.getDetail();
                    break;
                case 3:
                    mobile.increaseVolume();
                    break;
                case 4:
                    mobile.decreaseVolume();
                    break;
                case 5:
                    mobile.switchOn();
                    break;
                case 6:
                    mobile.switchOff();
                    break;
                case 0:
                    System.out.println("Quitting Program...");
                    System.exit(0); // program ends
                    break;
                default:
                    System.out.println("\nSorry, please enter valid option!");
            } // End of switch

            System.out.println("\n----------------------------------------------------------------------------");
            System.out.println("Do you want to continue? (1.Yes 2.No)");
            isExit = input.nextInt(); // valid-on

        } while(isExit == 1);

    } // End of main

    public static int showMenu() {
        int option = 0;
        // Printing menu to screen
        System.out.println("\n***** MAIN MENU *****");
        System.out.println("1. Set details");
        System.out.println("2. Get details");
        System.out.println("3. Increase volume");
        System.out.println("4. Decrease volume");
        System.out.println("5. Switch on");
        System.out.println("6. Switch off");
        System.out.println("0. Exit");

        // Getting user option from above menu
        System.out.println("Your choice: ");
        option = input.nextInt();
        // re
        return option;
    } // End of showMenu
} // End of class MobileTest
