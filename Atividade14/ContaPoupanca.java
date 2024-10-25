package Atividade14;

public class ContaPoupanca extends ContaBancaria {

    public Double juros_mensais;

    public ContaPoupanca (Double saldo, Double valor, Double juros_mensais){
        super (saldo, valor);
        this.juros_mensais = juros_mensais;
    }

    public Double sacar (){
        Double resultado = (get_saldo () - get_valor ()) + (get_saldo () * juros_mensais);
        mostrar (resultado);
        return 0.0;
    }

    public Double depositar(){
        Double resultado = getSaldo() + (getValor() + (getValor() * jurosMensais));
        mostrar(resultado);
        return 0.0;
    }

    public void mostrar(Double resultado){
        System.out.println("O valor restante no banco é de: "+ resultado);
    }
}
