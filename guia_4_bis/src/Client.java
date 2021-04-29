import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String telNumber;
    private String address;
    private List<Rental> rentals;

    public Client(String name, String telNumber, String address) {
        this.name = name;
        this.telNumber = telNumber;
        this.address = address;
        this.rentals = new ArrayList<>();
    }

    public Client() {
        this.name = "";
        this.telNumber = "";
        this.address = "";
        this.rentals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getAddress() {
        return address;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String getRentalsData() {
        return rentals.toString();
    }

    @Override
    public String toString() {
        return "Client.-" +
                "Name: " + name + "\n" +
                "Tel: " + telNumber + "\n" +
                "Address: " + address + "\n" +
                "Rentals: " + getRentals() + "\n";
    }
}
