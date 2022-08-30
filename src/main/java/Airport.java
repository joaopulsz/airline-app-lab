import java.util.ArrayList;

public class Airport {

    private String agencyName;
    private ArrayList<Flight> flights;

        public Airport(String agencyName, ArrayList<Flight> flights) {
        this.agencyName = agencyName;
        this.flights = flights;
    }

    //Getters and setters
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
