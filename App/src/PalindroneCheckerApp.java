public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";
        String reversed = "";

        // Reverse string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

    }
}