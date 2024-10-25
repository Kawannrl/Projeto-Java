public class Vendedor extends Funcionarios {

    public Vendedor(String nome, Double salario_base){
        super(nome, salario_base);
    }

    public Double calcular_salario(){
        Double resultado = getSalario_base() + ((getSalario_base() * 10)/100);
        mostrar(resultado);
        return 0.0;
    }

    public void mostrar(Double resultado){
        System.out.println("O funcionário " + getNome() + " vai receber: " + Math.floor(resultado));
    }
}
