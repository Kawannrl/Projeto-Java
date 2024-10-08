package Atividade02.java;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float altura, resultado, peso;

        System.out.println("Digite sua peso: ");
        peso = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();

        resultado = peso / (altura * altura);

        if (resultado < 18.5){
            System.out.println("MAGREZA");
        }else if (resultado > 18.5 && resultado < 24.9){
            System.out.println("NORMAL");
        }else if (resultado > 25 && resultado < 29.9){
            System.out.println("SOBREPESO");
        }else if (resultado > 30 && resultado < 39.9){
            System.out.println("OBESIDADE");
        }else{
            System.out.println("OBESIDADE GRAVE");
        }
    }
}