public class Pagamento {
    private Double valor;

    public Pagamento (Double valor){
        this.valor = valor;
    }

    public Double get_valor (){
        return valor;
    }

    public void set_valor (Double valor) {
        this.valor = valor;
    }

    public Double realizar_pagamento (){
        return valor;
    }
}
