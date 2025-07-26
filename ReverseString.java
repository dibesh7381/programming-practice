import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // here we make a Scanner class object

        System.out.print("Enter a String : "); // here we want user input
        String text = sc.nextLine();  // here we got the value

        String newText = "";  // it is an empty variable we used for concatenate value in future.

        for (int i = text.length() - 1; i >= 0; i--) {  // here the loop is run it takes the length of the String but run in descending order like 5,4,3,2,1 [length - 1 because String index problem ]
           newText += text.charAt(i);   // here we add our empty variable with reverse String value
        }

        System.out.println("Orginal String " + text);  // here we print the original String
        System.out.println("After Reverse the Strint : " + newText); // here we print the reverse String value

        sc.close(); // here we close our Scanner class object
    }
}

