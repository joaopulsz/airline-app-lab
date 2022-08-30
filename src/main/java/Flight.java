import java.lang.reflect.Array;

public class Flight {

    private int flightNumber;
    private String destination;
    private String departureLocation;
    private Passenger[] passengers;

    public Flight(int flightNumber, String destination, String departureLocation, Passenger[] passengers) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.passengers = passengers;
    }
}
