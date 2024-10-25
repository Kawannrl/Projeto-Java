import java.lang.Math;

public class Main {
    public static void main(String[] args){

        Funcionarios funcionario1 = new Funcionarios("Dave", 1000.00);
        Funcionarios vendedor1 = new Vendedor("Guilherme", 1920.00);
        Funcionarios gerente1 = new Gerente("Carlos", 8560.30);

        funcionario1.calcular_salario();
        funcionario1.mostrar();
        vendedor1.calcular_salario();
        gerente1.calcular_salario();



    }
}
