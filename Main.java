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
        new Movie("Inception", 2010, List.of("Sci-Fi", "Action"), "Christopher Nolan");
        new Movie("The Matrix", 1999, List.of("Sci-Fi", "Action"), "Lana Wachowski, Lilly Wachowski");
        new Movie("Interstellar", 2014, List.of("Sci-Fi", "Drama"), "Christopher Nolan");
        new Movie("Mad Max: Fury Road", 2015, List.of("Action", "Adventure"), "George Miller");
        new Movie("Blade Runner 2049", 2017, List.of("Sci-Fi", "Mystery"), "Denis Villeneuve");
        new Movie("The Dark Knight", 2008, List.of("Action", "Crime"), "Christopher Nolan");
        new Movie("Family", 2009, List.of("Comedy", "Action"), "Jason Statham");

        Movie movie = Movie.getSpecificMovie("Family");
        User user = new User("alice");
        VerifiedUser user2 = null;
        VerifiedReview verifiedReview = null;
        try {
            user2 = new VerifiedUser("bob", VerifiedUser.VerificationMethod.Password);
            System.out.println("User created: " + user2.getUsername());
            verifiedReview = new VerifiedReview(user2, 3, movie);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        List<Movie> movies = new ArrayList<>(Movie.getAllMovies());

        BasicReview basicReview = new BasicReview(user, 9, movie);
        BasicReview basicReview2 = new BasicReview(user, 8, Movie.getSpecificMovie("The Dark Knight"));

        movie.printDetails();
        System.out.println();
        user.printDetails();
        System.out.println();
        basicReview.printDetails();
        System.out.println();
        basicReview2.printDetails();
        System.out.println();
        if (verifiedReview != null) {
            verifiedReview.printDetails();
        }
        System.out.println();
        System.out.println("Inception total rating: " + movie.getAverageRating());
        System.out.println();
        System.out.println("The highest rated movies for each genre are: " + Movie.getHighestRatedByGenre());
        System.out.println();
        System.out.println("Related movies for " + movie + ": " + movie.getRelatedMovies());
        System.out.println();
        System.out.println("Reviewers of " + movie + ": " + movie.getReviewers());
        System.out.println();
        System.out.println(
                "The highest rated movies for each genre with at least two reviews and a minimum rating of 5 are: "
                        + Movie.getHighestRatedByGenre(2, 5));
        System.out.println();

        movies.sort(Movie.byYear);
        System.out.println("Movies sorted by year: " + movies);
        System.out.println();
    }
}