import java.util.Scanner;

public class Status {

    static boolean [][][] assento = new boolean [60][60][3];
    public static void status (){
        Scanner scanner = new Scanner (System.in);

        int andar = 0;

        System.out.println ("Informe em qual andar você quer ficar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar\n");
        andar = scanner.nextInt ();

        if (andar == 1){
            for (int i = 1; i < 31; i++){
                System.out.print (i + "A  ");
                for (int j = 1; j < 51; j++){
                    if (assento [i][j][0] == false){
                        System.out.print (j + " - L \t");
                    } else {
                        System.out.print (j + " - V \t");
                    }
                }
                System.out.println ();
            }
        }

        if (andar == 2){
            for (int i = 1; i < 21; i++){
                System.out.print (i + "A  ");
                for (int j = 1; j < 31; j++){
                    if (assento [i][j][1] == false){
                        System.out.print (j + " - L \t");
                    } else {
                        System.out.print (j + " - V \t");
                    }
                }
                System.out.println ();
            }
        }

        if (andar == 3){
            for (int i = 1; i < 11; i++){
                System.out.print (i + "\t");
                for (int j = 1; j < 16; j++){
                    if (assento [i][j][2] == false){
                        System.out.print (j + " - L \t");
                    } else {
                        System.out.print (j + " - V \t");
                    }
                }
                System.out.println ();
            }
        }
        System.out.println ();
        Menu.menu ();
    }

    public static void comprar (int andar, int linha, int coluna){
        if (assento [linha][coluna][andar] == false){
            assento [linha][coluna][andar] = true;
            System.out.println ("A compra do assento na coluna " + coluna + " na linha " + linha + " foi realizado com sucesso!");
            Logs.logs (andar,linha, coluna,"Compra");
        }
        else {
            System.out.println ("O assento escohido já foi comprado!");
            System.out.println ("Escolha outro assento!");
            Compra.compra ();
        }
    }

    public static void cancelar (int andar, int linha, int coluna){
        if (assento [linha][coluna][andar] == true){
            assento [linha][coluna][andar] = false;
            System.out.println ("O cancelamento do assento na coluna " + coluna + " na linha " + linha + " foi realizado com sucesso!");
            Logs.logs (andar,linha, coluna,"Desistência");
        }
        else {
            System.out.println ("Erro no cancelamento do assento!");
            System.out.println ("Tente novamento!");
            Desistencia.desistencia ();
        }
    }
}
