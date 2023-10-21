public class PangramChecker {
    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of each letter (a to z)
        boolean[] alphabet = new boolean[26];

        // Convert the input string to lowercase
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all letters (a to z) have been marked as present
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
