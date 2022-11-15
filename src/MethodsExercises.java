import java.util.Scanner;
public class MethodsExercises {
    public static  int addNums(int x, int y) {
        return x + y ;
    }
    public static  int subNums(int x, int y) {
        return x - y ;
    }
    public static  int multiNums(int x, int y) {
        return x * y ;
    }
    public static  int diviNums(int x, int y) {
        return x / y ;
    }
    public static  int moduNums(int x, int y) {
        return x % y ;
    }


    public static int getInteger(int min, int max) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer numcompare = number.nextInt();
        if (numcompare >= min & numcompare <= max) {
            return numcompare;
        }
        else {
            System.out.println("try again");
        }
        return getInteger(min,max);
    }

    public static int numFactor() {
        //need to take a number.
        //multiply that number  by every number below is
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number 1-10");
        Integer numfact = number.nextInt();
        int num = numfact;
        int fact = 1;
        for (int i = 1; i <= num; i ++){
                fact = fact * i;
        }
        return fact;
    }

    public static int DiceTest(int x) {
        int max = x;
        int min = 1;
        int range = max -min + 1;

        for (int i = 0; i <2; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
        return max;
    }

    public static int DiceRoll() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose how many sides you would like: ");
        int userSide = Integer.parseInt(userInput.next());

        Scanner userPrompt = new Scanner(System.in);
        System.out.println("Would you like to roll? Yes or no?");
        String YesNo = userPrompt.next();
        int max = userSide;
        int min = 1;
                int range = max -min + 1;

        if ( YesNo.equals("Yes")) {
            System.out.println("I'm rolling dice");

           DiceTest(userSide);

            // Use User input to "roll" 2 (userinput)-sided dice.
            Scanner YesNo2 = new Scanner(System.in);
            System.out.println("Would you like to roll again?");
                String Reroll = YesNo2.next();
                if (Reroll.equals("Yes")) {
                    return DiceRoll();
                }
                else {
                    System.out.println("Thanks for rolling by!");
                }
        }
        else {
            System.out.println("You chose no");

        }


        return 0;


    }
    public static void  main(String[] args) {
      /*  System.out.println(subNums(5,2));
        System.out.println(multiNums(10,2));
        System.out.println(diviNums(10,5));
        System.out.println(moduNums(11,4));
        System.out.println(getInteger(1,100));
        System.out.println(numFactor()); */
        System.out.println(DiceRoll());
    }
}
