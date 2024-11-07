public class Multiplicador {
    public static void main (String [] args){

        int [][] vetor = new int [10][10];
        int resultado;

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                resultado = i * j;

                if (resultado %2 == 0){
                    System.out.print (resultado + "\t");
                }
                else {
                    System.out.print ("-\t");
                }
            }
            System.out.println ();
        }
    }
}