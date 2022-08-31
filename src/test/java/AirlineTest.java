import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    Flight flight;
    Airline airline;

    @BeforeEach
    public void setUp(){
        this.airline = new Airline("BNTA");
        this.flight = new Flight(79879,Location.Dubai,Location.Istanbul);
    }

    @Test
    public void canAddFlight(){
        airline.addFlight(flight);
        assertEquals(airline.getFlights().size(),1);
    }

    @Test
    public void canCancelFlight(){
        airline.addFlight(flight);
        airline.cancelFlight(flight);
        assertEquals(airline.getFlights().size(),0);
    }



}
