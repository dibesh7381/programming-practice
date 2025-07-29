public class FactorialNum {

    public static int Findfact(int num){ // here we create a static method that requires a integer value

        int value = num;  // here we store our num value in the variable named value
        int factVal = 1;  // here we create a variable its value is 1

        for (int i = 1; i <= value; i++) { // here the loop is running until its condition is false 
           factVal = factVal * i; // here we add the factorial value => [1 * 1 = 1, 1 * 2 = 2 , 2 * 3 = 6] like that the condition is false
        }

        return factVal;  // here we return the result

    }
    public static void main(String[] args) {
        int demoValue = 5;  // here we declare a value
        System.out.println("Factorial of " + demoValue + " is : " + Findfact(demoValue)); /// here we print the factorial value
        System.out.println("Factorial of 0 " + " is : " + Findfact(0)); // here also 0! = 1 here only returned value is print which is factVal = 1
    }
}
