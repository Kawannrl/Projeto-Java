import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String nomes;
    public static String cpfs;
    public static double alturas;

    public static void main (String [] args){
        System.out.println ("\n||      BEM VINDO     ||\n");
        Main.menu ();
    }

    public static void menu (){
        Scanner scanner = new Scanner (System.in);
        ArrayList <String> nome = new ArrayList <>();
        ArrayList <String> cpf = new ArrayList <>();
        ArrayList <Double> altura = new ArrayList <>();

        int opcao;

        do {
            System.out.println ("Escolha umas das opções: ");
            System.out.println ("1 - Adicionar cliente");
            System.out.println ("2 - Remover cliente");
            System.out.println ("3 - Buscar cliente");
            System.out.println ("4 - Exibir clientes");
            System.out.println ("5 - Sair");
            System.out.print ("Resposta: ");
            opcao = scanner.nextInt ();

            switch (opcao){
                case 1:
                    System.out.println ("\nInforme o nome do cliente: ");
                    nomes = scanner.next ();
                    nome.add (nomes);
                    System.out.println ("Informe o CPF do cliente: ");
                    cpfs = scanner.next ();
                    cpf.add (cpfs);
                    System.out.println ("Informe a altura do cliente: ");
                    alturas = scanner.nextDouble ();
                    altura.add (alturas);
                    System.out.println ("Cliente cadastrado com sucesso!");
                    System.out.println ("\nO que deseja agora?\n");
                    Main.menu ();
                    break;
                case 2:
                    int i;

                    System.out.println ("\nInforme o nome do cliente: ");
                    nomes = scanner.next ();

                    if (nome.contains (nomes) == true){
                        i = nome.indexOf (nomes);
                        nome.remove (i);
                        cpf.remove (i);
                        altura.remove (i);

                        System.out.println ("O cliente foi removido com sucesso!");
                        System.out.println ("\nO que deseja agora?\n");
                        Main.menu ();
                    }
                    break;
                case 3:
                    System.out.println ("\nInforme o nome do cliente: ");
                    nomes = scanner.next ();

                    if (nome.contains (nomes) == true){
                        System.out.println ("O cliente informado já está cadastrado no sistema!");
                        System.out.println ("\nO que deseja agora?\n");
                        Main.menu ();
                    }
                    else {
                        System.out.println ("O cliente informado não está cadastrado no sistema!");
                        System.out.println ("\nO que deseja agora?\n");
                        Main.menu ();
                    }
                    break;
                case 4:
                    System.out.println ("\n||     EXIBIR CLIENTES     ||\n");
                    System.out.println ("Nomes: " + nome);
                    System.out.println ("CPF: " + cpf);
                    System.out.println ("Altura: " + altura);
                    System.out.println ("\nO que deseja agora?\n");
                    Main.menu ();
                    break;
                case 5:
                    System.out.println ("\nO programa está sendo encerrado pelo usuário!!!");
                    System.out.println ("Programa encerrando...");
                    System.exit (0);
                    break;
                default:
                    System.out.println ("\nErro!!!");
                    System.out.println ("Escolha umas das opções de 1 à 5");
            }
        }
        while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5);
    }
}