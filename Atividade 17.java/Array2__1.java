public class Array2__1 {
    public static void main (String[] args) {
        int vetor [] = {1,2,3,4,5,6,7,8,9,10};
        int vetor2 [] = new int [10];
        int inicio = 0;
        int fim = 9;

        while (inicio < 10){
            vetor2 [fim] = vetor [inicio];
            inicio ++;
            fim --;
        }
    }
}