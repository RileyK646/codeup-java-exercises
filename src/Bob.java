import java.util.List;
import java.util.Scanner;
public class Bob {
    public static void  main(String[] args) {
        String cont;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello my name is Bob");
            String userQ = scanner.next();
            if (userQ.contains("?")) {
                System.out.println("Sure");

            } else if (userQ.contains("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userQ.contains(" ")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Would you line to continue? [Y/N]");

             cont = scanner.next();
        } while (cont.equalsIgnoreCase("y"));
    }
}
