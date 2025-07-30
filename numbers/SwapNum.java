package numbers;
import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // here we create our Scanner class object

        System.out.print("Enter first number : "); // here we want user input
        int a = sc.nextInt();  // here we got the value

        sc.nextLine();  // here we use nextLine() for the problem of leftover newline after nextInt()

        System.out.print("Enter second number : "); // here we want user input
        int b = sc.nextInt();  // here we got the value

        System.out.println("Before swapping: a = " + a + ", b = " + b); // here we print the actual value

        // with using third variable :- [supose a value is 10 and b value is 20]
        // int c = a;  //[c = 10]
        // a = b;  // [a = 20 ]
        // b = c; // [b = 10]

        // with out using third variable :- 
        a = a + b;   // [a = 10 + 20 = 30]
        b = a - b;  // [b = 30 - 20 = 10]  // actual reverse value
        a = a - b; // [a = 30 - 10 = 20]   // actual reverse value

        System.out.println("After swapping: a = " + a + ", b = " + b); // here we print after swapping the values 


        sc.close(); // here we close our Scanner object class
        
    }
}
