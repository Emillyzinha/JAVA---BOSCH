package Bosch;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int delta;

        Scanner bhaskara = new Scanner(System.in);

        System.out.println("Olá, digite o valor de 'a': ");
        a = bhaskara.nextInt();
        System.out.println("Olá, digite o valor de 'b': ");
        b = bhaskara.nextInt();
        System.out.println("Olá, digite o valor de 'c': ");
        c = bhaskara.nextInt();

        delta = (int) (Math.pow(b,2) - 4*a*c);
        System.out.printf("O valor de delta é: %d",delta);
    }
}
