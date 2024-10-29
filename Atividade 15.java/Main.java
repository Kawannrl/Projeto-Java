public class Main {
    public static void main (String [] args){
        PagamentoBoleto PagamentoBoleto1 = new PagamentoBoleto (5646.0, "563462");
        PagamentoCartao PagamentoCartao1 = new PagamentoCartao (45645.0, "3657535");

        PagamentoBoleto1.realizar_pagamento ();
        PagamentoCartao1.realizar_pagamento ();
    }
}