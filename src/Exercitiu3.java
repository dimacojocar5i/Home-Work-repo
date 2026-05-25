import java.util.ArrayList;
import java.util.List;

public class Exercitiu3 {
    static void main(String[] args) {
        List<String> produse = new ArrayList<>(20);

        produse.add("Cipsuri");
        produse.add("Biscuiti");
        produse.add("Inghetata");
        produse.add("Bomboane");
        produse.add("Apa plata");

       System.out.println("Produsele din cosul de cumparaturi: " + produse);
        System.out.println();

        produse.remove("Cipsuri");
        produse.remove("Biscuiti");
        System.out.println("Cosul fara podusele cu indexul 0 si 1 " + produse);
        System.out.println();

        produse.set(1,"Fructe");
        System.out.println("Cosul cu produsele modificate de la indexul 1 " + produse);

    }
}
