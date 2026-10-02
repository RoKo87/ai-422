import java.util.Scanner;

/**
 * Reverses the order of words in a line of text.
 * Example: "Hello big world" -> "world big Hello"
 *
 * Usage:
 *   java WordFlipper
 *   Then type lines of text; each is printed with its words flipped.
 *   Type "quit" to stop.
 */
public class WordFlipper {

    /** Returns the input with its words in reverse order. */
    public static String flipWords(String input) {
        if (input == null || input.isBlank()) {
            return "";
        }
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(' ');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a line to flip its words, or \"quit\" to exit.");
        while (true) {
            System.out.print("Enter text: ");
            if (!scanner.hasNextLine()) {
                break; // input stream closed
            }
            String input = scanner.nextLine();
            if (input.trim().equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println(flipWords(input));
        }
        scanner.close();
    }
}
