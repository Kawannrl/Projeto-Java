import java.util.Scanner;

public class Desistencia {
    public static void desistencia (){
        Scanner scanner = new Scanner (System.in);

        int linha = 0;
        int coluna = 0;
        int andar = 0;

        System.out.println ("Informe o andar do assento que será devolvido: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar");
        andar = scanner.nextInt ();

        if (andar >= 1 || andar <= 3) {
            System.out.println("Informe o assento escolhido: ");
            System.out.print("Linha: ");
            linha = scanner.nextInt();
            System.out.print("Coluna: ");
            coluna = scanner.nextInt();
            System.out.println();

            andar--;

            Status.cancelar(andar, linha, coluna);

            System.out.println();
            System.out.println("O que deseja agora? ");
            System.out.println();
            Menu.menu();
        }
        else {
            System.out.println ("Erro!!!");
            System.out.println ("Escolha um número de 1 á 3!");
        }
    }
}
