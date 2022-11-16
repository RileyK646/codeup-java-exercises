import java.util.Scanner;

public class HighLow {
    public static void  main(String[] args) {
        /*System.out.println("This is your guess " + ask());
        System.out.println("this is the number to guess " + randomNumber());
        System.out.println("----------------------");*/
        System.out.println(highLow());
    }

    public static int ask() {
        Scanner init = new Scanner(System.in);
        System.out.println("Guess a number!");
        Integer numGuess = init.nextInt();
        return numGuess;
    }
    public static int randomNumber() {
        int max = 100;
        int min = 1;
        int range = max -min + 1;
        int rand = 0;
        for (int i = 0; i <1; i++) {
            rand = (int) (Math.random() * range) + min;

        }
        return rand;
    }
    public static String highLow() {
       if (ask() < randomNumber()) {
           System.out.println("this is your number " + ask() + " this is random " + randomNumber());
           System.out.println("Higher");
           return highLow();

        } else if (ask() > randomNumber()) {
           System.out.println("this is your number " + ask() + "this is random " + randomNumber());
           System.out.println("Lower");
           return highLow();
        }
        else if (ask() == randomNumber()) {
           System.out.println("Good guess!");

       };

        return "Good job";
    }

}
