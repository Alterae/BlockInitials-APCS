@SuppressWarnings("SpellCheckingInspection")
public class BlockInitials {
    public static void main(String[] args) {
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

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
