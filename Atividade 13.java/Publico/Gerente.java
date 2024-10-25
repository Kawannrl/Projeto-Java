package Atividade13.java.Publico;

public class Gerente extends Funcionario {
    public Gerente (String nome, Double salario_base){
        super (nome, salario_base);
    }

    public Double calcular_salario (){
        salario_base = salario_base + (salario_base * 0.2);
        return salario_base;
    }

    public void mostrar(){
        System.out.println("O funcionario "+ nome + " vai receber: "+ Math.floor(salario_base));
    }
}
