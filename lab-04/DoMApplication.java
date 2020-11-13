/*
Student: Rustam Zokirov
StudentID: U1910049
Lab #4: DoM Application
*/

import java.util.Scanner; // Import Snanner class
import java.util.Random; // Import Random class

class DoMApplication {

    public static void main(String[] args) { // main() method
        Scanner input = new Scanner(System.in); // Create a Scanner object
        int option, isExit; // Initializing some variables

        CityTemperature temperature = new CityTemperature(); // Create object of CityTemperature
        CityRainFall rainFall = new CityRainFall(); // Create object of CityRainFall

        do { // Loop for reusing the program
            option = showMenu(); // The option value

            switch (option){
                case 1:
                    temperature.viewCityInfo(); // show city info
                    break;

                case 2:
                    temperature.viewClimateData(); // show city temperature info
                    break;

                case 3:
                    rainFall.viewClimateData(); // show city rainfall info
                    break;

                case 4:
                    int ID;
                    String name;

                    System.out.print("Enter the city ID: ");
                    ID = input.nextInt(); // get user's input
                    temperature.setCityID(ID); // set city new ID

                    System.out.print("Enter the city name: ");
                    name = input.next(); // get user's input
                    temperature.setCityName(name); // set city new name

                    break;
                case 5:
                    double[] cityClimateData = new double[24]; // create an array

                    for(int j=0; j<24; j++) {
                        System.out.print("Enter climate data for " + j + ":00: ");
                        cityClimateData[j] = input.nextDouble(); // take user's input
                    }
                    temperature.setClimateData(cityClimateData); // set the new temperature data
                    break;

                case 6:
                    double[] cityRainFallData = new double[12]; // create an array

                    for(int k=0; k<12; k++) {
                        System.out.print("Enter rainfall data for month #" + (k+1) + ": ");
                        cityRainFallData[k] = input.nextDouble(); // take user's inputs
                    }
                    rainFall.setClimateData(cityRainFallData); // set  the new rainfall data
                    break;

                case 0:
                    System.out.println("Quitting Program...");
                    System.exit(0); // program ends
                    break;

                default:
                    System.out.println("Sorry, please enter valid option!");
            } // End of switch

            System.out.print("\nDo you want to continue? (0.No 1.Yes) - ");
            isExit = input.nextInt(); // validation checking

        } while(isExit == 1);
    } // End of main

    public static int showMenu() {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        int option = 0;
        // Printing menu to screen
        System.out.println("\n***** MAIN MENU *****");
        System.out.println("1. City information");
        System.out.println("2. City temperature (24 hours)");
        System.out.println("3. City rainfall (12 months)");
        System.out.println("4. Set city information");
        System.out.println("5. Set city temperature (24 hours)");
        System.out.println("6. Set city rainfall (12 months)");
        System.out.println("0. Exit");

        // Getting user option from above menu
        System.out.print("Your choice: ");
        option = input.nextInt();
        System.out.println();

        return option;
    } // End of showMenu
}

class City {
    private int cityID; // private = restricted access
    private String cityName; // private = restricted access

    City() { // Default constructor
        cityID = 49;
        cityName = "Silicon Valley";
    }

    City(int cityID, String cityName) { // Parametrized constructor
        this.cityID = cityID;
        this.cityName = cityName;
    }

    // Getter for cityID
    public int getCityID() {
        return cityID;
    }

    // Setter for cityID
    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    // Getter for cityName
    public String getCityName() {
        return cityName;
    }

    // Setter for cityName
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // Viewer for CityInfo: Id, Name
    public void viewCityInfo() {
        System.out.println("City ID: " + getCityID());
        System.out.println("City Name: " + getCityName());
    }
}

class CityTemperature extends City{
    private double[] cityClimateData = {};

    CityTemperature() {
        cityClimateData = new double[24];

        for(int i=0; i<24; i++) { // Set to default 0
            cityClimateData[i] = i+20;
        }
    }

    public void setClimateData(double[] cityClimateData) {
        this.cityClimateData = cityClimateData;
    }

    // Getter for cityClimateData
    public double[] getClimateData() {
        return cityClimateData;
    }

    public void viewClimateData() {
        for(int i=0; i<24; i++) { // Set to default 0
            System.out.println("Time: " + i + ":00 = " + cityClimateData[i] + " C");
        }
    }
}

class CityRainFall extends City {
    private double[] cityClimateData = {}; // data member

    CityRainFall() { // default constructor
        Random random = new Random(); // Create an object of Random class
        cityClimateData = new double[12]; // Create an array

        for(int i=0; i<12; i++) { // Set to default 0
            int rand_num = random.nextInt(200);
            cityClimateData[i] = rand_num + 500; // Initialize the elements
        }
    }

    public void setClimateData(double[] cityClimateData) {
        this.cityClimateData = cityClimateData;
    }

    // Getter for cityClimateData
    public double[] getClimateData() {
        return cityClimateData;
    }

    // Viewer for ClimateData
    public void viewClimateData() {
        for(int i=0; i<12; i++) { // Set to default 0
            System.out.println("Month #" + (i+1) +": " + cityClimateData[i] + " mm");
        }
    }
}
