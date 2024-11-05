public class Array4 {
    public static void main (String [] args){
        int vetor [] = {6,4,2,10,5,8,1,3,9,7};
        int aux = 0;

        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (vetor [i] < vetor [j]){
                    aux = vetor [i];
                    vetor [i] = vetor [j];
                    vetor [j] = aux;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.println (vetor [i]);
        }
    }
}
