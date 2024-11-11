import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Main main = new Main ();
        main.main ();
    }

    public void main () {
        Scanner scanner = new Scanner(System.in);
        Menu1 menu1 = new Menu1();
        Menu2 menu2 = new Menu2();
        Menu3 menu3 = new Menu3();

        int opcao;

        System.out.println ("||     BEM VINDO     ||");

        do {
            System.out.println ("\nEscolha umas das opções: \n1 - menu 1\n2 - menu 2\n3 - menu 3\n4 - Sair");
            opcao = scanner.nextInt ();

            switch (opcao){

                case 1:
                    menu1.menu1 ();
                    break;
                case 2:
                    menu2.menu2 ();
                    break;
                case 3:
                    menu3.menu3 ();
                    break;
                case 4:

                    break;
            }
        } while (opcao < 0 || opcao > 4);
        System.out.println ("O programa está sendo encerrado pelo usuário");
        System.out.println ("Encerrando...");
    }
}