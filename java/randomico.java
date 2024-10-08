package Atividade03.java;

import java.util.Scanner;
import java.util.Random;

public class randomico {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();

        int num;
        int aleatorio = random.nextInt (100) + 1;

        System.out.println (aleatorio);
        System.out.println("Informe um número: ");
        num = scanner.nextInt ();

        do {
            if (num < aleatorio) {
                System.out.println ("O número aleatório é maior que " + num);
                System.out.println ("informe um outro número: ");
                num = scanner.nextInt();
            }
            else {
                System.out.println ("O número aleatório é menor que " + num);
                System.out.println ("informe um outro número: ");
                num = scanner.nextInt();
            }
        }
        while (num != aleatorio);
        System.out.println ("Parabens!!! Você acertou o número aleatório");
    }
}
