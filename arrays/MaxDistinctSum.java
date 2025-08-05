package arrays;

import java.util.Scanner;

public class MaxDistinctSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we set scanner class object

        System.out.print("Enter number of test cases: ");  // here we want user input
        int T = sc.nextInt(); // here we store Total test cases given by user

        for (int test = 1; test <= T; test++) {  // here the loop is run whatever the user is input
            System.out.println("\nTest Case #" + test); // here we set message for count our test

            System.out.print("Enter size of array: ");  // here we want the array size from user
            int N = sc.nextInt(); // here we store the Size of the array given by user
            int[] A = new int[N]; // here we create an array size is given by the user

            System.out.print("Enter " + N + " space-separated integers: "); // here we want values for our array
            for (int i = 0; i < N; i++) {  // here the loop is run until the size of an array given by user
                A[i] = sc.nextInt();  // here we set values in an arrray
            }

            int first = -1;   // here we store Largest number from an array in future
            int second = -1;  // here we store second Largest number from an array in future

            for (int i = 0; i < N; i++) {  // here the loop is run until the length of the array
                int num = A[i]; // here we set array value (num = A[0] = something)

                if (num > first) {  // here we check if num > first (5 > -1) it runs
                    second = first; // here value set for second largest = (second = -1)
                    first = num; // here we set first largest value = (first = 5)
                } else if (num > second && num != first) { // here if 5 > -1 && 5 != -1 (true) it runs
                    second = num; //  here we set second largest value second = 4;
                }
            }

            System.out.println("First Largest: " + first);  // here we print first largest value
            System.out.println("Second Largest: " + second); // here we print second largest value
            System.out.println("Sum of two distinct largest numbers: " + (first + second)); // here we print the summation of the values
        }

        sc.close();
    }
}



