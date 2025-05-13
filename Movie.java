import java.util.*;

public class Movie implements Printable {
    // attributes
    private String title;
    private int year;
    private List<String> genres;
    private String director;
    private List<Review> reviews;
    private List<Movie> relatedMovies;

    // constructor
    public Movie(String title, int year, List<String> genres, String director) {
        this.title = title;
        this.year = year;
        this.genres = new ArrayList<>(genres);
        this.director = director;
        this.reviews = new ArrayList<Review>();
        this.relatedMovies = new ArrayList<Movie>();
    }

    // methods
    public void addReview(Review r) {
        reviews.add(r);
    }

    public void addRelatedMovie(Movie m) {
        relatedMovies.add(m);
    }

    public double getAverageRating() {
        if (reviews.isEmpty())
            return 0;
        int total = 0;
        for (Review r : reviews) {
            total += r.getWeightedRating();
        }
        double finalRating = (double) total / reviews.size();
        return finalRating > 10 ? 10 : finalRating;
    }

    // print details
    public void printDetails() {
        System.out.println(this);
    }

    // getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGenres() {
        return new ArrayList<>(genres);
    }

    public String getDirector() {
        return director;
    }

    public List<Review> getReviews() {
        return new ArrayList<>(reviews);
    }

    public List<Movie> getRelatedMovies() {
        return new ArrayList<>(relatedMovies);
    }

    // toString
    @Override
    public String toString() {
        return "Title: " + title + "\n"
                + "Year: " + year + "\n"
                + "Genres: " + genres + "\n"
                + "Director: " + director + "\n"
                + "Average Rating: " + getAverageRating();
    }
}