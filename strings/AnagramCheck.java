package strings;

public class AnagramCheck {
   public static boolean isAnagram(String s1, String s2){ // here we make a method that accepts two strings
       if (s1.length() != s2.length()){  // here we check if our string length is not same return false
           return false;
       }

       int [] count = new int[26]; // here we create an array with the size of 26

       for (int i = 0; i < s1.length(); i++) { // This loop runs until s1 length
           count[s1.charAt(i) - 'a']++; // here count[s1.charAt(0) - 97]++, exp :- s1 = abc; count[a - a]++ = count[0]++
           count[s2.charAt(i) - 'a']--; // here count[s1.charAt(0) - 97]--, exp :- s1 = abc; count[a - a]-- = count[0]--
       }

       for (int i = 0; i < 26; i++) { // This loop runs 26  times
           if (count[i] != 0){ // here if (count[0] != 0) it return false
               return false;
           }
       }

       return true;  // either return true if two string is same quantity and letter.
   }

    public static void main(String[] args) {
        String s1 = "listen"; // here we create first string
        String s2 = "silent"; // here we create second string
        if (isAnagram(s1,s2)){ // here we check if two string isAnagram or not
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
}


