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

        // FIZZ BUZZ
           for(int i = 1; i <= 100; i++) { // <--+
               if (i % 5 ==0 & i % 3 == 0) {
                   System.out.println("FizzBuzz");
                   continue;
               }
            else if(i % 3 == 0) { //
                System.out.println("Fizz");//             |
                continue; // ----------------+
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

               System.out.println(i);
        }
    }
}
