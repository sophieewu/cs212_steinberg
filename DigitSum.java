public class DigitSum {

    // Static method to calculate the sum of the digits of a number
    public static int sumDigits(int num) {
        int sum = 0;
        
        // Make sure the number is positive
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test the sumDigits method with different inputs
        System.out.println("Sum of digits in 12345 is: " + sumDigits(12345));
        System.out.println("Sum of digits in 0 is: " + sumDigits(0));
        System.out.println("Sum of digits in -678 is: " + sumDigits(-678));
    }
}
