import java.util.Scanner;

public class Menu2 {
    public void menu2 () {
        Scanner scanner = new Scanner (System.in);
        Opção1 opcao1 = new Opção1 ();
        Opção2 opcao2 = new Opção2 ();
        Opção3 opcao3 = new Opção3 ();
        Main main = new Main ();

        int opcao;

        do {
            System.out.println ("Escolha umas das opções: \n1 - opção 1\n2 - opção 2\n3 - opção 3\n4 - Retornar");
            opcao = scanner.nextInt ();

            switch (opcao){

                case 1:
                    opcao1.opcao1 ();
                    break;
                case 2:
                    opcao2.opcao2 ();
                    break;
                case 3:
                    opcao3.opcao3 ();
                    break;
                case 4:
                    System.out.println ("Você escolheu a opção retornar!");
                    System.out.println ("Retornado...");
                    main.main ();
                    break;
                default:
                    System.out.println ("Erro!!! Escolha um número de 1 a 4");
                    break;
            }
        } while (opcao < 0 || opcao > 4);
    }
}
