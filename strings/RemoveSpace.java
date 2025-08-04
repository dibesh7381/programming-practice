package strings;

public class RemoveSpace {
    public static void main(String[] args) {
        String value = "Dibesh Ranjan Das";
        String removeValue = value.replaceAll("[\\s]","");
        System.out.println("Original value is : " + value);
        System.out.println("After white space remove value is : " + removeValue);
    }
}
