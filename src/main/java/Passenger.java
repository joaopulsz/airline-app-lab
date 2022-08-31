public class Passenger {

    private String name;
    private int passportNumber;
    private String contactInfo;


    public Passenger(String name, int passportNumber, String contactInfo) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.contactInfo = contactInfo;
    }

    //Methods
    public void createBooking (Flight flight){
        String response = flight.addPassenger(this);
        System.out.println(response);
    }

    public void cancelBooking (Flight flight) {
        String response = flight.removePassenger(this);
        System.out.println(response);
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
