import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Airline airline = new Airline("EasyJet");

        Scanner input3 = new Scanner(System.in);
        System.out.println("Please select usertype, type admin or user");
        String userType = input3.nextLine();

        if (userType.equals("admin")){
            boolean stillUsingApp = true;
            System.out.println("Welcome, admin.");
            while (stillUsingApp) {
                System.out.println("What would you like to do next?");
                System.out.println("Type 'flights' to display a list of available flights.");
                System.out.println("Type 'create' to create a new flight.");
                System.out.println("Type 'cancel' to cancel a flight.");
                System.out.println("Type 'quit' to quit the app.");

                Scanner input4 = new Scanner(System.in);

                String response = input4.nextLine().toLowerCase();
                if (response.equals("flights")) {
                    airline.displayFlights();

                } else if (response.equals("create")){
                    System.out.println("What is the flight number?");
                    int response2 = input4.nextInt();
                    System.out.println("What is the flight destination?");
                    Location response3 = Location.valueOf(input4.next());
                    System.out.println("What is the flight departure location?");
                    Location response4 = Location.valueOf(input4.next());
                    airline.addFlight(new Flight(response2,response3,response4));


                } else if (response.equals("cancel")){
                    System.out.println("What is the flight number you want to cancel?");
                    int response5 = input4.nextInt();
                    for (Flight flight : airline.getFlights()){
                        if (flight.getFlightNumber()==response5){
                            airline.cancelFlight(flight);
                            System.out.println("Flight cancelled");
                        }
                        break;
                    }
                } else if (response.equals("quit")) {
                    stillUsingApp = false;
                } else {
                    System.out.println("Please enter a valid keyword.");
                }
            }

        } else if (userType.equals("user")) {
            //App setup
            Flight flight1 = new Flight(10001, Location.Paris, Location.NewYork);
            Flight flight2 = new Flight(10002, Location.Milan, Location.London);
            Flight flight3 = new Flight(10003, Location.Dubai, Location.Tokyo);

            airline.addFlight(flight1);
            airline.addFlight(flight2);
            airline.addFlight(flight3);

            //User registration
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome, please enter your name.");
            String passengerName = input.nextLine();
            System.out.println("Thank you, " + passengerName + ". Now please enter your email address.");
            String contactDetails = input.nextLine();
            System.out.println("Thank you. Now your passport number please.");
            int passportNumber = input.nextInt();
            System.out.println("Registration completed.");

            Passenger passenger = new Passenger(passengerName, passportNumber, contactDetails);


            boolean stillUsingApp = true;

            while (stillUsingApp) {
                System.out.println("What would you like to do next?");
                System.out.println("Type 'flights' to display a list of available flights.");
                System.out.println("Type 'create' to create a new booking.");
                System.out.println("Type 'cancel' to cancel a booking.");
                System.out.println("Type 'quit' to close the app.");

                Scanner input2 = new Scanner(System.in);
                String response = input2.nextLine().toLowerCase();

                if (response.equals("flights")) {
                    airline.displayFlights();
                } else if (response.equals("create")) {
                    System.out.println("Which flight would you like to book? Please enter flight number.");
                    int flight = input.nextInt();

                    if (flight == 10001) {
                        passenger.createBooking(flight1);
                    } else if (flight == 10002) {
                        passenger.createBooking(flight2);
                    } else if (flight == 10003) {
                        passenger.createBooking(flight3);
                    } else {
                        System.out.println("Invalid number.");
                    }
                } else if (response.equals("cancel")) {
                    System.out.println("Please enter the flight number:");
                    int flight = input.nextInt();

                    if (flight == 10001) {
                        passenger.cancelBooking(flight1);
                    } else if (flight == 10002) {
                        passenger.cancelBooking(flight2);
                    } else if (flight == 10003) {
                        passenger.cancelBooking(flight3);
                    } else {
                        System.out.println("Invalid number.");
                    }
                } else if (response.equals("quit")) {
                    stillUsingApp = false;
                    System.out.println("Thank you for flying with " + airline.getAirlineName());
                } else {
                    System.out.println("Please enter a valid keyword.");
                }
            }
        }
    }
}
