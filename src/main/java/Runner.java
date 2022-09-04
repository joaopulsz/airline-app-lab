import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        //CREATE DUMMY DATA
        Airline airline = new Airline("BNTA Airways");

        Flight flight1 = new Flight(Location.Dubai, Location.Milan);
        Flight flight2 = new Flight(Location.Singapore, Location.London);
        Flight flight3 = new Flight(Location.Istanbul, Location.Paris);
        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addFlight(flight3);

        Passenger passenger1 = new Passenger("Joe", 1234, "joe@gmail.com");
        Passenger passenger2 = new Passenger("Jane", 5678, "jane@gmail.com");
        Passenger passenger3 = new Passenger("Bob", 4321, "bob@gmail.com");
        Passenger passenger4 = new Passenger("Mary", 8765, "mary@gmail.com");
        flight1.addPassenger(passenger1);
        flight2.addPassenger(passenger2);
        flight3.addPassenger(passenger3);
        flight1.addPassenger(passenger4);

        //CREATE CLI APP
        boolean stillUsingApp = true;

        System.out.println("Welcome to FlightManagerPro.");

        while (stillUsingApp) {
            System.out.println("What would you like to do next?\n" +
                    "Enter 1 to display all available flights.\n" +
                    "Enter 2 to create a new flight.\n" +
                    "Enter 3 to cancel a flight.\n" +
                    "Enter 4 to book a passenger onto a flight.\n" +
                    "Enter 5 to cancel a booking.\n" +
                    "And enter q if you wish to quit.");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("1")) {
                airline.displayFlights();

            } else if (input.equals("2")) {
                airline.createNewFlight();

            } else if (input.equals("3")) {
                airline.cancelFlight();

            } else if (input.equals("4")) {
                System.out.println("Please enter the flight number:");
                int flightNum = scanner.nextInt();
                Flight flightToAddPassenger = airline.findFlight(flightNum);
                try {
                    flightToAddPassenger.bookNewPassenger();
                } catch (Exception e) {
                    System.out.println("Please enter a valid flight number.");
                }

            } else if (input.equals("5")) {
                System.out.println("Please enter the flight number:");
                int flightNum = scanner.nextInt();
                Flight flightToRemovePassenger = airline.findFlight(flightNum);
                if (flightToRemovePassenger.getPassengers().size() == 0) {
                    System.out.println("There are no bookings for this flight yet.");
                } else {
                    try {
                        flightToRemovePassenger.cancelBooking();
                    } catch (Exception e) {
                        System.out.println("Please enter a valid flight number.");
                    }
                }

            } else if (input.equals("q".toLowerCase())) {
                System.out.println("Thank you for using FlightManagerPro.");
                stillUsingApp = false;

            } else {
                System.out.println("Please enter a valid command.");
            }

        }

    }
}
