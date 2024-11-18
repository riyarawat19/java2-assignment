import java.util.Scanner;
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class Q24EmployeeRecruitment {
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("The candidate is too older!");
        } else if (age < 20) {
            throw new TooYounger("The candidate is too younger!");
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter candidate name: ");
            String name = scanner.nextLine();

            System.out.print("Enter candidate age: ");
            int age = scanner.nextInt();

            checkEligibility(name, age);
        } catch (TooOlder olderError) {
            System.out.println(olderError.getMessage());
        } catch (TooYounger youngerError) {
            System.out.println(youngerError.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid data.");
        } finally {
            scanner.close();  
        }
    }
}