import java.util.Scanner;
public class ControlFlowExercises {
    public static void  main(String[] args) {
    /*    int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }*/
     /*   int i = 2;
        do {
           i = i*2;
            System.out.println("The number is " + i);
        } while (i < 1000000);*/

      /*  for(int i = 2; i < 1000000; i *= 2) {
            System.out.println("i is " + i);
        }*/

    /*    for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }*/

      /*  // FIZZ BUZZ
           for(int i = 1; i <= 100; i++) { // <--+
               if (i % 5 ==0 & i % 3 == 0) {
                   System.out.println("FizzBuzz");
                   continue;
               }
            else if(i % 3 == 0) { //
                System.out.println("Fizz");//             |
                continue; // ----------------+
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

               System.out.println(i);
        }*/
        Scanner userinput = new Scanner(System.in);

        System.out.print("What number would you like to go up to?: ");
        int userInput = Integer.parseInt(userinput.next());


        System.out.println("Here's your table!");

           int i = 0;
        System.out.printf("%5s ","number |");
        System.out.printf("%5s"," Squared |");
        System.out.printf("%5s %n"," cubed");
        System.out.printf("%7s ", "----- |").printf("%8s ", "----- |").printf("%8s %n ", "----- ");
        do {
           i++;
           int squared = (int) Math.pow(i,2);
            int cubed = (int) Math.pow(i,3);
            System.out.printf(" %d", i);
            System.out.printf("%5s", " |");
            System.out.printf("%5s"," ");
            System.out.printf("%d", squared );
            System.out.printf("%5s", "  |");
            System.out.printf("%5s"," ");
            System.out.printf("%d", cubed );

            System.out.printf("%n","_____________________________");
        } while (i < userInput);



        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
