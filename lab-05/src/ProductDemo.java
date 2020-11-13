/*
Student: Rustam Zokirov
ID: U1910049
Lab: #5
*/

import java.net.PortUnreachableException;
import java.util.Scanner; // import Scanner class

// interface
interface Operatable {
    public void increaseVolume();
    public void decreaseVolume();
    public void switchOn();
    public void switchOff();
}

// abstract class
abstract class Product implements Operatable {
    private int productID;
    private String companyName;
    private String modelName;
    protected boolean isOn;
    protected int volume;

    Product() { // default constructor
        productID = 49;
        companyName = "EightSoft";
        modelName = "ZeroOne";
        isOn = false;
        volume = 8;
    }

    Product(int productID, String companyName, String modelName, boolean isOn, int volume) { // parametric constructor
        this.productID = productID;
        this.companyName = companyName;
        this.modelName = modelName;
        this.isOn = isOn;
        this.volume = volume;
    }

    public int getProductID() { return productID; } // returns product ID

    public String getCompanyName() { return companyName; } // returns company name

    public String getModelName() { return modelName; } // returns model name

    public int getVolume() { return volume; } // returns volume

    public void setProductID(int productID) { this.productID = productID; } // set product ID

    public void setCompanyName(String companyName) { this.companyName = companyName; } // set company name

    public void setModelName(String modelName) { this.modelName = modelName; } // set model name

    public void setVolume(int volume) {
        if (isOn && volume >= 0 && volume <=10) {
            this.volume = volume;
            System.out.println("\nVolume: " + getVolume());
        }
        else if (!isOn) {
            System.out.println("\nDevice is switched off!");
        }
        else {
            System.out.println("\nVolume must be in range (0-10)!");
        }
    }

    public void increaseVolume() { // increase volume of device
        if (isOn && volume>=0 && volume<=10) { // validation checking
            System.out.println("\nVolume: " + volume);
            volume++;
        }
        else if (!isOn) {
            System.out.println("\nDevice is switched off!");
        }
        else {
            System.out.println("\nVolume must be in range (0-10)!");
        }
    }

    public void decreaseVolume() { // decrease volume of device
        if (isOn && volume>=0 && volume<=10) { // validation checking
            System.out.println("\nVolume: " + volume);
            volume--;
        }
        else if (!isOn) {
            System.out.println("\nDevice is switched off!");
        }
        else {
            System.out.println("\nVolume must be in range (0-10)!");
        }
    }

    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Device is switched on!");
        }
        else {
            System.out.println("\nDevice is already switched on!");
        }
    }

    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("\nDevice is switched off!");
        }
        else {
            System.out.println("\nDevice is already switched off!");
        }
    }
} // class

// TV class inherited from Product class
class TV extends Product {
    private int channel;

    TV() {
        switchOn();
        channel = 1;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (isOn && channel>=1 && channel<=100) {
            this.channel = channel;
            System.out.println("\nChannel: " + getChannel());
        }
        else if (!isOn) {
            System.out.println("\nDevice is switched off!");
        }
        else {
            System.out.println("\nChannels range must be (1-100)!");
        }
    }

    public void viewInfo() { // displying info
        System.out.println("\n*** TV info ***");
        System.out.println("Product ID: " + getProductID());
        System.out.println("Company name: " + getCompanyName());
        System.out.println("Model name: " + getModelName());
        System.out.println("Channel: " + getChannel());
        System.out.println("Volume: " + getVolume());
        System.out.println("isOn: " + isOn);
    }
}

class Mobile extends Product {
    int noOfSims;

    Mobile() { 
        switchOn();
        noOfSims = 1; // set to default
    }

    public int getNoOfSims() { // get number of sims
        return noOfSims;
    }

    public void setNoOfSims(int noOfSims) { // set number of sims
        this.noOfSims = noOfSims;
    }

    // changing sim lots
    public void changeSim() {
        if (isOn && noOfSims==1 || noOfSims==2) {
            if (noOfSims==1) {
                System.out.println("\nYou have only one sim :)");
            }
            else {
                noOfSims++;
                System.out.println("\nSim no.: " + noOfSims);
            }
        }
        else {
            System.out.println("\nDevice is switched off!");
        }
    }

    public void viewInfo () { // viewing all info about the mobile
        System.out.println("\n*** Mobile info ***");
        System.out.println("Product ID: " + getProductID());
        System.out.println("Company name: " + getCompanyName());
        System.out.println("Model name: " + getModelName());
        System.out.println("Number of sims: " + getNoOfSims());
        System.out.println("Volume: " + getVolume());
        System.out.println("isOn: " + isOn);
    }
}

