import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VideoStore store = new VideoStore();
        Movie movie1 = new Movie("TOY STORY 4", LocalDate.of(2019, 04, 20), 320, Rating.R, "USA", "Toys", Genre.ADVENTURE);
        store.addMovie(movie1);
        Movie movie3 = new Movie("ALGO POR AQUI", LocalDate.of(2018, 04, 20), 320, Rating.PG, "CA", "Something", Genre.ACTION);
        store.addMovie(movie3);
        Movie movie4 = new Movie("THE HOLIDAY", LocalDate.of(2000, 04, 20), 320, Rating.G, "USA", "House Exchange", Genre.DRAMA);
        store.addMovie(movie4);

        Client client1 = new Client("ROGELIO SANCHEZ", "4829869", "SOLIS 8896");

        // LocalDate today = LocalDate.now();
        //  System.out.println(today);

        String title;
        String name;

        System.out.println("Ingrese un titulo");
        title = scan.nextLine();

        Movie movie2 = store.getMovie(title.toUpperCase());
        System.out.println(movie2);

        if (movie2.getDescription() != null) {
            System.out.println("Ingrese nombre Cliente");
            name = scan.nextLine();
            Client client2 = store.getClient(name.toUpperCase());
            if (client2.getName() != null) {
                System.out.println("Procediendo a realizar el alquiler");
                Rental rental1 = new Rental(movie2, client2);
                store.rentMovie(rental1);
                System.out.println(store.getActiveRentals().toString());
                //  System.out.println(client2.getRentals().toString());
                // System.out.println(store.getMostPopularGenres());
                //  System.out.println(store.getMostPopularMovie());

            }


        }

    }
}
