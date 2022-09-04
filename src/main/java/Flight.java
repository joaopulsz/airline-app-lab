import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

    Scanner scanner = new Scanner(System.in);

    private static int number = 1000;
    private int flightNumber;
    private Location destination;
    private Location departureLocation;
    private ArrayList<Passenger> passengers;

    public Flight(Location destination, Location departureLocation) {
        this.flightNumber = number;
        number++;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.passengers = new ArrayList<>();
    }

    //Methods
    public void addPassenger(Passenger passenger){
            passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
            passengers.remove(passenger);
    }

    public void bookNewPassenger() {
        System.out.println("Please enter the passenger's name:");
        String name = scanner.nextLine();
        System.out.println("Now please enter the passenger's email address:");
        String email = scanner.nextLine();
        System.out.println("Now please enter the passenger's passport number:");
        int passport = scanner.nextInt();
        Passenger newPassenger = new Passenger(name, passport, email);
        this.passengers.add(newPassenger);
        System.out.println("Passenger successfully booked onto flight " + this.getFlightNumber() + ".");
    }

    public void cancelBooking() {
        System.out.println("Please enter the passenger's passport number.");
        int passport = scanner.nextInt();
        Passenger passengerToCancel = findPassenger(passport);
        if (passengerToCancel == null) {
            System.out.println("Please enter a valid passport number.");
        } else {
            this.removePassenger(passengerToCancel);
        }
    }

    public Passenger findPassenger(int passport) {
        Passenger foundPassenger = null;
        for (Passenger passenger : passengers) {
            if (passenger.getPassportNumber() == passport) {
                System.out.println(passenger.getName() + "'s booking has been cancelled.");
                foundPassenger = passenger;
                break;
            }
        }
        return foundPassenger;
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
