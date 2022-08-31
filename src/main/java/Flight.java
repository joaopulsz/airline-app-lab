import java.util.ArrayList;

public class Flight {

    private int flightNumber;
    private Location destination;
    private Location departureLocation;
    private ArrayList<Passenger> passengers;

    public Flight(int flightNumber, Location destination, Location departureLocation) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.passengers = new ArrayList<>();
    }

    //Methods
    public String addPassenger(Passenger passenger){
        if(passengers.size() >= 100){
            return "Sorry, this flight is booked.";
        } else {
            passengers.add(passenger);
            return "Booking completed.";
        }
    }

    public String removePassenger(Passenger passenger){
        if (this.passengers.contains(passenger)){
            passengers.remove(passenger);
            return "Your booking has been cancelled.";
        } else {
            return  "Booking not found.";
        }

    }

    //Getters and setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
