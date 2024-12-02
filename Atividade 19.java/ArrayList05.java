import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList05 {
    public static void main (String [] args){
        ArrayList <String> nomes = new ArrayList <>();

        nomes.add ("Ana");
        nomes.add ("João");
        nomes.add ("Pedro");
        nomes.add ("Alex");
        nomes.add ("Fernanda");

        Collections.sort (nomes);

        System.out.println ("\nLista ordenada" );
        System.out.println (nomes);
        System.out.println ("\nPrimeiro nome: " + nomes.get (0));
        System.out.println ("Último nome: " + nomes.get (nomes.size () - 1));

        Collections.reverse (nomes);

        System.out.println ("\nLista invertida: ");
        System.out.println (nomes);
    }
}
