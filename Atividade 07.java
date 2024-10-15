import java.util.Scanner;

public class Media {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int num, quantidade, soma = 0, media = 0;

        System.out.println("Informe quantos números deseja digitar: ");
        quantidade = scanner.nextInt ();

        for (int i = 0; i < quantidade; i++){
            System.out.println("Informe o " + (i + 1) + "° número: ");
            num = scanner.nextInt ();

            soma = soma + num;
            media = soma / quantidade;
        }
        System.out.println ("A média dos números é: " + media);
    }
}
