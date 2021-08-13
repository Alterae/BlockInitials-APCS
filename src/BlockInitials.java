// Suppress spell-checking so that the string of Js in the initials doesn't cause a warning.
@SuppressWarnings("SpellCheckingInspection")

public class BlockInitials {
    /**
     * Main function.  Prints the author's initials in block letters.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Array literals use curly braces.
        String[] lines = {
                "MM              MM    JJJJJJJJJJ      SSSSSS  ",
                "MMMM          MMMM        JJ        SS      SS",
                "MM  MM      MM  MM        JJ        SS        ",
                "MM    MM  MM    MM        JJ        SS        ",
                "MM      MM      MM        JJ          SSS     ",
                "MM              MM        JJ             SSS  ",
                "MM              MM        JJ                SS",
                "MM              MM        JJ                SS",
                "MM              MM    JJ  JJ        SS      SS",
                "MM              MM      JJ            SSSSSS  ",
        };

        // Here's how we do a foreach loop in Java.
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
