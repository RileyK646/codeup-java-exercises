public class ControlFlowExercises {
    public static void  main(String[] args) {
    /*    int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }*/
        int i = 0;
        do {
           i++;
           i++;
            System.out.println("The number is " + i);
        } while (i < 100);

     /*   for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }*/

    /*    for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }*/
    }
}
