public class Array6 {
    public static void main (String [] args){

        for (int numero = 1; numero < 1000; numero++){
            int soma = 0;

            for (int i = 1; i < numero; i++){
                if (numero % i == 0){
                    soma += i;
                }
            }
            if (numero == soma){
                System.out.println (numero);
            }
        }
    }
}