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
    public static void  main(String[] args) {
        System.out.println(subNums(5,2));
        System.out.println(multiNums(10,2));
        System.out.println(diviNums(10,5));
        System.out.println(moduNums(11,4));
        System.out.println(getInteger(1,10));

    }
}
