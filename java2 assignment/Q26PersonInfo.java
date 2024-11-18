import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class Q26PersonInfo {
    public static void checkAge(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative!");
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(name, age); // Pass both name and age to the checkAge method
        } catch (NegativeAgeException ageError) {
            System.out.println(ageError.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid data.");
        } finally {
            scanner.close();  
        }
    }
}
