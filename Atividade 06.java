import java.util.Scanner;
import java.util.Random;

public class Jogo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ();

        int opcao, num, total ;
        int aleatorio = random.nextInt (10);

        do {
            System.out.println ("Escolha umas das suas opçôes: ");
            System.out.println (" 1 - IMPAR\n 2 - PAR\n 3 - SAIR\n");
            opcao = scanner.nextInt ();

            if (opcao == 1) {
                System.out.println("Informe um número: ");
                num = scanner.nextInt();

                total = aleatorio + num;

                if (total % 2 == 0) {
                    System.out.println("||   DERROTA   ||");
                } else {
                    System.out.println("||   VITÓRIA   ||");
                }
            } else if (opcao == 2) {
                System.out.println("Informe um número: ");
                num = scanner.nextInt();

                total = aleatorio + num;

                if (total % 2 == 0) {
                    System.out.println("||   VITÓRIA   ||");
                } else {
                    System.out.println("||   DERROTA   ||");
                }
            } else if (opcao == 3) {
                System.out.println("O programa está sendo encerrado pelo usuário!");
                System.out.println("Encerrando programa ...");
            } else {
                System.out.println("Erro!!!\nInforme um número entre 1 e 3");
            }
        } while (opcao != 3);
    }
}
