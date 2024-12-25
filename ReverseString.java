import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Method 1: Using a StringBuilder
        String reversedUsingBuilder = reverseUsingStringBuilder(input);
        System.out.println("Reversed using StringBuilder: " + reversedUsingBuilder);

        // Method 2: Using a manual loop
        String reversedUsingLoop = reverseUsingLoop(input);
        System.out.println("Reversed using manual loop: " + reversedUsingLoop);

        // Method 3: Using recursion
        String reversedUsingRecursion = reverseUsingRecursion(input);
        System.out.println("Reversed using recursion: " + reversedUsingRecursion);
    }

    // Method 1: Reverse using StringBuilder
    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method 2: Reverse using a loop
    public static String reverseUsingLoop(String str) {
        char[] charArray = str.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }

    // Method 3: Reverse using recursion
    public static String reverseUsingRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }
}
