import java.util.Scanner;

public class Fatorial {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        int num;
        int resultado = 1;

        System.out.println ("Digite um valor: ");
        num = scanner.nextInt ();

        for (int i = 1; i <= num; i++){
            resultado = resultado * i;
        }
        System.out.println ("O fatorial de " + num + " é: " + resultado);
    }
}
