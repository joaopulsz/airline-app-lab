import java.util.ArrayList;

public class Airline {

    private String airline;
    private ArrayList<Flight> flights;

        public Airline(String airline) {
        this.airline = airline;
        this.flights = new ArrayList<>();
    }

    //Methods
    public void addFlight(Flight flight){
            flights.add(flight);
    }

    public void cancelFlight(Flight flight){
            flights.remove(flight);
    }

    public void displayFlights() {
        System.out.println("All available flights are displayed below");
        for (Flight flight: flights) {
            System.out.println(flight.getFlightNumber() +": flying to "+ flight.getDestination()+", from "+ flight.getDepartureLocation());
            }
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
