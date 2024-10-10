package Atividade04.java;

import java.util.Random;

public class papel {
    public static int papel (){

        Random random = new Random ();

        int aleatorio = random.nextInt (3) + 1;
        int escolha = 2;

        if (aleatorio == 1){
            System.out.println ("||   VITÓRIA   ||");
            System.out.println ("O adversário escolheu PEDRA");
        }
        else if (aleatorio == escolha){
            System.out.println ("||   EMPATE   ||");
            System.out.println ("Ambos escolheram PAPEL");
        }
        else {
            System.out.println ("||   DERROTA  ||");
            System.out.println ("O adversário escolheu TESOURA");
        }
        return 0;
    }
}
