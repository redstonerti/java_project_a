public class VerifiedReview extends Review {
    public VerifiedReview(User user, int rating, Movie movie) {
        super(user, rating, movie);
    }

    public VerifiedReview(User user, int rating, String comment, Movie movie) {
        super(user, rating, comment, movie);
    }

    public int getWeightedRating() {
        return (int) Math.round((float) this.getRating() * 1.3);
    }
}