import java.util.Scanner;

public class Desistencia {
    public static void desistencia (){
        Scanner scanner = new Scanner (System.in);

        int linha = 0;
        int coluna = 0;
        int andar = 0;

        do {
            System.out.println ();
            System.out.println ("Informe o andar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar");
            andar = scanner.nextInt ();

            if (andar != 1 && andar != 2 && andar != 3){
                Erros.andar_invalido ("Andar inválido");
            }
        }
        while (andar != 1 && andar != 2 && andar != 3);

        if (andar == 1){

            do {
                System.out.println ("Informe o assento escolhido: ");
                System.out.print ("Linha: ");
                linha = scanner.nextInt ();

                if (linha < 1 || linha > 30){
                    Erros.linha_invalida ("Linha inválida");
                }
            }
            while (linha < 1 || linha > 30);

            do {
                System.out.print ("Coluna: ");
                coluna = scanner.nextInt ();

                if (coluna < 1 || coluna > 50){
                    Erros.coluna_invalida ("Coluna inválida");
                }
            }
            while (coluna < 1 || coluna > 50);
        }

        else if (andar == 2){
            do {
                System.out.println ("Informe o assento escolhido: ");
                System.out.print ("Linha: ");
                linha = scanner.nextInt ();

                if (linha < 1 || linha > 20){
                    Erros.linha_invalida ("Linha inválida");
                }
            }
            while (linha < 1 || linha > 20);

            do {
                System.out.print ("Coluna: ");
                coluna = scanner.nextInt ();

                if (coluna < 1 || coluna > 30){
                    Erros.coluna_invalida ("Coluna inválida");
                }
            }
            while (coluna < 1 || coluna > 30);
        }

        else {
            do {
                System.out.println ("Informe o assento escolhido: ");
                System.out.print ("Linha: ");
                linha = scanner.nextInt ();

                if (linha < 1 || linha > 10){
                    Erros.linha_invalida ("Linha inválida");
                }
            }
            while (linha < 1 || linha > 10);

            do {
                System.out.print ("Coluna: ");
                coluna = scanner.nextInt ();

                if (coluna < 1 || coluna > 15){
                    Erros.coluna_invalida ("Coluna inválida");
                }
            }
            while (coluna < 1 || coluna > 15);
        }

        andar--;

        Status.cancelar (andar, linha, coluna);

        System.out.println ();
        System.out.println ("O que deseja agora? ");
        System.out.println ();
        Menu.menu ();
    }
}
