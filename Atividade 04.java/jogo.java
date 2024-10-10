package Atividade04.java;

import java.util.Scanner;

public class jogo {
    public static void main (String[] args){
        menu();
    }

    public static void menu (){
        Scanner scanner = new Scanner (System.in);

        int opcao;

        System.out.println ("Escolha uma das opçôes:");
        System.out.println (" 1 - PEDRA\n 2 - PAPEL\n 3 - TESOURA\n 4 - SAIR\n");
        opcao = scanner.nextInt ();

        switch (opcao){
            case 1:
                int retorno = pedra.pedra ();
                menu ();
            break;
            case 2:
                 retorno = papel.papel ();
                 menu ();
            break;
            case 3:
                 retorno = tesoura.tesoura ();
                 menu ();
            break;
            case 4:
                System.out.println ("Encerrando a partida ...\n");
        }
        if (opcao < 1 || opcao > 4){
            System.out.println ("Erro!!!\nInforme um número válido");
            menu ();
        }
        else {
            System.exit (0);
        }
    }
}
