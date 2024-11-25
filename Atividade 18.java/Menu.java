public class Menu {
    public static void menu (){

        int opcao;

        do {
            System.out.println ("Escolha uma das opções: \n1 - Comprar Ingresso\n2 - Cancelar Ingresso\n3 - Assentos\n4 - Histórico de Compras\n5 - Sair");
            System.out.print ("Resposta: ");
            opcao = Entrada.entrada_menu ();

            switch (opcao){
                case 1:
                    Compra.compra ();
                    break;
                case 2:
                    Desistencia.desistencia ();
                    break;
                case 3:
                    Status.status ();
                    break;
                case 4:
                    Logs.imprimir ();
                    break;
                case 5:
                    System.out.println ();
                    System.out.println ("O programa está sendo encerrado pelo usuário!");
                    System.out.println ("Encerrando...");
                    System.out.println ();
                    Erros.encerrar_sistema ("Encerramento do sistema");
                    Erros.imprimir_erros ();
                    System.exit (0);
                    break;
                default:
                    System.out.println ();
                    System.out.println ("Erro!!!");
                    System.out.println ("Escolha uma opção de 1 á 5!");
                    System.out.println ();
            }
        } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5);
    }
}
