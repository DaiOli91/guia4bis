import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VideoStore {
    private List<Movie> movies;
    private List<Client> clients;
    private List<Rental> rentals;

    public VideoStore() {
        this.movies = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void rentMovie(Rental rental) {
        if (!this.clients.contains(rental.getClient())) { //if client does not exists, it is added
            this.clients.add(rental.getClient()); //to be able to proceed in line 25
        }

        if (this.movies.contains(rental.getMovie())) { //if the movie exists
            int index = this.movies.indexOf(rental.getMovie()); //get the index
            if (this.movies.get(index).isAvailability()) { //if the movie is not already rented
                this.rentals.add(rental); //rent it
                this.movies.get(index).setAvailability();
                this.movies.get(index).setCounterRental();

                int clientIndex = this.clients.indexOf(rental.getClient());
                this.clients.get(clientIndex).getRentals().add(rental);
            }
        }
    }

    public void returnMovie(Rental rental) {
        if (this.rentals.contains(rental)) {
            LocalDate today = LocalDate.now();
            int auxIndex = this.rentals.indexOf(rental);
            this.rentals.get(auxIndex).returnMovie();
            this.movies.get(this.movies.indexOf(rental.getMovie())).setAvailability();
        }


    }

    public List<Rental> getActiveRentals() {
        LocalDate today = LocalDate.now();

        List<Rental> activeRentals = (List<Rental>) this
                .rentals
                .stream()
                .filter(r -> r
                        .getReturnDate()
                        .isAfter(today))
                .collect(Collectors.toList());

        return activeRentals;
    }

    public List<Rental> getShouldReturnToday() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        List<Rental> returnsToday = (List<Rental>) this.rentals
                .stream()
                .filter(rental -> rental
                        .getReturnDate()
                        .isEqual(today))
                .collect(Collectors.toList());

        return returnsToday;
    }

    public Movie getMostPopularMovie() {
        this.movies
                .sort((Movie m1, Movie m2) -> m2
                        .getCounterRental() - m1
                        .getCounterRental());

        return this.movies.get(0);
    }

    public String getMostPopularGenres() {
        List<Genre> list = new ArrayList<>();
        this.movies
                .stream()
                .sorted((Movie m1, Movie m2) -> m2
                        .getCounterRental() - m1
                        .getCounterRental());

        for (Movie movie :
                this.movies
        ) {
            if (!list.contains(movie.getGenre())) {
                list.add(movie.getGenre());
            }
        }

        return list.toString();
    }
    public Client getClient(String name) {
        List<Client> filteredClients = this.clients
                .stream()
                .filter(c -> c
                        .getName()
                        .equals(name))
                .collect(Collectors
                        .toList());
        Client aux_client = new Client();
        if (!filteredClients.isEmpty()) {
            aux_client = filteredClients.get(0);
        }
        return aux_client;
    }

    public String getClientsRentals(String name) {
        Client aux_client = (Client) this.clients
                .stream()
                .filter(c -> c
                        .getName()
                        .equals(name));
        return aux_client.getRentalsData();
    }

    public String getMovieData(String title) {
        Movie aux_movie = (Movie) this.movies.stream().filter(m -> m.getTitle().equals(title));

        return aux_movie.toString();
    }

    public Movie getMovie(String title) {
        List<Movie> filteredMovies = this.movies
                .stream()
                .filter(m -> m
                        .getTitle()
                        .equals(title))
                .collect(Collectors
                        .toList());
        Movie aux_movie = new Movie();
        if (!filteredMovies.isEmpty()) {
            aux_movie = filteredMovies.get(0);
        }
        return aux_movie;
    }
}
