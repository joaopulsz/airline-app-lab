public class Runner {

    public static void main(String[] args) {

        //Instantiation of Objects
        Airline airline = new Airline("EasyJet");
        Flight flight1 = new Flight(00001, Location.Paris, Location.NewYork);
        Flight flight2 = new Flight(00002, Location.Milan, Location.London);
        Flight flight3 = new Flight(00003, Location.Dubai, Location.Tokyo);

        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addFlight(flight3);

        //Displaying flights
        airline.displayFlights();

        

    }
}
