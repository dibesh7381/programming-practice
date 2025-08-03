package numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int value = 121;  //  here we take a hardcore value
        int originalValue = value;  // here we got a copy of originalValue for condition checking
        int revValue = 0;  // here we set a variable for future use

        while (value != 0)  {  // here the loop is run until 121 != 0
            int temp = value % 10;  // here we store [temp = 121 % 10 = 1]
            revValue = revValue * 10 + temp; // here we use our default variable [revValue = 0 * 10 + 1]
            value = value / 10;  // here we update our [value = 121 / 10 = 12] again the loop is run
        }

        if (originalValue == revValue){  // here if the value is 121 == 121 it runs
            System.out.println("it is a palindrome number");
        }
        else{ // if not equal it will run
            System.out.println("it is not a palindrome number");
        }
    }
}
