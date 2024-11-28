public class Compra {
    public static void compra (){

        int linha = 0;
        int coluna = 0;
        int andar = 0;

        do {
            System.out.println ("\nInforme em qual andar você quer ficar: \n1 - 1° Andar\n2 - 2° Andar\n3 - 3° Andar");
            System.out.print ("Resposta: ");
            andar = Entrada.entrada_andar_compra ();

            if (andar != 1 && andar != 2 && andar != 3){
                Erros.andar_invalido ("Compra");
            }
        }
        while (andar != 1 && andar != 2 && andar != 3);

        if (andar == 1){

            do {
                System.out.println ("\nInforme o assento escolhido: ");
                System.out.println ("Linha -> 1 - 30");
                System.out.print ("Resposta: ");
                linha = Entrada.entrada_linha_compra ();

                if (linha < 1 || linha > 30){
                    Erros.linha_invalida ("Compra");
                }
            }
            while (linha < 1 || linha > 30);

            do {
                System.out.println ("Coluna -> 1 - 50: ");
                System.out.print ("Resposta: ");
                coluna = Entrada.entrada_coluna_compra ();

                if (coluna < 1 || coluna > 50){
                    Erros.coluna_invalida ("Compra");
                }
            }
            while (coluna < 1 || coluna > 50);
        }

        else if (andar == 2){
            do {
                System.out.println ("\nInforme o assento escolhido: ");
                System.out.println ("Linha -> 1 - 20: ");
                System.out.print ("Resposta: ");
                linha = Entrada.entrada_linha_compra ();

                if (linha < 1 || linha > 20){
                    Erros.linha_invalida ("Compra");
                }
            }
            while (linha < 1 || linha > 20);

            do {
                System.out.println ("Coluna -> 1 - 30: ");
                System.out.print ("Resposta: ");
                coluna = Entrada.entrada_coluna_compra ();

                if (coluna < 1 || coluna > 30){
                    Erros.coluna_invalida ("Compra");
                }
            }
            while (coluna < 1 || coluna > 30);
        }

        else {
            do {
                System.out.println ("\nInforme o assento escolhido: ");
                System.out.println ("Linha -> 1 - 10: ");
                System.out.print ("Resposta: ");
                linha = Entrada.entrada_linha_compra ();

                if (linha < 1 || linha > 10){
                    Erros.linha_invalida ("Compra");
                }
            }
            while (linha < 1 || linha > 10);

            do {
                System.out.println ("Coluna -> 1 - 15: ");
                System.out.print ("Resposta: ");
                coluna = Entrada.entrada_coluna_compra ();

                if (coluna < 1 || coluna > 15){
                    Erros.coluna_invalida ("Compra");
                }
            }
            while (coluna < 1 || coluna > 15);
        }

        andar--;

        Status.comprar (andar, linha, coluna);

        System.out.println ();
        System.out.println ("O que deseja agora? ");
        System.out.println ();
        Menu.menu ();
    }
}
