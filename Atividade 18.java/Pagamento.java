public class Pagamento {
    public static double dinheiro = 0.0;
    public static double troco = 0.0;
    public static double total = 0.0;
    public static void pagamento (int andar, int linha, int coluna, String Status){

        int forma_pagamento;

        do {
            System.out.println ("\nEscolha uma das opções: \n1 - Pix\n2 - Cartão de Débito\n3 - Cartão de Crédito\n4 - Dinheiro");
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

        if (Status == "Comprar"){

            dinheiro = 20;
            total += dinheiro;

            System.out.println ("\nVocê selecionou o Pix como forma de pagamento!");
            System.out.println ("Escaneie a chave Pix abaixo para o pagamento");
            System.out.println ("(41)99924-8834");
            Logs.valor_teatro ("Compra", "Pix", dinheiro, troco, total);
            Logs.logs (andar, linha, coluna, "Comprar", "Pix");
        }

        if (Status == "Desistência"){

            dinheiro = -20;
            total += dinheiro;

            System.out.println ("\nVocê selecionou o Pix como forma de devolução!");
            System.out.println ("Devolução realizada com sucesso!");
            System.out.println ();
            Logs.valor_teatro ("Desistência", "Pix", dinheiro, troco, total);
            Logs.logs (andar, linha, coluna, "Desistência", "Pix");
        }
    }

    public static void pagamento_debito (int andar, int linha, int coluna, String Status){

        int senha;

        System.out.println ("\nVocê selecionou o Cartão de Débito como forma de pagamento!");
        System.out.print ("Senha: ");

        senha = Entrada.entrada_pagamento_debito ();

        if (Status == "Comprar"){
            if (senha == 1234){

                dinheiro = 20;
                total += dinheiro;

                System.out.println ("Pagamento realizado com sucesso!");
                System.out.println ();
                Logs.valor_teatro ("Compra", "Cartão de Débito", dinheiro, troco, total);
                Logs.logs (andar, linha, coluna, "Comprar", "Cartão de Débito");
            }
        }

        if (Status == "Desistência"){

            if (senha == 1234){

                dinheiro = -20;
                total += dinheiro;

                System.out.println ("Devolução realizada com sucesso!");
                System.out.println ();
                Logs.valor_teatro ("Desistência", "Cartão de Débito", dinheiro, troco, total);
                Logs.logs (andar, linha, coluna, "Desistência", "Cartão de Débito");
            }
        }
    }



    public static void pagamento_credito (int andar, int linha, int coluna, String Status){

        int senha;

        System.out.println ("\nVocê selecionou o Cartão de Crédito como forma de pagamento!");
        System.out.print ("Senha: ");

        senha = Entrada.entrada_pagamento_credito ();

        if (Status == "Comprar"){
            if (senha == 1234){

                dinheiro = 20;
                total += dinheiro;

                System.out.println ("Pagamento realizado com suceso!");
                System.out.println ();
                Logs.valor_teatro ("Compra", "Cartão de Crédito", dinheiro, troco, total);
                Logs.logs (andar, linha, coluna, "Compra", "Cartão de Crédito");
            }
        }

        if (Status == "Desistência"){
            if (senha == 1234){

                dinheiro = -20;
                total += dinheiro;

                System.out.println ("Devolução realizada com suceso!");
                System.out.println ();
                Logs.valor_teatro ("Desistência", "Cartão de Crédito", dinheiro, troco, total);
                Logs.logs (andar, linha, coluna, "Desistência", "Cartão de Crédito");
            }
        }
    }

    public static void pagamento_dinheiro (int andar, int linha, int coluna, String Status){

        if (Status == "Comprar"){

            System.out.println ("\nVocê selecionou o Dinheiro como forma de pagamento!");
            System.out.println ();
            System.out.println ("Informe o valor do pagamento");
            System.out.print ("Resposta: ");

            dinheiro = Entrada.entrada_pagamento_dinheiro ();

            if (dinheiro > 20){

                total += dinheiro;
                troco = dinheiro - 20;

                System.out.println ("Pagamento realizado com sucesso");
                System.out.println ("Troco do pagamento: " + troco);
                System.out.println ();
                Logs.valor_teatro ("Compra", "Dinheiro", dinheiro, troco, total);
                Logs.logs (andar, linha, coluna, "Compra", "Dinheiro");
            }
            else if (dinheiro == 20){
                System.out.println ("Pagamento realizado com sucesso");
                Logs.valor_teatro ("Compra", "Dinheiro", dinheiro, troco, total);
                Logs.logs (andar, linha, coluna, "Compra", "Dinheiro");
            }
            else {
                System.out.println ("Erro!!!");
                System.out.println ("Falha no pagamento");
                System.out.println ("Tente novamente");
                Compra.compra ();
            }
        }

        if (Status == "Desistência"){

            dinheiro = -20;
            total += dinheiro;

            System.out.println ("Você selecionou o Dinheiro como forma de devolução!");
            System.out.println ();
            System.out.println ("Dinheiro devolvido com sucesso");
            System.out.println ();
            Logs.valor_teatro ("Desistência", "Dinheiro", dinheiro, troco, total);
            Logs.logs (andar, linha, coluna, "Desistência", "Dinheiro");
        }
    }
}
