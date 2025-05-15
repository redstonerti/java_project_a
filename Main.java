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
        Movie movie2 = new Movie("Family", 2009, List.of("Comedy", "Action"), "Jason Statham");
        User user = new User("alice");
        User user2 = new User("bob");

        List<Movie> movies = new ArrayList<>(Movie.getAllMovies());

        BasicReview basicReview = new BasicReview(user, 9, movie);
        BasicReview basicReview2 = new BasicReview(user, 8, movie2);
        VerifiedReview verifiedReview = new VerifiedReview(user2, 3, movie);

        movie.printDetails();
        System.out.println();
        user.printDetails();
        System.out.println();
        basicReview.printDetails();
        System.out.println();
        basicReview2.printDetails();
        System.out.println();
        verifiedReview.printDetails();
        System.out.println();
        System.out.println("Inception total rating: " + movie.getAverageRating());
        System.out.println();
        System.out.println("The highest rated movies for each genre are: " + Movie.getHighestRatedByGenre());
        System.out.println();
        System.out.println("Related movies for " + movie + ": " + movie.getRelatedMovies());
        System.out.println();
        System.out.println("Reviewrs of " + movie + ": " + movie.getReviewers());
        System.out.println();
        System.out.println("The highest rated movies for each genre with N=2 and X=5 are: " + Movie.getHighestRatedByGenre(2, 5));
        System.out.println();

        movies.sort(Movie.byYear);
        System.out.println("Movies sorted by year: "+ movies);
        System.out.println();
    }
}