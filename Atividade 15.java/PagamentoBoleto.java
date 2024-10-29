public class PagamentoBoleto extends Pagamento {

    public String codico_boleto;

    public PagamentoBoleto (Double valor, String codigo_boleto){
        super (valor);
        this.codico_boleto = codigo_boleto;
    }

    public Double realizar_pagamento (){
        System.out.println ("Pagemento realizado ateravés do boleto < " + codico_boleto + " >");
        System.out.println ("Pagamento no valor de: " + get_valor ());
        return 0.0;
    }
}
