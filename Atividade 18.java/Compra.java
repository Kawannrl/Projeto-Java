import java.util.Scanner;

public class Compra {
    public static void compra (){
        Scanner scanner = new Scanner (System.in);

        int linha = 0;
        int coluna = 0;
        int andar = 0;

        System.out.println ("Informe em qual andar você quer ficar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar");
        andar = scanner.nextInt ();
        System.out.println ("Informe eo assento escolhido: ");
        System.out.print ("Linha: ");
        linha = scanner.nextInt ();
        System.out.print ("Coluna: ");
        coluna = scanner.nextInt ();
        System.out.println ();

        andar--;
        coluna--;
        linha--;

        Status.comprar (andar, linha, coluna);

        System.out.println ();
        System.out.println ("O que deseja agora? ");
        System.out.println ();
        Menu.menu ();
    }
}