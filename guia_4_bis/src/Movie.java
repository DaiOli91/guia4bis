import java.time.LocalDate;

public class Movie {
    private String title;
    private LocalDate dateRelease;
    private int duration;
    private Rating rating;
    private String country;
    private String description;
    private Genre genre;

    public Movie(String title, LocalDate dateRelease, int duration, Rating rating, String country, String description, Genre genre) {
        this.title = title;
        this.dateRelease = dateRelease;
        this.duration = duration;
        this.rating = rating;
        this.country = country;
        this.description = description;
        this.genre = genre;
    }
}
