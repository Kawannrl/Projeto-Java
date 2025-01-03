public class Status {

    static boolean [][][] assento = new boolean [60][60][3];
    public static void status (){

        int andar = 0;

        do {
            System.out.println ();
            System.out.println ("Informe em qual andar você quer ficar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar\n");
            andar = Entrada.entrada_andar ();

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

            if (andar == 1 || andar == 2 || andar == 3){
                System.out.println ();
                Menu.menu ();
            }

        }
        while (andar != 1 && andar != 2 && andar != 3);

        Erros.andar_invalido ("Andar inválido");
    }

    public static void comprar (int andar, int linha, int coluna){
        if (assento [linha][coluna][andar] == false){
            assento [linha][coluna][andar] = true;
            Pagamento.pagamento (andar,linha, coluna,"Comprar");
            System.out.println ("A compra do assento na coluna " + coluna + " na linha " + linha + " foi realizado com sucesso!");
        }
        else {
            Erros.poltrona_invalida ("Poltrona inválida");
            Erros.compra_cadeira ("Compra de cadeira já comprada");
            Menu.menu ();
        }
    }

    public static void cancelar (int andar, int linha, int coluna){
        if (assento [linha][coluna][andar] == true){
            assento [linha][coluna][andar] = false;
            Pagamento.pagamento (andar,linha, coluna,"Desistência");
            System.out.println ("O cancelamento do assento na coluna " + coluna + " na linha " + linha + " foi realizado com sucesso!");
        }
        else {
            Erros.desistencia_cadeira ("Desistência de cadeira livre");
            Menu.menu ();
        }
    }
}
