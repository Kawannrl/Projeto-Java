public class Main {
    public static void main (String [] args){
        ContaCorrente ContaCorrente1 = new ContaCorrente (500.0, 50.0, 0.05);
        ContaCorrente ContaCorrente2 = new ContaCorrente (500.0, 50.0, 0.05);
        ContaPoupanca ContaPoupanca1 = new ContaPoupanca (500.0, 250.0, 0.08);
        ContaPoupanca ContaPoupanca2 = new ContaPoupanca (500.0, 250.0, 0.08);

        ContaCorrente1.sacar ();
        ContaCorrente2.depositar ();
        ContaPoupanca1.sacar ();
        ContaPoupanca2.depositar ();
    }
}
