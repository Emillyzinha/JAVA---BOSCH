package Bosch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[]args){
        Scanner imc = new Scanner(System.in);
        double peso;
        double altura;
        double calculoimc;

        System.out.println("Vamos calcular o seu IMC!");
        System.out.print("Por favor, informe o seu peso: \n");
        peso = imc.nextDouble();
        System.out.print("Por favor, informe a sua altura: \n");
        altura = imc.nextDouble();

        calculoimc = peso/(Math.pow(altura, 2));
            DecimalFormat deci = new DecimalFormat();
            deci.applyPattern(" #.00");
            System.out.printf("O seu IMC calculado é: %.2f", calculoimc);
    }
}