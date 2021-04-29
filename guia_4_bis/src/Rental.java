import java.time.LocalDate;

public class Rental {
    private LocalDate rentingDate;
    private LocalDate returnDate;
    private Movie movie;
    private Client client;

    public Rental(Movie movie, Client client) {
        setRentingDate();
        setReturnDate();
        this.movie = movie;
        this.client = client;
    }

    public LocalDate getRentingDate() {
        return rentingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public Client getClient() {
        return client;
    }

    public String getMovieData() {
        return movie.toString();
    }

    public String getClientData() {
        return client.toString();
    }

    public void setRentingDate(){
        this.rentingDate = LocalDate.now();
    }

    public void setReturnDate(){
        this.returnDate = this.rentingDate.plusDays(3);
    }

    public void returnMovie(){
        this.returnDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Rental.-" +
                "Since: " + rentingDate + "\n" +
                "Until: " + returnDate + "\n" +
                "Movie: " + movie.toString() + "\n";
    }
}
