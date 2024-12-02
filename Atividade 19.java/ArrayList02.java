import java.util.ArrayList;

public class ArrayList02 {
    public static void main (String [] args){
        ArrayList <Integer> numeros_inteiros = new ArrayList <>();

        numeros_inteiros.add (1);
        numeros_inteiros.add (2);
        numeros_inteiros.add (3);
        numeros_inteiros.add (4);
        numeros_inteiros.add (5);
        numeros_inteiros.add (6);
        numeros_inteiros.add (7);
        numeros_inteiros.add (8);
        numeros_inteiros.add (9);
        numeros_inteiros.add (10);

        System.out.println (numeros_inteiros);
        System.out.println (numeros_inteiros.contains (5));
        System.out.println (numeros_inteiros.indexOf (7));
        System.out.println (numeros_inteiros.isEmpty ());
    }
}
