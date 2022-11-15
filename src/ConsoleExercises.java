import java.util.Scanner;

public class ConsoleExercises {
    public static void  main(String[] args) {
     /*   double pi = 3.14159;
        System.out.format("The value of pi is approximately " + pi);
        Scanner newScanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Enter a number: ");
        int userNum = newScanner.nextInt();
        System.out.println(userNum);*/
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     /*   Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput2 = scanner.next();

        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

        Scanner scanner3= new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput3 = scanner.next();

        System.out.println("You entered: --> \"" + userInput3 + "\" <--");
*/
/*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        String userLength = scanner.next();
        System.out.println("You entered: --> \"" + userLength + "\" <--");
        int length = Integer.parseInt(userLength);


        System.out.print("Enter width: ");
        String userWidth = scanner.next();
        System.out.println("You entered: --> \"" + userWidth + "\" <--");
        int width = Integer.parseInt(userWidth);

        System.out.println("The perimeter is " +(( (length * 2) + (width * 2))) );
        System.out.println("The area is " + (length * width));

    }
}
