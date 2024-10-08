package Atividade04.java;

import java.util.Random;

public class tesoura {
    public static int tesoura (){

        Random random = new Random ();

        int aleatorio = random.nextInt (3) + 1;
        int escolha = 3;

        if (aleatorio == 1){
            System.out.println ("||   DERROTA   ||");
            System.out.println ("O adversário escolheu PEDRA");
        }
        else if (aleatorio == 2){
            System.out.println ("||   VITÓRIA   ||");
            System.out.println ("O adversário escolheu PAPEL");
        }
        else {
            System.out.println ("||   EMPATE  ||");
            System.out.println ("Ambos escolheram TESOURA");
        }
        return 0;
    }
}
