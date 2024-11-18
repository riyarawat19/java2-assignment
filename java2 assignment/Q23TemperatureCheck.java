import java.util.Scanner;
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class Q23TemperatureCheck {
    public static void checkTemperature(double tempCelsius) throws TooHot, TooCold {
        if (tempCelsius > 35) {
            throw new TooHot("The temperature is too hot!");
        } else if (tempCelsius < 5) {
            throw new TooCold("The temperature is too cold!");
        } else {
       
            double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
            System.out.println("The temperature is normal. In Fahrenheit: " + tempFahrenheit + "°F");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the temperature in Celsius: ");
            double tempCelsius = scanner.nextDouble();

            checkTemperature(tempCelsius);
        } catch (TooHot hotError) {
            System.out.println(hotError.getMessage());
        } catch (TooCold coldError) {
            System.out.println(coldError.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number for the temperature.");
        } finally {
            scanner.close();  
        }
    }
}