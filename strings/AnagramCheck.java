package strings;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen"; // here is the first string
        String s2 = "silent"; // here is the second string

        if (isAnagram(s1, s2)) {  // here we call the isAnagram method
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    static boolean isAnagram(String s1, String s2) { // here we create a method that accepts 2 string

        if (s1.length() != s2.length()) { // here we check two string length is same or not
            return false;
        }


        int[] count = new int[26]; // here we make an array with the size of 26

        for (int i = 0; i < s1.length(); i++) { // here the loop is run until s1 string length
            char ch = s1.charAt(i); // here we store each character in ch variable
            count[ch - 'a']++; // here (count[11 - 0 = 11] means set 1 in the index no 11 of the array this runs until the length of the string
        }


        for (int i = 0; i < s2.length(); i++) { // here the loop is run until s1 string length
            char ch = s2.charAt(i); // here we store each character in ch variable
            count[ch - 'a']--; // here (count[11 - 0 = 11] means remove 1 in the index no 11 of the array this runs until the length of the string
        }


        for (int i = 0; i < 26; i++) { // here the loop is run 26 times
            if (count[i] != 0) { // here we check array all values are 0 or not
                return false;
            }
        }

        return true;  // if all index values of the array is 0 then it return true
    }
}



