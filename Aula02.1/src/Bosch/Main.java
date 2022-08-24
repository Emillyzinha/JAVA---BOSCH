
	package Bosch;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                double Fah;
                double conversao1;
                System.out.print("Digite o grau em Fahrenheit, por favor: ");
                Fah = entrada.nextDouble();
                conversao1 = (Fah-32.0)*5.0/9.0;
                System.out.printf("O valor da conversão de Fahrenheit em Celsius é: %f °C\n\n", conversao1);

                System.out.println("----------------------------------------------------------------\n");


            }
        }