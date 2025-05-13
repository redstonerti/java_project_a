public class BasicReview extends Review {
    public BasicReview(User user, int rating, String comment, Movie movie) {
        super(user, rating, comment, movie);
    }

    public BasicReview(User user, int rating, Movie movie) {
        super(user, rating, movie);
    }

    public int getWeightedRating() {
        return rating;
    }
}