public class Q20ExceptionDemo {
    public static void main(String[] args) {
       try {
            System.out.println("Attempting to create an array with negative size...");
            int size = -5; 
            int[] arr = new int[size];  
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        
        try {
            System.out.println("\nAttempting to divide by zero...");
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}