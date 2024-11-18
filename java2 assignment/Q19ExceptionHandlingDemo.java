import java.io.IOException;

public class Q19ExceptionHandlingDemo {

    public static void readFile() throws IOException {
       
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            readFile();

        } catch (IOException e) {
            
            System.out.println("Caught exception: " + e.getMessage());

            throw new ArithmeticException("Arithmetic Exception thrown from catch block");

        } catch (Exception e) {
        
            System.out.println("Caught general exception: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed, cleanup can be done here");
        
        }
    }
}