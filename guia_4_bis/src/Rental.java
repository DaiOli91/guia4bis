import java.time.LocalDate;

public class Rental {
    private LocalDate rentingDate;
    private LocalDate returnDate;

    public Rental(LocalDate rentingDate, LocalDate returnDate) {
        this.rentingDate = rentingDate;
        this.returnDate = returnDate;
    }
}
