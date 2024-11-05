public class Array3 {
    public static void main (String [] args){
        int vetor [] = {1,2,3,4,5,6,7,8,9};
        int valor = 4;

        for (int i = 0; i < 10; i++){
            if (vetor [i] != valor){
                System.out.println (vetor [i]);
            }
        }
    }
}
