import java.util.Scanner;

public class Exercitiiu1 {
    static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        {
            System.out.println("Petru, ce virsta ai?");
            int age = object.nextInt();

            String raspuns1 = (18 <= age) ? "Acces permis" : "Acces interzis";
            System.out.println(raspuns1);
        }


    }
}

