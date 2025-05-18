import java.util.*;

public class VerifiedUser extends User {
    // attributes
    protected String username;
    protected List<Review> reviews;

    public enum VerificationMethod {
        Password,
        MFA,
        Email,
        OAuth,
        SMS,
        CAPTCHA
    }

    public boolean verify(VerificationMethod verificationMethod) {
        return true;
    }

    // constructor
    public VerifiedUser(String username, VerificationMethod verificationMethod) throws Exception {
        super(username);
        if (!verify(verificationMethod)) {
            throw new Exception("Verification failed for user: " + username);
        }
        this.username = username;
        this.reviews = new ArrayList<Review>();
    }
}