package numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we create a Scanner class  object

        System.out.print("Enter the number of value you want to find Fobonacci : ");  // here we want user input
        int value = sc.nextInt();  // here we got the user input value

        int first = 0;  // here declare hardcore value is 0
        int second = 1; // here declare hardcore value is 1

        System.out.print("Fibonacci series is up to " + value + " is : "); // here we just print the value
        for (int i = 0; i < value; i++) {  // here we run the loop until user input value [n terms]
             System.out.print(first + " ");  // here we print Fibonacci values [0 " "] is print
            int next = first + second;  // here we create a new variable and sum the first and second value [0 + 1 = 1]
            second = first; // here [second value is = 0]
            first = next; // here [first value is 1] and its going on until n terms
        }


        sc.close();  // here we close our Scanner class object
    }
}
