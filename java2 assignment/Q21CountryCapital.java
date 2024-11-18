class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class Q21CountryCapital {

    public static String getCapital(String country) throws NoMatchFoundException {
        String[] countries = {"USA", "India", "France", "Germany", "Canada", "Australia", "Japan"};
        String[] capitals = {"Washington D.C.", "New Delhi", "Paris", "Berlin", "Ottawa", "Canberra", "Tokyo"};

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equalsIgnoreCase(country)) {
                return capitals[i];
            }
        }

        throw new NoMatchFoundException("No match found for the country: " + country);
    }

    public static void main(String[] args) {
          if (args.length == 0) {
            System.out.println("Please provide a country name as a command line argument.");
            return;
        }

        String country = args[0];

        try {
          
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}