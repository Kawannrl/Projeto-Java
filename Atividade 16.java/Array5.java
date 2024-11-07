public class Array5 {
    public static void main (String [] args){
        int valor = 5;
        int limitador = 1;

        for (int i = 1; i <= valor; i++){
            for (int j = 1; j <= limitador; j++){
                System.out.print (j + " ");
            }
            System.out.println ("");
            limitador ++;
        }
    }
}
