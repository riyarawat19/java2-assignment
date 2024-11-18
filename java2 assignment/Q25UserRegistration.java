import java.util.Scanner;
class InvalidUsername extends Exception {
    public InvalidUsername(String message) {
        super(message);
    }
}
class PasswordMismatch extends Exception {
    public PasswordMismatch(String message) {
        super(message);
    }
}

public class Q25UserRegistration {
    public static void validateUser(String username, String password, String confirmPassword) throws InvalidUsername, PasswordMismatch {
        if (username.length() < 6) {
            throw new InvalidUsername("Username must be at least 6 characters long!");
        }
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatch("Password and confirmation password do not match!");
        }
        System.out.println("Registration successful!");
        System.out.println("Username: " + username);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Confirm password: ");
            String confirmPassword = scanner.nextLine();
            validateUser(username, password, confirmPassword);
        } catch (InvalidUsername usernameError) {
            System.out.println(usernameError.getMessage());
        } catch (PasswordMismatch passwordError) {
            System.out.println(passwordError.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
