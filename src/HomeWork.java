public class HomeWork {
    public static void main(){
        System.out.println();
        String name = numePrenume();
        System.out.println("Nunele si Prenumele: " + name);

        int age = virsta();
        System.out.println("Virsta: " + age);

        double heigt = inaltimea();
        System.out.println("Inaltimea: " + heigt);

    }
    public static String numePrenume() {
        return "Cojocari Dumitru";

    }
    public static int virsta() {
        return 27;
    }
    public static double inaltimea() {
        return 1.79;
    }
}
