import java.util.Date;
import java.text.SimpleDateFormat;

public class Logs {
    static String contador [][] = new String [500][4];
    static String cont [][] = new String [500][5];
    public static void logs (int andar, int linha, int coluna, String Status, String Pagamento){
        int i = 0;
        while (true){
            if (null == contador [i][0]){
                contador [i][0] = "a " + Integer.toString (andar + 1) + " | l " + Integer.toString (linha) + " | c " + Integer.toString (coluna);
                contador [i][1] = Status;
                contador [i][2] = Pagamento;
                contador [i][3] = Logs.data ();
                break;
            }
            i++;
        }
    }

    public static  void valor_teatro (String Status, String Pagamento, double dinheiro, double troco, double total){
        int i = 0;
        while (true){
            if (null == cont [i][0]){
                cont [i][0] = Status;
                cont [i][1] = Pagamento;
                cont [i][2] = "Pagamento: R$ " + Double.toString (dinheiro) + " Troco: R$ " + Double.toString (troco);
                cont [i][3] = "Total: R$ " + Double.toString (total);
                cont [i][4] = Logs.data ();
                break;
            }
            i++;
        }
    }

    public static String data (){
        Date Agora = new Date ();
        String data = new SimpleDateFormat ("dd/MM/yyyy  ").format (Agora);
        String hora = new SimpleDateFormat ("HH:mm:ss  ").format (Agora);

        return data+"  "+hora;
    }

    public static void imprimir (){

        System.out.println ();
        System.out.println ("Histórico de compra: ");
        System.out.println ();

        for (int i = 0; i < contador.length; i++){
            if (contador [i][0] == null){
                break;
            }
            System.out.println (contador [i][0]);
            System.out.println (contador [i][1]);
            System.out.println (contador [i][2]);
            System.out.println (contador [i][3]);
            System.out.println ();
        }
        Menu.menu ();
    }

    public static void imprimir_valor_teatro (){
        System.out.println ();
        System.out.println ("Lucro do teatro: ");
        System.out.println ();

        for (int i = 0; i < cont.length; i++){
            if (cont [i][0] == null){
                break;
            }
            System.out.println (cont [i][0]);
            System.out.println (cont [i][1]);
            System.out.println (cont [i][2]);
            System.out.println (cont [i][3]);
            System.out.println (cont [i][4]);
            System.out.println ();
        }
        Menu.menu ();
    }
}
