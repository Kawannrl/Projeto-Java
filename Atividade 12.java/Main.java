import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Pessoa pessoa1 = new Pessoa ();

        //pessoa1.nome = "Kawann";
        //pessoa1.idade = 18;

        //pessoa2.nome = "Alex";
        //pessoa2.idade = 40;

        //pessoa1.informacoes ();
        //System.out.println ("");
        //pessoa1.informacoes ();

        pessoa1.setNome ("Kawann");
        pessoa1.setIdade (18);

        System.out.println ("Nome: " + pessoa1.getNome () + "\nIdade: " + pessoa1.getIdade ());
    }
}