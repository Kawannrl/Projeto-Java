import java.util.ArrayList;

public class ArrayList03 {
    public static void main (String [] args){
        ArrayList <Double> numeros_decimais = new ArrayList <>();

        double soma = 0.0;

        numeros_decimais.add (0.1);
        numeros_decimais.add (0.2);
        numeros_decimais.add (0.3);
        numeros_decimais.add (0.4);
        numeros_decimais.add (0.5);

        for (double numeros : numeros_decimais){
            soma += numeros;
        }

        System.out.println (numeros_decimais);
        System.out.println (soma);
    }
}
