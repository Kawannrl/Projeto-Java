package Atividade13.java.Publico;

public class Funcionario {

    String nome;
    Double salario_base;

    public Funcionario (String nome, Double salario_base){
        this.nome = nome;
        this.salario_base = salario_base;
    }

    public Double calcular_salario (){
        return salario_base;
    }

    public String nome (){
        return nome;
    }

    public void mostrar(){
        System.out.println("O funcionário " + nome + " vai receber: " + salario_base);
    }
}
