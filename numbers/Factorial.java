package numbers;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we create a Scanner class object

        System.out.print("Enter the number you want to find the factorial : "); // here we want the user input
        int value = sc.nextInt(); // here we got the user input value

        long factVal = 1; // here we declare variable initial value is 1

        if (value < 0) {  // if the user is give less than 0 value it run
            System.out.println("Please enter a positive number ");
            
        }
        else{ // either this else case is run
              for (int i = 1; i <= value; i++) {   // here the loop is running based on user input
                factVal = factVal * i;  // here we merge our value like = [factVal = 1 * 1 = 1, 1 * 2 = 2, 2 * 3 = 6] like this
           }
        }

        System.out.println(value + " factorial value is " + factVal);  // here we print our factVal of the given number


        sc.close();  // here we close the Scanner class object
    }
}
