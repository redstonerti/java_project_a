public class VerifiedReview extends Review {
    public VerifiedReview(VerifiedUser verifiedUser, int rating, Movie movie) {
        super((User) verifiedUser, rating, movie);
    }

    public VerifiedReview(User user, int rating, String comment, Movie movie) {
        super(user, rating, comment, movie);
    }

    public int getWeightedRating() {
        return (int) Math.round((float) this.getRating() * 1.3);
    }
}