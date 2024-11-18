class Counter {
    static int count = 0;
    static void incrementCount() {
        count++; 
        System.out.println("Count: " + count);
    }
}

public class Q16StaticDemo {
    public static void main(String[] args) {
        System.out.println("First call to incrementCount:");
        Counter.incrementCount();  

        System.out.println("Second call to incrementCount:");
        Counter.incrementCount();  

        System.out.println("Third call to incrementCount:");
        Counter.incrementCount();  
    }
}