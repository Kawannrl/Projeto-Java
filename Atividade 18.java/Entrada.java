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
            Menu.menu ();
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
            Desistencia.desistencia();
        }
        return -1;
    }
}
