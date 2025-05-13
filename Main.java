//AM:3240177
//email: p3240177@aueb.gr
//onoma: IFIGENEIA
//epitheto: RAPTI

//AM: 3240033
//email: p3240033@aueb.gr
//onoma: VASILEIOS
//epitheto: GRIGOROPOULOS

//AM: 3240244
//email: p3240244@aueb.gr
//onoma: GEORGIOS
//epitheto: FITIKIDES

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 2010, List.of("Sci-Fi", "Action"), "Christopher Nolan");
        User user = new User("alice");

        BasicReview basicReview = new BasicReview(user, 9, movie);

        VerifiedReview verifiedReview = new VerifiedReview(user, 10, movie);

        movie.printDetails();
        System.out.println();
        user.printDetails();
        System.out.println();
        basicReview.printDetails();

        verifiedReview.printDetails();

        System.out.println("Inception total rating: " + movie.getAverageRating());
    }
}