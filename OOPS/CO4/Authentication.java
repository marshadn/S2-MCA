package CO4;
import java.util.Scanner;

// User-defined exception class
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

// Authenticator class
class Authenticator {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    public void authenticate(String username, String password) throws AuthenticationException {
        if (!VALID_USERNAME.equals(username)) {
            throw new AuthenticationException("Invalid username.");
        }

        if (!VALID_PASSWORD.equals(password)) {
            throw new AuthenticationException("Invalid password.");
        }

        System.out.println("Authentication successful!");
    }
}

// Main class
public class Authentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authenticator authenticator = new Authenticator();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticator.authenticate(username, password);
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }

        scanner.close();
    }
}
