import java.util.ArrayList;
import java.util.Random;

public class ArrayList04 {
    public static void main (String [] args){
        Random random  = new Random (1);
        ArrayList <Integer> numeros_inteiros = new ArrayList <>();
        ArrayList <Integer> numeros_par = new ArrayList <>();

        for (int i = 0; i < 15; i++){
            numeros_inteiros.add (random.nextInt (100) + 1);
        }

        for (int numeros : numeros_inteiros){
            if (numeros %2 == 0){
                numeros_par.add (numeros);
            }
        }

        System.out.println ("\nLista de números inteiros: ");
        System.out.println (numeros_inteiros);
        System.out.println ("\nLista de números pares: ");
        System.out.println (numeros_par);
    }
}
