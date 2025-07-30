package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we create a scanner class object

        System.out.print("Enter first string: "); // here we want user input
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase(); // here we got the modified user value

        System.out.print("Enter second string: ");  // here we want user input
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase(); // here we got the modified user value

        if (str1.length() != str2.length()) {  // here we check if length is not same of both string, this will be run
            System.out.println("Not anagrams");
            return;  // here we return because we don't want to perform any other task
        }

        char[] a1 = str1.toCharArray(); // here we convert our String to character array ("care", ['c','a','r','e'] ) like this
        char[] a2 = str2.toCharArray(); // here we convert our String to character array ("race", ['r','a','c','e'] ) like this

        Arrays.sort(a1);  // here we sort our array like ( ['c','a','r','e'] => ['a','c','e','r'] )
        Arrays.sort(a2);  // here also we sort our array like ( ['r','a','c','e'] => ['a','c','e','r'] )

        if (Arrays.equals(a1, a2)) {  // here if two array is same it runs
            System.out.println("Anagrams");
        } else {   // if not it runs
            System.out.println("Not anagrams");
        }
    }
}

