import java.util.ArrayList;

public class ArrayList01 {
    public static void main (String [] args){
        ArrayList <String> nomes = new ArrayList <>();

        nomes.add ("Kawann");
        nomes.add ("Rodrigo");
        nomes.add ("Carlos");
        nomes.add ("Guilherme");
        nomes.add ("Dave");

        System.out.println (nomes);

        nomes.remove ("Rodrigo");

        System.out.println (nomes);

        nomes.set (0, "nnawaK");

        System.out.println (nomes);
    }
}