public class BasicReview extends Review {
    public BasicReview(User user, int rating, String comment, Movie movie) throws Exception {
        super(user, rating, comment, movie);
    }

    public BasicReview(User user, int rating, Movie movie) throws Exception {
        super(user, rating, movie);
    }

    public int getWeightedRating() {
        return this.getRating();
    }
}