public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String test = "Racecar";
        System.out.println(checkPalindrome(test));
        System.out.println(checkPalindrome(null));
    }

    public static boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

        if (input.isEmpty()) {
            return true;
        }

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start++) != cleaned.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}