package Bosch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        double valor;
        double calculo1;
        double calculo2;

        Scanner valores = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = valores.nextDouble();

        calculo1 = Math.pow(valor, 2);
        calculo2 = Math.pow(valor, 3);
        DecimalFormat deci = new DecimalFormat();
        deci.applyPattern("#.00");
        System.out.printf("O resultado de %.2f ao quadrado é: %.2f\nO resultado de %.2f ao quadrado é: %.2f", valor, calculo1, valor, calculo2);
    }
}