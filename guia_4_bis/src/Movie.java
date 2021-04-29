import java.time.LocalDate;

public class Movie {
    private String title;
    private LocalDate dateRelease;
    private int duration;
    private Rating rating;
    private String country;
    private String description;
    private Genre genre;
    private int counterRental;
    private boolean availability;

    public Movie(String title, LocalDate dateRelease, int duration, Rating rating, String country, String description, Genre genre) {
        this.title = title;
        this.dateRelease = dateRelease;
        this.duration = duration;
        this.rating = rating;
        this.country = country;
        this.description = description;
        this.genre = genre;
        this.counterRental = 0;
        this.availability = true;
    }

    public Movie() {
        this.title = "";
        this.dateRelease = null;
        this.duration = 0;
        this.rating = null;
        this.country = "";
        this.description = "";
        this.genre = null;
        this.counterRental = 0;
        this.availability = false;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDateRelease() {
        return dateRelease;
    }

    public int getDuration() {
        return duration;
    }

    public Rating getRating() {
        return rating;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getCounterRental() {
        return counterRental;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability() {
        this.availability = !availability;
    }

    public void setCounterRental() {
        this.counterRental++;
    }

    @Override
    public String toString() {
        return "Title: " + title + '\n' +
                "Release: " + dateRelease + '\n' +
                "Duration: " + duration + '\n' +
                "Rating: " + rating + '\n' +
                "Country: " + country + '\n' +
                "Description: " + description + '\n' +
                "Genre: " + genre + '\n' +
                "Availability: " + availability + '\n' +
                "Counter: " + counterRental;
    }
}
