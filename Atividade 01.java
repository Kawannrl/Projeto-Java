import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        String nome;

        int idade;
        float altura;
        boolean casado;

        casado = false;

        System.out.print ("Digite o seu nome: ");
        nome = scanner.nextLine ();
        System.out.print ("Digite a sua idade: ");
        idade = scanner.nextInt ();
        System.out.print ("Digite sua altura: ");
        altura = scanner.nextFloat ();
        System.out.print ("Informe se você é casado: ");
        //casado = scanner.nextBoolean();

        System.out.println ("Seu nome é: " + nome);
        System.out.println ("Sua idade é: " + idade);
        System.out.println ("Sua altuera é: " + altura);

        if (false == scanner.nextBoolean()){
            System.out.println ("Você não é casado!");
        }
        else if (true == scanner.nextBoolean()){
            System.out.println ("Você é casado!");
        }
        else {
            System.out.println ("Informe uma das duas opçôes, true ou false");
        }

        //String nome;
        //nome = "Kawann";

        //System.out.println ("Meu nome é: " + nome + ", seja bem vindo!");
        //System.out.println ("Olá Mundo!");
        //System.out.print ("Seja bem vindo!");
    }
}
