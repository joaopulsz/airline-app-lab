import java.util.ArrayList;

public class Airport {

    private String agencyName;
    private ArrayList<Flight> flights;

        public Airport(String agencyName, ArrayList<Flight> flights) {
        this.agencyName = agencyName;
        this.flights = flights;
    }
}
