import java.util.Date;
import java.text.SimpleDateFormat;

public class Erros {
    static String erro [][] = new String [500][3];
    public static int j = 0;
    public static void andar_invalido (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "ERR0035";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void linha_invalida (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "ERR0055";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void coluna_invalida (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "ERR0045";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void poltrona_invalida (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "ERR0005";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void compra_cadeira (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "ERR0015";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void desistencia_cadeira (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "ERR0025";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();;
                break;
            }
            j++;
        }
    }

    public static void iniciar_sistema (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "SYS0001";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void encerrar_sistema (String Status){
        while (true){
            if (null == erro [j][0]){
                erro [j][0] = "SYS0010";
                erro [j][1] = Status;
                erro [j][2] = Erros.data();
                break;
            }
            j++;
        }
    }

    public static void imprimir_erros (){
        for (int i = 0; i < erro.length; i++){
            if (erro [i][0] == null){
                break;
            }
            System.out.println (erro [i][0]);
            System.out.println (erro [i][1]);
            System.out.println (erro [i][2]);
            System.out.println ();
        }
    }

    public static String data (){
        Date Agora = new Date ();
        String data = new SimpleDateFormat ("dd/MM/yyyy  ").format (Agora);
        String hora = new SimpleDateFormat ("HH:mm:ss  ").format (Agora);

        return data+"  "+hora;
    }
}
