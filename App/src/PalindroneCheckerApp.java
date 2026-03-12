public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String appName = "PalindroneChecker App";
        String version = "Version 1.0";

        System.out.println("=================================");
        System.out.println("Welcome to the " + appName + "!");
        System.out.println(version);
        System.out.println("=================================");

        System.out.println("Application is ready to check palindrones.");

        // ================= UC2 =================
        // Hardcoded palindrome check using StringBuilder
        String uc2Word = "madam";

        if (uc2Word.equals(new StringBuilder(uc2Word).reverse().toString())) {
            System.out.println("UC2 Result: \"" + uc2Word + "\" is a Palindrone");
        } else {
            System.out.println("UC2 Result: \"" + uc2Word + "\" is NOT a Palindrone");
        }
        // =======================================


        // ================= UC3 =================
        // Palindrome check by reversing using loop
        String original = "level";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("UC3 Result: \"" + original + "\" is a Palindrone");
        } else {
            System.out.println("UC3 Result: \"" + original + "\" is NOT a Palindrone");
        }
        // =======================================


        // ================= UC4 =================
        // Palindrome check using char array & two-pointer approach
        String uc4Word = "radar";

        char[] chars = uc4Word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrone = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrone = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrone) {
            System.out.println("UC4 Result: \"" + uc4Word + "\" is a Palindrone");
        } else {
            System.out.println("UC4 Result: \"" + uc4Word + "\" is NOT a Palindrone");
        }
        // =======================================
    }
}