package Bosch;

public class desafio7 {
    public static void main(String[] args) {
        int resolucao;
        double n1;
        double n2;
        double n3;
        double x;

        n1 = 3 * Math.pow(-3/4, -2);
        n2 = 6 * Math.pow(3, -1)/4-4;
        n3 = 7*Math.pow(-3/4, -1)+2;
        x = (n1 + n2)/n3;

        resolucao = (int) ((Math.pow(x,-1))+4);

        System.out.println(resolucao);
    }
}