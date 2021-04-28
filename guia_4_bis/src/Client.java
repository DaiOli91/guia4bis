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

}
