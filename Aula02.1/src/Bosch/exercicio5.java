package Bosch;

        import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        double base;
        double altura;
        double calculo;

        Scanner triangulo = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um triângulo!");
        System.out.println("Me diga a base dele, por favor: ");
        base = triangulo.nextDouble();
        System.out.println("Me diga a altura dele, por favor: ");
        altura = triangulo.nextDouble();

        calculo = (base*altura)/2;
        System.out.printf("O valor da área do triângulo informado é: %f",calculo);
    }
}
