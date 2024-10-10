package Atividade04.java;

import java.util.Random;

public class pedra {
    public static int pedra (){

        Random random = new Random ();

        int aleatorio = random.nextInt (3) + 1;
        int escolha = 1;

        if (aleatorio == escolha){
            System.out.println ("||   EMPATE   ||");
            System.out.println ("Ambos escolheram PEDRA");
        }
        else if (aleatorio == 2){
            System.out.println ("||   DERROTA   ||");
            System.out.println ("O adversário escolheu PAPEL");
        }
        else {
            System.out.println ("||   VITÓRIA   ||");
            System.out.println ("O adversário escolheu TESOURA");
        }
        return 0;
    }
}
