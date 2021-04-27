import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Movie> movies;
    private List<Client> clients;
    private List<Rental> rentals;

    public VideoStore() {
        this.movies = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }
}
