public class Passenger {

    private static int id = 1;
    private int personalId;
    private String name;
    private int passportNumber;
    private String contactInfo;


    public Passenger(String name, int passportNumber, String contactInfo) {
        this.personalId = id;
        id++;
        this.name = name;
        this.passportNumber = passportNumber;
        this.contactInfo = contactInfo;
    }

    //Getters and setters
    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

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
