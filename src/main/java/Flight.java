import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Flight {

    private int flightNumber;
    private String destination;
    private String departureLocation;
    private ArrayList<Passenger> passengers;

    public Flight(int flightNumber, String destination, String departureLocation) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.passengers = new ArrayList<>();
    }

    //Methods
    public String addPassenger(Passenger passenger){
        if(passengers.size()>99){
            return "Sorry this flight is booked.";
        } else {
            passengers.add(passenger);
            return "Passenger added.";
        }
    }

    //Getters and setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
