import java.util.Arrays;

public class ArraysExercises {
    public static void main (String[] args) {
        String[] peoples = {"Riley", "Mario", "Vilolet"};
        for (String people : peoples) {
            System.out.println(people);
        }

        String[] newPerson = Arrays.copyOf(peoples, peoples.length + 1);

        newPerson[peoples.length] = "Han Solo " + "\n" + "Boba";

        for (String peep : newPerson) {
            System.out.println(peep);
    }
        System.out.println(Arrays.toString(newPerson));

    }
    }
