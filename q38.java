import java.util.Scanner;

// Custom exception class for invalid input
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// MyCalculator class with the power method
class MyCalculator {
    // Method to calculate n^p
    public int power(int n, int p) throws NegativeNumberException {
        if (n < 0 || p < 0) {
            throw new NegativeNumberException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}

// Main class to test the MyCalculator class
public class q38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();

            try {
                int result = myCalculator.power(n, p);
                System.out.println(result);
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
