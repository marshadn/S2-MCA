package CO4;
//  Find the average of N positive integers, raising a user defined exception for each negative input.

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        // Read n positive integers from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the positive integers: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("arr[" + i + "]: ");
                arr[i] = readPostiveInteger(sc);
                // Also calculate the sum
                sum += arr[i];
            } catch (NegativeIntegerException e) {
                // If the user enters a negative integer, decrement i to re-enter the value
                e.printStackTrace();
                i--;
            }
        }
        // Calculate the average from the sum
        float avg = (float) sum / n;
        System.out.println("Average: " + avg);
        sc.close();

    }

    // * Read a positive integer from the user
    static int readPostiveInteger(Scanner sc) {
        int n = sc.nextInt();
        if (n < 0) {
            throw new NegativeIntegerException();
        }
        return n;
    }

}

// * User-defined exception
class NegativeIntegerException extends RuntimeException {

    NegativeIntegerException() {
        super("Negative Integer!");
    }

}