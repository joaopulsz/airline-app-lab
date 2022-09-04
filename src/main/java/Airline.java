import java.util.ArrayList;
import java.util.Scanner;

public class Airline {

    Scanner scanner = new Scanner(System.in);

    private String airline;
    private ArrayList<Flight> flights;

    public Airline(String airline) {
        this.airline = airline;
        this.flights = new ArrayList<>();
    }

    //Methods
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void displayFlights() {
        System.out.println("All available flights are displayed below:");
        for (Flight flight : flights) {
            System.out.println(flight.getFlightNumber() + ": flying to " + flight.getDestination() + ", from " + flight.getDepartureLocation() + ". Current number of passengers booked: " + flight.getPassengers().size() + ".");
        }
    }

    public void createNewFlight() {
        System.out.println("Please enter a destination.");
        String destination = scanner.nextLine();
        System.out.printf("Thank you. Now please enter a departure location.");
        String departure = scanner.nextLine();
        try {
            Flight newFlight = new Flight(Location.valueOf(destination), Location.valueOf(departure));
            this.addFlight(newFlight);
            System.out.println("New flight successfully added.");
        } catch (Exception e) {
            System.out.println("Sorry, we do not fly to/from there.");
        }
    }

    public void cancelFlight() {
        System.out.println("Please enter the flight number:");
        int flightNum = scanner.nextInt();
        Flight flightToCancel = findFlight(flightNum);
        try {
            System.out.println("Flight " + flightToCancel.getFlightNumber() + " successfully cancelled.");
            flights.remove(flightToCancel);
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
    }

    public Flight findFlight(int flightNum) {
        Flight foundFlight = null;
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNum) {
                foundFlight = flight;
                break;
            }
        }
        return foundFlight;
    }

    //Getters and setters
    public String getAirlineName() {
        return airline;
    }

    public void setAirlineName(String airlineName) {
        this.airline = airlineName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
