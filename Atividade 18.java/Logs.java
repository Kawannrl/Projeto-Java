import java.util.Date;

public class Logs {
    static String contador [][] = new String [500][3];
    public static void logs (int andar, int linha, int coluna, String Status) {
        int i = 0;
        while (true){
            if (null == contador[i][0]){
                contador[i][0] = "a " + Integer.toString (andar) + " | l " + Integer.toString (linha) + " | c " + Integer.toString(coluna);
                contador[i][1] = Status;
                contador[i][2] = String.valueOf(data());
                break;
            }
            i++;
        }
    }
    public static Date data (){
        Date Agora = new Date();
        return Agora;
    }
    public static void imprimir (){

        System.out.println ("Histórico de compra: ");
        for (int i = 0; i < contador.length; i++){
            if (contador [i][0] == null){
                break;
            }
            System.out.println (contador[i][0]);
            System.out.println (contador[i][1]);
            System.out.println (contador[i][2]);
            System.out.println ();
        }
        Menu.menu ();
    }
}
