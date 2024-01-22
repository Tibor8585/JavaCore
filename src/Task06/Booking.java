package Task06;

public class Booking {
    private String name;
    private  int phoneNumber;
    private  String checkInDate;
    private  String checkOutDate;
    private  int numberOfGuests;

    public Booking(String name, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                '}';
    }
}
