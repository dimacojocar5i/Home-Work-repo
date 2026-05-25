import java.util.Arrays;
import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        {
            String[] weekDays = new String[7];

            for (int i = 0; i < weekDays.length; i++) {
                System.out.print("Introduceti ziua saptaminii: ");
                weekDays[i] = object.nextLine();

            }
            for (String days : weekDays) {
                System.out.println(days);
            }
        }
    }
}