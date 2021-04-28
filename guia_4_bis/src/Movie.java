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
    }

    @Override
    public String toString() {
        return "Movie:" +
                "Title: " + title + '\n' +
                "Release: " + dateRelease + '\n' +
                "Duration" + duration + '\n' +
                "Rating" + rating + '\n' +
                "Country" + country + '\n' +
                "Description" + description + '\n' +
                "Genre" + genre + '\n';
    }
}
