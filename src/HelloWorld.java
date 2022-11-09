import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 64;
        System.out.println(myFavoriteNumber);

        String myString = "java drink";
        System.out.println(myString);

        float myNumber = 3.14f;

        /*int x = 5;
        System.out.println(++x);
        System.out.println(x);*/
/*

        int x = 4;
        System.out.println(x += 5);
*/

       /* int x = 3;
        int y = 4;
        System.out.println(x += y);
*/
        int x = 10;
        int y = 2;
        System.out.println(x /= y);
        System.out.println( y -x);

        //ToDo: save your age to a variable. create a scanner class. have the user guess your age. return whether or not the guessed age is the same as the age saved:
       /* int age = 32;
        Scanner ageAsl = new Scanner(System.in);

        System.out.print("Whats your age");
        int userAge = ageAsl.nextInt();


        System.out.println(userAge == age);
*/
    }

}