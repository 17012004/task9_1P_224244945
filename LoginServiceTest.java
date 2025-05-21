package web.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the LoginService class, following a Test-Driven Development approach.
 * Each test case is designed to verify specific behaviors of the login method,
 * ensuring correctness and robustness.
 */
public class LoginServiceTest {

    /**
     * Test case for a successful login with valid credentials.
     * This test expects the login method to return true when all credentials
     * (username, password, and DOB) are correct.
     */
    @Test
    @DisplayName("Test successful login with valid credentials")
    public void testLoginSuccess() {
        // Given valid credentials
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should be successful
        assertTrue(result, "Login should be successful for valid credentials.");
    }

    /**
     * Test case for failed login due to incorrect username.
     * This test expects the login method to return false when the username is incorrect,
     * even if password and DOB are correct.
     */
    @Test
    @DisplayName("Test failed login with incorrect username")
    public void testLoginFailureIncorrectUsername() {
        // Given incorrect username but valid password and DOB
        String username = "wrong_user";
        String password = "ahsan_pass";
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for incorrect username.");
    }

    /**
     * Test case for failed login due to incorrect password.
     * This test expects the login method to return false when the password is incorrect,
     * even if username and DOB are correct.
     */
    @Test
    @DisplayName("Test failed login with incorrect password")
    public void testLoginFailureIncorrectPassword() {
        // Given correct username and DOB but incorrect password
        String username = "ahsan";
        String password = "wrong_password";
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for incorrect password.");
    }

    /**
     * Test case for failed login due to incorrect date of birth.
     * This test expects the login method to return false when the DOB is incorrect,
     * even if username and password are correct.
     */
    @Test
    @DisplayName("Test failed login with incorrect DOB")
    public void testLoginFailureIncorrectDob() {
        // Given correct username and password but incorrect DOB
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "02-02-2000"; // Incorrect DOB

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for incorrect DOB.");
    }

    /**
     * Test case for failed login when username is null.
     * This test expects the login method to return false when the username is null.
     */
    @Test
    @DisplayName("Test failed login with null username")
    public void testLoginFailureNullUsername() {
        // Given null username
        String username = null;
        String password = "ahsan_pass";
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for null username.");
    }

    /**
     * Test case for failed login when password is null.
     * This test expects the login method to return false when the password is null.
     */
    @Test
    @DisplayName("Test failed login with null password")
    public void testLoginFailureNullPassword() {
        // Given null password
        String username = "ahsan";
        String password = null;
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for null password.");
    }

    /**
     * Test case for failed login when DOB is null.
     * This test expects the login method to return false when the DOB is null.
     */
    @Test
    @DisplayName("Test failed login with null DOB")
    public void testLoginFailureNullDob() {
        // Given null DOB
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = null;

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for null DOB.");
    }

    /**
     * Test case for failed login when username is empty.
     * This test expects the login method to return false when the username is an empty string.
     */
    @Test
    @DisplayName("Test failed login with empty username")
    public void testLoginFailureEmptyUsername() {
        // Given empty username
        String username = "";
        String password = "ahsan_pass";
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for empty username.");
    }

    /**
     * Test case for failed login when password is empty.
     * This test expects the login method to return false when the password is an empty string.
     */
    @Test
    @DisplayName("Test failed login with empty password")
    public void testLoginFailureEmptyPassword() {
        // Given empty password
        String username = "ahsan";
        String password = "";
        String dob = "01-01-2000";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for empty password.");
    }

    /**
     * Test case for failed login when DOB is empty.
     * This test expects the login method to return false when the DOB is an empty string.
     */
    @Test
    @DisplayName("Test failed login with empty DOB")
    public void testLoginFailureEmptyDob() {
        // Given empty DOB
        String username = "ahsan";
        String password = "ahsan_pass";
        String dob = "";

        // When the login method is called
        boolean result = LoginService.login(username, password, dob);

        // Then the login should fail
        assertFalse(result, "Login should fail for empty DOB.");
    }
}