public class ProductDemo { // main class 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        int option; // Initializing some variables

        Product product; // product reference

        for (int j=0; j<100; j++) { // for loop for reusing program
        System.out.println("\n***** MAIN MENU *****");
            System.out.println("1. TV");
            System.out.println("2. Mobile");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            option = input.nextInt(); // get user option from above menu

            switch (option) { // main menu
                case 1:
                    product = new TV();
  		    TV tv = (TV) product; // custing of objects

                    for (int i=1; i<100; i++) {
                        System.out.println("\n***** TV *****"); // menu for TV
                        System.out.println("1. View info");
                        System.out.println("2. Change product info");
                        System.out.println("3. Switch channel");
                        System.out.println("4. Increase volume");
                        System.out.println("5. Decrease volume");
                        System.out.println("6. Switch on");
                        System.out.println("7. Switch off");
                        System.out.println("0. Go back");
                        System.out.print("Your choice: ");

                        int optionTV = input.nextInt();

                        switch (optionTV) {
                            case 1:
                                tv.viewInfo(); 
                                break;

                            case 2:
                                // set product id
                                int pid;
                                System.out.print("Enter new product id: ");
                                pid = input.nextInt();
                                tv.setProductID(pid);

                                // set company name
                                String companyName;
                                System.out.print("Enter new company name: ");
                                companyName = input.next();
                                tv.setCompanyName(companyName);

                                // set model name
                                String modelName;
                                System.out.print("Enter new model name: ");
                                modelName = input.next();
                                tv.setModelName(modelName);
                                break;

                            case 3:
                                // set channel
                                int channel;
                                if (tv.isOn) {
                                    System.out.print("Enter channel (1-100): ");
                                    channel = input.nextInt();
                                    tv.setChannel(channel);
                                }
                                else {
                                    System.out.println("\nDevice is switched off!");
                                }
                                break;

                            case 4:
                                tv.increaseVolume(); // increase volume
                                break;

                            case 5:
                                tv.decreaseVolume(); // decrease volume
                                break;

                            case 6:
                                tv.switchOn(); // switch on
                                break;

                            case 7:
                                tv.switchOff(); // switch off
                                break;

                            case 0:
                                i = 1000;
                                break;
                        }
                        i--; // for validation loop
                    }
                    break;

                case 2:
                    product = new Mobile(); // creating object of Mobile
                    Mobile mobile = (Mobile) product; // custing of object

                    for (int i=1; i<100; i++) {
                        System.out.println("\n***** MOBILE *****"); // menu for mobile
                        System.out.println("1. View info");
                        System.out.println("2. Change product info");
                        System.out.println("3. Switch sim");
                        System.out.println("4. Increase volume");
                        System.out.println("5. Decrease volume");
                        System.out.println("6. Switch on");
                        System.out.println("7. Switch off");
                        System.out.println("0. Go back");
                        System.out.print("Your choice: ");

                        int optionMobile = input.nextInt();

                        switch (optionMobile) {
                            case 1:
                                mobile.viewInfo();
                                break;

                            case 2:
                                // set product id
                                int pid;
                                System.out.print("Enter new product id: ");
                                pid = input.nextInt();
                                mobile.setProductID(pid);

                                // set company name
                                String companyName;
                                System.out.print("Enter new company name: ");
                                companyName = input.next();
                                mobile.setCompanyName(companyName);

                                // set model name
                                String modelName;
                                System.out.print("Enter new model name: ");
                                modelName = input.next();
                                mobile.setModelName(modelName);

                                // set number of sims
                                int noOfSims;
                                System.out.print("Enter number of sims (1-2): ");
                                noOfSims = input.nextInt(); //setNoOfSims
                                if (noOfSims==1 || noOfSims==2) {
                                    mobile.setNoOfSims(noOfSims);
                                }
                                else {
                                    System.out.print("Wrong! Number could be 1 or 2!");
                                }
                                break;

                            case 3:
                                mobile.changeSim();
                                break;

                            case 4:
                                mobile.increaseVolume();
                                break;

                            case 5:
                                mobile.decreaseVolume();
                                break;

                            case 6:
                                mobile.switchOn();
                                break;

                            case 7:
                                mobile.switchOff();
                                break;

                            case 0:
                                i = 1000;
                                break;
                        }
                        i--; // for validating loop
                    }
                    break;

                case 0:
                    System.out.println("Quitting Program...");
                    System.exit(0); // program ends
                    break;

                default:
                    System.out.println("Please enter a valid option!");
            } // End of switch
            j--;
        } // end of for
    } // end of main()
} // end of ProductDemo
