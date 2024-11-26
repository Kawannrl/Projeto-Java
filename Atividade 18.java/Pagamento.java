import java.util.Scanner;

public class Pagamento {
    public static void pagamento (int andar, int linha, int coluna, String Status){
        Scanner scanner = new Scanner (System.in);

        int forma_pagamento;

        do {
            System.out.println ("Informe a forma de pagamento: \n1 - Pix\n2 - Cartão de Débito\n3 - Cartão de Crédito\n4 - Dinheiro");
            System.out.print ("Resposta: ");
            forma_pagamento = Entrada.entrada_pagamento ();

            switch (forma_pagamento){
                case 1:
                    Pagamento.pagamento_pix (andar, linha, coluna, Status);
                    break;
                case 2:
                    Pagamento.pagamento_debito (andar, linha, coluna, Status);
                    break;
                case 3:
                    Pagamento.pagamento_credito (andar, linha, coluna, Status);
                    break;
                case 4:
                    Pagamento.pagamento_dinheiro (andar, linha, coluna, Status);
                    break;
                default:
                    System.out.println ();
                    System.out.println ("Erro!!!");
                    System.out.println ("Escolha uma opção de 1 á 4!");
                    System.out.println ();
            }
        }
        while (forma_pagamento != 1 && forma_pagamento != 2 && forma_pagamento != 3 && forma_pagamento != 4);
    }

    public static void pagamento_pix (int andar, int linha, int coluna, String Status){

        System.out.println ("Você selecionou o Pix como forma de pagamento!");
        System.out.println ("Escaneie o QR Code abaixo para o pagamento");
    }

    public static void pagamento_debito (int andar, int linha, int coluna, String Status){

        int senha;

        System.out.println ("Você selecionou o Cartão de Débito como forma de pagamento!");
        System.out.print ("Senha: ");

        senha = Entrada.entrada_pagamento_debito ();

        if (senha == 1234){
            System.out.println ("Pagamento realizado com sucesso!");
            Logs.logs (andar,linha, coluna,"Compra", "Cartão de Débito");
        }
    }

    public static void pagamento_credito (int andar, int linha, int coluna, String Status){

        int senha;

        System.out.println ("Você selecionou o Cartão de Crédito como forma de pagamento!");
        System.out.print ("Senha: ");

        senha = Entrada.entrada_pagamento_credito ();

        if (senha == 1234){
            System.out.println ("Pagamento realizado com suceso!");
            Logs.logs (andar,linha, coluna,"Compra", "Cartão de Crédito");
        }
    }

    public static void pagamento_dinheiro (int andar, int linha, int coluna, String Status){

        System.out.println ("Você selecionou o Dinheiro como forma de pagamento!");
    }
}
