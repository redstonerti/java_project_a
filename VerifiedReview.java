public class VerifiedReview extends Review { 
    public VerifiedReview(User user, int rating, String comment, Movie movie) { 
        super(user, rating, comment, movie); 
    } 
 
    public int getWeightedRating() { 
        return rating; 
    } 
}