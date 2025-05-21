package web.service;

/**
 * Business logic to handle login functions.
 * Validates username, password, and date of birth.
 */
public class LoginService {

    /**
     * Static method returns true for successful login, false otherwise.
     * @param username
     * @param password
     * @param dob - must be in "01-01-2000" format
     * @return true if credentials match
     */
    public static boolean login(String username, String password, String dob) {
        // Debug logs (optional for debugging only)
        System.out.println("LoginService Inputs -> Username: " + username + ", Password: " + password + ", DOB: " + dob);

        // Validate input not null or empty
        if (username == null || username.isEmpty() ||
                password == null || password.isEmpty() ||
                dob == null || dob.isEmpty()) {
            return false;
        }

        String validUsername = "ahsan";
        String validPassword = "ahsan_pass";
        String validDob = "01-01-2000";  // must match exactly

        return username.equals(validUsername) &&
               password.equals(validPassword) &&
               dob.equals(validDob);

    }
}
