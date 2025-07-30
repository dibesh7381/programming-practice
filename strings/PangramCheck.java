package strings;

import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we create Scanner class object

        System.out.print("Enter a string: ");  // here we want user input
        String str = sc.nextLine();
        str.toLowerCase().replaceAll("[^a-z]","");  // here we got the updated user value

        for (char ch = 'a'; ch <= 'z'; ch++) { // here the loop runs until reach a to z
            if (!str.contains(String.valueOf(ch))) {  // here we check the condition [if user value does not contain character string value, here we convert char value to String value]
                System.out.println("Not a Pangram."); // if the value is not in between a to z it runs
                return;
            }
        }

        System.out.println("It's a Pangram!"); // if the value between a to z it runs

        sc.close();  // here we close our scanner class object
    }
}
