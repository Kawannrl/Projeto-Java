import java.util.Scanner;

public class Array1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int [] numeros = new int [10];

        System.out.println ("Informe 10 números inteiros: ");

        for (int i = 0; i < 10; i++){
            System.out.println ("Número " + (i + 1) + ":");
            numeros [i] = scanner.nextInt ();
        }

        int maior = numeros [0];
        int menor = numeros [0];

        for (int num : numeros){
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }

        System.out.println ("O maior valor é: " + maior);
        System.out.println ("O menor valor é: " + menor);
    }
}
