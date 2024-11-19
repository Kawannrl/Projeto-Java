import java.util.Scanner;

public class Compra {
    public static void compra (){
        Scanner scanner = new Scanner (System.in);

        int linha = 0;
        int coluna = 0;
        int andar = 0;

        do {
            System.out.println ("Informe em qual andar você quer ficar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar");
            andar = scanner.nextInt ();
            System.out.println("Informe o assento escolhido: ");

            System.out.print("Linha: ");
            linha = scanner.nextInt();

            do {
                System.out.print("Coluna: ");
                coluna = scanner.nextInt();
                System.out.println();

                andar--;

                Status.comprar(andar, linha, coluna);

                System.out.println();
                System.out.println("O que deseja agora? ");
                System.out.println();
                Menu.menu();
            }
            while (linha >= 1 && linha <= 50);

            Erros.linha_invalida ("Linha inválida");
        }
        while (andar != 1 && andar != 2 && andar != 3);

        Erros.andar_invalido ("Andar inválido");
    }
}
