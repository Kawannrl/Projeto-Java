import java.util.Scanner;

public class Status {
    public static void status () {
        Scanner scanner = new Scanner(System.in);

        int andar = 0;
        boolean [][] assento = new boolean [60][60];
        int assento_escolhido [][];

        System.out.println ("Informe em qual andar você quer ficar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar\n4 - Sair");
        andar = scanner.nextInt ();

        if (andar == 1){
            for (int i = 1; i < 31; i++){
                System.out.print(i + "A  ");
                for (int j = 1; j < 51; j++){
                    if (assento[i][j] == false){
                        System.out.print(j + " L \t");
                    } else {
                        System.out.print(" V ");
                    }
                }
                System.out.println ();
            }
        }

        if (andar == 2){
            for (int i = 1; i < 21; i++){
                System.out.print(i + "A  ");
                for (int j = 1; j < 31; j++){
                    if (assento[i][j] == false){
                        System.out.print (j + " L \t");
                    } else {
                        System.out.print (" V ");
                    }
                }
                System.out.println ();
            }
        }

        if (andar == 3){
            for (int i = 1; i < 11; i++){
                System.out.print(i + "A  ");
                for (int j = 1; j < 16; j++){
                    if (assento[i][j] == false){
                        System.out.print (j + " - L \t");
                    } else {
                        System.out.print (" V ");
                    }
                }
                System.out.println ();
            }
        }
    }
}
