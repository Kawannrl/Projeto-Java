public class ContaCorrente extends ContaBancaria {
    public Double taxa_operacao;

    public ContaCorrente (Double saldo, Double valor, Double taxa_operacao){
        super (saldo, valor);
        this.taxa_operacao = taxa_operacao;
    }

    public Double sacar (){
        Double resultado = get_saldo () - (get_valor () + (get_saldo() * taxa_operacao));
        mostrar (resultado);
        return 0.0;
    }

    public Double depositar (){
        Double resultado = get_saldo () + (get_valor () - (get_saldo () * taxa_operacao));
        mostrar (resultado);
        return 0.0;
    }

    public void mostrar (Double resultado){
        System.out.println ("O valor restante no banco é de: " + resultado);
    }
}
