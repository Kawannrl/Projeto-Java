public class Main {
    public static void main (String [] args){
        Pessoa pessoa1 = new Pessoa ();
        Carro carro1 = new Carro ();

        carro1.nome = "Corsa";
        carro1.ano = 1999;
        carro1.codigo = 4321;

        pessoa1.nome = "Kawann";
        pessoa1.ano = 18;
        pessoa1.codigo = 1234;

        pessoa1.apresentar ();
        carro1.apresentar ();
    }
}