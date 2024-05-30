/* Write a program to determine what happens if you divide a double by 0. */
public class DivideByZero {
    public static void main(String[] args) {
        double positiveValue = 42.0;
        double negativeValue = -42.0;
        double zeroValue = 0.0;

        System.out.println("Positive value divided by zero:");
        System.out.println("42.0 / 0.0 = " + (positiveValue / zeroValue));

        System.out.println("\nNegative value divided by zero:");
        System.out.println("-42.0 / 0.0 = " + (negativeValue / zeroValue));

        System.out.println("\nZero divided by zero:");
        System.out.println("0.0 / 0.0 = " + (zeroValue / zeroValue));
    }
}
