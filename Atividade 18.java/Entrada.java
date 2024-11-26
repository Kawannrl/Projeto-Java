import java.util.Scanner;

public class Entrada {
    public static int  entrada_menu (){
        Scanner scanner = new Scanner (System.in);

        int opcao;

        if (scanner.hasNextInt ()){
            opcao = scanner.nextInt ();
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + opcao);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + andar);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + andar);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + andar);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + linha);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + linha);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + coluna);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + coluna);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + forma_pagamento);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + senha);
            System.out.println ();
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
            System.out.println ();
            System.out.println ("Você digitou o número inteiro " + senha);
            System.out.println ();
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
}
