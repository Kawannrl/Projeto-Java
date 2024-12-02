import java.util.ArrayList;
import java.util.Collections;

public class ArrayList06 {
    public static void main (String [] args){
        ArrayList <Double> notas = new ArrayList <>();

        double Soma = 0.0;
        double media = 0.0;

        notas.add (7.0);
        notas.add (9.0);
        notas.add (4.0);
        notas.add (8.0);
        notas.add (1.0);

        System.out.println (notas);

        for (double soma : notas){
            Soma += soma;
        }

        media = Soma / 5;

        System.out.println ("\nMédia das notas: " + media);
        Collections.sort (notas);

        System.out.println ("\nMenor nota: " + notas.get (0));
        System.out.println ("\nMaior nota: " + notas.get (4));
    }
}
