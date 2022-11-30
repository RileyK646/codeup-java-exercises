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
        System.out.printf("Please input a number between %d and %d", min, max);
            int input = Integer.parseInt(scanner.nextLine());
                    if (input > min && input < max) {
                        return input;
                    }
                    else {
                        System.out.println("That number is not within range");
                    }
                    return input;
    }
    public int getInt() {
        System.out.println("Please enter a number");
        int input = scanner.nextInt();
        return input;
    }
    public double getDouble(double min, double max) {
        System.out.printf("Please input a number between %f and %f ", min, max);
        double input = scanner.nextDouble();
        if (input > min && input < max) {
            return input;
        }
        else {
            System.out.println("That number is not within range");
        }
        return input;
    }
    public double getDouble(){
        System.out.println("Input a double");
        double input  = scanner.nextDouble();
        return input;
    }
}
