import java.util.Date;

public class Erros {
    static String erro [][] = new String [500][3];
    public static void andar_invalido (String Status){
        int i = 0;
        while (true){
            if (null == erro [i][0]){
                erro [i][0] = "ERR0035";
                erro [i][1] = Status;
                erro [i][2] = String.valueOf (data ());
                break;
            }
            i++;
        }
    }

    public static void linha_invalida (String Status){
        int i = 0;
        while (true){
            if (null == erro [i][0]){
                erro [i][0] = "ERR0035";
                erro [i][1] = Status;
                erro [i][2] = String.valueOf (data ());
                break;
            }
            i++;
        }
    }

    public static Date data (){
        Date Agora = new Date ();
        return Agora;
    }
}
