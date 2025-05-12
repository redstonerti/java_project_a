public abstract class Review implements Printable { 
    //attributes
    protected User user; 
    protected int rating; 
    protected String comment; 
    protected Movie movie; 
 
    //constructor
    public Review(User user, int rating, String comment, Movie movie) { 
        this.user = user; 
        this.rating = rating; 
        this.comment = comment; 
        this.movie = movie; 
    } 

    //methods
    public abstract int getWeightedRating(); 
 
    //print details
    public void printDetails() { 
        System.out.println(this);
    } 

    //getters
    public User getUser() { 
        return user; 
    }

    public int getRating() { 
        return rating; 
    }

    public String getComment() { 
        return comment; 
    }

    public Movie getMovie() { 
        return movie; 
    }

    //toString
    @Override
    public String toString() {
        return user.getUsername() + " rated " + movie.getTitle() + " with " + rating + "/10" + ((comment != null && !comment.isEmpty()) ? "\nComment: " + comment :  "");
    }
}