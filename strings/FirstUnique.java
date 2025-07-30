package strings;

public class FirstUnique {
    public static void main(String[] args) {
        String str = "aabbcdeff"; // here we take a hardcore value

        for (int i = 0; i < str.length(); i++) {  // here the loop is running until the str length
            char ch = str.charAt(i);  // here we get each character [ch = str.charAt(i) => ch = a]
            boolean isUnique = true; // here we set a variable true

            for (int j = 0; j < str.length(); j++) {  // this loop run under the first loop it also runs until the str length
                if (i != j && str.charAt(j) == ch) { // here [0 != 0 and a == a] if is true it runs
                    isUnique = false;  // it is false and break the loop
                    break;
                }
            }

            if (isUnique) {  // here if the value is comes first that is not repetative it run
                System.out.println("First non-repeating character: " + ch);
                return;  // return is used so only first unique value is stored
            }
        }

        System.out.println("No non-repeating character found.");  // if no single character found it run
    }
}

