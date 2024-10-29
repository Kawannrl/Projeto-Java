public class PagamentoCartao extends Pagamento{
    public String numero_cartao;

    public PagamentoCartao (Double valor, String numero_cartao){
        super (valor);
        this.numero_cartao = numero_cartao;
    }

    public Double realizar_pagamento (){
        System.out.println ("Pagamento realizado com o cartão < " + numero_cartao + " >");
        System.out.println ("Pagamento realizado no valor de: " + get_valor ());
        return 0.0;
    }
}
