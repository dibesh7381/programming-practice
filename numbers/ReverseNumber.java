package numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234; // here we take a hardcore value
        int reversed = 0; // here we take a variable for future use

        System.out.println("Original Number : " + num); // here we print our original value

        while (num != 0) {  // here the loop is run until num value is not equal to 0
            int digit = num % 10; // here we got the remainder [digit = 1234 % 10]
            reversed = reversed * 10 + digit;  // here we use our default variable [reversed = 0 * 10 + 4 = 4]
            num = num / 10; // here [num = 1234 / 10 = 123] the loop again run after complete this
        }

        System.out.println("Reversed Number: " + reversed); // here we print our reversed value
    }
}
