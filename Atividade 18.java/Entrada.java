import java.util.Scanner;

public class Entrada {
    public static int  entrada_menu (){
        Scanner scanner = new Scanner (System.in);

        int opcao;

        if (scanner.hasNextInt ()){
            opcao = scanner.nextInt ();
            return opcao;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para o menu!");
            System.out.println ();
            Menu.menu ();
        }
        return -1;
    }

    public static int entrada_andar (){
        Scanner scanner = new Scanner (System.in);

        int andar;

        if (scanner.hasNextInt ()){
            andar = scanner.nextInt ();
            return andar;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para o andar!");
            System.out.println ();
            Erros.andar_invalido ("Andar inválido");
            Status.status ();
        }
        return -1;
    }

    public static int entrada_andar_compra (){
        Scanner scanner = new Scanner (System.in);

        int andar;

        if (scanner.hasNextInt ()){
            andar = scanner.nextInt ();
            return andar;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para o andar!");
            System.out.println ();
            Erros.andar_invalido ("Andar inválido");
            Compra.compra ();
        }
        return -1;
    }

    public static int entrada_andar_desistencia (){
        Scanner scanner = new Scanner (System.in);

        int andar;

        if (scanner.hasNextInt ()){
            andar = scanner.nextInt ();
            return andar;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para o andar!");
            System.out.println ();
            Erros.andar_invalido ("Andar inválido");
            Desistencia.desistencia ();
        }
        return -1;
    }

    public static int entrada_linha_compra (){
        Scanner scanner = new Scanner (System.in);

        int linha;

        if (scanner.hasNextInt ()){
            linha = scanner.nextInt ();
            return linha;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a linha!");
            System.out.println ();
            Erros.linha_invalida ("Linha inválida");
            Compra.compra ();
        }
        return -1;
    }

    public static int entrada_linha_desistencia (){
        Scanner scanner = new Scanner (System.in);

        int linha;

        if (scanner.hasNextInt ()){
            linha = scanner.nextInt ();
            return linha;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a linha!");
            System.out.println ();
            Erros.linha_invalida ("Linha inválida");
            Desistencia.desistencia ();
        }
        return -1;
    }

    public static int entrada_coluna_compra (){
        Scanner scanner = new Scanner (System.in);

        int coluna;

        if (scanner.hasNextInt ()){
            coluna = scanner.nextInt ();
            return coluna;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a coluna!");
            System.out.println ();
            Erros.coluna_invalida ("Coluna inválida");
            Compra.compra ();
        }
        return -1;
    }

    public static int entrada_coluna_desistencia (){
        Scanner scanner = new Scanner (System.in);

        int coluna;

        if (scanner.hasNextInt ()){
            coluna = scanner.nextInt ();
            return coluna;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a coluna!");
            System.out.println ();
            Erros.coluna_invalida ("Coluna inválida");
            Desistencia.desistencia ();
        }
        return -1;
    }

    public static int entrada_pagamento (){
        Scanner scanner = new Scanner (System.in);

        int forma_pagamento;

        if (scanner.hasNextInt ()){
            forma_pagamento = scanner.nextInt ();
            return forma_pagamento;
        }
        else {
            System.out.println ();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a forma de pagamento!");
            System.out.println ("Tente novamente!");
            System.out.println ();
            Compra.compra ();
        }
        return -1;
    }

    public static int entrada_pagamento_debito (){
        Scanner scanner = new Scanner (System.in);

        int senha;

        if (scanner.hasNextInt ()){
            senha = scanner.nextInt ();
            return senha;
        }
        else {
            System.out.println();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a senha!");
            System.out.println ("Tente novamente!");
            System.out.println ();
            Compra.compra ();
        }
        return -1;
    }

    public static int entrada_pagamento_credito (){
        Scanner scanner = new Scanner (System.in);

        int senha;

        if (scanner.hasNextInt ()){
            senha = scanner.nextInt ();
            return senha;
        }
        else {
            System.out.println();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para a senha!");
            System.out.println ("Tente novamente!");
            System.out.println ();
            Compra.compra ();
        }
        return -1;
    }

    public static Double entrada_pagamento_dinheiro (){
        Scanner scanner = new Scanner (System.in);

        Double dinheiro;

        if (scanner.hasNextDouble ()){
            dinheiro = scanner.nextDouble ();
            return dinheiro;
        }
        else {
            System.out.println();
            System.out.println ("Opção inválida!!!");
            System.out.println ("Esse valor é inválido para o pagamento!");
            System.out.println ("Tente novamente!");
            System.out.println ();
            Compra.compra ();
        }
        return (double) -1;
    }
}
