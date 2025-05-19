public class BasicReview extends Review {

    public BasicReview(User user, int rating, String comment, Movie movie) {
        super(user, rating, comment, movie);
        this.weight = 1;
    }

    public BasicReview(User user, int rating, Movie movie) {
        super(user, rating, movie);
        this.weight = 1;
    }
}