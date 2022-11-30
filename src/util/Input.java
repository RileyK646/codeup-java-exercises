package util;
import java.util.Scanner;
public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String  getString() {
        System.out.println("Type please");
        return scanner.nextLine();
    };

    public boolean yesNo() {
        System.out.println("Please enter yes or no");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y")) {
                System.out.println("thank you for choosing ");
                return true;
            }
            else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("n")) {
                System.out.println("you chose");
            }return false;
    }
    public int getInt(int min, int max) {


    }
}
