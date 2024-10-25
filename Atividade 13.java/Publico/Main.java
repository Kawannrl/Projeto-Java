package Atividade13.java.Publico;

public class Main {
    public static void main (String [] args) {

        Funcionario funcionario1 = new Funcionario ("Kawann", 2.000);
        Funcionario vendedor1 = new Funcionario ("Roma", 2.300);
        Funcionario gerente1 = new Funcionario ("Carlos", 1.500);

        funcionario1.calcular_salario ();
        vendedor1.calcular_salario ();
        gerente1.calcular_salario ();

        funcionario1.mostrar ();
        vendedor1.mostrar ();
        gerente1.mostrar ();
    }
}