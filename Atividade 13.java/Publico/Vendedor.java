package Atividade13.java.Publico;

public class Vendedor extends Funcionario {
    public Vendedor (String nome, Double salario_base){
        super (nome, salario_base);
    }

    public Double calcular_salario (){
        salario_base = salario_base + (salario_base * 0.1);
        return salario_base;
    }

    public void mostrar(){
        System.out.println("O funcionário " + nome + " vai receber: " + Math.floor(salario_base));
    }
}
