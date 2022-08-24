package Bosch;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double Celsius;
        double conversao2;

        System.out.print("Digite o grau em Celsius, por favor: ");
        Celsius = entrada.nextDouble();
        conversao2 = (Celsius*9/5)+32;
        System.out.printf("O valor da conversão de Celsius em Fahrenheit é: %f", conversao2);

        System.out.println();
        }
}
