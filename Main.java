//AM:
//email:
//onoma:
//epitheto:

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
        Movie m = new Movie("Inception", 2010, List.of("Sci-Fi", "Action"), "Christopher Nolan");
        User u = new User("alice");

        Review r = new BasicReview(u, 9, "Mind-blowing!", m);
        m.addReview(r);
        u.addReview(r);

        m.printDetails();
        System.out.println();
        u.printDetails();
        System.out.println();
        r.printDetails();
    }
}